package br.com.strn.erp.api.converter.entities.financeiro

import br.com.strn.erp.api.converter.subItem
import br.com.strn.erp.api.database.entities.financeiro.Conta
import br.com.strn.erp.api.database.entities.financeiro.TipoConta
import com.google.gson.*
import java.lang.reflect.Type

class GsonConta : JsonSerializer<Conta>, JsonDeserializer<Conta> {
    override fun serialize(src: Conta?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        if ((src == null) || (context == null)) return null

        val json = JsonObject()
        json.addProperty("handle", src.handle)
        json.addProperty("nome", src.nome)
        json.add("tipoConta", subItem(src.tipoConta?.handle))
        return json
    }

    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): Conta? {
        if ((json == null) || (context == null)) return null

        val obj = json.asJsonObject
        return Conta(
                id = obj.get("id").asLong,
                nome = obj.get("nome").asString,
                tipoConta = context.deserialize(obj.get("tipoConta"), TipoConta::class.java),
                handle = obj.get("handle").asString
        )
    }
}