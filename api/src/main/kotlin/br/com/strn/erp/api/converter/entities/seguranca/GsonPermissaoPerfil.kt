package br.com.strn.erp.api.converter.entities.seguranca

import br.com.strn.erp.api.converter.subItem
import br.com.strn.erp.api.database.entities.seguranca.Perfil
import br.com.strn.erp.api.database.entities.seguranca.Permissao
import br.com.strn.erp.api.database.entities.seguranca.PermissaoPerfil
import com.google.gson.*
import java.lang.reflect.Type

class GsonPermissaoPerfil : JsonSerializer<PermissaoPerfil>, JsonDeserializer<PermissaoPerfil> {
    override fun serialize(src: PermissaoPerfil?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        if ((src == null) || (context == null)) return null

        val json = JsonObject()
        json.addProperty("handle", src.handle)
        json.add("permissao", subItem(src.permissao?.handle))
        json.add("perfil", subItem(src.perfil?.handle))
        return json
    }

    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): PermissaoPerfil? {
        if ((json == null) || (context == null)) return null

        val obj = json.asJsonObject
        return PermissaoPerfil(
                id = obj.get("id").asLong,
                permissao = context.deserialize(obj.get("permissao"), Permissao::class.java),
                perfil = context.deserialize(obj.get("perfil"), Perfil::class.java),
                handle = obj.get("handle").asString
        )
    }
}