package br.com.strn.erp.api.converter.entities.seguranca

import br.com.strn.erp.api.database.entities.enums.TipoPermissao
import br.com.strn.erp.api.database.entities.seguranca.Permissao
import com.google.gson.*
import java.lang.reflect.Type

class GsonPermissao : JsonSerializer<Permissao>, JsonDeserializer<Permissao> {
    override fun serialize(src: Permissao?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        if ((src == null) || (context == null)) return null

        val json = JsonObject()
        json.addProperty("handle", src.handle)
        json.addProperty("nome", src.nome)
        json.addProperty("descricao", src.descricao)
        json.addProperty("identificador", src.identificador?.name)
        return json
    }

    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): Permissao? {
        if ((json == null) || (context == null)) return null

        val obj = json.asJsonObject
        return Permissao(
                id = obj.get("id").asLong,
                nome = obj.get("nome").asString,
                descricao = obj.get("descricao").asString,
                identificador = TipoPermissao.valueOf(obj.get("identificador").asString),
                handle = obj.get("handle").asString
        )
    }
}