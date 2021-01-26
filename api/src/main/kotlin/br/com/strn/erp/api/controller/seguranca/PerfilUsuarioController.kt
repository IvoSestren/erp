package br.com.strn.erp.api.controller.seguranca

import br.com.strn.erp.api.database.entities.seguranca.PerfilUsuario
import br.com.strn.erp.api.service.seguranca.PerfilUsuarioService
import br.com.strn.erp.api.util.Constants.Path.Param.HANDLE
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@Suppress("unused")
@RestController
@RequestMapping(value = ["/perfil/usuario"], produces = [MediaType.APPLICATION_JSON_VALUE])
class PerfilUsuarioController(
        private val service: PerfilUsuarioService
) {
    @GetMapping("/")
    fun findAll(pageable: Pageable): ResponseEntity<Page<PerfilUsuario>> {
        return ResponseEntity.ok(service.findAll(pageable))
    }

    @GetMapping(HANDLE)
    fun findByHandle(@PathVariable("handle") handle: String): ResponseEntity<PerfilUsuario> {
        return ResponseEntity.ok(service.findByHandle(handle))
    }

    @PostMapping("/")
    fun add(@RequestBody perfilUsuario: PerfilUsuario): ResponseEntity<PerfilUsuario> {
        return ResponseEntity.ok(service.add(perfilUsuario))
    }

    @PutMapping(HANDLE)
    fun update(@RequestBody perfilUsuario: PerfilUsuario, @PathVariable("handle") handle: String): ResponseEntity<PerfilUsuario> {
        return ResponseEntity.ok(service.update(perfilUsuario, handle))
    }

    @DeleteMapping(HANDLE)
    fun delete(@PathVariable("handle") handle: String): ResponseEntity<PerfilUsuario> {
        return ResponseEntity.ok(service.delete(handle))
    }
}