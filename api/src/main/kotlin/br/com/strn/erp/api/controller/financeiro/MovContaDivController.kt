package br.com.strn.erp.api.controller.financeiro

import br.com.strn.erp.api.database.entities.financeiro.MovContaDiv
import br.com.strn.erp.api.service.financeiro.MovContaDivService
import br.com.strn.erp.api.util.Constants.Path.Param.HANDLE
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@Suppress("unused")
@RestController
@RequestMapping(value = ["/conta/movimento/divisao"], produces = [MediaType.APPLICATION_JSON_VALUE])
class MovContaDivController(
        private val service: MovContaDivService
) {
    @GetMapping("/")
    fun findAll(pageable: Pageable): ResponseEntity<Page<MovContaDiv>> {
        return ResponseEntity.ok(service.findAll(pageable))
    }

    @GetMapping(HANDLE)
    fun findByHandle(@PathVariable("handle") handle: String): ResponseEntity<MovContaDiv> {
        return ResponseEntity.ok(service.findByHandle(handle))
    }

    @PostMapping("/")
    fun add(@RequestBody movContaDiv: MovContaDiv): ResponseEntity<MovContaDiv> {
        return ResponseEntity.ok(service.add(movContaDiv))
    }

    @PutMapping(HANDLE)
    fun update(@RequestBody movContaDiv: MovContaDiv, @PathVariable("handle") handle: String): ResponseEntity<MovContaDiv> {
        return ResponseEntity.ok(service.update(movContaDiv, handle))
    }

    @DeleteMapping(HANDLE)
    fun delete(@PathVariable("handle") handle: String): ResponseEntity<MovContaDiv> {
        return ResponseEntity.ok(service.delete(handle))
    }
}