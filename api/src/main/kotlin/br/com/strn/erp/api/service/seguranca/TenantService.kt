package br.com.strn.erp.api.service.seguranca

import br.com.strn.erp.api.database.dao.seguranca.TenantRepository
import br.com.strn.erp.api.database.entities.seguranca.Tenant
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class TenantService(
        private val repository: TenantRepository
) {
    fun findAll(pageable: Pageable): Page<Tenant> {
        return repository.findAll(pageable)
    }

}