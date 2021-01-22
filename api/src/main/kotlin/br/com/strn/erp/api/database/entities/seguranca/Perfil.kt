package br.com.strn.erp.api.database.entities.seguranca

import br.com.strn.erp.api.database.entities.BaseEntity
import org.hibernate.annotations.Where
import javax.persistence.*

@Entity
@Table(name = "perfil")
@Where(clause = "deleted_at is null")
class Perfil(
        var nome: String,

        @Id
        @SequenceGenerator(name = "sq_perfil", sequenceName = "sq_perfil", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_perfil")
        @Column(name = "id", unique = true, nullable = false)
        var id: Long? = null
) : BaseEntity()