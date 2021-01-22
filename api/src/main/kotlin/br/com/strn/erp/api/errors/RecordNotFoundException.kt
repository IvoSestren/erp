package br.com.strn.erp.api.errors

class RecordNotFoundException : RuntimeException {
    constructor() : super("Record not found")
}
