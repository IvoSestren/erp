package br.com.strn.erp.api.converter.entities.financeiro

import br.com.strn.erp.api.converter.subItem
import br.com.strn.erp.api.database.entities.financeiro.*
import com.google.gson.*
import java.lang.reflect.Type
import java.time.LocalDateTime

class GsonMovContaDiv : JsonSerializer<MovContaDiv>, JsonDeserializer<MovContaDiv> {
    override fun serialize(src: MovContaDiv?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        if ((src == null) || (context == null)) return null

        val json = JsonObject()
        json.addProperty("handle", src.handle)
        json.addProperty("descricao", src.descricao)
        json.addProperty("valor", src.valor)
        json.add("dataConciliado", context.serialize(src.dataConciliado))
        json.add("movConta", subItem(src.movConta?.handle))
        json.add("conta", subItem(src.conta?.handle))
        json.add("planoConta", subItem(src.planoConta?.handle))
        json.add("centroCusto", subItem(src.centroCusto?.handle))
        return json
    }

    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): MovContaDiv? {
        if ((json == null) || (context == null)) return null

        val obj = json.asJsonObject
        return MovContaDiv(
                id = obj.get("id").asLong,
                descricao = obj.get("descricao").asString,
                valor = obj.get("valor").asFloat,
                dataConciliado = context.deserialize(obj.get("dataConciliado"), LocalDateTime::class.java),
                movConta = context.deserialize(obj.get("movConta"), MovConta::class.java),
                conta = context.deserialize(obj.get("conta"), Conta::class.java),
                planoConta = context.deserialize(obj.get("planoConta"), PlanoConta::class.java),
                centroCusto = context.deserialize(obj.get("centroCusto"), CentroCusto::class.java),
                handle = obj.get("handle").asString
        )
    }
}