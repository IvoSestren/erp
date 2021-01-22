package br.com.strn.erp.api.errors

class PermissionException : RuntimeException {
    constructor() : super("Permission denied")
}