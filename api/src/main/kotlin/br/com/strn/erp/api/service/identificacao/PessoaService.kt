package br.com.strn.erp.api.service.identificacao

import br.com.strn.erp.api.database.dao.identificacao.PessoaRepository
import br.com.strn.erp.api.database.entities.identificacao.Pessoa
import br.com.strn.erp.api.errors.RecordNotFoundException
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class PessoaService(
        private val repository: PessoaRepository
) {
    fun findAll(pageable: Pageable): Page<Pessoa> {
        return repository.findAll(pageable)
    }

    fun findById(id: Long): Pessoa {
        return repository.findById(id).orElseThrow { RecordNotFoundException(Pessoa::class, id) }
    }

    fun findByHandle(handle: String): Pessoa {
        return repository.findByHandle(handle) ?: throw RecordNotFoundException(Pessoa::class, handle)
    }

    fun add(pessoa: Pessoa): Pessoa {
        pessoa.id = null
        return repository.save(pessoa)
    }

    fun update(pessoa: Pessoa, id: Long): Pessoa {
        val pessoaDb = findById(id)
        return update(pessoa, pessoaDb)
    }

    fun update(pessoa: Pessoa, handle: String): Pessoa {
        val pessoaDb = findByHandle(handle)
        return update(pessoa, pessoaDb)
    }

    fun delete(id: Long): Pessoa {
        return repository.softDelete(id) ?: throw RecordNotFoundException(Pessoa::class, id)
    }

    fun delete(handle: String): Pessoa {
        return repository.softDelete(handle) ?: throw RecordNotFoundException(Pessoa::class, handle)
    }

    private fun update(old: Pessoa, new: Pessoa): Pessoa {
        new.nome = old.nome
        new.juridica = old.juridica
        new.cnpj = old.cnpj

        return repository.save(new)
    }
}
