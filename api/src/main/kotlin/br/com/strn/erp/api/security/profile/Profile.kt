package br.com.strn.erp.api.security.profile

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class Profile {
    @Value(value = "\${spring.profiles.active:}")
    lateinit var activeProfiles: String

    fun isDev(): Boolean {
        for (activeProfile in activeProfiles.split(","))
            if (activeProfile == "dev") return true

        return false
    }
}
