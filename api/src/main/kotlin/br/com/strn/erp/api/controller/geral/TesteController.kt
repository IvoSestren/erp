package br.com.strn.erp.api.controller.geral

import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Suppress("unused")
@RestController
@RequestMapping(value = ["/teste"], produces = [MediaType.APPLICATION_JSON_VALUE])
class TesteController {
    @GetMapping("/")
    fun teste(): ResponseEntity<String> {
        return ResponseEntity.ok("Ok")
    }
}