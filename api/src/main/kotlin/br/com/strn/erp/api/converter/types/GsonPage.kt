package br.com.strn.erp.api.converter.types

import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonSerializer
import org.springframework.data.domain.Page
import java.lang.reflect.Type

class GsonPage : JsonSerializer<Page<Any?>> {
    override fun serialize(src: Page<Any?>?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        if ((src == null) || (context == null)) return null

        val json = JsonObject()

        json.add("content", context.serialize(src.content))

        json.addProperty("first", src.isFirst)
        json.addProperty("last", src.isLast)
        json.addProperty("number", src.number)
        json.addProperty("numberOfElements", src.numberOfElements)
        json.addProperty("size", src.size)
        json.addProperty("totalElements", src.totalElements)
        json.addProperty("totalPages", src.totalPages)

        json.add("pageable", context.serialize(src.pageable))

        return json
    }
}
