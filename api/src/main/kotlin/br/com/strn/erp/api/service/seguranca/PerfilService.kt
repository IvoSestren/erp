package br.com.strn.erp.api.service.seguranca

import br.com.strn.erp.api.database.dao.seguranca.PerfilRepository
import br.com.strn.erp.api.database.entities.seguranca.Perfil
import br.com.strn.erp.api.errors.RecordNotFoundException
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class PerfilService(
        private val repository: PerfilRepository
) {
    fun findAll(pageable: Pageable): Page<Perfil> {
        return repository.findAll(pageable)
    }

    fun findById(id: Long): Perfil {
        return repository.findById(id).orElseThrow { RecordNotFoundException(Perfil::class, id) }
    }

    fun findByHandle(handle: String): Perfil {
        return repository.findByHandle(handle) ?: throw RecordNotFoundException(Perfil::class, handle)
    }

    fun add(perfil: Perfil): Perfil {
        perfil.id = null
        return repository.save(perfil)
    }

    fun update(perfil: Perfil, id: Long): Perfil {
        val perfilDb = findById(id)
        return update(perfil, perfilDb)
    }

    fun update(perfil: Perfil, handle: String): Perfil {
        val perfilDb = findByHandle(handle)
        return update(perfil, perfilDb)
    }

    fun delete(id: Long): Perfil {
        return repository.softDelete(id) ?: throw RecordNotFoundException(Perfil::class, id)
    }

    fun delete(handle: String): Perfil {
        return repository.softDelete(handle) ?: throw RecordNotFoundException(Perfil::class, handle)
    }

    private fun update(old: Perfil, new: Perfil): Perfil {
        new.nome = old.nome
        return repository.save(new)
    }
}
