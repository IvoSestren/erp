package br.com.strn.erp.api.service.financeiro

import br.com.strn.erp.api.database.dao.financeiro.MovContaDivRepository
import br.com.strn.erp.api.database.entities.financeiro.MovContaDiv
import br.com.strn.erp.api.errors.RecordNotFoundException
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class MovContaDivService(
        private val repository: MovContaDivRepository,
        private val movContaService: MovContaService,
        private val contaService: ContaService,
        private val planoContaService: PlanoContaService,
        private val centroCustoService: CentroCustoService
) {
    fun findAll(pageable: Pageable): Page<MovContaDiv> {
        return repository.findAll(pageable)
    }

    fun findById(id: Long): MovContaDiv {
        return repository.findById(id).orElseThrow { RecordNotFoundException(MovContaDiv::class, id) }
    }

    fun findByHandle(handle: String): MovContaDiv {
        return repository.findByHandle(handle) ?: throw RecordNotFoundException(MovContaDiv::class, handle)
    }

    fun add(movContaDiv: MovContaDiv): MovContaDiv {
        movContaDiv.id = null

        foreignKeys(movContaDiv, movContaDiv)

        return repository.save(movContaDiv)
    }

    fun update(movContaDiv: MovContaDiv, id: Long): MovContaDiv {
        val movContaDivDb = findById(id)
        return update(movContaDiv, movContaDivDb)
    }

    fun update(movContaDiv: MovContaDiv, handle: String): MovContaDiv {
        val movContaDivDb = findByHandle(handle)
        return update(movContaDiv, movContaDivDb)
    }

    fun delete(id: Long): MovContaDiv {
        return repository.softDelete(id) ?: throw RecordNotFoundException(MovContaDiv::class, id)
    }

    fun delete(handle: String): MovContaDiv {
        return repository.softDelete(handle) ?: throw RecordNotFoundException(MovContaDiv::class, handle)
    }

    private fun update(old: MovContaDiv, new: MovContaDiv): MovContaDiv {
        foreignKeys(old, new)
        return repository.save(new)
    }

    private fun foreignKeys(origem: MovContaDiv, destino: MovContaDiv) {
        val idMovConta = origem.movConta?.id
        if (idMovConta != null)
            destino.movConta = movContaService.findById(idMovConta)

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
}
