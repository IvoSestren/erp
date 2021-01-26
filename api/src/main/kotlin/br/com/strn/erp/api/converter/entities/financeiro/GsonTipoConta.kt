package br.com.strn.erp.api.converter.entities.financeiro

import br.com.strn.erp.api.database.entities.financeiro.TipoConta
import com.google.gson.*
import java.lang.reflect.Type

class GsonTipoConta : JsonSerializer<TipoConta>, JsonDeserializer<TipoConta> {
    override fun serialize(src: TipoConta?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        if ((src == null) || (context == null)) return null

        val json = JsonObject()
        json.addProperty("handle", src.handle)
        json.addProperty("nome", src.nome)
        return json
    }

    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): TipoConta? {
        if ((json == null) || (context == null)) return null

        val obj = json.asJsonObject
        return TipoConta(
                id = obj.get("id").asLong,
                nome = obj.get("nome").asString,
                handle = obj.get("handle").asString
        )
    }
}