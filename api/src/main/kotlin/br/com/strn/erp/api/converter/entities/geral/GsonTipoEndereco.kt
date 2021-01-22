package br.com.strn.erp.api.converter.entities.geral

import br.com.strn.erp.api.database.entities.geral.TipoEndereco
import com.google.gson.JsonElement
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonSerializer
import java.lang.reflect.Type

class GsonTipoEndereco : JsonSerializer<TipoEndereco> {
    override fun serialize(src: TipoEndereco?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}