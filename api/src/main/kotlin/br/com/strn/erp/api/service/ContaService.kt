package br.com.strn.erp.api.service

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
        return repository.findById(id).orElseThrow { RecordNotFoundException() }
    }

    fun add(conta: Conta): Conta {
        conta.id = null

        val tipoConta = conta.tipoConta
        if (tipoConta != null) {
            val idTipoConta = tipoConta.id
            conta.tipoConta = tipoContaService.findById(idTipoConta!!)
        }
        return repository.save(conta)
    }

    fun update(conta: Conta, id: Long): Conta {
        val contaDb = repository.findById(id).orElseThrow { RecordNotFoundException() }
        contaDb.nome = conta.nome

        val tipoConta = conta.tipoConta
        if (tipoConta != null) {
            val idTipoConta = tipoConta.id
            contaDb.tipoConta = tipoContaService.findById(idTipoConta!!)
        }
        return repository.save(contaDb)
    }

    fun delete(id: Long): Conta {
        return repository.softDelete(id) ?: throw RecordNotFoundException()
    }

}