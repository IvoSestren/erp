package br.com.strn.erp.api.converter.entities.geral

import br.com.strn.erp.api.database.entities.geral.Municipio
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonSerializer
import java.lang.reflect.Type

class GsonMunicipio : JsonSerializer<Municipio> {
    override fun serialize(src: Municipio?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {

        if (src == null) return null

        val json = JsonObject()

        json.addProperty("id", src.id)
        json.addProperty("nome", src.nome)
        json.addProperty("ibge", src.ibge)

        val estado = src.estado
        if (estado != null) {
            val jsonEstado = JsonObject()
            jsonEstado.addProperty("id", estado.id)
            json.add("estado", jsonEstado)
        }

        return json
    }
}