package br.com.strn.erp.api.controller.financeiro

import br.com.strn.erp.api.database.entities.financeiro.Conta
import br.com.strn.erp.api.service.financeiro.ContaService
import br.com.strn.erp.api.util.Constants.Path.Param.HANDLE
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@Suppress("unused")
@RestController
@RequestMapping(value = ["/conta"], produces = [MediaType.APPLICATION_JSON_VALUE])
class ContaController(
        private val service: ContaService
) {
    @GetMapping("/")
    fun findAll(pageable: Pageable): ResponseEntity<Page<Conta>> {
        return ResponseEntity.ok(service.findAll(pageable))
    }

    @GetMapping(HANDLE)
    fun findByHandle(@PathVariable("handle") handle: String): ResponseEntity<Conta> {
        return ResponseEntity.ok(service.findByHandle(handle))
    }

    @PostMapping("/")
    fun add(@RequestBody conta: Conta): ResponseEntity<Conta> {
        return ResponseEntity.ok(service.add(conta))
    }

    @PutMapping(HANDLE)
    fun update(@RequestBody conta: Conta, @PathVariable("handle") handle: String): ResponseEntity<Conta> {
        return ResponseEntity.ok(service.update(conta, handle))
    }

    @DeleteMapping(HANDLE)
    fun delete(@PathVariable("handle") handle: Long): ResponseEntity<Conta> {
        return ResponseEntity.ok(service.delete(handle))
    }
}