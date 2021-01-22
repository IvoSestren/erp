package br.com.strn.erp.api.service

import br.com.strn.erp.api.database.dao.geral.MunicipioRepository
import br.com.strn.erp.api.database.entities.geral.Municipio
import br.com.strn.erp.api.errors.RecordNotFoundException
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class MunicipioService(
        private val repository: MunicipioRepository,
        private val estadoService: EstadoService
) {

    fun findAll(pageable: Pageable): Page<Municipio> {
        return repository.findAll(pageable)
    }

    fun delete(id: Long): Municipio {
        return repository.softDelete(id) ?: throw RecordNotFoundException()
    }

    fun findById(id: Long): Municipio {
        return repository.findById(id).orElseThrow { RecordNotFoundException() }
    }

    fun add(municipio: Municipio): Municipio {
        municipio.id = null

        municipio.estado = estadoService.findById(municipio.estado!!.id!!)

        return repository.save(municipio)
    }

    fun update(municipio: Municipio, id: Long): Municipio {
        val municipioDb = repository.findById(id).orElseThrow { RecordNotFoundException() }

        municipioDb.nome = municipio.nome
        municipioDb.ibge = municipio.ibge

        municipioDb.estado = estadoService.findById(municipio.estado!!.id!!)

        return repository.save(municipioDb)
    }
}
