package br.com.strn.erp.api.security.permission

import br.com.strn.erp.api.errors.PermissionException
import br.com.strn.erp.api.security.profile.Profile
import br.com.strn.erp.api.service.seguranca.PermissaoService
import org.springframework.stereotype.Component
import org.springframework.web.method.HandlerMethod
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter
import java.lang.reflect.Method
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Component
class PermissionInterceptor(
        private val service: PermissaoService,
        private val profile: Profile
) : HandlerInterceptorAdapter() {

    override fun preHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any): Boolean {

        if (profile.isDev())
            return super.preHandle(request, response, handler)

        val hm = handler as HandlerMethod
        val method = hm.method

        val res: Boolean

        res = if (annotatedPermission(method)) {
            permited(method)
        } else {
            false
        }

        if (res) {
            return super.preHandle(request, response, handler)
        } else {
            throw PermissionException()
        }
    }

    private fun permited(method: Method): Boolean {
        val permissionMethod = method.getDeclaredAnnotation(Permission::class.java) ?: return false

        if (service.usuarioAtualTemPermissao(permissionMethod.value))
            return true

        val permissionClass = method.declaringClass.getAnnotation(Permission::class.java)
        return service.usuarioAtualTemPermissao(permissionClass.value)
    }

    private fun annotatedPermission(method: Method): Boolean {
        return method.declaringClass.isAnnotationPresent(Permission::class.java) || method.isAnnotationPresent(Permission::class.java)
    }


}