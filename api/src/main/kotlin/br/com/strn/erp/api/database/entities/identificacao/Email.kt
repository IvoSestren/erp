package br.com.strn.erp.api.database.entities.identificacao

import br.com.strn.erp.api.database.entities.BaseEntity
import org.hibernate.annotations.Where
import javax.persistence.*

@Entity
@Table(name = "email")
@Where(clause = "deleted_at is null")
class Email(
        var email: String,
        var validado: Boolean,

        @Id
        @SequenceGenerator(name = "sq_email", sequenceName = "sq_email", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_email")
        @Column(name = "id", unique = true, nullable = false)
        var id: Long? = null
) : BaseEntity()