package br.com.strn.erp.api.database.entities.financeiro

import br.com.strn.erp.api.database.entities.BaseEntity
import br.com.strn.erp.api.database.util.newHandle
import org.hibernate.annotations.Where
import javax.persistence.*

@Entity
@Table(name = "planoconta")
@Where(clause = "deleted_at is null")
class PlanoConta(
        var credito: Boolean? = true,
        var nome: String? = null,

        @ManyToOne
        @JoinColumn(name = "id_planocontapai")
        var planoContaPai: PlanoConta? = null,

        @Id
        @SequenceGenerator(name = "sq_planoconta", sequenceName = "sq_planoconta", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_planoconta")
        @Column(name = "id", unique = true, nullable = false)
        var id: Long? = null,

        override var handle: String? = newHandle()
) : BaseEntity(handle = handle)