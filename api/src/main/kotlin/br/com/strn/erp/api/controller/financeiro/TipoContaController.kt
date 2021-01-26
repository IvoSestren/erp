package br.com.strn.erp.api.controller.financeiro

import br.com.strn.erp.api.database.entities.financeiro.TipoConta
import br.com.strn.erp.api.service.financeiro.TipoContaService
import br.com.strn.erp.api.util.Constants.Path.Param.HANDLE
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@Suppress("unused")
@RestController
@RequestMapping(value = ["/tipoconta"], produces = [MediaType.APPLICATION_JSON_VALUE])
class TipoContaController(
        private val service: TipoContaService
) {
    @GetMapping("/")
    fun findAll(pageable: Pageable): ResponseEntity<Page<TipoConta>> {
        return ResponseEntity.ok(service.findAll(pageable))
    }

    @GetMapping(HANDLE)
    fun findByHandle(@PathVariable("handle") handle: String): ResponseEntity<TipoConta> {
        return ResponseEntity.ok(service.findByHandle(handle))
    }

    @PostMapping("/")
    fun add(@RequestBody tipoConta: TipoConta): ResponseEntity<TipoConta> {
        return ResponseEntity.ok(service.add(tipoConta))
    }

    @PutMapping(HANDLE)
    fun update(@RequestBody tipoConta: TipoConta, @PathVariable("handle") handle: String): ResponseEntity<TipoConta> {
        return ResponseEntity.ok(service.update(tipoConta, handle))
    }

    @DeleteMapping(HANDLE)
    fun delete(@PathVariable("handle") handle: String): ResponseEntity<TipoConta> {
        return ResponseEntity.ok(service.delete(handle))
    }
}