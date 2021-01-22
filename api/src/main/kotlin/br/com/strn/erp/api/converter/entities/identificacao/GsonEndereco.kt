package br.com.strn.erp.api.converter.entities.identificacao

import br.com.strn.erp.api.database.entities.identificacao.Endereco
import com.google.gson.JsonElement
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonSerializer
import java.lang.reflect.Type

class GsonEndereco : JsonSerializer<Endereco> {
    override fun serialize(src: Endereco?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}