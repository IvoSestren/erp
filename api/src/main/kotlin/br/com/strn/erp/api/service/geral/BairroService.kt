package br.com.strn.erp.api.service.geral

import br.com.strn.erp.api.database.dao.geral.BairroRepository
import br.com.strn.erp.api.database.entities.geral.Bairro
import br.com.strn.erp.api.errors.RecordNotFoundException
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class BairroService(
        private val repository: BairroRepository,
        private val municipioService: MunicipioService
) {
    fun findAll(pageable: Pageable): Page<Bairro> {
        return repository.findAll(pageable)
    }

    fun findById(id: Long): Bairro {
        return repository.findById(id).orElseThrow { RecordNotFoundException(Bairro::class, id) }
    }

    fun findByHandle(handle: String): Bairro {
        return repository.findByHandle(handle) ?: throw RecordNotFoundException(Bairro::class, handle)
    }

    fun add(bairro: Bairro): Bairro {
        bairro.id = null

        foreignKeys(bairro, bairro)

        return repository.save(bairro)
    }

    fun update(bairro: Bairro, id: Long): Bairro {
        val bairroDb = findById(id)
        return update(bairro, bairroDb)
    }

    fun update(bairro: Bairro, handle: String): Bairro {
        val bairroDb = findByHandle(handle)
        return update(bairro, bairroDb)
    }

    fun delete(id: Long): Bairro {
        return repository.softDelete(id) ?: throw RecordNotFoundException(Bairro::class, id)
    }

    fun delete(handle: String): Bairro {
        return repository.softDelete(handle) ?: throw RecordNotFoundException(Bairro::class, handle)
    }

    private fun update(old: Bairro, new: Bairro): Bairro {
        new.nome = old.nome

        foreignKeys(old, new)

        return repository.save(new)
    }

    private fun foreignKeys(origem: Bairro, destino: Bairro) {
        val idMunicipio = origem.municipio?.id
        if (idMunicipio != null) {
            destino.municipio = municipioService.findById(idMunicipio)
        }
    }
}