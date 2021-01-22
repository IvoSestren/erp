package br.com.strn.erp.api.converter.entities.seguranca

import br.com.strn.erp.api.database.entities.seguranca.Usuario
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonSerializer
import java.lang.reflect.Type

class GsonUsuario : JsonSerializer<Usuario> {
    override fun serialize(src: Usuario?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        if (src == null) return null

        val json = JsonObject()

        json.addProperty("id", src.id)
        json.addProperty("nome", src.nome)

        return json
    }

}
