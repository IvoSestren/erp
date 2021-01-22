package br.com.strn.erp.api.service

import br.com.strn.erp.api.database.dao.geral.ConfiguracaoRepository
import br.com.strn.erp.api.database.entities.enums.ConfiguracaoChave
import br.com.strn.erp.api.database.entities.geral.Configuracao
import br.com.strn.erp.api.errors.RecordNotFoundException
import org.springframework.stereotype.Service

@Service
class ConfiguracaoService(
        private val repository: ConfiguracaoRepository
) {

    fun findAll(): List<Configuracao> {
        return repository.findAll()
    }

    fun findByChave(chave: ConfiguracaoChave): Configuracao {
        return repository.findByChave(chave) ?: throw RecordNotFoundException()
    }

}