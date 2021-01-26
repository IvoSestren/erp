package br.com.strn.erp.api.database.dao.geral

import br.com.strn.erp.api.database.dao.BaseRepository
import br.com.strn.erp.api.database.entities.enums.ConfiguracaoChave
import br.com.strn.erp.api.database.entities.geral.Configuracao

interface ConfiguracaoRepository : BaseRepository<Configuracao> {
    fun findByChave(chave: ConfiguracaoChave): Configuracao?
}