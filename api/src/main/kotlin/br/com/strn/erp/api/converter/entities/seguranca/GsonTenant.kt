package br.com.strn.erp.api.converter.entities.seguranca

import br.com.strn.erp.api.database.entities.seguranca.Tenant
import com.google.gson.*
import java.lang.reflect.Type

class GsonTenant : JsonSerializer<Tenant>, JsonDeserializer<Tenant> {
    override fun serialize(src: Tenant?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        if (src == null) return null

        val json = JsonObject()
        json.addProperty("handle", src.handle)
        json.addProperty("nome", src.nome)
        json.addProperty("schema", src.schema)
        return json
    }

    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): Tenant? {
        if ((json == null) || (context == null)) return null

        val obj = json.asJsonObject
        return Tenant(
                id = obj.get("id").asLong,
                nome = obj.get("nome").asString,
                schema = obj.get("schema").asString,
                handle = obj.get("handle").asString
        )
    }
}