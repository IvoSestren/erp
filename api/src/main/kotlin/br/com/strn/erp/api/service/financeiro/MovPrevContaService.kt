package br.com.strn.erp.api.service.financeiro

import br.com.strn.erp.api.database.dao.financeiro.MovPrevContaRepository
import br.com.strn.erp.api.database.entities.financeiro.MovPrevConta
import br.com.strn.erp.api.errors.RecordNotFoundException
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class MovPrevContaService(
        private val repository: MovPrevContaRepository,
        private val movPrevService: MovPrevService
) {
    fun findAll(pageable: Pageable): Page<MovPrevConta> {
        return repository.findAll(pageable)
    }

    fun findById(id: Long): MovPrevConta {
        return repository.findById(id).orElseThrow { RecordNotFoundException(MovPrevConta::class, id) }
    }

    fun findByHandle(handle: String): MovPrevConta {
        return repository.findByHandle(handle) ?: throw RecordNotFoundException(MovPrevConta::class, handle)
    }

    fun add(movPrevConta: MovPrevConta): MovPrevConta {
        movPrevConta.id = null

        foreignKeys(movPrevConta, movPrevConta)

        return repository.save(movPrevConta)
    }

    fun update(movPrevConta: MovPrevConta, id: Long): MovPrevConta {
        val movPrevContaDb = findById(id)
        return update(movPrevConta, movPrevContaDb)
    }

    fun update(movPrevConta: MovPrevConta, handle: String): MovPrevConta {
        val movPrevContaDb = findByHandle(handle)
        return update(movPrevConta, movPrevContaDb)
    }

    fun delete(id: Long): MovPrevConta {
        return repository.softDelete(id) ?: throw RecordNotFoundException(MovPrevConta::class, id)
    }

    fun delete(handle: String): MovPrevConta {
        return repository.softDelete(handle) ?: throw RecordNotFoundException(MovPrevConta::class, handle)
    }

    private fun foreignKeys(origem: MovPrevConta, destino: MovPrevConta) {
        val idMovPrev = origem.movPrev?.id
        if (idMovPrev != null)
            destino.movPrev = movPrevService.findById(idMovPrev)
    }

    private fun update(old: MovPrevConta, new: MovPrevConta): MovPrevConta {
        new.data = old.data
        new.descricao = old.descricao

        foreignKeys(old, new)

        return repository.save(new)
    }
}
