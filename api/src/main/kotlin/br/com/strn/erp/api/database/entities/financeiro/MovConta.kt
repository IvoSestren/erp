package br.com.strn.erp.api.database.entities.financeiro

import br.com.strn.erp.api.database.entities.BaseEntity
import br.com.strn.erp.api.database.util.newHandle
import org.hibernate.annotations.Where
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "movconta")
@Where(clause = "deleted_at is null")
class MovConta(

        var data: LocalDateTime?,
        var descricao: String?,

        @OneToMany
        var divisoes: List<MovContaDiv>? = null,

        @Id
        @SequenceGenerator(name = "sq_movconta", sequenceName = "sq_movconta", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_movconta")
        @Column(name = "id", unique = true, nullable = false)
        var id: Long? = null,

        override var handle: String? = newHandle()
) : BaseEntity(handle = handle)