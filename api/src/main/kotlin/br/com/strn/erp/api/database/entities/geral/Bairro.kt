package br.com.strn.erp.api.database.entities.geral

import br.com.strn.erp.api.database.entities.BaseEntity
import org.hibernate.annotations.Where
import javax.persistence.*

@Entity
@Table(name = "bairro")
@Where(clause = "deleted_at is null")
class Bairro(
        var nome: String,

        @ManyToOne
        @JoinColumn(name = "id_municipio")
        var municipio: Municipio?,

        @Id
        @SequenceGenerator(name = "sq_bairro", sequenceName = "sq_bairro", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_bairro")
        @Column(name = "id", unique = true, nullable = false)
        var id: Long? = null
) : BaseEntity()