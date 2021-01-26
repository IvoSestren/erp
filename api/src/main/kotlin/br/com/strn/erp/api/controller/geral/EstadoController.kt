package br.com.strn.erp.api.controller.geral

import br.com.strn.erp.api.database.entities.enums.TipoPermissao
import br.com.strn.erp.api.database.entities.geral.Estado
import br.com.strn.erp.api.security.permission.Permission
import br.com.strn.erp.api.service.geral.EstadoService
import br.com.strn.erp.api.util.Constants.Path.Param.HANDLE
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@Suppress("unused")
@RestController
@RequestMapping(value = ["/estado"], produces = [MediaType.APPLICATION_JSON_VALUE])
class EstadoController(
        private val service: EstadoService
) {
    @Permission(TipoPermissao.ESTADO_FINDALL)
    @GetMapping("/")
    fun findAll(pageable: Pageable): ResponseEntity<Page<Estado>> {
        return ResponseEntity.ok(service.findAll(pageable))
    }

    @Permission(TipoPermissao.ESTADO_FINDBYHANDLE)
    @GetMapping(HANDLE)
    fun findByHandle(@PathVariable("handle") handle: String): ResponseEntity<Estado> {
        return ResponseEntity.ok(service.findByHandle(handle))
    }

    @Permission(TipoPermissao.ESTADO_ADD)
    @PostMapping("/")
    fun add(@RequestBody estado: Estado): ResponseEntity<Estado> {
        return ResponseEntity.ok(service.add(estado))
    }

    @Permission(TipoPermissao.ESTADO_UPDATE)
    @PutMapping(HANDLE)
    fun update(@RequestBody estado: Estado, @PathVariable("handle") handle: String): ResponseEntity<Estado> {
        return ResponseEntity.ok(service.update(estado, handle))
    }

    @Permission(TipoPermissao.ESTADO_DELETE)
    @DeleteMapping(HANDLE)
    fun delete(@PathVariable("handle") handle: String): ResponseEntity<Estado> {
        return ResponseEntity.ok(service.delete(handle))
    }
}