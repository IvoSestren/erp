package br.com.strn.erp.api.database.entities.seguranca

import br.com.strn.erp.api.database.entities.BaseEntity
import br.com.strn.erp.api.database.entities.enums.TipoPermissao
import br.com.strn.erp.api.database.util.newHandle
import org.hibernate.annotations.Where
import javax.persistence.*

@Entity
@Table(name = "permissao")
@Where(clause = "deleted_at is null")
class Permissao(
        var nome: String?,
        var descricao: String?,

        @Enumerated(EnumType.STRING)
        var identificador: TipoPermissao? = null,

        @Id
        @SequenceGenerator(name = "sq_permissao", sequenceName = "sq_permissao", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_permissao")
        @Column(name = "id", unique = true, nullable = false)
        var id: Long? = null,

        override var handle: String? = newHandle()
) : BaseEntity(handle = handle)
