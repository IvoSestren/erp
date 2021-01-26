package br.com.strn.erp.api.database.entities.financeiro

import br.com.strn.erp.api.database.entities.BaseEntity
import br.com.strn.erp.api.database.util.newHandle
import org.hibernate.annotations.Where
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "movprevconta")
@Where(clause = "deleted_at is null")
class MovPrevConta(
        var data: LocalDateTime?,
        var descricao: String?,

        @ManyToOne
        @JoinColumn(name = "id_movprev")
        var movPrev: MovPrev? = null,

        @Id
        @SequenceGenerator(name = "sq_movprevconta", sequenceName = "sq_movprevconta", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_movprevconta")
        @Column(name = "id", unique = true, nullable = false)
        var id: Long? = null,

        override var handle: String? = newHandle()
) : BaseEntity(handle = handle)