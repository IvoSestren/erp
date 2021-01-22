package br.com.strn.erp.api.security.crypto

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import org.mindrot.jbcrypt.BCrypt
import java.security.SecureRandom
import java.util.regex.Pattern

class BCryptPasswordEncoder(
        private val strenght: Int = -1,
        private val random: SecureRandom? = null
) : PasswordEncoder {

    override fun encode(rawPassword: CharSequence): String {
        var salt: String

        if (strenght > 0) {
            if (random != null) {
                salt = BCrypt.gensalt(strenght, random)
            } else {
                salt = BCrypt.gensalt(strenght)
            }
        } else {
            salt = BCrypt.gensalt()
        }
        return BCrypt.hashpw(rawPassword.toString(), salt)
    }

    override fun matches(rawPassword: CharSequence, encodedPassword: String): Boolean {
        if (encodedPassword.isEmpty())
            return false

        if (!BCRYPT_PATTERN.matcher(encodedPassword).matches())
            return false

        return BCrypt.checkpw(rawPassword.toString(), encodedPassword)
    }

    companion object {
        private val BCRYPT_PATTERN: Pattern = Pattern.compile("\\A\\\$2a?\\\$\\d\\d\\\$[./0-9A-Za-z]{53}")
        private val LOGGER: Log = LogFactory.getLog(BCryptPasswordEncoder::class.java)
    }
}