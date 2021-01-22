package br.com.strn.erp.api.converter.types

import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonSerializer
import org.springframework.data.domain.Pageable
import java.lang.reflect.Type

class GsonPageable : JsonSerializer<Pageable> {
    override fun serialize(src: Pageable?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        if ((src == null) || (context == null)) return null

        val json = JsonObject()

        json.add("sort", context.serialize(src.sort))
        json.addProperty("offset", src.offset)
        json.addProperty("pageSize", src.pageSize)
        json.addProperty("pageNumber", src.pageNumber)
        json.addProperty("paged", src.isPaged)
        json.addProperty("unpaged", src.isUnpaged)

        return json
    }

}
