package br.com.strn.erp.api.security.tenant

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Component
class TenantInterceptor : HandlerInterceptorAdapter() {

    private val logger = LoggerFactory.getLogger(javaClass)

    override fun preHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any): Boolean {
        val tenantNome = request.getHeader("AppID")
        val schema = "clie" + tenantNome.replace("-", "")

        logger.debug("Set tenantContext: {}", schema)

        TenantContext.schema.set(schema)

        return true
    }

    override fun afterCompletion(request: HttpServletRequest, response: HttpServletResponse, handler: Any, ex: Exception?) {
        logger.debug("Clear tenantContext: {}}", TenantContext.schema.get())
        TenantContext.schema.set("public")
        super.afterCompletion(request, response, handler, ex)
    }
}