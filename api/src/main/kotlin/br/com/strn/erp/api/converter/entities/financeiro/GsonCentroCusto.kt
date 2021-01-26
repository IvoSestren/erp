package br.com.strn.erp.api.converter.entities.financeiro

import br.com.strn.erp.api.converter.subItem
import br.com.strn.erp.api.database.entities.financeiro.CentroCusto
import com.google.gson.*
import java.lang.reflect.Type

class GsonCentroCusto : JsonSerializer<CentroCusto>, JsonDeserializer<CentroCusto> {
    override fun serialize(src: CentroCusto?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement? {
        if ((src == null) || (context == null)) return null

        val json = JsonObject()
        json.addProperty("handle", src.handle)
        json.addProperty("codigo", src.codigo)
        json.addProperty("nome", src.nome)
        json.add("centroCustoPai", subItem(src.centroCustoPai?.handle))
        return json
    }

    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): CentroCusto? {
        if ((json == null) || (context == null)) return null

        val obj = json.asJsonObject

        return CentroCusto(
                codigo = obj.get("codigo").asString,
                nome = obj.get("nome").asString,
                centroCustoPai = context.deserialize(obj.get("centroCustoPai"), CentroCusto::class.java),
                id = obj.get("id").asLong,
                handle = obj.get("handle").asString
        )
    }
}