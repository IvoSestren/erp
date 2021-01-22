package br.com.strn.erp.api.converter.entities.financeiro

import br.com.strn.erp.api.database.entities.financeiro.TipoConta
import com.google.gson.JsonElement
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonSerializer
import java.lang.reflect.Type

class GsonTipoConta : JsonSerializer<TipoConta> {
    override fun serialize(src: TipoConta?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}