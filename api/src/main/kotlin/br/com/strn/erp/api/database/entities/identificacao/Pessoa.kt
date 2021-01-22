package br.com.strn.erp.api.database.entities.identificacao

import br.com.strn.erp.api.database.entities.BaseEntity
import org.hibernate.annotations.Where
import javax.persistence.*

@Entity
@Table(name = "pessoa")
@Where(clause = "deleted_at is null")
class Pessoa(
        var nome: String,
        var juridica: Boolean,
        var cnpj: String,

        @Id
        @SequenceGenerator(name = "sq_pessoa", sequenceName = "sq_pessoa", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_pessoa")
        @Column(name = "id", unique = true, nullable = false)
        var id: Long? = null
) : BaseEntity() {
}