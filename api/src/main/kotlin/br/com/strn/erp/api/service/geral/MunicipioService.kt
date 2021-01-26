package br.com.strn.erp.api.service.geral

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
        return repository.softDelete(id) ?: throw RecordNotFoundException(Municipio::class, id)
    }

    fun delete(handle: String): Municipio {
        return repository.softDelete(handle) ?: throw RecordNotFoundException(Municipio::class, handle)
    }

    fun findById(id: Long): Municipio {
        return repository.findById(id).orElseThrow { RecordNotFoundException(Municipio::class, id) }
    }

    fun findByHandle(handle: String): Municipio {
        return repository.findByHandle(handle) ?: throw RecordNotFoundException(Municipio::class, handle)
    }

    fun add(municipio: Municipio): Municipio {
        municipio.id = null

        foreignKeys(municipio, municipio)

        return repository.save(municipio)
    }

    fun update(municipio: Municipio, id: Long): Municipio {
        val municipioDb = findById(id)
        return update(municipio, municipioDb)
    }

    fun update(municipio: Municipio, handle: String): Municipio {
        val municipioDb = findByHandle(handle)
        return update(municipio, municipioDb)
    }

    fun findByEstado(id: Long, pageable: Pageable): Page<Municipio> {
        return repository.findByEstado(id, pageable)
    }

    fun findByEstado(handle: String, pageable: Pageable): Page<Municipio> {
        return repository.findByEstado(handle, pageable)
    }

    private fun update(old: Municipio, new: Municipio): Municipio {
        new.nome = old.nome
        new.ibge = old.ibge

        foreignKeys(old, new)

        return repository.save(new)
    }

    private fun foreignKeys(origem: Municipio, destino: Municipio) {
        destino.estado = estadoService.findById(origem.estado!!.id!!)
    }
}
