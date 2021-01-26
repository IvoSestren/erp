package br.com.strn.erp.api.service.financeiro

import br.com.strn.erp.api.database.dao.financeiro.ContaRepository
import br.com.strn.erp.api.database.entities.financeiro.Conta
import br.com.strn.erp.api.errors.RecordNotFoundException
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class ContaService(
        private val repository: ContaRepository,
        private val tipoContaService: TipoContaService
) {
    fun findAll(pageable: Pageable): Page<Conta> {
        return repository.findAll(pageable)
    }

    fun findById(id: Long): Conta {
        return repository.findById(id).orElseThrow { RecordNotFoundException(Conta::class, id) }
    }

    fun findByHandle(handle: String): Conta {
        return repository.findByHandle(handle) ?: throw RecordNotFoundException(Conta::class, handle)
    }

    fun add(conta: Conta): Conta {
        conta.id = null

        val idTipoConta = conta.tipoConta?.id
        if (idTipoConta != null)
            conta.tipoConta = tipoContaService.findById(idTipoConta)

        return repository.save(conta)
    }

    fun update(conta: Conta, id: Long): Conta {
        val contaDb = findById(id)
        return update(conta, contaDb)
    }

    fun update(conta: Conta, handle: String): Conta {
        val contaDb = findByHandle(handle)
        return update(conta, contaDb)
    }

    fun delete(id: Long): Conta {
        return repository.softDelete(id) ?: throw RecordNotFoundException(Conta::class, id)
    }

    fun delete(handle: String): Conta {
        return repository.softDelete(handle) ?: throw RecordNotFoundException(Conta::class, handle)
    }

    private fun update(old: Conta, new: Conta): Conta {
        new.nome = old.nome

        val idTipoConta = old.tipoConta?.id
        if (idTipoConta != null)
            new.tipoConta = tipoContaService.findById(idTipoConta)

        return repository.save(new)
    }
}