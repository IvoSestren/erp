package br.com.strn.erp.api.database.entities.seguranca

import br.com.strn.erp.api.database.entities.BaseEntity
import br.com.strn.erp.api.database.entities.identificacao.Email
import br.com.strn.erp.api.database.util.newHandle
import org.hibernate.annotations.Where
import javax.persistence.*

@Entity
@Table(name = "usuariologin")
@Where(clause = "deleted_at is null")
class UsuarioLogin(
        var senha: String?,

        @ManyToOne
        @JoinColumn(name = "id_usuario")
        var usuario: Usuario? = null,

        @ManyToOne
        @JoinColumn(name = "id_email")
        var email: Email? = null,

        @Id
        @SequenceGenerator(name = "sq_usuariologin", sequenceName = "sq_usuariologin", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_usuariologin")
        @Column(name = "id", unique = true, nullable = false)
        var id: Long? = null,

        override var handle: String? = newHandle()
) : BaseEntity(handle = handle)