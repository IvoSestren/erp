package br.com.strn.erp.api.controller

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.context.WebApplicationContext

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
abstract class AbstractTest {

    protected lateinit var mvc: MockMvc

    @Autowired
    protected lateinit var webApplicationContext: WebApplicationContext

    protected fun setUp() {
        mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build()
    }

    protected fun mapToJson(obj: Any): String {
        val objectMapper = ObjectMapper()
        return objectMapper.writeValueAsString(obj)
    }

    protected fun <T : Any> mapFromJson(json: String, clazz: Class<T>): Any? {
        val objectMapper = ObjectMapper()
        return objectMapper.readValue(json, clazz)
    }
}