package br.com.strn.erp.api.converter.entities.geral

import br.com.strn.erp.api.converter.subItem
import br.com.strn.erp.api.database.entities.geral.Estado
import br.com.strn.erp.api.database.entities.geral.Pais
import com.google.gson.*
import java.lang.reflect.Type

class GsonEstado : JsonSerializer<Estado>, JsonDeserializer<Estado> {
    override fun serialize(src: Estado?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        if ((src == null) || (context == null)) return null

        val json = JsonObject()
        json.addProperty("handle", src.handle)
        json.addProperty("nome", src.nome)
        json.addProperty("abreviacao", src.abreviacao)
        json.add("pais", subItem(src.pais?.handle))
        return json
    }

    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): Estado? {
        if ((json == null) || (context == null)) return null

        val obj = json.asJsonObject
        return Estado(
                id = obj.get("id").asLong,
                nome = obj.get("nome").asString,
                abreviacao = obj.get("abreviacao").asString,
                pais = context.deserialize(obj.get("pais"), Pais::class.java),
                handle = obj.get("handle").asString
        )
    }
}