package br.com.strn.erp.api.converter.entities.geral

import br.com.strn.erp.api.database.entities.geral.Anexo
import com.google.gson.*
import java.lang.reflect.Type

class GsonAnexo : JsonSerializer<Anexo>, JsonDeserializer<Anexo> {
    override fun serialize(src: Anexo?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        if (src == null)
            return null

        val json = JsonObject()
        json.addProperty("handle", src.handle)
        json.addProperty("nomeArquivo", src.nomeArquivo)
        json.addProperty("mimeType", src.mimeType)
        json.addProperty("tamanho", src.tamanho)

        return json
    }

    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): Anexo? {
        if ((json == null) || (context == null)) return null

        val obj = json.asJsonObject
        return Anexo(
                id = obj.get("id").asLong,
                nomeArquivo = obj.get("nomeArquivo").asString,
                mimeType = obj.get("mimeType").asString,
                tamanho = obj.get("tamanho").asLong,
                handle = obj.get("handle").asString
        )
    }
}