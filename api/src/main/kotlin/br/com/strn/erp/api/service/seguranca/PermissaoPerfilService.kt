package br.com.strn.erp.api.service.seguranca

import br.com.strn.erp.api.database.dao.seguranca.PermissaoPerfilRepository
import br.com.strn.erp.api.database.entities.seguranca.PermissaoPerfil
import br.com.strn.erp.api.errors.RecordNotFoundException
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class PermissaoPerfilService(
        private val repository: PermissaoPerfilRepository,
        private val permissaoService: PermissaoService,
        private val perfilService: PerfilService
) {
    fun findAll(pageable: Pageable): Page<PermissaoPerfil> {
        return repository.findAll(pageable)
    }

    fun findById(id: Long): PermissaoPerfil {
        return repository.findById(id).orElseThrow { RecordNotFoundException(PermissaoPerfil::class, id) }
    }

    fun findByHandle(handle: String): PermissaoPerfil {
        return repository.findByHandle(handle) ?: throw RecordNotFoundException(PermissaoPerfil::class, handle)
    }

    fun add(permissaoPerfil: PermissaoPerfil): PermissaoPerfil {
        permissaoPerfil.id = null
        foreignKeys(permissaoPerfil, permissaoPerfil)
        return repository.save(permissaoPerfil)
    }

    fun update(permissaoPerfil: PermissaoPerfil, id: Long): PermissaoPerfil {
        val permissaoPerfilDb = findById(id)
        return update(permissaoPerfil, permissaoPerfilDb)
    }

    fun update(permissaoPerfil: PermissaoPerfil, handle: String): PermissaoPerfil {
        val permissaoPerfilDb = findByHandle(handle)
        return update(permissaoPerfil, permissaoPerfilDb)
    }

    fun delete(id: Long): PermissaoPerfil {
        return repository.softDelete(id) ?: throw RecordNotFoundException(PermissaoPerfil::class, id)
    }

    fun delete(handle: String): PermissaoPerfil {
        return repository.softDelete(handle) ?: throw RecordNotFoundException(PermissaoPerfil::class, handle)
    }

    private fun foreignKeys(origem: PermissaoPerfil, destino: PermissaoPerfil) {
        val idPermissao = origem.permissao?.id
        if (idPermissao != null)
            destino.permissao = permissaoService.findById(idPermissao)

        val idPerfil = origem.perfil?.id
        if (idPerfil != null)
            destino.perfil = perfilService.findById(idPerfil)
    }

    private fun update(old: PermissaoPerfil, new: PermissaoPerfil) : PermissaoPerfil {
        foreignKeys(old, new)
        return repository.save(new)
    }
}
