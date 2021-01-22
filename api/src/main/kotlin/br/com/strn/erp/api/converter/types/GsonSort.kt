package br.com.strn.erp.api.converter.types

import com.google.gson.*
import org.springframework.data.domain.Sort
import java.lang.reflect.Type

class GsonSort : JsonSerializer<Sort> {
    override fun serialize(src: Sort?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        if ((src == null) || (src.count() <= 0)) return null

        val json = JsonArray()

        for (order in src) {
            val jsonOrder = JsonObject()

            jsonOrder.addProperty("direction", order.direction.name)
            jsonOrder.addProperty("property", order.property)
            jsonOrder.addProperty("ignoreCase", order.isIgnoreCase)
            jsonOrder.addProperty("nullHandling", order.nullHandling.name)
            jsonOrder.addProperty("ascending", order.isAscending)
            jsonOrder.addProperty("descending", order.isDescending)

            json.add(jsonOrder)
        }

        return json
    }

}
