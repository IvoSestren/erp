package br.com.strn.erp.api.converter.entities.financeiro

import br.com.strn.erp.api.database.entities.financeiro.MovConta
import com.google.gson.*
import java.lang.reflect.Type
import java.time.LocalDateTime

class GsonMovConta : JsonSerializer<MovConta>, JsonDeserializer<MovConta> {
    override fun serialize(src: MovConta?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        if ((src == null) || (context == null)) return null

        val json = JsonObject()
        json.addProperty("handle", src.handle)
        json.add("data", context.serialize(src.data))
        json.addProperty("descricao", src.descricao)
        return json
    }

    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): MovConta? {
        if ((json == null) || (context == null)) return null

        val obj = json.asJsonObject
        return MovConta(
                id = obj.get("id").asLong,
                data = context.deserialize(obj.get("data"), LocalDateTime::class.java),
                descricao = obj.get("descricao").asString,
                handle = obj.get("handle").asString
        )
    }
}