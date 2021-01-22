package br.com.strn.erp.api.service

import br.com.strn.erp.api.database.dao.geral.EstadoRepository
import br.com.strn.erp.api.database.entities.geral.Estado
import br.com.strn.erp.api.errors.RecordNotFoundException
import org.springframework.stereotype.Service

@Service
class EstadoService(
        private val repository: EstadoRepository
) {
    fun findById(id: Long): Estado {
        return repository.findById(id).orElseThrow { RecordNotFoundException() }
    }

}