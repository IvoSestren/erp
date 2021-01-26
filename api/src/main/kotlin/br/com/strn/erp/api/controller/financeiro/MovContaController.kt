package br.com.strn.erp.api.controller.financeiro

import br.com.strn.erp.api.database.entities.financeiro.MovConta
import br.com.strn.erp.api.service.financeiro.MovContaService
import br.com.strn.erp.api.util.Constants.Path.Param.HANDLE
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@Suppress("unused")
@RestController
@RequestMapping(value = ["/conta/movimento"], produces = [MediaType.APPLICATION_JSON_VALUE])
class MovContaController(
        private val service: MovContaService
) {
    @GetMapping("/")
    fun findAll(pageable: Pageable): ResponseEntity<Page<MovConta>> {
        return ResponseEntity.ok(service.findAll(pageable))
    }

    @GetMapping(HANDLE)
    fun findByHandle(@PathVariable("handle") handle: String): ResponseEntity<MovConta> {
        return ResponseEntity.ok(service.findByHandle(handle))
    }

    @PostMapping("/")
    fun add(@RequestBody movConta: MovConta): ResponseEntity<MovConta> {
        return ResponseEntity.ok(service.add(movConta))
    }

    @PutMapping(HANDLE)
    fun update(@RequestBody movConta: MovConta, @PathVariable("handle") handle: String): ResponseEntity<MovConta> {
        return ResponseEntity.ok(service.update(movConta, handle))
    }

    @DeleteMapping(HANDLE)
    fun delete(@PathVariable("handle") handle: String): ResponseEntity<MovConta> {
        return ResponseEntity.ok(service.delete(handle))
    }
}