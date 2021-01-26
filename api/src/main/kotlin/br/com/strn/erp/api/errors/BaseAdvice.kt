package br.com.strn.erp.api.errors

import com.auth0.jwt.exceptions.JWTVerificationException
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RequestMapping
import java.time.LocalDateTime
import javax.servlet.http.HttpServletRequest

@ControllerAdvice
@RequestMapping(produces = ["application/json"])
class BaseAdvice(
        private val request: HttpServletRequest
) {

    private val logger = LoggerFactory.getLogger(javaClass)

    @ExceptionHandler(value = [IllegalArgumentException::class, AppIDNotFoundException::class, Exception::class])
    fun badRequestException(e: Exception): ResponseEntity<Map<String, String>> {
        return error(e, HttpStatus.BAD_REQUEST)
    }

    @ExceptionHandler(value = [JWTVerificationException::class, TokenException::class, UserNotFoundException::class, PermissionException::class])
    fun forbiddenException(e: Exception): ResponseEntity<Map<String, String>> {
        return error(e, HttpStatus.FORBIDDEN)
    }

    @ExceptionHandler(value = [RecordNotFoundException::class])
    fun notFoundException(e: Exception): ResponseEntity<Map<String, String>> {
        return error(e, HttpStatus.NOT_FOUND)
    }

    @ExceptionHandler(value = [RuntimeException::class])
    fun internalServerError(e: Exception): ResponseEntity<Map<String, String>> {
        return error(e, HttpStatus.INTERNAL_SERVER_ERROR)
    }

    private fun error(e: Exception, httpStatus: HttpStatus): ResponseEntity<Map<String, String>> {
        val message = e.message ?: e.javaClass.simpleName

        val errors = HashMap<String, String>()

        errors["timestamp"] = LocalDateTime.now().toString()
        errors["status"] = httpStatus.value().toString()
        errors["error"] = message

        logger.error("Response error: (${httpStatus.value()}) $message")

        return ResponseEntity.status(httpStatus).body(errors)
    }
}