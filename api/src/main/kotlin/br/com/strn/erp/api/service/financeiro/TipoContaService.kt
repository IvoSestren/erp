package br.com.strn.erp.api.service.financeiro

import br.com.strn.erp.api.database.dao.financeiro.TipoContaRepository
import br.com.strn.erp.api.database.entities.financeiro.TipoConta
import br.com.strn.erp.api.errors.RecordNotFoundException
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class TipoContaService(
        private val repository: TipoContaRepository
) {
    fun findById(id: Long): TipoConta {
        return repository.findById(id).orElseThrow { RecordNotFoundException(TipoConta::class, id) }
    }

    fun findByHandle(handle: String): TipoConta {
        return repository.findByHandle(handle) ?: throw RecordNotFoundException(TipoConta::class, handle)
    }

    fun findAll(pageable: Pageable): Page<TipoConta> {
        return repository.findAll(pageable)
    }

    fun add(tipoConta: TipoConta): TipoConta {
        tipoConta.id = null

        return repository.save(tipoConta)
    }

    fun update(tipoConta: TipoConta, id: Long): TipoConta {
        val tipoContaDb = findById(id)
        return update(tipoConta, tipoContaDb)
    }

    fun update(tipoConta: TipoConta, handle: String): TipoConta {
        val tipoContaDb = findByHandle(handle)
        return update(tipoConta, tipoContaDb)
    }

    fun delete(id: Long): TipoConta {
        return repository.softDelete(id) ?: throw RecordNotFoundException(TipoConta::class, id)
    }

    fun delete(handle: String): TipoConta {
        return repository.softDelete(handle) ?: throw RecordNotFoundException(TipoConta::class, handle)
    }

    private fun update(old: TipoConta, new: TipoConta): TipoConta {
        new.nome = old.nome
        return repository.save(new)
    }
}
