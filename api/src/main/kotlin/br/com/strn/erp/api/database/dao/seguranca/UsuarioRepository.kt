package br.com.strn.erp.api.database.dao.seguranca

import br.com.strn.erp.api.database.dao.BaseRepository
import br.com.strn.erp.api.database.entities.seguranca.Usuario
import org.springframework.data.jpa.repository.Query

interface UsuarioRepository : BaseRepository<Usuario, Long> {
    @Query("SELECT a FROM Usuario a INNER JOIN UsuarioLogin b on b.usuario = a INNER JOIN Email c on c = b.email WHERE c.email = ?2")
    fun findByEmailLogin(email: String): Usuario?
}
