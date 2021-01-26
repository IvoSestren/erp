package br.com.strn.erp.api.service.geral

import br.com.strn.erp.api.database.dao.geral.EstadoRepository
import br.com.strn.erp.api.database.entities.geral.Estado
import br.com.strn.erp.api.errors.RecordNotFoundException
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class EstadoService(
        private val repository: EstadoRepository,
        private val paisService: PaisService
) {
    fun findById(id: Long): Estado {
        return repository.findById(id).orElseThrow { RecordNotFoundException(Estado::class, id) }
    }

    fun findByHandle(handle: String): Estado {
        return repository.findByHandle(handle) ?: throw RecordNotFoundException(Estado::class, handle)
    }

    fun findAll(pageable: Pageable): Page<Estado> {
        return repository.findAll(pageable)
    }

    fun add(estado: Estado): Estado {
        estado.id = null

        foreignKeys(estado, estado)

        return repository.save(estado)
    }

    fun update(estado: Estado, id: Long): Estado {
        val estadoDb = findById(id)
        return update(estado, estadoDb)
    }

    fun update(estado: Estado, handle: String): Estado {
        val estadoDb = findByHandle(handle)
        return update(estado, estadoDb)
    }

    fun delete(id: Long): Estado {
        return repository.softDelete(id) ?: throw RecordNotFoundException(Estado::class, id)
    }

    fun delete(handle: String): Estado {
        return repository.softDelete(handle) ?: throw RecordNotFoundException(Estado::class, handle)
    }

    private fun foreignKeys(origem: Estado, destino: Estado) {
        val idPais = origem.pais?.id
        if (idPais != null)
            destino.pais = paisService.findById(idPais)
    }

    private fun update(old: Estado, new: Estado): Estado {
        new.nome = old.nome
        new.abreviacao = old.abreviacao

        foreignKeys(old, new)

        return repository.save(new)
    }
}