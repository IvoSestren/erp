package br.com.strn.erp.api.database.entities.financeiro

import br.com.strn.erp.api.database.entities.BaseEntity
import org.hibernate.annotations.Where
import javax.persistence.*

@Entity
@Table(name = "movprevcontadiv")
@Where(clause = "deleted_at is null")
class MovPrevContaDiv(
    var descricao: String,
    var valor: Float,

    @ManyToOne
    @JoinColumn(name = "id_movprevconta")
    var movPrevConta: MovPrevConta? = null,

    @ManyToOne
    @JoinColumn(name = "id_conta")
    var conta: Conta? = null,

    @ManyToOne
    @JoinColumn(name = "id_planoconta")
    var planoConta: PlanoConta? = null,

    @ManyToOne
    @JoinColumn(name = "id_centrocusto")
    var centroCusto: CentroCusto? = null,

    @Id
    @SequenceGenerator(name = "sq_movprevcontadiv", sequenceName = "sq_movprevcontadiv", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_movprevcontadiv")
    @Column(name = "id", unique = true, nullable = false)
    var id: Long? = null
) : BaseEntity()