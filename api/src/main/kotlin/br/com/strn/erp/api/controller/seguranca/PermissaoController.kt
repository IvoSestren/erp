package br.com.strn.erp.api.controller.seguranca

import br.com.strn.erp.api.database.entities.seguranca.Permissao
import br.com.strn.erp.api.service.seguranca.PermissaoService
import br.com.strn.erp.api.util.Constants.Path.Param.HANDLE
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@Suppress("unused")
@RestController
@RequestMapping(value = ["/permissao"], produces = [MediaType.APPLICATION_JSON_VALUE])
class PermissaoController(
        private val service: PermissaoService
) {
    @GetMapping("/")
    fun findAll(pageable: Pageable): ResponseEntity<Page<Permissao>> {
        return ResponseEntity.ok(service.findAll(pageable))
    }

    @GetMapping(HANDLE)
    fun findByHandle(@PathVariable("handle") handle: String): ResponseEntity<Permissao> {
        return ResponseEntity.ok(service.findByHandle(handle))
    }

    @PostMapping("/")
    fun add(@RequestBody permissao: Permissao): ResponseEntity<Permissao> {
        return ResponseEntity.ok(service.add(permissao))
    }

    @PutMapping(HANDLE)
    fun update(@RequestBody permissao: Permissao, @PathVariable("handle") handle: String): ResponseEntity<Permissao> {
        return ResponseEntity.ok(service.update(permissao, handle))
    }

    @DeleteMapping(HANDLE)
    fun delete(@PathVariable("handle") handle: String): ResponseEntity<Permissao> {
        return ResponseEntity.ok(service.delete(handle))
    }
}