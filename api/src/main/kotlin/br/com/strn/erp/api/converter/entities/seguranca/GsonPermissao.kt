package br.com.strn.erp.api.converter.entities.seguranca

import br.com.strn.erp.api.database.entities.seguranca.Permissao
import com.google.gson.JsonElement
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonSerializer
import java.lang.reflect.Type

class GsonPermissao : JsonSerializer<Permissao> {
    override fun serialize(src: Permissao?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}