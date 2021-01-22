package br.com.strn.erp.api.database.entities.financeiro

import br.com.strn.erp.api.database.entities.BaseEntity
import org.hibernate.annotations.Where
import javax.persistence.*

@Entity
@Table(name = "tipoconta")
@Where(clause = "deleted_at is null")
class TipoConta(
    var nome: String,

    @Id
    @SequenceGenerator(name = "sq_tipoconta", sequenceName = "sq_tipoconta", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tipoconta")
    @Column(name = "id", unique = true, nullable = false)
    var id: Long? = null
) : BaseEntity()