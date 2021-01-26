package br.com.strn.erp.api.service.identificacao

import br.com.strn.erp.api.database.dao.identificacao.EmailRepository
import br.com.strn.erp.api.database.entities.identificacao.Email
import br.com.strn.erp.api.errors.RecordNotFoundException
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class EmailService(
        private val repository: EmailRepository
) {
    fun findAll(pageable: Pageable): Page<Email> {
        return repository.findAll(pageable)
    }

    fun findById(id: Long): Email {
        return repository.findById(id).orElseThrow { RecordNotFoundException(Email::class, id) }
    }

    fun findByHandle(handle: String): Email {
        return repository.findByHandle(handle) ?: throw RecordNotFoundException(Email::class, handle)
    }

    fun add(email: Email): Email {
        email.id = null
        email.validado = false
        return repository.save(email)
    }

    fun update(email: Email, id: Long): Email {
        val emailDb = findById(id)
        return update(email, emailDb)
    }

    fun update(email: Email, handle: String): Email {
        val emailDb = findByHandle(handle)
        return update(email, emailDb)
    }

    fun delete(id: Long): Email {
        return repository.softDelete(id) ?: throw RecordNotFoundException(Email::class, id)
    }

    fun delete(handle: String): Email {
        return repository.softDelete(handle) ?: throw RecordNotFoundException(Email::class, handle)
    }

    private fun update(old: Email, new: Email): Email {
        if (new.email != old.email) {
            new.email = old.email
            new.validado = false
        } else {
            new.validado = old.validado
        }

        return repository.save(new)
    }
}