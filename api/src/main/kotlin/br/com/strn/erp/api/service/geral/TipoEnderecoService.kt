package br.com.strn.erp.api.service.geral

import br.com.strn.erp.api.database.dao.geral.TipoEnderecoRepository
import br.com.strn.erp.api.database.entities.geral.TipoEndereco
import br.com.strn.erp.api.errors.RecordNotFoundException
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class TipoEnderecoService(
        private val repository: TipoEnderecoRepository
) {
    fun findAll(pageable: Pageable): Page<TipoEndereco> {
        return repository.findAll(pageable)
    }

    fun findById(id: Long): TipoEndereco {
        return repository.findById(id).orElseThrow { RecordNotFoundException(TipoEndereco::class, id) }
    }

    fun findByHandle(handle: String): TipoEndereco {
        return repository.findByHandle(handle) ?: throw RecordNotFoundException(TipoEndereco::class, handle)
    }

    fun add(tipoEndereco: TipoEndereco): TipoEndereco {
        tipoEndereco.id = null
        return repository.save(tipoEndereco)
    }

    fun update(tipoEndereco: TipoEndereco, id: Long): TipoEndereco {
        val tipoEnderecoDb = findById(id)
        return update(tipoEndereco, tipoEnderecoDb)
    }

    fun update(tipoEndereco: TipoEndereco, handle: String): TipoEndereco {
        val tipoEnderecoDb = findByHandle(handle)
        return update(tipoEndereco, tipoEnderecoDb)
    }

    fun delete(id: Long): TipoEndereco {
        return repository.softDelete(id) ?: throw RecordNotFoundException(TipoEndereco::class, id)
    }

    fun delete(handle: String): TipoEndereco {
        return repository.softDelete(handle) ?: throw RecordNotFoundException(TipoEndereco::class, handle)
    }

    private fun update(old: TipoEndereco, new: TipoEndereco): TipoEndereco {
        new.nome = old.nome
        new.identificador = old.identificador

        return repository.save(new)
    }
}