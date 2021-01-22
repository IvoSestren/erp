package br.com.strn.erp.api.service

import br.com.strn.erp.api.database.dao.seguranca.PermissaoRepository
import br.com.strn.erp.api.database.entities.enums.TipoPermissao
import br.com.strn.erp.api.database.entities.seguranca.Permissao
import br.com.strn.erp.api.security.token.TokenUtils
import org.springframework.stereotype.Service

@Service
class PermissaoService(
        private val repository: PermissaoRepository,
        private val tokenUtils: TokenUtils,
        private val usuarioService: UsuarioService
) {
    fun usuarioAtualTemPermissao(tipoPermissao: TipoPermissao): Boolean {
        val permissoes = arrayOf(tipoPermissao)

        return usuarioAtualTemPermissao(permissoes)
    }

    fun usuarioAtualTemPermissao(tipoPermissoes: Array<out TipoPermissao>): Boolean {
        val email = tokenUtils.getEmail()
        val usuario = usuarioService.findByEmailLogin(email)
        val permissoesUsuario: List<Permissao> = repository.findByUsuario(usuario.id!!)

        for (tipoPermissao in tipoPermissoes) {
            if ((tipoPermissao == TipoPermissao.GUEST) || (tipoPermissao == TipoPermissao.AUTENTICACAO_LOGOUT))
                return true

            for (permissao in permissoesUsuario) {
                if (permissao.identificador == tipoPermissao)
                    return true

                if (permissao.identificador == TipoPermissao.ADMIN)
                    return true
            }
        }

        return false
    }

}
