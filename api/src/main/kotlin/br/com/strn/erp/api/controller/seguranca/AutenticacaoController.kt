package br.com.strn.erp.api.controller.seguranca

import br.com.strn.erp.api.database.dto.seguranca.LoginDTO
import br.com.strn.erp.api.database.dto.seguranca.TokenDTO
import br.com.strn.erp.api.database.entities.enums.TipoPermissao
import br.com.strn.erp.api.errors.UserNotFoundException
import br.com.strn.erp.api.security.permission.Permission
import br.com.strn.erp.api.service.seguranca.AutenticacaoService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Suppress("unused")
@RestController
@RequestMapping(value = ["/autenticacao"], produces = ["application/json"])
class AutenticacaoController(
    private val service: AutenticacaoService
) {

    @Permission(TipoPermissao.GUEST)
    @PostMapping("/login/")
    fun login(@RequestBody login: LoginDTO): ResponseEntity<TokenDTO> {
        return try {
            ResponseEntity.ok(service.login(login))
        } catch (ignored: Exception) {
            throw UserNotFoundException()
        }
    }

    @Permission(TipoPermissao.AUTENTICACAO_LOGOUT)
    @RequestMapping("/logout/")
    fun logout(): ResponseEntity<String> {
        return ResponseEntity.ok().build()
    }
}