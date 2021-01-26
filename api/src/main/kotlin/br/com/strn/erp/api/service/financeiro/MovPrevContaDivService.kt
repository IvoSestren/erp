package br.com.strn.erp.api.service.financeiro

import br.com.strn.erp.api.database.dao.financeiro.MovPrevContaDivRepository
import br.com.strn.erp.api.database.entities.financeiro.MovPrevContaDiv
import br.com.strn.erp.api.errors.RecordNotFoundException
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class MovPrevContaDivService(
        private val repository: MovPrevContaDivRepository,
        private val movPrevContaService: MovPrevContaService,
        private val contaService: ContaService,
        private val planoContaService: PlanoContaService,
        private val centroCustoService: CentroCustoService
) {
    fun findAll(pageable: Pageable): Page<MovPrevContaDiv> {
        return repository.findAll(pageable)
    }

    fun findById(id: Long): MovPrevContaDiv {
        return repository.findById(id).orElseThrow { RecordNotFoundException(MovPrevContaDiv::class, id) }
    }

    fun findByHandle(handle: String): MovPrevContaDiv {
        return repository.findByHandle(handle) ?: throw RecordNotFoundException(MovPrevContaDiv::class, handle)
    }

    fun add(movPrevContaDiv: MovPrevContaDiv): MovPrevContaDiv {
        movPrevContaDiv.id = null

        foreignKeys(movPrevContaDiv, movPrevContaDiv)

        return repository.save(movPrevContaDiv)
    }

    fun update(movPrevContaDiv: MovPrevContaDiv, id: Long): MovPrevContaDiv {
        val movPrevContaDivDb = findById(id)
        return update(movPrevContaDiv, movPrevContaDivDb)
    }

    fun update(movPrevContaDiv: MovPrevContaDiv, handle: String): MovPrevContaDiv {
        val movPrevContaDivDb = findByHandle(handle)
        return update(movPrevContaDiv, movPrevContaDivDb)
    }

    fun delete(id: Long): MovPrevContaDiv {
        return repository.softDelete(id) ?: throw RecordNotFoundException(MovPrevContaDiv::class, id)
    }

    fun delete(handle: String): MovPrevContaDiv {
        return repository.softDelete(handle) ?: throw RecordNotFoundException(MovPrevContaDiv::class, handle)
    }

    private fun foreignKeys(origem: MovPrevContaDiv, destino: MovPrevContaDiv) {
        val idMovPrevConta = origem.movPrevConta?.id
        if (idMovPrevConta != null)
            destino.movPrevConta = movPrevContaService.findById(idMovPrevConta)

        val idConta = origem.conta?.id
        if (idConta != null)
            destino.conta = contaService.findById(idConta)

        val idPlanoConta = origem.planoConta?.id
        if (idPlanoConta != null)
            destino.planoConta = planoContaService.findById(idPlanoConta)

        val idCentroCusto = origem.centroCusto?.id
        if (idCentroCusto != null)
            destino.centroCusto = centroCustoService.findById(idCentroCusto)
    }

    private fun update(old: MovPrevContaDiv, new: MovPrevContaDiv): MovPrevContaDiv {
        new.descricao = old.descricao
        new.valor = old.valor

        foreignKeys(old, new)

        return repository.save(new)
    }
}
