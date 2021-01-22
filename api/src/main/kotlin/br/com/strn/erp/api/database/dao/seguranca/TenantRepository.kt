package br.com.strn.erp.api.database.dao.seguranca

import br.com.strn.erp.api.database.entities.seguranca.Tenant
import org.springframework.data.jpa.repository.JpaRepository

interface TenantRepository : JpaRepository<Tenant, Long> {
    fun findByNome(nome: String): Tenant?
}