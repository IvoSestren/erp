package br.com.strn.erp.api.security.token

import br.com.strn.erp.api.database.entities.enums.ConfiguracaoChave
import br.com.strn.erp.api.service.ConfiguracaoService
import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import com.auth0.jwt.interfaces.DecodedJWT
import org.springframework.stereotype.Component
import java.time.LocalDateTime
import java.time.ZoneId
import java.util.*
import javax.servlet.http.HttpServletRequest

@Component
class TokenUtils(
        private val request: HttpServletRequest,
        private val configuracaoService: ConfiguracaoService
) {

    fun generate(userId: Long, email: String): String {
        return JWT.create()
                .withIssuer("auth0")
                .withSubject(email)
                .withClaim("userId", userId)
                .withExpiresAt(Date.from(LocalDateTime.now().plusDays(90).atZone(ZoneId.systemDefault()).toInstant()))
                .sign(algorithm())
    }

    fun getAuthorization(): String {
        return request.getHeader("Authorization")
    }

    fun getEmail(token: String): String {
        val jwt = getJWT(token)

        return jwt.subject
    }

    fun getEmail(): String {
        return getEmail(getAuthorization())
    }

    private fun algorithm(): Algorithm {
        return Algorithm.HMAC512(password())
    }

    private fun getJWT(token: String): DecodedJWT {
        val verifier = JWT.require(algorithm()).withIssuer("auth0").build()
        return verifier.verify(token)
    }

    private fun password(): String {
        return try {
            configuracaoService.findByChave(ConfiguracaoChave.TOKEN_PASSWORD).valor
        } catch (e: Exception) {
            DEFAULT_PASSWORD
        }
    }

    companion object {
        private const val DEFAULT_PASSWORD: String = "-93uNI:y5T{dBKGca_/\\:nr&ElcFsg<Y{Z)bh&,>Te.>}u!C05^fJ8mI'cY\"~yn1"
    }
}
