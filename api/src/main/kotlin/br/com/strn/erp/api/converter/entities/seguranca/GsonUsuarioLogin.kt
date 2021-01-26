package br.com.strn.erp.api.converter.entities.seguranca

import br.com.strn.erp.api.converter.subItem
import br.com.strn.erp.api.database.entities.identificacao.Email
import br.com.strn.erp.api.database.entities.seguranca.Usuario
import br.com.strn.erp.api.database.entities.seguranca.UsuarioLogin
import com.google.gson.*
import java.lang.reflect.Type

class GsonUsuarioLogin : JsonSerializer<UsuarioLogin>, JsonDeserializer<UsuarioLogin> {
    override fun serialize(src: UsuarioLogin?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        if ((src == null) || (context == null)) return null

        val json = JsonObject()
        json.addProperty("handle", src.handle)
        json.add("usuario", subItem(src.usuario?.handle))
        json.add("email", subItem(src.email?.handle))
        return json
    }

    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): UsuarioLogin? {
        if ((json == null) || (context == null)) return null

        val obj = json.asJsonObject
        return UsuarioLogin(
                id = obj.get("id").asLong,
                senha = obj.get("senha").asString,
                usuario = context.deserialize(obj.get("usuario"), Usuario::class.java),
                email = context.deserialize(obj.get("email"), Email::class.java),
                handle = obj.get("handle").asString
        )
    }
}