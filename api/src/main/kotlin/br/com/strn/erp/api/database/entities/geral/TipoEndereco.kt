package br.com.strn.erp.api.database.entities.geral

import br.com.strn.erp.api.database.entities.BaseEntity
import org.hibernate.annotations.Where
import javax.persistence.*

@Entity
@Table(name = "tipoendereco")
@Where(clause = "deleted_at is null")
class TipoEndereco(
        var nome: String,
        var identificador: String,

        @Id
        @SequenceGenerator(name = "sq_tipoendereco", sequenceName = "sq_tipoendereco", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tipoendereco")
        @Column(name = "id", unique = true, nullable = false)
        var id: Long? = null
) : BaseEntity()