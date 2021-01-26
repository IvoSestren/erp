package br.com.strn.erp.api.database.util

import java.util.*

fun newHandle(): String {
    return UUID.randomUUID().toString()
}