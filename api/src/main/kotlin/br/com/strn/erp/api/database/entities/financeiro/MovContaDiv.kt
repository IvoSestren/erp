package br.com.strn.erp.api.database.entities.financeiro

import br.com.strn.erp.api.database.entities.BaseEntity
import org.hibernate.annotations.Where
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "movcontadiv")
@Where(clause = "deleted_at is null")
class MovContaDiv(
    var descricao: String,
    var valor: Float,

    @Column(name = "data_conciliado")
    var dataConciliado: LocalDateTime,

    @ManyToOne
    @JoinColumn(name = "id_movconta")
    var movConta: MovConta,

    @ManyToOne
    @JoinColumn(name = "id_conta")
    var conta: Conta,

    @ManyToOne
    @JoinColumn(name = "id_planoconta")
    var planoConta: PlanoConta,

    @ManyToOne
    @JoinColumn(name = "id_centrocusto")
    var centroCusto: CentroCusto,

    @Id
    @SequenceGenerator(name = "sq_movcontadiv", sequenceName = "sq_movcontadiv", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_movcontadiv")
    @Column(name = "id", unique = true, nullable = false)
    var id: Long? = null
) : BaseEntity()