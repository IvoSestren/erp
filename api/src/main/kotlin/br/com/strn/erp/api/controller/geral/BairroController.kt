package br.com.strn.erp.api.controller.geral

import br.com.strn.erp.api.database.entities.geral.Bairro
import br.com.strn.erp.api.service.geral.BairroService
import br.com.strn.erp.api.util.Constants.Path.Param.HANDLE
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@Suppress("unused")
@RestController
@RequestMapping(value = ["/bairro"], produces = [MediaType.APPLICATION_JSON_VALUE])
class BairroController(
        private val service: BairroService
) {
    @GetMapping("/")
    fun findAll(pageable: Pageable): ResponseEntity<Page<Bairro>> {
        return ResponseEntity.ok(service.findAll(pageable))
    }

    @GetMapping(HANDLE)
    fun findByHandle(@PathVariable("handle") handle: String): ResponseEntity<Bairro> {
        return ResponseEntity.ok(service.findByHandle(handle))
    }

    @PostMapping("/")
    fun add(@RequestBody bairro: Bairro): ResponseEntity<Bairro> {
        return ResponseEntity.ok(service.add(bairro))
    }

    @PutMapping(HANDLE)
    fun update(@RequestBody bairro: Bairro, @PathVariable("handle") handle: String): ResponseEntity<Bairro> {
        return ResponseEntity.ok(service.update(bairro, handle))
    }

    @DeleteMapping(HANDLE)
    fun delete(@PathVariable("handle") handle: String): ResponseEntity<Bairro> {
        return ResponseEntity.ok(service.delete(handle))
    }
}