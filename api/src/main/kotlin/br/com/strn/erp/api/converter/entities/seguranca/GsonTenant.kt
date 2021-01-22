package br.com.strn.erp.api.converter.entities.seguranca

import br.com.strn.erp.api.database.entities.seguranca.Tenant
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonSerializer
import java.lang.reflect.Type

class GsonTenant : JsonSerializer<Tenant> {
    override fun serialize(src: Tenant?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        if (src == null) return null

        val json = JsonObject()
        json.addProperty("id", src.id)
        json.addProperty("nome", src.nome)
        json.addProperty("schema", src.schema)
        return json
    }
}