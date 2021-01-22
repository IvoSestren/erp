package br.com.strn.erp.api.service

import br.com.strn.erp.api.database.dao.seguranca.UsuarioRepository
import br.com.strn.erp.api.database.entities.seguranca.Usuario
import br.com.strn.erp.api.errors.RecordNotFoundException
import br.com.strn.erp.api.security.token.TokenUtils
import org.springframework.stereotype.Service

@Service
class UsuarioService(
        private val repository: UsuarioRepository,
        private val tokenUtils: TokenUtils
) {
    fun findByEmailLogin(email: String): Usuario {
        return repository.findByEmailLogin(email) ?: throw RecordNotFoundException()
    }

    fun findById(id: Long): Usuario {
        return repository.findById(id).orElseThrow { RecordNotFoundException() }
    }

    fun add(usuario: Usuario): Usuario {
        usuario.id = null

        return repository.save(usuario)
    }

    fun update(usuario: Usuario, id: Long): Usuario {
        val usuarioDb = repository.findById(id).orElseThrow { RecordNotFoundException() }
        usuarioDb.nome = usuario.nome
        return repository.save(usuarioDb)
    }

    fun delete(id: Long): Usuario {
        val usuarioDb = repository.findById(id).orElseThrow { RecordNotFoundException() }
        return repository.softDelete(usuarioDb.id!!) ?: throw RecordNotFoundException()
    }

    fun usuarioAtual(): Usuario {
        val email = tokenUtils.getEmail()

        return repository.findByEmailLogin(email) ?: throw RecordNotFoundException()
    }
}
