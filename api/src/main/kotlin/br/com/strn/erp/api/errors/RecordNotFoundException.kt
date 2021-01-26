package br.com.strn.erp.api.errors

import kotlin.reflect.KClass

class RecordNotFoundException : RuntimeException {
    constructor() : super("Record not found")
    constructor(entity: KClass<*>, id: Long) : super("Record not found: ${entity.simpleName} = $id")
    constructor(entity: KClass<*>, value: String) : super("Record not found: ${entity.simpleName} = $value")
}
