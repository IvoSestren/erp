package br.com.strn.erp.api.converter.entities.geral

import br.com.strn.erp.api.database.entities.geral.Pais
import com.google.gson.*
import java.lang.reflect.Type

class GsonPais : JsonSerializer<Pais>, JsonDeserializer<Pais> {
    override fun serialize(src: Pais?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        if (src == null) return null

        val json = JsonObject()

        json.addProperty("handle", src.handle)
        json.addProperty("nome", src.nome)
        json.addProperty("abreviacao", src.abreviacao)
        json.addProperty("nomeInternacional", src.nomeInternacional)
        json.addProperty("codigoBancoCentral", src.codigoBancoCentral)
        json.addProperty("codigoInternacional", src.codigoInternacional)

        return json
    }

    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): Pais? {
        if ((json == null) || (context == null)) return null

        val obj = json.asJsonObject
        return Pais(
                id = obj.get("id").asLong,
                nome = obj.get("nome").asString,
                abreviacao = obj.get("abreviacao").asString,
                nomeInternacional = obj.get("nomeInternacional").asString,
                codigoBancoCentral = obj.get("codigoBancoCentral").asString,
                codigoInternacional = obj.get("codigoInternacional").asString,
                handle = obj.get("handle").asString
        )
    }
}