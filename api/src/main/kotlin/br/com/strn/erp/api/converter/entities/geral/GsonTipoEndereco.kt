package br.com.strn.erp.api.converter.entities.geral

import br.com.strn.erp.api.database.entities.geral.TipoEndereco
import com.google.gson.*
import java.lang.reflect.Type

class GsonTipoEndereco : JsonSerializer<TipoEndereco>, JsonDeserializer<TipoEndereco> {
    override fun serialize(src: TipoEndereco?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        if (src == null) return null

        val json = JsonObject()

        json.addProperty("handle", src.handle)
        json.addProperty("nome", src.nome)
        json.addProperty("identificador", src.identificador)

        return json
    }

    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): TipoEndereco? {
        if ((json == null) || (context == null)) return null

        val obj = json.asJsonObject
        return TipoEndereco(
                id = obj.get("id").asLong,
                nome = obj.get("nome").asString,
                identificador = obj.get("identificador").asString,
                handle = obj.get("handle").asString
        )
    }
}