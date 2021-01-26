package br.com.strn.erp.api.service.geral

import br.com.strn.erp.api.database.dao.geral.ConfiguracaoRepository
import br.com.strn.erp.api.database.entities.enums.ConfiguracaoChave
import br.com.strn.erp.api.database.entities.geral.Configuracao
import br.com.strn.erp.api.errors.RecordNotFoundException
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class ConfiguracaoService(
        private val repository: ConfiguracaoRepository
) {

    fun findByChave(chave: ConfiguracaoChave): Configuracao {
        return repository.findByChave(chave) ?: throw RecordNotFoundException(ConfiguracaoChave::class, chave.name)
    }

    fun findAll(pageable: Pageable): Page<Configuracao> {
        return repository.findAll(pageable)
    }

    fun findById(id: Long): Configuracao {
        return repository.findById(id).orElseThrow { RecordNotFoundException(Configuracao::class, id) }
    }

    fun findByHandle(handle: String): Configuracao {
        return repository.findByHandle(handle) ?: throw RecordNotFoundException(Configuracao::class, handle)
    }

    fun add(configuracao: Configuracao): Configuracao {
        configuracao.id = null

        return repository.save(configuracao)
    }

    fun update(configuracao: Configuracao, id: Long): Configuracao {
        val configuracaoDb = findById(id)
        return update(configuracao, configuracaoDb)
    }

    fun update(configuracao: Configuracao, handle: String): Configuracao {
        val configuracaoDb = findByHandle(handle)
        return update(configuracao, configuracaoDb)
    }

    fun delete(id: Long): Configuracao {
        return repository.softDelete(id) ?: throw RecordNotFoundException(Configuracao::class, id)
    }

    fun delete(handle: String): Configuracao {
        return repository.softDelete(handle) ?: throw RecordNotFoundException(Configuracao::class, handle)
    }

    private fun update(old: Configuracao, new: Configuracao): Configuracao {
        new.chave = old.chave
        new.valor = old.valor
        return repository.save(new)
    }
}