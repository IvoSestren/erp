package br.com.strn.erp.api.converter.entities.identificacao

import br.com.strn.erp.api.database.entities.identificacao.Email
import com.google.gson.*
import java.lang.reflect.Type

class GsonEmail : JsonSerializer<Email>, JsonDeserializer<Email> {
    override fun serialize(src: Email?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        if (src == null) return null

        val json = JsonObject()
        json.addProperty("handle", src.handle)
        json.addProperty("email", src.email)
        json.addProperty("validado", src.validado)
        return json
    }

    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): Email? {
        if ((json == null) || (context == null)) return null

        val obj = json.asJsonObject
        return Email(
                id = obj.get("id").asLong,
                email = obj.get("email").asString,
                validado = obj.get("validado").asBoolean,
                handle = obj.get("handle").asString
        )
    }
}