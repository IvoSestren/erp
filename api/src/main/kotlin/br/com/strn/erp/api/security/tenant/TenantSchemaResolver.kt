package br.com.strn.erp.api.security.tenant

import org.hibernate.context.spi.CurrentTenantIdentifierResolver
import org.springframework.stereotype.Component

@Component
class TenantSchemaResolver : CurrentTenantIdentifierResolver {
    override fun resolveCurrentTenantIdentifier(): String {
        return TenantContext.schema.get() ?: return FlywayConfig.DEFAULT_SCHEMA
    }

    override fun validateExistingCurrentSessions(): Boolean {
        return true
    }

}