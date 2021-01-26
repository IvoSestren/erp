package br.com.strn.erp.api.controller.geral

import br.com.strn.erp.api.database.entities.geral.TipoEndereco
import br.com.strn.erp.api.service.geral.TipoEnderecoService
import br.com.strn.erp.api.util.Constants.Path.Param.HANDLE
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@Suppress("unused")
@RestController
@RequestMapping(value = ["/tipoendereco"], produces = [MediaType.APPLICATION_JSON_VALUE])
class TipoEnderecoController(
        private val service: TipoEnderecoService
) {
    @GetMapping("/")
    fun findAll(pageable: Pageable): ResponseEntity<Page<TipoEndereco>> {
        return ResponseEntity.ok(service.findAll(pageable))
    }

    @GetMapping(HANDLE)
    fun findByHandle(@PathVariable("handle") handle: String): ResponseEntity<TipoEndereco> {
        return ResponseEntity.ok(service.findByHandle(handle))
    }

    @PostMapping("/")
    fun add(@RequestBody tipoEndereco: TipoEndereco): ResponseEntity<TipoEndereco> {
        return ResponseEntity.ok(service.add(tipoEndereco))
    }

    @PutMapping(HANDLE)
    fun update(@RequestBody tipoEndereco: TipoEndereco, @PathVariable("handle") handle: String): ResponseEntity<TipoEndereco> {
        return ResponseEntity.ok(service.update(tipoEndereco, handle))
    }

    @DeleteMapping(HANDLE)
    fun delete(@PathVariable("handle") handle: String): ResponseEntity<TipoEndereco> {
        return ResponseEntity.ok(service.delete(handle))
    }
}