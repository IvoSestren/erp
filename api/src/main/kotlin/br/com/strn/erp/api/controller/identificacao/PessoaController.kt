package br.com.strn.erp.api.controller.identificacao

import br.com.strn.erp.api.database.entities.identificacao.Pessoa
import br.com.strn.erp.api.service.identificacao.PessoaService
import br.com.strn.erp.api.util.Constants
import br.com.strn.erp.api.util.Constants.Path.Param.HANDLE
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@Suppress("unused")
@RestController
@RequestMapping(value = ["/pessoa"], produces = [MediaType.APPLICATION_JSON_VALUE])
class PessoaController(
        private val service: PessoaService
) {
    @GetMapping("/")
    fun findAll(pageable: Pageable): ResponseEntity<Page<Pessoa>> {
        return ResponseEntity.ok(service.findAll(pageable))
    }

    @GetMapping(HANDLE)
    fun findByHandle(@PathVariable("handle") handle: String): ResponseEntity<Pessoa> {
        return ResponseEntity.ok(service.findByHandle(handle))
    }

    @PostMapping("/")
    fun add(@RequestBody pessoa: Pessoa): ResponseEntity<Pessoa> {
        return ResponseEntity.ok(service.add(pessoa))
    }

    @PutMapping(HANDLE)
    fun update(@RequestBody pessoa: Pessoa, @PathVariable("handle") handle: String): ResponseEntity<Pessoa> {
        return ResponseEntity.ok(service.update(pessoa, handle))
    }

    @DeleteMapping(HANDLE)
    fun delete(@PathVariable("handle") handle: String): ResponseEntity<Pessoa> {
        return ResponseEntity.ok(service.delete(handle))
    }
}