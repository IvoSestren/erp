package br.com.strn.erp.api.controller.seguranca

import br.com.strn.erp.api.database.entities.seguranca.Tenant
import br.com.strn.erp.api.service.seguranca.TenantService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Suppress("unused")
@RestController
@RequestMapping(value = ["/tenant"], produces = [MediaType.APPLICATION_JSON_VALUE])
class TenantController(
        private val service: TenantService
) {
    @GetMapping("/")
    fun findAll(pageable: Pageable): ResponseEntity<Page<Tenant>> {
        return ResponseEntity.ok(service.findAll(pageable))
    }
}