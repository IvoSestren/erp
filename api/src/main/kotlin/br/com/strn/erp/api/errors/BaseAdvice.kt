package br.com.strn.erp.api.errors

import com.auth0.jwt.exceptions.JWTVerificationException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RequestMapping
import java.time.LocalDateTime

@ControllerAdvice
@RequestMapping(produces = ["application/json"])
class BaseAdvice {

    @ExceptionHandler(value = [IllegalArgumentException::class, AppIDNotFoundException::class])
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

        errors.put("timestamp", LocalDateTime.now().toString())
        errors.put("status", httpStatus.value().toString())
        errors.put("error", message)

        return ResponseEntity.status(httpStatus).body(errors)
    }
}