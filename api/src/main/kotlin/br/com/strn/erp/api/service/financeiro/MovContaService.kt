package br.com.strn.erp.api.service.financeiro

import br.com.strn.erp.api.database.dao.financeiro.MovContaRepository
import br.com.strn.erp.api.database.entities.financeiro.MovConta
import br.com.strn.erp.api.errors.RecordNotFoundException
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class MovContaService(
        private val repository: MovContaRepository
) {
    fun findAll(pageable: Pageable): Page<MovConta> {
        return repository.findAll(pageable)
    }

    fun findById(id: Long): MovConta {
        return repository.findById(id).orElseThrow { RecordNotFoundException(MovConta::class, id) }
    }

    fun findByHandle(handle: String): MovConta {
        return repository.findByHandle(handle) ?: throw RecordNotFoundException(MovConta::class, handle)
    }

    fun add(movConta: MovConta): MovConta {
        movConta.id = null
        return repository.save(movConta)
    }

    fun update(movConta: MovConta, id: Long): MovConta {
        val movContaDb = findById(id)
        return update(movConta, movContaDb)
    }

    fun update(movConta: MovConta, handle: String): MovConta {
        val movContaDb = findByHandle(handle)
        return update(movConta, movContaDb)
    }

    fun delete(id: Long): MovConta {
        return repository.softDelete(id) ?: throw RecordNotFoundException(MovConta::class, id)
    }

    fun delete(handle: String): MovConta {
        return repository.softDelete(handle) ?: throw RecordNotFoundException(MovConta::class, handle)
    }

    private fun update(old: MovConta, new: MovConta): MovConta {
        new.data = old.data
        new.descricao = old.descricao

        return repository.save(new)
    }
}
