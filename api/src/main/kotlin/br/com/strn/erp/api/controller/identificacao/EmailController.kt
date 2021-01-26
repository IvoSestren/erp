package br.com.strn.erp.api.controller.identificacao

import br.com.strn.erp.api.database.entities.identificacao.Email
import br.com.strn.erp.api.service.identificacao.EmailService
import br.com.strn.erp.api.util.Constants.Path.Param.HANDLE
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@Suppress("unused")
@RestController
@RequestMapping(value = ["/email"], produces = [MediaType.APPLICATION_JSON_VALUE])
class EmailController(
        private val service: EmailService
) {
    @GetMapping("/")
    fun findAll(pageable: Pageable): ResponseEntity<Page<Email>> {
        return ResponseEntity.ok(service.findAll(pageable))
    }

    @GetMapping(HANDLE)
    fun findByHandle(@PathVariable("handle") handle: String): ResponseEntity<Email> {
        return ResponseEntity.ok(service.findByHandle(handle))
    }

    @PostMapping("/")
    fun add(@RequestBody email: Email): ResponseEntity<Email> {
        return ResponseEntity.ok(service.add(email))
    }

    @PutMapping(HANDLE)
    fun update(@RequestBody email: Email, @PathVariable("handle") handle: String): ResponseEntity<Email> {
        return ResponseEntity.ok(service.update(email, handle))
    }

    @DeleteMapping(HANDLE)
    fun delete(@PathVariable("handle") handle: String): ResponseEntity<Email> {
        return ResponseEntity.ok(service.delete(handle))
    }
}