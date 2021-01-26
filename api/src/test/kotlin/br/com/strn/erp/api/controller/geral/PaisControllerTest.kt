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

class PaisControllerTest : AbstractTest() {
    @BeforeEach
    override fun setUp() {
        super.setUp()
    }

    @Test
    fun findAll() {
        val uri = "/pais/"
        mvc.perform(
                        MockMvcRequestBuilders
                                .get(uri)
                                .accept(MediaType.APPLICATION_JSON)
                                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON)
                                .header("AppID", "5b2d36f7-5dad-4954-b60e-b0d19d1c1dc6"))
                //.andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk)
                .andExpect(MockMvcResultMatchers.jsonPath("$.content").isArray)
                .andExpect(MockMvcResultMatchers.jsonPath("$.content", Matchers.hasSize<Int>(1)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.content[0].handle", Matchers.`is`("97c518e3-b860-4605-8856-0236f6c6eb65")))
                .andDo(MockMvcResultHandlers.print())
    }
}