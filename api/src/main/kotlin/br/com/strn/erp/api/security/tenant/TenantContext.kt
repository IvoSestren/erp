package br.com.strn.erp.api.security.tenant

class TenantContext {
    companion object {
        val schema: ThreadLocal<String> = InheritableThreadLocal()
    }
}
