package br.com.strn.erp.api.controller.financeiro

import br.com.strn.erp.api.database.entities.financeiro.PlanoConta
import br.com.strn.erp.api.service.financeiro.PlanoContaService
import br.com.strn.erp.api.util.Constants.Path.Param.HANDLE
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@Suppress("unused")
@RestController
@RequestMapping(value = ["/planoconta"], produces = [MediaType.APPLICATION_JSON_VALUE])
class PlanoContaController(
        private val service: PlanoContaService
) {
    @GetMapping("/")
    fun findAll(pageable: Pageable): ResponseEntity<Page<PlanoConta>> {
        return ResponseEntity.ok(service.findAll(pageable))
    }

    @GetMapping(HANDLE)
    fun findByHandle(@PathVariable("handle") handle: String): ResponseEntity<PlanoConta> {
        return ResponseEntity.ok(service.findByHandle(handle))
    }

    @PostMapping("/")
    fun add(@RequestBody planoConta: PlanoConta): ResponseEntity<PlanoConta> {
        return ResponseEntity.ok(service.add(planoConta))
    }

    @PutMapping(HANDLE)
    fun update(@RequestBody planoConta: PlanoConta, @PathVariable("handle") handle: String): ResponseEntity<PlanoConta> {
        return ResponseEntity.ok(service.update(planoConta, handle))
    }

    @DeleteMapping(HANDLE)
    fun delete(@PathVariable("handle") handle: String): ResponseEntity<PlanoConta> {
        return ResponseEntity.ok(service.delete(handle))
    }
}