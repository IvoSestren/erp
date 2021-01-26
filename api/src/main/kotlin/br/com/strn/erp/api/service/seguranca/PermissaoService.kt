package br.com.strn.erp.api.service.seguranca

import br.com.strn.erp.api.database.dao.seguranca.PermissaoRepository
import br.com.strn.erp.api.database.entities.enums.TipoPermissao
import br.com.strn.erp.api.database.entities.seguranca.Permissao
import br.com.strn.erp.api.errors.RecordNotFoundException
import br.com.strn.erp.api.security.token.TokenUtils
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
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

        if (tipoPermissoes.contains(TipoPermissao.GUEST) || tipoPermissoes.contains(TipoPermissao.AUTENTICACAO_LOGOUT))
            return true

        val email = tokenUtils.email
        val usuario = usuarioService.findByEmailLogin(email)
        val permissoesUsuario: List<Permissao> = repository.findByUsuario(usuario.id!!)

        for (tipoPermissao in tipoPermissoes) {
            for (permissao in permissoesUsuario) {
                if (permissao.identificador == tipoPermissao)
                    return true

                if (permissao.identificador == TipoPermissao.ADMIN)
                    return true
            }
        }

        return false
    }

    fun findAll(pageable: Pageable): Page<Permissao> {
        return repository.findAll(pageable)
    }

    fun findById(id: Long): Permissao {
        return repository.findById(id).orElseThrow { RecordNotFoundException(Permissao::class, id) }
    }

    fun findByHandle(handle: String): Permissao {
        return repository.findByHandle(handle) ?: throw RecordNotFoundException(Permissao::class, handle)
    }

    fun add(permissao: Permissao): Permissao {
        permissao.id = null
        return repository.save(permissao)
    }

    fun update(permissao: Permissao, id: Long): Permissao {
        val permissaoDb = findById(id)
        return update(permissao, permissaoDb)
    }

    fun update(permissao: Permissao, handle: String): Permissao {
        val permissaoDb = findByHandle(handle)
        return update(permissao, permissaoDb)
    }

    fun delete(id: Long): Permissao {
        return repository.softDelete(id) ?: throw RecordNotFoundException(Permissao::class, id)
    }

    fun delete(handle: String): Permissao {
        return repository.softDelete(handle) ?: throw RecordNotFoundException(Permissao::class, handle)
    }

    fun update(old: Permissao, new: Permissao): Permissao {
        new.nome = old.nome
        new.descricao = old.descricao
        new.identificador = old.identificador
        return repository.save(new)
    }
}
