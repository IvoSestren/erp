package br.com.strn.erp.api.converter.entities.identificacao

import br.com.strn.erp.api.converter.subItem
import br.com.strn.erp.api.database.entities.geral.Bairro
import br.com.strn.erp.api.database.entities.geral.Estado
import br.com.strn.erp.api.database.entities.geral.Municipio
import br.com.strn.erp.api.database.entities.geral.Pais
import br.com.strn.erp.api.database.entities.identificacao.Endereco
import com.google.gson.*
import java.lang.reflect.Type

class GsonEndereco : JsonSerializer<Endereco>, JsonDeserializer<Endereco> {
    override fun serialize(src: Endereco?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        if ((src == null) || (context == null)) return null

        val json = JsonObject()
        json.addProperty("handle", src.handle)
        json.addProperty("logradouro", src.logradouro)
        json.addProperty("numero", src.numero)
        json.addProperty("complemento", src.complemento)
        json.add("pais", subItem(src.pais?.handle))
        json.add("estado", subItem(src.estado?.handle))
        json.add("municipio", subItem(src.municipio?.handle))
        json.add("bairro", subItem(src.bairro?.handle))
        return json
    }

    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): Endereco? {
        if ((json == null) || (context == null)) return null

        val obj = json.asJsonObject
        return Endereco(
                id = obj.get("id").asLong,
                logradouro = obj.get("logradouro").asString,
                numero = obj.get("numero").asString,
                complemento = obj.get("complemento").asString,
                pais = context.deserialize(obj.get("pais"), Pais::class.java),
                estado = context.deserialize(obj.get("estado"), Estado::class.java),
                municipio = context.deserialize(obj.get("municipio"), Municipio::class.java),
                bairro = context.deserialize(obj.get("bairro"), Bairro::class.java),
                handle = obj.get("handle").asString
        )
    }
}