package br.com.strn.erp.api.database.entities.seguranca

import br.com.strn.erp.api.database.entities.BaseEntity
import org.hibernate.annotations.Where
import javax.persistence.*

@Entity
@Table(name = "permissaoperfil")
@Where(clause = "deleted_at is null")
class PermissaoPerfil(
        @ManyToOne
        @JoinColumn(name = "id_permissao")
        var permissao: Permissao? = null,

        @ManyToOne
        @JoinColumn(name = "id_perfil")
        var perfil: Perfil? = null,

        @Id
        @SequenceGenerator(name = "sq_permissaoperfil", sequenceName = "sq_permissaoperfil", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_permissaoperfil")
        @Column(name = "id", unique = true, nullable = false)
        var id: Long? = null
) : BaseEntity()