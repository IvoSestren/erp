package br.com.strn.erp.api.converter.entities.financeiro

import br.com.strn.erp.api.converter.subItem
import br.com.strn.erp.api.database.entities.financeiro.*
import com.google.gson.*
import java.lang.reflect.Type

class GsonMovPrevContaDiv : JsonSerializer<MovPrevContaDiv>, JsonDeserializer<MovPrevContaDiv> {
    override fun serialize(src: MovPrevContaDiv?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        if ((src == null) || (context == null)) return null

        val json = JsonObject()
        json.addProperty("handle", src.handle)
        json.addProperty("descricao", src.descricao)
        json.addProperty("valor", src.valor)
        json.add("movPrevConta", subItem(src.movPrevConta?.handle))
        json.add("conta", subItem(src.conta?.handle))
        json.add("planoConta", subItem(src.planoConta?.handle))
        json.add("centroCusto", subItem(src.centroCusto?.handle))
        return json
    }

    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): MovPrevContaDiv? {
        if ((json == null) || (context == null)) return null

        val obj = json.asJsonObject
        return MovPrevContaDiv(
                id = obj.get("id").asLong,
                descricao = obj.get("descricao").asString,
                valor = obj.get("valor").asFloat,
                movPrevConta = context.deserialize(obj.get("movPrevConta"), MovPrevConta::class.java),
                conta = context.deserialize(obj.get("conta"), Conta::class.java),
                planoConta = context.deserialize(obj.get("planoConta"), PlanoConta::class.java),
                centroCusto = context.deserialize(obj.get("centroCusto"), CentroCusto::class.java),
                handle = obj.get("handle").asString
        )
    }
}