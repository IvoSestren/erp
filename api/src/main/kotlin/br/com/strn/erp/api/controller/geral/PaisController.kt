package br.com.strn.erp.api.controller.geral

import br.com.strn.erp.api.database.entities.geral.Pais
import br.com.strn.erp.api.service.geral.PaisService
import br.com.strn.erp.api.util.Constants.Path.Param.HANDLE
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@Suppress("unused")
@RestController
@RequestMapping(value = ["/pais"], produces = [MediaType.APPLICATION_JSON_VALUE])
class PaisController(
        private val service: PaisService
) {
    @GetMapping("/")
    fun findAll(pageable: Pageable): ResponseEntity<Page<Pais>> {
        return ResponseEntity.ok(service.findAll(pageable))
    }

    @GetMapping(HANDLE)
    fun findByHandle(@PathVariable("handle") handle: String): ResponseEntity<Pais> {
        return ResponseEntity.ok(service.findByHandle(handle))
    }

    @PostMapping("/")
    fun add(@RequestBody pais: Pais): ResponseEntity<Pais> {
        return ResponseEntity.ok(service.add(pais))
    }

    @PutMapping(HANDLE)
    fun update(@RequestBody pais: Pais, @PathVariable("handle") handle: String): ResponseEntity<Pais> {
        return ResponseEntity.ok(service.update(pais, handle))
    }

    @DeleteMapping(HANDLE)
    fun delete(@PathVariable("handle") handle: String): ResponseEntity<Pais> {
        return ResponseEntity.ok(service.delete(handle))
    }
}