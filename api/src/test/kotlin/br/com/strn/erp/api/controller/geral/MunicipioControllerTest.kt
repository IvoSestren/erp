package br.com.strn.erp.api.controller.geral

import br.com.strn.erp.api.controller.AbstractTest
import org.hamcrest.Matchers
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultHandlers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

class MunicipioControllerTest : AbstractTest() {
    @BeforeEach
    override fun setUp() {
        super.setUp()
    }

    @Test
    fun findAll() {
        val uri = "/municipio/"
        mvc.perform(
                        MockMvcRequestBuilders
                                .get(uri)
                                .accept(MediaType.APPLICATION_JSON)
                                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON)
                                .header("AppID", "5b2d36f7-5dad-4954-b60e-b0d19d1c1dc6"))
                //.andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk)
                .andExpect(MockMvcResultMatchers.jsonPath("$.content").isArray)
                .andExpect(MockMvcResultMatchers.jsonPath("$.content", Matchers.hasSize<Int>(20)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.content[0].handle", Matchers.`is`("286588cc-22e9-4971-8e40-9b5bdcdd3ed1")))
                .andDo(MockMvcResultHandlers.print())
    }
}