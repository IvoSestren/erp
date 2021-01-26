package br.com.strn.erp.api.controller.geral

import br.com.strn.erp.api.database.entities.geral.Configuracao
import br.com.strn.erp.api.service.geral.ConfiguracaoService
import br.com.strn.erp.api.util.Constants.Path.Param.HANDLE
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@Suppress("unused")
@RestController
@RequestMapping(value = ["/configuracao"], produces = [MediaType.APPLICATION_JSON_VALUE])
class ConfiguracaoController(
        private val service: ConfiguracaoService
) {
    @GetMapping("/")
    fun findAll(pageable: Pageable): ResponseEntity<Page<Configuracao>> {
        return ResponseEntity.ok(service.findAll(pageable))
    }

    @GetMapping(HANDLE)
    fun findByHandle(@PathVariable("handle") handle: String): ResponseEntity<Configuracao> {
        return ResponseEntity.ok(service.findByHandle(handle))
    }

    @PostMapping("/")
    fun add(@RequestBody configuracao: Configuracao): ResponseEntity<Configuracao> {
        return ResponseEntity.ok(service.add(configuracao))
    }

    @PutMapping(HANDLE)
    fun update(@RequestBody configuracao: Configuracao, @PathVariable("handle") handle: String): ResponseEntity<Configuracao> {
        return ResponseEntity.ok(service.update(configuracao, handle))
    }

    @DeleteMapping(HANDLE)
    fun delete(@PathVariable("handle") handle: String): ResponseEntity<Configuracao> {
        return ResponseEntity.ok(service.delete(handle))
    }
}