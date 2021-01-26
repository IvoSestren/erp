package br.com.strn.erp.api.database.dao.seguranca

import br.com.strn.erp.api.database.dao.BaseRepository
import br.com.strn.erp.api.database.entities.seguranca.UsuarioLogin
import org.springframework.data.jpa.repository.Query

interface UsuarioLoginRepository : BaseRepository<UsuarioLogin> {
    @Query("select b from UsuarioLogin b inner join Email c on c = b.email where c.email = ?1")
    fun findByEmail(email: String): UsuarioLogin?
}