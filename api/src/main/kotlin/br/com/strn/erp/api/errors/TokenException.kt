package br.com.strn.erp.api.errors

class TokenException : RuntimeException {
    constructor() : super("Token invalid or expired")
}