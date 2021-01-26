package br.com.strn.erp.api.controller.financeiro

import br.com.strn.erp.api.database.entities.financeiro.MovPrevConta
import br.com.strn.erp.api.service.financeiro.MovPrevContaService
import br.com.strn.erp.api.util.Constants.Path.Param.HANDLE
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@Suppress("unused")
@RestController
@RequestMapping(value = ["/previsao/conta/movimentacao"], produces = [MediaType.APPLICATION_JSON_VALUE])
class MovPrevContaController(
        private val service: MovPrevContaService
) {
    @GetMapping("/")
    fun findAll(pageable: Pageable): ResponseEntity<Page<MovPrevConta>> {
        return ResponseEntity.ok(service.findAll(pageable))
    }

    @GetMapping(HANDLE)
    fun findByHandle(@PathVariable("handle") handle: String): ResponseEntity<MovPrevConta> {
        return ResponseEntity.ok(service.findByHandle(handle))
    }

    @PostMapping("/")
    fun add(@RequestBody movPrevConta: MovPrevConta): ResponseEntity<MovPrevConta> {
        return ResponseEntity.ok(service.add(movPrevConta))
    }

    @PutMapping(HANDLE)
    fun update(@RequestBody movPrevConta: MovPrevConta, @PathVariable("handle") handle: String): ResponseEntity<MovPrevConta> {
        return ResponseEntity.ok(service.update(movPrevConta, handle))
    }

    @DeleteMapping(HANDLE)
    fun delete(@PathVariable("handle") handle: String): ResponseEntity<MovPrevConta> {
        return ResponseEntity.ok(service.delete(handle))
    }
}