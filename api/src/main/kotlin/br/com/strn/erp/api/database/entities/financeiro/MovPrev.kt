package br.com.strn.erp.api.database.entities.financeiro

import br.com.strn.erp.api.database.entities.BaseEntity
import br.com.strn.erp.api.database.entities.enums.TipoMovPrev
import br.com.strn.erp.api.database.entities.enums.TipoPeriodicidade
import br.com.strn.erp.api.database.util.newHandle
import org.hibernate.annotations.Where
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "movprev")
@Where(clause = "deleted_at is null")
class MovPrev(
        var dataInicio: LocalDateTime?,
        var dataFim: LocalDateTime?,

        @Enumerated(EnumType.STRING)
        var tipo: TipoMovPrev?,

        @Enumerated(EnumType.STRING)
        var periodicidade: TipoPeriodicidade?,

        @Id
        @SequenceGenerator(name = "sq_movprev", sequenceName = "sq_movprev", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_movprev")
        @Column(name = "id", unique = true, nullable = false)
        var id: Long? = null,

        override var handle: String? = newHandle()
) : BaseEntity(handle = handle)