package br.com.strn.erp.api.converter.entities.geral

import br.com.strn.erp.api.converter.subItem
import br.com.strn.erp.api.database.entities.geral.Estado
import br.com.strn.erp.api.database.entities.geral.Municipio
import com.google.gson.*
import java.lang.reflect.Type

class GsonMunicipio : JsonSerializer<Municipio>, JsonDeserializer<Municipio> {

    override fun serialize(src: Municipio?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        if ((src == null) || (context == null)) return null

        val json = JsonObject()
        json.addProperty("handle", src.handle)
        json.addProperty("nome", src.nome)
        json.addProperty("ibge", src.ibge)
        json.add("estado", subItem(src.estado?.handle))
        return json
    }

    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): Municipio? {
        if ((json == null) || (context == null)) return null

        val obj = json.asJsonObject
        return Municipio(
                id = obj.get("id").asLong,
                nome = obj.get("nome").asString,
                ibge = obj.get("ibge").asString,
                estado = context.deserialize(obj.get("estado"), Estado::class.java),
                handle = obj.get("handle").asString
        )
    }
}