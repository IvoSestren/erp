package br.com.strn.erp.api.converter.entities.identificacao

import br.com.strn.erp.api.database.entities.identificacao.Pessoa
import com.google.gson.*
import java.lang.reflect.Type

class GsonPessoa : JsonSerializer<Pessoa>, JsonDeserializer<Pessoa> {
    override fun serialize(src: Pessoa?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        if ((src == null) || (context == null)) return null

        val json = JsonObject()
        json.addProperty("handle", src.handle)
        json.addProperty("nome", src.nome)
        json.addProperty("juricia", src.juridica)
        json.addProperty("cnpj", src.cnpj)
        return json
    }

    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): Pessoa? {
        if ((json == null) || (context == null)) return null

        val obj = json.asJsonObject
        return Pessoa(
                id = obj.get("id").asLong,
                nome = obj.get("nome").asString,
                juridica = obj.get("juridica").asBoolean,
                cnpj = obj.get("cnpj").asString,
                handle = obj.get("handle").asString
        )
    }
}