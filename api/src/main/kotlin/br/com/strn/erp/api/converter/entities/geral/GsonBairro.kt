package br.com.strn.erp.api.converter.entities.geral

import br.com.strn.erp.api.database.entities.geral.Bairro
import com.google.gson.JsonElement
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonSerializer
import java.lang.reflect.Type

class GsonBairro : JsonSerializer<Bairro> {
    override fun serialize(src: Bairro?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}