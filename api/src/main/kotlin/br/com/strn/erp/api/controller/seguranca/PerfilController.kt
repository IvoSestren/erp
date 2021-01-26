package br.com.strn.erp.api.controller.seguranca

import br.com.strn.erp.api.database.entities.seguranca.Perfil
import br.com.strn.erp.api.service.seguranca.PerfilService
import br.com.strn.erp.api.util.Constants.Path.Param.HANDLE
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@Suppress("unused")
@RestController
@RequestMapping(value = ["/perfil"], produces = [MediaType.APPLICATION_JSON_VALUE])
class PerfilController(
        private val service: PerfilService
) {
    @GetMapping("/")
    fun findAll(pageable: Pageable): ResponseEntity<Page<Perfil>> {
        return ResponseEntity.ok(service.findAll(pageable))
    }

    @GetMapping(HANDLE)
    fun findByHandle(@PathVariable("handle") handle: String): ResponseEntity<Perfil> {
        return ResponseEntity.ok(service.findByHandle(handle))
    }

    @PostMapping("/")
    fun add(@RequestBody perfil: Perfil): ResponseEntity<Perfil> {
        return ResponseEntity.ok(service.add(perfil))
    }

    @PutMapping(HANDLE)
    fun update(@RequestBody perfil: Perfil, @PathVariable("handle") handle: String): ResponseEntity<Perfil> {
        return ResponseEntity.ok(service.update(perfil, handle))
    }

    @DeleteMapping(HANDLE)
    fun delete(@PathVariable("handle") handle: String): ResponseEntity<Perfil> {
        return ResponseEntity.ok(service.delete(handle))
    }
}