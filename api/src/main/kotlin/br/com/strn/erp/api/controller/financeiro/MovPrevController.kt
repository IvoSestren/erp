package br.com.strn.erp.api.controller.financeiro

import br.com.strn.erp.api.database.entities.financeiro.MovPrev
import br.com.strn.erp.api.service.financeiro.MovPrevService
import br.com.strn.erp.api.util.Constants.Path.Param.HANDLE
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@Suppress("unused")
@RestController
@RequestMapping(value = ["/previsao"], produces = [MediaType.APPLICATION_JSON_VALUE])
class MovPrevController(
        private val service: MovPrevService
) {
    @GetMapping("/")
    fun findAll(pageable: Pageable): ResponseEntity<Page<MovPrev>> {
        return ResponseEntity.ok(service.findAll(pageable))
    }

    @GetMapping(HANDLE)
    fun findByHandle(@PathVariable("handle") handle: String): ResponseEntity<MovPrev> {
        return ResponseEntity.ok(service.findByHandle(handle))
    }

    @PostMapping("/")
    fun add(@RequestBody movPrev: MovPrev): ResponseEntity<MovPrev> {
        return ResponseEntity.ok(service.add(movPrev))
    }

    @PutMapping(HANDLE)
    fun update(@RequestBody movPrev: MovPrev, @PathVariable("handle") handle: String): ResponseEntity<MovPrev> {
        return ResponseEntity.ok(service.update(movPrev, handle))
    }

    @DeleteMapping(HANDLE)
    fun delete(@PathVariable("handle") handle: String): ResponseEntity<MovPrev> {
        return ResponseEntity.ok(service.delete(handle))
    }
}