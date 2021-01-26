package br.com.strn.erp.api.service.financeiro

import br.com.strn.erp.api.database.dao.financeiro.MovPrevRepository
import br.com.strn.erp.api.database.entities.financeiro.MovPrev
import br.com.strn.erp.api.errors.RecordNotFoundException
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class MovPrevService(
        private val repository: MovPrevRepository
) {
    fun findAll(pageable: Pageable): Page<MovPrev> {
        return repository.findAll(pageable)
    }

    fun findById(id: Long): MovPrev {
        return repository.findById(id).orElseThrow { RecordNotFoundException(MovPrev::class, id) }
    }

    fun findByHandle(handle: String): MovPrev {
        return repository.findByHandle(handle) ?: throw RecordNotFoundException(MovPrev::class, handle)
    }

    fun add(movPrev: MovPrev): MovPrev {
        movPrev.id = null

        return repository.save(movPrev)
    }

    fun update(movPrev: MovPrev, id: Long): MovPrev {
        val movPrevDb = findById(id)
        return update(movPrev, movPrevDb)
    }

    fun update(movPrev: MovPrev, handle: String): MovPrev {
        val movPrevDb = findByHandle(handle)
        return update(movPrev, movPrevDb)
    }

    fun delete(id: Long): MovPrev {
        return repository.softDelete(id) ?: throw RecordNotFoundException(MovPrev::class, id)
    }

    fun delete(handle: String): MovPrev {
        return repository.softDelete(handle) ?: throw RecordNotFoundException(MovPrev::class, handle)
    }

    private fun update(old: MovPrev, new: MovPrev): MovPrev {
        new.dataInicio = old.dataInicio
        new.dataFim = old.dataFim
        new.tipo = old.tipo
        new.periodicidade = old.periodicidade

        return repository.save(new)
    }
}
