package br.com.strn.erp.api.service.geral

import br.com.strn.erp.api.database.dao.geral.PaisRepository
import br.com.strn.erp.api.database.entities.geral.Pais
import br.com.strn.erp.api.errors.RecordNotFoundException
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class PaisService(
        private val repository: PaisRepository
) {
    fun findById(id: Long): Pais {
        return repository.findById(id).orElseThrow { RecordNotFoundException(Pais::class, id) }
    }

    fun findByHandle(handle: String): Pais {
        return repository.findByHandle(handle) ?: throw RecordNotFoundException(Pais::class, handle)
    }

    fun findAll(pageable: Pageable): Page<Pais> {
        return repository.findAll(pageable)
    }

    fun add(pais: Pais): Pais {
        pais.id = null
        return repository.save(pais)
    }

    fun update(pais: Pais, id: Long): Pais {
        val paisDb = findById(id)
        return update(pais, paisDb)
    }

    fun update(pais: Pais, handle: String): Pais {
        val paisDb = findByHandle(handle)
        return update(pais, paisDb)
    }

    fun delete(id: Long): Pais {
        return repository.softDelete(id) ?: throw RecordNotFoundException(Pais::class, id)
    }

    fun delete(handle: String): Pais {
        return repository.softDelete(handle) ?: throw RecordNotFoundException(Pais::class, handle)
    }

    private fun update(old: Pais, new: Pais): Pais {
        new.nome = old.nome
        new.abreviacao = old.abreviacao
        new.nomeInternacional = old.nomeInternacional
        new.codigoBancoCentral = old.codigoBancoCentral
        new.codigoInternacional = old.codigoInternacional

        return repository.save(new)
    }
}