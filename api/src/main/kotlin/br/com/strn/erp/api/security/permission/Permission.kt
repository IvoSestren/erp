package br.com.strn.erp.api.security.permission

import br.com.strn.erp.api.database.entities.enums.TipoPermissao

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.TYPE, AnnotationTarget.FUNCTION)
annotation class Permission(
        vararg val value: TipoPermissao
)