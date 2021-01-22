package br.com.strn.erp.api.service

import br.com.strn.erp.api.database.dao.financeiro.TipoContaRepository
import br.com.strn.erp.api.database.entities.financeiro.TipoConta
import br.com.strn.erp.api.errors.RecordNotFoundException
import org.springframework.stereotype.Service

@Service
class TipoContaService(
        private val repository: TipoContaRepository
) {
    fun findById(id: Long): TipoConta {
        return repository.findById(id).orElseThrow { RecordNotFoundException() }
    }

}
