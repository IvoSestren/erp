package br.com.strn.erp.api.converter.entities.geral

import br.com.strn.erp.api.database.entities.enums.ConfiguracaoChave
import br.com.strn.erp.api.database.entities.geral.Configuracao
import com.google.gson.*
import java.lang.reflect.Type

class GsonConfiguracao : JsonSerializer<Configuracao>, JsonDeserializer<Configuracao> {
    override fun serialize(src: Configuracao?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        if (src == null) return null

        val json = JsonObject()
        json.addProperty("handle", src.handle)
        json.addProperty("chave", src.chave?.name)
        json.addProperty("valor", src.valor)
        return json
    }

    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): Configuracao? {
        if (json == null) return null

        val obj = json.asJsonObject

        return Configuracao(
                chave = ConfiguracaoChave.valueOf(obj.get("chave").asString),
                valor = obj.get("valor").asString,
                id = obj.get("id").asLong,
                handle = obj.get("handle").asString
        )
    }
}