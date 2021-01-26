package br.com.strn.erp.api.database.entities.geral

import br.com.strn.erp.api.database.entities.BaseEntity
import br.com.strn.erp.api.database.entities.financeiro.MovContaDiv
import br.com.strn.erp.api.database.util.newHandle
import org.hibernate.annotations.Where
import javax.persistence.*
import javax.validation.constraints.NotNull

@Entity
@Table(name = "estado")
@Where(clause = "deleted_at is null")
class Estado(
        var nome: String?,
        var abreviacao: String?,

        @ManyToOne
        @JoinColumn(name = "id_pais")
        @NotNull
        var pais: Pais?,

        @OneToMany
        @JoinColumn(name = "id_estado")
        var municipios: List<Municipio>? = null,

        @Id
        @SequenceGenerator(name = "sq_estado", sequenceName = "sq_estado", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_estado")
        @Column(name = "id", unique = true, nullable = false)
        var id: Long? = null,

        override var handle: String? = newHandle()
) : BaseEntity(handle = handle)