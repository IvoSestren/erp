package br.com.strn.erp.api.converter.types

import com.google.gson.*
import java.lang.reflect.Type
import java.time.LocalDateTime

class GsonLocalDateTime : JsonSerializer<LocalDateTime>, JsonDeserializer<LocalDateTime> {
    override fun serialize(src: LocalDateTime?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        if (src == null) return null

        return JsonPrimitive(src.toString())
    }

    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): LocalDateTime? {
        if ((json == null) || (context == null)) return null

        return LocalDateTime.parse(json.asString)
    }

}
