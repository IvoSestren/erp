package br.com.strn.erp.api.converter

import com.google.gson.JsonElement
import com.google.gson.JsonObject

fun subItem(handle: String?): JsonElement? {
    return if (handle == null) {
        null
    } else {
        val json = JsonObject()
        json.addProperty("handle", handle)
        json
    }
}
