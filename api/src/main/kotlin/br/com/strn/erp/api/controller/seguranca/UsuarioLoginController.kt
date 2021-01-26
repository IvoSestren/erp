package br.com.strn.erp.api.controller.seguranca

import br.com.strn.erp.api.database.entities.seguranca.UsuarioLogin
import br.com.strn.erp.api.service.seguranca.UsuarioLoginService
import br.com.strn.erp.api.util.Constants.Path.Param.HANDLE
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@Suppress("unused")
@RestController
@RequestMapping(value = ["/usuario/login"], produces = [MediaType.APPLICATION_JSON_VALUE])
class UsuarioLoginController(
        private val service: UsuarioLoginService
) {
    @GetMapping("/")
    fun findAll(pageable: Pageable): ResponseEntity<Page<UsuarioLogin>> {
        return ResponseEntity.ok(service.findAll(pageable))
    }

    @GetMapping(HANDLE)
    fun findByHandle(@PathVariable("handle") handle: String): ResponseEntity<UsuarioLogin> {
        return ResponseEntity.ok(service.findByHandle(handle))
    }

    @PostMapping("/")
    fun add(@RequestBody usuarioLogin: UsuarioLogin): ResponseEntity<UsuarioLogin> {
        return ResponseEntity.ok(service.add(usuarioLogin))
    }

    @PutMapping(HANDLE)
    fun update(@RequestBody usuarioLogin: UsuarioLogin, @PathVariable("handle") handle: String): ResponseEntity<UsuarioLogin> {
        return ResponseEntity.ok(service.update(usuarioLogin, handle))
    }

    @DeleteMapping(HANDLE)
    fun delete(@PathVariable("handle") handle: String): ResponseEntity<UsuarioLogin> {
        return ResponseEntity.ok(service.delete(handle))
    }
}