package br.com.strn.erp.api.converter.entities.financeiro

import br.com.strn.erp.api.database.entities.financeiro.MovPrevContaDiv
import com.google.gson.JsonElement
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonSerializer
import java.lang.reflect.Type

class GsonMovPrevContaDiv : JsonSerializer<MovPrevContaDiv> {
    override fun serialize(src: MovPrevContaDiv?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}