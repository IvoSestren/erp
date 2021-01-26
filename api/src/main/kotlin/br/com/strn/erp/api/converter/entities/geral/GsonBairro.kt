package br.com.strn.erp.api.converter.entities.geral

import br.com.strn.erp.api.converter.subItem
import br.com.strn.erp.api.database.entities.geral.Bairro
import br.com.strn.erp.api.database.entities.geral.Municipio
import com.google.gson.*
import java.lang.reflect.Type

class GsonBairro : JsonSerializer<Bairro>, JsonDeserializer<Bairro> {
    override fun serialize(src: Bairro?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        if ((src == null) || (context == null)) return null

        val json = JsonObject()
        json.addProperty("handle", src.handle)
        json.addProperty("nome", src.nome)
        json.add("municipio", subItem(src.municipio?.handle))
        return json
    }

    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): Bairro? {
        if ((json == null) || (context == null)) return null

        val obj = json.asJsonObject
        return Bairro(
                id = obj.get("id").asLong,
                nome = obj.get("nome").asString,
                municipio = context.deserialize(obj.get("municipio"), Municipio::class.java),
                handle = obj.get("handle").asString
        )
    }
}