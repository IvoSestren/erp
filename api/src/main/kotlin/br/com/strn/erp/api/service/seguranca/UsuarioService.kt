package br.com.strn.erp.api.service.seguranca

import br.com.strn.erp.api.database.dao.seguranca.UsuarioRepository
import br.com.strn.erp.api.database.entities.seguranca.Usuario
import br.com.strn.erp.api.errors.RecordNotFoundException
import br.com.strn.erp.api.security.token.TokenUtils
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class UsuarioService(
        private val repository: UsuarioRepository,
        private val tokenUtils: TokenUtils
) {
    fun findByEmailLogin(email: String): Usuario {
        return repository.findByEmailLogin(email) ?: throw RecordNotFoundException(Usuario::class, email)
    }

    fun findById(id: Long): Usuario {
        return repository.findById(id).orElseThrow { RecordNotFoundException(Usuario::class, id) }
    }

    fun findByHandle(handle: String): Usuario {
        return repository.findByHandle(handle) ?: throw RecordNotFoundException(Usuario::class, handle)
    }

    fun add(usuario: Usuario): Usuario {
        usuario.id = null
        return repository.save(usuario)
    }

    fun update(usuario: Usuario, id: Long): Usuario {
        val usuarioDb = findById(id)
        return update(usuario, usuarioDb)
    }

    fun update(usuario: Usuario, handle: String): Usuario {
        val usuarioDb = findByHandle(handle)
        return update(usuario, usuarioDb)
    }

    fun delete(id: Long): Usuario {
        return repository.softDelete(id) ?: throw RecordNotFoundException(Usuario::class, id)
    }

    fun delete(handle: String): Usuario {
        return repository.softDelete(handle) ?: throw RecordNotFoundException(Usuario::class, handle)
    }

    fun usuarioAtual(): Usuario {
        val email = tokenUtils.email

        return repository.findByEmailLogin(email) ?: throw RecordNotFoundException(Usuario::class, email)
    }

    fun findAll(pageable: Pageable): Page<Usuario> {
        return repository.findAll(pageable)
    }

    private fun update(old: Usuario, new: Usuario): Usuario {
        new.nome = old.nome
        return repository.save(new)
    }
}
