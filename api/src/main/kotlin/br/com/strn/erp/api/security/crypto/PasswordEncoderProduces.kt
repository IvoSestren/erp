package br.com.strn.erp.api.security.crypto

import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class PasswordEncoderProduces {

    @Bean
    fun getInstance(): PasswordEncoder {
        return BCryptPasswordEncoder()
    }
}