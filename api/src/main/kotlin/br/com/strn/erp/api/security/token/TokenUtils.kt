package br.com.strn.erp.api.security.token

import br.com.strn.erp.api.database.entities.enums.ConfiguracaoChave
import br.com.strn.erp.api.security.profile.Profile
import br.com.strn.erp.api.service.geral.ConfiguracaoService
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
        private val configuracaoService: ConfiguracaoService,
        private val profile: Profile
) {

    fun generate(userHandle: String, email: String): String {
        return JWT.create()
                .withIssuer("auth0")
                .withSubject(email)
                .withClaim("userHandle", userHandle)
                .withExpiresAt(Date.from(LocalDateTime.now().plusDays(90).atZone(ZoneId.systemDefault()).toInstant()))
                .sign(algorithm())
    }

    val authorization: String
        get() = request.getHeader("Authorization")

    val email: String
        get() = getEmail(authorization)

    private fun algorithm(): Algorithm {
        return Algorithm.HMAC512(password())
    }

    private fun getJWT(token: String): DecodedJWT {
        val verifier = JWT.require(algorithm()).withIssuer("auth0").build()
        return verifier.verify(token)
    }

    private fun password(): String {
        if (profile.isDev())
            return DEFAULT_PASSWORD

        return try {
            configuracaoService.findByChave(ConfiguracaoChave.TOKEN_PASSWORD).valor!!
        } catch (e: Exception) {
            DEFAULT_PASSWORD
        }
    }

    private fun getEmail(token: String): String {
        val jwt = getJWT(token)

        return jwt.subject
    }

    companion object {
        private const val DEFAULT_PASSWORD: String = "-93uNI:y5T{dBKGca_/\\:nr&ElcFsg<Y{Z)bh&,>Te.>}u!C05^fJ8mI'cY\"~yn1"
    }
}
