package br.com.strn.erp.api.database.dao.seguranca

import br.com.strn.erp.api.database.dao.BaseRepository
import br.com.strn.erp.api.database.entities.enums.TipoPermissao
import br.com.strn.erp.api.database.entities.seguranca.Permissao
import org.springframework.data.jpa.repository.Query

interface PermissaoRepository : BaseRepository<Permissao> {
    @Query("SELECT DISTINCT a FROM Permissao a INNER JOIN PermissaoPerfil b ON b.permissao = b INNER JOIN Perfil c ON c = b.perfil INNER JOIN PerfilUsuario d ON d.perfil = c INNER JOIN Usuario e ON e = d.usuario WHERE e.id = ?1")
    fun findByUsuario(idUsuario: Long): List<Permissao>

    @Query("SELECT DISTINCT a FROM Permissao a INNER JOIN PermissaoPerfil b ON b.permissao = b INNER JOIN Perfil c ON c = b.perfil INNER JOIN PerfilUsuario d ON d.perfil = c INNER JOIN Usuario e ON e = d.usuario WHERE e.id = ?1 AND a.identificador = ?2")
    fun findByUsuarioPermissao(idUsuario: Long, identificador: TipoPermissao)
}
