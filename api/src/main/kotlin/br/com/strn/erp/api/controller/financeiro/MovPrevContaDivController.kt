package br.com.strn.erp.api.controller.financeiro

import br.com.strn.erp.api.database.entities.financeiro.MovPrevContaDiv
import br.com.strn.erp.api.service.financeiro.MovPrevContaDivService
import br.com.strn.erp.api.util.Constants.Path.Param.HANDLE
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@Suppress("unused")
@RestController
@RequestMapping(value = ["/previsao/conta/movimentacao/divisao"], produces = [MediaType.APPLICATION_JSON_VALUE])
class MovPrevContaDivController(
        private val service: MovPrevContaDivService
) {
    @GetMapping("/")
    fun findAll(pageable: Pageable): ResponseEntity<Page<MovPrevContaDiv>> {
        return ResponseEntity.ok(service.findAll(pageable))
    }

    @GetMapping(HANDLE)
    fun findByHandle(@PathVariable("handle") handle: String): ResponseEntity<MovPrevContaDiv> {
        return ResponseEntity.ok(service.findByHandle(handle))
    }

    @PostMapping("/")
    fun add(@RequestBody movPrevContaDiv: MovPrevContaDiv): ResponseEntity<MovPrevContaDiv> {
        return ResponseEntity.ok(service.add(movPrevContaDiv))
    }

    @PutMapping(HANDLE)
    fun update(@RequestBody movPrevContaDiv: MovPrevContaDiv, @PathVariable("handle") handle: String): ResponseEntity<MovPrevContaDiv> {
        return ResponseEntity.ok(service.update(movPrevContaDiv, handle))
    }

    @DeleteMapping(HANDLE)
    fun delete(@PathVariable("handle") handle: String): ResponseEntity<MovPrevContaDiv> {
        return ResponseEntity.ok(service.delete(handle))
    }
}