package br.com.strn.erp.api.controller.geral

import br.com.strn.erp.api.database.entities.geral.Municipio
import br.com.strn.erp.api.service.geral.MunicipioService
import br.com.strn.erp.api.util.Constants
import br.com.strn.erp.api.util.Constants.Path.Param.HANDLE
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@Suppress("unused")
@RestController
@RequestMapping(value = ["/municipio"], produces = [MediaType.APPLICATION_JSON_VALUE])
class MunicipioController(
        private val service: MunicipioService
) {
    @GetMapping("/")
    fun findAll(pageable: Pageable): ResponseEntity<Page<Municipio>> {
        return ResponseEntity.ok(service.findAll(pageable))
    }

    @GetMapping(HANDLE)
    fun findByHandle(@PathVariable("handle") handle: String): ResponseEntity<Municipio> {
        return ResponseEntity.ok(service.findByHandle(handle))
    }

    @GetMapping("/estado$HANDLE")
    fun findByEstado(@PathVariable("handle") handle: String, pageable: Pageable): ResponseEntity<Page<Municipio>> {
        return ResponseEntity.ok(service.findByEstado(handle, pageable))
    }

    @PostMapping("/")
    fun add(@RequestBody municipio: Municipio): ResponseEntity<Municipio> {
        return ResponseEntity.ok(service.add(municipio))
    }

    @PutMapping(HANDLE)
    fun update(@RequestBody municipio: Municipio, @PathVariable("handle") handle: String): ResponseEntity<Municipio> {
        return ResponseEntity.ok(service.update(municipio, handle))
    }

    @DeleteMapping(HANDLE)
    fun delete(@PathVariable("handle") handle: String): ResponseEntity<Municipio> {
        return ResponseEntity.ok(service.delete(handle))
    }
}