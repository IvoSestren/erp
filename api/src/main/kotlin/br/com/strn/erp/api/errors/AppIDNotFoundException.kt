package br.com.strn.erp.api.errors

class AppIDNotFoundException : RuntimeException {
    constructor() : super("AppID not found")
}