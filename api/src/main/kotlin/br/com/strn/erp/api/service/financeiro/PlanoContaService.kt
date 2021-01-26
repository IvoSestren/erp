package br.com.strn.erp.api.service.financeiro

import br.com.strn.erp.api.database.dao.financeiro.PlanoContaRepository
import br.com.strn.erp.api.database.entities.financeiro.PlanoConta
import br.com.strn.erp.api.errors.RecordNotFoundException
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class PlanoContaService(
        private val repository: PlanoContaRepository
) {
    fun findById(id: Long): PlanoConta {
        return repository.findById(id).orElseThrow { RecordNotFoundException(PlanoConta::class, id) }
    }

    fun findByHandle(handle: String): PlanoConta {
        return repository.findByHandle(handle) ?: throw RecordNotFoundException(PlanoConta::class, handle)
    }

    fun findAll(pageable: Pageable): Page<PlanoConta> {
        return repository.findAll(pageable)
    }

    fun add(planoConta: PlanoConta): PlanoConta {
        planoConta.id = null

        foreignKeys(planoConta, planoConta)

        return repository.save(planoConta)
    }

    fun update(planoConta: PlanoConta, id: Long): PlanoConta {
        val planoContaDb = findById(id)
        return update(planoConta, planoContaDb)
    }

    fun update(planoConta: PlanoConta, handle: String): PlanoConta {
        val planoContaDb = findByHandle(handle)
        return update(planoConta, planoContaDb)
    }

    fun delete(id: Long): PlanoConta {
        return repository.softDelete(id) ?: throw RecordNotFoundException(PlanoConta::class, id)
    }

    fun delete(handle: String): PlanoConta {
        return repository.softDelete(handle) ?: throw RecordNotFoundException(PlanoConta::class, handle)
    }

    private fun foreignKeys(origem: PlanoConta, destino: PlanoConta) {
        val idPlanoContaPai = origem.planoContaPai?.id
        if (idPlanoContaPai != null)
            destino.planoContaPai = findById(idPlanoContaPai)
    }

    private fun update(old: PlanoConta, new: PlanoConta): PlanoConta {
        new.credito = old.credito
        new.nome = old.nome

        foreignKeys(old, new)

        return repository.save(new)
    }
}
