package br.com.strn.erp.api.service.financeiro

import br.com.strn.erp.api.database.dao.financeiro.CentroCustoRepository
import br.com.strn.erp.api.database.entities.financeiro.CentroCusto
import br.com.strn.erp.api.errors.RecordNotFoundException
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class CentroCustoService(
        private val repository: CentroCustoRepository
) {
    fun findAll(pageable: Pageable): Page<CentroCusto> {
        return repository.findAll(pageable)
    }

    fun findById(id: Long): CentroCusto {
        return repository.findById(id).orElseThrow { RecordNotFoundException(CentroCusto::class, id) }
    }

    fun findByHandle(handle: String): CentroCusto {
        return repository.findByHandle(handle) ?: throw RecordNotFoundException(CentroCusto::class, handle)
    }

    fun add(centroCusto: CentroCusto): CentroCusto {
        centroCusto.id = null

        val idCentroCustoPai = centroCusto.centroCustoPai?.id
        if (idCentroCustoPai != null)
            centroCusto.centroCustoPai = findById(idCentroCustoPai)

        return repository.save(centroCusto)
    }

    fun update(centroCusto: CentroCusto, id: Long): CentroCusto {
        val centroCustoDb = findById(id)
        return update(centroCusto, centroCustoDb)
    }

    fun update(centroCusto: CentroCusto, handle: String): CentroCusto {
        val centroCustoDb = findByHandle(handle)
        return update(centroCusto, centroCustoDb)
    }

    fun delete(id: Long): CentroCusto {
        return repository.softDelete(id) ?: throw RecordNotFoundException(CentroCusto::class, id)
    }

    fun delete(handle: String): CentroCusto {
        return repository.softDelete(handle) ?: throw RecordNotFoundException(CentroCusto::class, handle)
    }

    private fun update(old: CentroCusto, new: CentroCusto): CentroCusto {
        new.codigo = old.codigo
        new.nome = old.nome

        val idCentroCustoPai = old.centroCustoPai?.id
        if (idCentroCustoPai != null)
            new.centroCustoPai = findById(idCentroCustoPai)

        return repository.save(new)
    }
}
