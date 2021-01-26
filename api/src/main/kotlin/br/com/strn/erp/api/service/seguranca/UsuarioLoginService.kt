package br.com.strn.erp.api.service.seguranca

import br.com.strn.erp.api.database.dao.seguranca.UsuarioLoginRepository
import br.com.strn.erp.api.database.entities.seguranca.UsuarioLogin
import br.com.strn.erp.api.errors.RecordNotFoundException
import br.com.strn.erp.api.service.identificacao.EmailService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class UsuarioLoginService(
        private val repository: UsuarioLoginRepository,
        private val usuarioService: UsuarioService,
        private val emailService: EmailService
) {
    fun findAll(pageable: Pageable): Page<UsuarioLogin> {
        return repository.findAll(pageable)
    }

    fun findById(id: Long): UsuarioLogin {
        return repository.findById(id).orElseThrow { RecordNotFoundException(UsuarioLogin::class, id) }
    }

    fun findByHandle(handle: String): UsuarioLogin {
        return repository.findByHandle(handle) ?: throw RecordNotFoundException(UsuarioLogin::class, handle)
    }

    fun add(usuarioLogin: UsuarioLogin): UsuarioLogin {
        usuarioLogin.id = null
        foreignKeys(usuarioLogin, usuarioLogin)
        return repository.save(usuarioLogin)
    }

    fun update(usuarioLogin: UsuarioLogin, id: Long): UsuarioLogin {
        val usuarioLoginDb = findById(id)
        return update(usuarioLogin, usuarioLoginDb)
    }

    fun update(usuarioLogin: UsuarioLogin, handle: String): UsuarioLogin {
        val usuarioLoginDb = findByHandle(handle)
        return update(usuarioLogin, usuarioLoginDb)
    }

    fun delete(id: Long): UsuarioLogin {
        return repository.softDelete(id) ?: throw RecordNotFoundException(UsuarioLogin::class, id)
    }

    fun delete(handle: String): UsuarioLogin {
        return repository.softDelete(handle) ?: throw RecordNotFoundException(UsuarioLogin::class, handle)
    }

    private fun foreignKeys(origem: UsuarioLogin, destino: UsuarioLogin) {
        val idUsuario = origem.usuario?.id
        if (idUsuario != null)
            destino.usuario = usuarioService.findById(idUsuario)

        val idEmail = origem.email?.id
        if (idEmail != null)
            destino.email = emailService.findById(idEmail)
    }

    private fun update(old: UsuarioLogin, new: UsuarioLogin): UsuarioLogin {
        new.senha = old.senha
        foreignKeys(old, new)
        return repository.save(new)
    }
}
