package br.com.strn.erp.api.converter.entities.identificacao

import br.com.strn.erp.api.database.entities.identificacao.Pessoa
import com.google.gson.JsonElement
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonSerializer
import java.lang.reflect.Type

class GsonPessoa : JsonSerializer<Pessoa> {
    override fun serialize(src: Pessoa?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}