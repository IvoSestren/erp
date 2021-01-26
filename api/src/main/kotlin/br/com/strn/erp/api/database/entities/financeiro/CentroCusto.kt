package br.com.strn.erp.api.database.entities.financeiro

import br.com.strn.erp.api.database.entities.BaseEntity
import br.com.strn.erp.api.database.util.newHandle
import org.hibernate.annotations.Where
import javax.persistence.*

@Entity
@Table(name = "centrocusto")
@Where(clause = "deleted_at is null")
class CentroCusto(
        var codigo: String?,
        var nome: String?,

        @ManyToOne
        @JoinColumn(name = "id_centrocustopai")
        var centroCustoPai: CentroCusto? = null,

        @Id
        @SequenceGenerator(name = "sq_centrocusto", sequenceName = "sq_centrocusto", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_centrocusto")
        @Column(name = "id", unique = true, nullable = false)
        var id: Long? = null,

        override var handle: String? = newHandle()
) : BaseEntity(handle = handle)