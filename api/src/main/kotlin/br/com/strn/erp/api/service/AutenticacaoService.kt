package br.com.strn.erp.api.service

import br.com.strn.erp.api.database.dao.seguranca.UsuarioLoginRepository
import br.com.strn.erp.api.database.dto.seguranca.LoginDTO
import br.com.strn.erp.api.database.dto.seguranca.TokenDTO
import br.com.strn.erp.api.database.entities.seguranca.UsuarioLogin
import br.com.strn.erp.api.errors.UserNotFoundException
import br.com.strn.erp.api.security.crypto.PasswordEncoder
import br.com.strn.erp.api.security.token.TokenUtils
import org.springframework.stereotype.Service
import javax.servlet.http.HttpServletResponse

@Service
class AutenticacaoService(
        private val repository: UsuarioLoginRepository,
        private val passwordEncoder: PasswordEncoder,
        private val response: HttpServletResponse,
        private val tokenUtils: TokenUtils
) {

    fun login(loginDTO: LoginDTO): TokenDTO {
        val login = repository.findByEmail(loginDTO.email) ?: throw UserNotFoundException()

        if (!passwordEncoder.matches(loginDTO.senha, login.senha)) {
            throw UserNotFoundException()
        }

        val tokenHeader = generateToken(login)

        response.addHeader("Authorization", tokenHeader)

        return TokenDTO(tokenHeader)
    }

    private fun generateToken(login: UsuarioLogin): String {
        return tokenUtils.generate(login.id!!, login.senha)
    }
}
