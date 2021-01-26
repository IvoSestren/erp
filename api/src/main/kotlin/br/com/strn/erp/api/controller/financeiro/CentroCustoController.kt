package br.com.strn.erp.api.controller.financeiro

import br.com.strn.erp.api.database.entities.financeiro.CentroCusto
import br.com.strn.erp.api.service.financeiro.CentroCustoService
import br.com.strn.erp.api.util.Constants.Path.Param.HANDLE
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@Suppress("unused")
@RestController
@RequestMapping(value = ["/centrocusto"], produces = [MediaType.APPLICATION_JSON_VALUE])
class CentroCustoController(
        private val service: CentroCustoService
) {
    @GetMapping("/")
    fun findAll(pageable: Pageable): ResponseEntity<Page<CentroCusto>> {
        return ResponseEntity.ok(service.findAll(pageable))
    }

    @GetMapping(HANDLE)
    fun findByHandle(@PathVariable("handle") handle: String): ResponseEntity<CentroCusto> {
        return ResponseEntity.ok(service.findByHandle(handle))
    }

    @PostMapping("/")
    fun add(@RequestBody centroCusto: CentroCusto): ResponseEntity<CentroCusto> {
        return ResponseEntity.ok(service.add(centroCusto))
    }

    @PutMapping(HANDLE)
    fun update(@RequestBody centroCusto: CentroCusto, @PathVariable("handle") handle: String): ResponseEntity<CentroCusto> {
        return ResponseEntity.ok(service.update(centroCusto, handle))
    }

    @DeleteMapping(HANDLE)
    fun delete(@PathVariable("handle") handle: String): ResponseEntity<CentroCusto> {
        return ResponseEntity.ok(service.delete(handle))
    }
}