package br.com.strn.erp.api.service.identificacao

import br.com.strn.erp.api.database.dao.identificacao.EnderecoRepository
import br.com.strn.erp.api.database.entities.identificacao.Endereco
import br.com.strn.erp.api.errors.RecordNotFoundException
import br.com.strn.erp.api.service.geral.BairroService
import br.com.strn.erp.api.service.geral.EstadoService
import br.com.strn.erp.api.service.geral.MunicipioService
import br.com.strn.erp.api.service.geral.PaisService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class EnderecoService(
        private val repository: EnderecoRepository,
        private val paisService: PaisService,
        private val estadoService: EstadoService,
        private val municipioService: MunicipioService,
        private val bairroService: BairroService
) {
    fun findAll(pageable: Pageable): Page<Endereco> {
        return repository.findAll(pageable)
    }

    fun findById(id: Long): Endereco {
        return repository.findById(id).orElseThrow { RecordNotFoundException(Endereco::class, id) }
    }

    fun findByHandle(handle: String): Endereco {
        return repository.findByHandle(handle) ?: throw RecordNotFoundException(Endereco::class, handle)
    }

    fun add(endereco: Endereco): Endereco {
        endereco.id = null

        foreignKeys(endereco, endereco)

        return repository.save(endereco)
    }

    fun update(endereco: Endereco, id: Long): Endereco {
        val enderecoDb = findById(id)
        return update(endereco, enderecoDb)
    }

    fun update(endereco: Endereco, handle: String): Endereco {
        val enderecoDb = findByHandle(handle)
        return update(endereco, enderecoDb)
    }

    fun delete(id: Long): Endereco {
        return repository.softDelete(id) ?: throw RecordNotFoundException(Endereco::class, id)
    }

    fun delete(handle: String): Endereco {
        return repository.softDelete(handle) ?: throw RecordNotFoundException(Endereco::class, handle)
    }

    private fun foreignKeys(origem: Endereco, destino: Endereco) {
        val idPais = origem.pais?.id
        if (idPais != null)
            destino.pais = paisService.findById(idPais)

        val idEstado = origem.estado?.id
        if (idEstado != null)
            destino.estado = estadoService.findById(idEstado)

        val idMunicipio = origem.municipio?.id
        if (idMunicipio != null)
            destino.municipio = municipioService.findById(idMunicipio)

        val idBairro = origem.bairro?.id
        if (idBairro != null)
            destino.bairro = bairroService.findById(idBairro)
    }

    private fun update(old: Endereco, new: Endereco): Endereco {
        new.logradouro = old.logradouro
        new.numero = old.numero
        new.complemento = old.complemento

        foreignKeys(old, new)

        return repository.save(new)
    }
}
