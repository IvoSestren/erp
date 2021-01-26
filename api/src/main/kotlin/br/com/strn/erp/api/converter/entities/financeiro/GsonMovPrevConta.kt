package br.com.strn.erp.api.converter.entities.financeiro

import br.com.strn.erp.api.converter.subItem
import br.com.strn.erp.api.database.entities.financeiro.MovPrev
import br.com.strn.erp.api.database.entities.financeiro.MovPrevConta
import com.google.gson.*
import java.lang.reflect.Type
import java.time.LocalDateTime

class GsonMovPrevConta : JsonSerializer<MovPrevConta>, JsonDeserializer<MovPrevConta> {
    override fun serialize(src: MovPrevConta?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        if ((src == null) || (context == null)) return null

        val json = JsonObject()
        json.addProperty("handle", src.handle)
        json.add("data", context.serialize(src.data))
        json.addProperty("descricao", src.descricao)
        json.add("movPrev", subItem(src.movPrev?.handle))
        return json
    }

    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): MovPrevConta? {
        if ((json == null) || (context == null)) return null

        val obj = json.asJsonObject
        return MovPrevConta(
                id = obj.get("id").asLong,
                data = context.deserialize(obj.get("data"), LocalDateTime::class.java),
                descricao = obj.get("descricao").asString,
                movPrev = context.deserialize(obj.get("movPrev"), MovPrev::class.java),
                handle = obj.get("handle").asString
        )
    }
}