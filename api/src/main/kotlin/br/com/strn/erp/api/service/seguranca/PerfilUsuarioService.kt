package br.com.strn.erp.api.service.seguranca

import br.com.strn.erp.api.database.dao.seguranca.PerfilUsuarioRepository
import br.com.strn.erp.api.database.entities.seguranca.PerfilUsuario
import br.com.strn.erp.api.errors.RecordNotFoundException
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class PerfilUsuarioService(
        private val repository: PerfilUsuarioRepository,
        private val perfilService: PerfilService,
        private val usuarioService: UsuarioService
) {
    fun findAll(pageable: Pageable): Page<PerfilUsuario> {
        return repository.findAll(pageable)
    }

    fun findById(id: Long): PerfilUsuario {
        return repository.findById(id).orElseThrow { RecordNotFoundException(PerfilUsuario::class, id) }
    }

    fun findByHandle(handle: String): PerfilUsuario {
        return repository.findByHandle(handle) ?: throw RecordNotFoundException(PerfilUsuario::class, handle)
    }

    fun add(perfilUsuario: PerfilUsuario): PerfilUsuario {
        perfilUsuario.id = null

        foreignKeys(perfilUsuario, perfilUsuario)

        return repository.save(perfilUsuario)
    }

    fun update(perfilUsuario: PerfilUsuario, id: Long): PerfilUsuario {
        val perfilUsuarioDb = findById(id)
        return update(perfilUsuario, perfilUsuarioDb)
    }

    fun update(perfilUsuario: PerfilUsuario, handle: String): PerfilUsuario {
        val perfilUsuarioDb = findByHandle(handle)
        return update(perfilUsuario, perfilUsuarioDb)
    }

    fun delete(id: Long): PerfilUsuario {
        return repository.softDelete(id) ?: throw RecordNotFoundException(PerfilUsuario::class, id)
    }

    fun delete(handle: String): PerfilUsuario {
        return repository.softDelete(handle) ?: throw RecordNotFoundException(PerfilUsuario::class, handle)
    }

    private fun foreignKeys(origem: PerfilUsuario, destino: PerfilUsuario) {
        val idPerfil = origem.perfil?.id
        if (idPerfil != null)
            destino.perfil = perfilService.findById(idPerfil)

        val idUsuario = origem.usuario?.id
        if (idUsuario != null)
            destino.usuario = usuarioService.findById(idUsuario)
    }

    private fun update(old: PerfilUsuario, new: PerfilUsuario): PerfilUsuario {
        foreignKeys(old, new)
        return repository.save(new)
    }
}
