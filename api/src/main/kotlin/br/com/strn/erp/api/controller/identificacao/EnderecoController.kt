package br.com.strn.erp.api.controller.identificacao

import br.com.strn.erp.api.database.entities.identificacao.Endereco
import br.com.strn.erp.api.service.identificacao.EnderecoService
import br.com.strn.erp.api.util.Constants.Path.Param.HANDLE
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@Suppress("unused")
@RestController
@RequestMapping(value = ["/endereco"], produces = [MediaType.APPLICATION_JSON_VALUE])
class EnderecoController(
        private val service: EnderecoService
) {
    @GetMapping("/")
    fun findAll(pageable: Pageable): ResponseEntity<Page<Endereco>> {
        return ResponseEntity.ok(service.findAll(pageable))
    }

    @GetMapping(HANDLE)
    fun findByHandle(@PathVariable("handle") handle: String): ResponseEntity<Endereco> {
        return ResponseEntity.ok(service.findByHandle(handle))
    }

    @PostMapping("/")
    fun add(@RequestBody endereco: Endereco): ResponseEntity<Endereco> {
        return ResponseEntity.ok(service.add(endereco))
    }

    @PutMapping(HANDLE)
    fun update(@RequestBody endereco: Endereco, @PathVariable("handle") handle: String): ResponseEntity<Endereco> {
        return ResponseEntity.ok(service.update(endereco, handle))
    }

    @DeleteMapping(HANDLE)
    fun delete(@PathVariable("handle") handle: String): ResponseEntity<Endereco> {
        return ResponseEntity.ok(service.delete(handle))
    }
}