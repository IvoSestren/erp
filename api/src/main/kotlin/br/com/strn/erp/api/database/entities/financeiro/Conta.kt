package br.com.strn.erp.api.database.entities.financeiro

import br.com.strn.erp.api.database.entities.BaseEntity
import org.hibernate.annotations.Where
import javax.persistence.*

@Entity
@Table(name = "conta")
@Where(clause = "deleted_at is null")
class Conta(
    var nome: String,

    @ManyToOne
    @JoinColumn(name = "id_tipoconta")
    var tipoConta: TipoConta?,

    @Id
    @SequenceGenerator(name = "sq_conta", sequenceName = "sq_conta", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_conta")
    @Column(name = "id", unique = true, nullable = false)
    var id: Long? = null
) : BaseEntity()