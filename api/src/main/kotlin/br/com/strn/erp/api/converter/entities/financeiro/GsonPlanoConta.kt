package br.com.strn.erp.api.converter.entities.financeiro

import br.com.strn.erp.api.converter.subItem
import br.com.strn.erp.api.database.entities.financeiro.PlanoConta
import com.google.gson.*
import java.lang.reflect.Type

class GsonPlanoConta : JsonSerializer<PlanoConta>, JsonDeserializer<PlanoConta> {
    override fun serialize(src: PlanoConta?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        if ((src == null) || (context == null)) return null

        val json = JsonObject()
        json.addProperty("handle", src.handle)
        json.addProperty("credito", src.credito)
        json.addProperty("nome", src.nome)
        json.add("planoContaPai", subItem(src.planoContaPai?.handle))
        return json
    }

    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): PlanoConta? {
        if ((json == null) || (context == null)) return null

        val obj = json.asJsonObject
        return PlanoConta(
                id = obj.get("id").asLong,
                credito = obj.get("credito").asBoolean,
                nome = obj.get("nome").asString,
                planoContaPai = context.deserialize(obj.get("planoContaPai"), PlanoConta::class.java),
                handle = obj.get("handle").asString
        )
    }
}