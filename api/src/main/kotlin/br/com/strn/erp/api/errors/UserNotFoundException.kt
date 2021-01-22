package br.com.strn.erp.api.errors

class UserNotFoundException : RuntimeException {
    constructor() : super("User not found")
}