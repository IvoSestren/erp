package br.com.strn.erp.api.converter.entities.seguranca

import br.com.strn.erp.api.database.entities.seguranca.Perfil
import com.google.gson.*
import java.lang.reflect.Type

class GsonPerfil : JsonSerializer<Perfil>, JsonDeserializer<Perfil> {
    override fun serialize(src: Perfil?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        if ((src == null) || (context == null)) return null

        val json = JsonObject()
        json.addProperty("handle", src.handle)
        json.addProperty("nome", src.nome)
        return json
    }

    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): Perfil? {
        if ((json == null) || (context == null)) return null

        val obj = json.asJsonObject
        return Perfil(
                id = obj.get("id").asLong,
                nome = obj.get("nome").asString,
                handle = obj.get("handle").asString
        )
    }
}