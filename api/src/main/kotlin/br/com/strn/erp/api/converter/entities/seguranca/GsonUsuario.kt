package br.com.strn.erp.api.converter.entities.seguranca

import br.com.strn.erp.api.database.entities.seguranca.Usuario
import com.google.gson.*
import java.lang.reflect.Type

class GsonUsuario : JsonSerializer<Usuario>, JsonDeserializer<Usuario> {
    override fun serialize(src: Usuario?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        if (src == null) return null

        val json = JsonObject()

        json.addProperty("handle", src.handle)
        json.addProperty("nome", src.nome)

        return json
    }

    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): Usuario? {
        if ((json == null) || (context == null)) return null

        val obj = json.asJsonObject
        return Usuario(
                id = obj.get("id").asLong,
                nome = obj.get("nome").asString,
                handle = obj.get("handle").asString
        )
    }

}
