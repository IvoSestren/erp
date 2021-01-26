package br.com.strn.erp.api.database.entities.seguranca

import br.com.strn.erp.api.database.entities.BaseEntity
import br.com.strn.erp.api.database.util.newHandle
import org.hibernate.annotations.Where
import javax.persistence.*

@Entity
@Table(name = "perfilusuario")
@Where(clause = "deleted_at is null")
class PerfilUsuario(
        @ManyToOne
        @JoinColumn(name = "id_perfil")
        var perfil: Perfil? = null,

        @ManyToOne
        @JoinColumn(name = "id_usuario")
        var usuario: Usuario? = null,

        @Id
        @SequenceGenerator(name = "sq_perfilusuario", sequenceName = "sq_perfilusuario", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_perfilusuario")
        @Column(name = "id", unique = true, nullable = false)
        var id: Long? = null,

        override var handle: String? = newHandle()
) : BaseEntity(handle = handle
)