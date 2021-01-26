package br.com.strn.erp.api.converter.entities.financeiro

import br.com.strn.erp.api.database.entities.enums.TipoMovPrev
import br.com.strn.erp.api.database.entities.enums.TipoPeriodicidade
import br.com.strn.erp.api.database.entities.financeiro.MovPrev
import com.google.gson.*
import java.lang.reflect.Type
import java.time.LocalDateTime

class GsonMovPrev : JsonSerializer<MovPrev>, JsonDeserializer<MovPrev> {
    override fun serialize(src: MovPrev?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        if ((src == null) || (context == null)) return null

        val json = JsonObject()
        json.addProperty("handle", src.handle)
        json.add("dataInicio", context.serialize(src.dataInicio))
        json.add("dataFim", context.serialize(src.dataFim))
        json.addProperty("tipo", src.tipo?.name)
        json.addProperty("periodicidade", src.periodicidade?.name)
        return json
    }

    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): MovPrev? {
        if ((json == null) || (context == null)) return null

        val obj = json.asJsonObject
        return MovPrev(
                id = obj.get("id").asLong,
                dataInicio = context.deserialize(obj.get("dataInicio"), LocalDateTime::class.java),
                dataFim = context.deserialize(obj.get("dataFim"), LocalDateTime::class.java),
                tipo = TipoMovPrev.valueOf(obj.get("tipo").asString),
                periodicidade = TipoPeriodicidade.valueOf(obj.get("periodicidade").asString),
                handle = obj.get("handle").asString
        )
    }
}