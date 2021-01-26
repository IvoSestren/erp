package br.com.strn.erp.api.controller.seguranca

import br.com.strn.erp.api.database.entities.seguranca.Usuario
import br.com.strn.erp.api.service.seguranca.UsuarioService
import br.com.strn.erp.api.util.Constants.Path.Param.HANDLE
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@Suppress("unused")
@RestController
@RequestMapping(value = ["/usuario"], produces = [MediaType.APPLICATION_JSON_VALUE])
class UsuarioController(
        private val service: UsuarioService
) {
    @GetMapping("/")
    fun findAll(pageable: Pageable): ResponseEntity<Page<Usuario>> {
        return ResponseEntity.ok(service.findAll(pageable))
    }

    @GetMapping(HANDLE)
    fun findByHandle(@PathVariable("handle") handle: String): ResponseEntity<Usuario> {
        return ResponseEntity.ok(service.findByHandle(handle))
    }

    @PostMapping("/")
    fun add(@RequestBody usuario: Usuario): ResponseEntity<Usuario> {
        return ResponseEntity.ok(service.add(usuario))
    }

    @PutMapping(HANDLE)
    fun update(@RequestBody usuario: Usuario, @PathVariable("handle") handle: String): ResponseEntity<Usuario> {
        return ResponseEntity.ok(service.update(usuario, handle))
    }

    @DeleteMapping(HANDLE)
    fun delete(@PathVariable("handle") handle: String): ResponseEntity<Usuario> {
        return ResponseEntity.ok(service.delete(handle))
    }
}