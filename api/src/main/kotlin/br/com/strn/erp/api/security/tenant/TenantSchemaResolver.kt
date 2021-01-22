package br.com.strn.erp.api.security.tenant

import org.hibernate.context.spi.CurrentTenantIdentifierResolver
import org.springframework.stereotype.Component

@Component
class TenantSchemaResolver : CurrentTenantIdentifierResolver {
    override fun resolveCurrentTenantIdentifier(): String {
        var schema = TenantContext.schema.get()
        if (schema == null)
            schema = FlywayConfig.DEFAULT_SCHEMA
        return schema
    }

    override fun validateExistingCurrentSessions(): Boolean {
        return true
    }

}