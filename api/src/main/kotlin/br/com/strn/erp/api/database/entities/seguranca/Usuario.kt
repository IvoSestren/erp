package br.com.strn.erp.api.database.entities.seguranca

import br.com.strn.erp.api.database.entities.BaseEntity
import br.com.strn.erp.api.database.util.newHandle
import org.hibernate.annotations.Where
import javax.persistence.*

@Entity
@Table(name = "usuario")
@Where(clause = "deleted_at is null")
class Usuario(
        var nome: String?,

        @Id
        @SequenceGenerator(name = "sq_usuario", sequenceName = "sq_usuario", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_usuario")
        @Column(name = "id", unique = true, nullable = false)
        var id: Long? = null,

        override var handle: String? = newHandle()
) : BaseEntity(handle = handle)