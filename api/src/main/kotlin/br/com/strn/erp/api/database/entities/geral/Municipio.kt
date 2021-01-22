package br.com.strn.erp.api.database.entities.geral

import br.com.strn.erp.api.database.entities.BaseEntity
import org.hibernate.annotations.Where
import javax.persistence.*
import javax.validation.constraints.NotNull

@Entity
@Table(name = "municipio")
@Where(clause = "deleted_at is null")
@NamedEntityGraph(name = "municipio.estado", attributeNodes = [NamedAttributeNode("estado")])
class Municipio(

        var nome: String,
        var ibge: String,

        @ManyToOne
        @JoinColumn(name = "id_estado")
        @NotNull
        var estado: Estado?,

        @Id
        @SequenceGenerator(name = "sq_municipio", sequenceName = "sq_municipio", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_municipio")
        @Column(name = "id", unique = true, nullable = false)
        var id: Long? = null
) : BaseEntity()