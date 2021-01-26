package br.com.strn.erp.api.converter.entities.seguranca

import br.com.strn.erp.api.converter.subItem
import br.com.strn.erp.api.database.entities.seguranca.Perfil
import br.com.strn.erp.api.database.entities.seguranca.PerfilUsuario
import br.com.strn.erp.api.database.entities.seguranca.Usuario
import com.google.gson.*
import java.lang.reflect.Type

class GsonPerfilUsuario : JsonSerializer<PerfilUsuario>, JsonDeserializer<PerfilUsuario> {
    override fun serialize(src: PerfilUsuario?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        if ((src == null) || (context == null)) return null

        val json = JsonObject()
        json.addProperty("handle", src.handle)
        json.add("perfil", subItem(src.perfil?.handle))
        json.add("usuario", subItem(src.usuario?.handle))
        return json
    }

    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): PerfilUsuario? {
        if ((json == null) || (context == null)) return null

        val obj = json.asJsonObject
        return PerfilUsuario(
                id = obj.get("id").asLong,
                perfil = context.deserialize(obj.get("perfil"), Perfil::class.java),
                usuario = context.deserialize(obj.get("usuario"), Usuario::class.java),
                handle = obj.get("handle").asString
        )
    }
}