package br.com.strn.erp.api.controller.seguranca

import br.com.strn.erp.api.database.entities.seguranca.PermissaoPerfil
import br.com.strn.erp.api.service.seguranca.PermissaoPerfilService
import br.com.strn.erp.api.util.Constants.Path.Param.HANDLE
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@Suppress("unused")
@RestController
@RequestMapping(value = ["/perfil/permissao"], produces = [MediaType.APPLICATION_JSON_VALUE])
class PermissaoPerfilController(
        private val service: PermissaoPerfilService
) {
    @GetMapping("/")
    fun findAll(pageable: Pageable): ResponseEntity<Page<PermissaoPerfil>> {
        return ResponseEntity.ok(service.findAll(pageable))
    }

    @GetMapping(HANDLE)
    fun findByHandle(@PathVariable("handle") handle: String): ResponseEntity<PermissaoPerfil> {
        return ResponseEntity.ok(service.findByHandle(handle))
    }

    @PostMapping("/")
    fun add(@RequestBody permissaoPerfil: PermissaoPerfil): ResponseEntity<PermissaoPerfil> {
        return ResponseEntity.ok(service.add(permissaoPerfil))
    }

    @PutMapping(HANDLE)
    fun update(@RequestBody permissaoPerfil: PermissaoPerfil, @PathVariable("handle") handle: String): ResponseEntity<PermissaoPerfil> {
        return ResponseEntity.ok(service.update(permissaoPerfil, handle))
    }

    @DeleteMapping(HANDLE)
    fun delete(@PathVariable("handle") handle: String): ResponseEntity<PermissaoPerfil> {
        return ResponseEntity.ok(service.delete(handle))
    }
}