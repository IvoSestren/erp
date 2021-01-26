package br.com.strn.erp.api.database.entities.geral

import br.com.strn.erp.api.database.entities.BaseEntity
import br.com.strn.erp.api.database.entities.enums.ConfiguracaoChave
import br.com.strn.erp.api.database.util.newHandle
import org.hibernate.annotations.Where
import javax.persistence.*

@Entity
@Table(name = "configuracao")
@Where(clause = "deleted_at is null")
class Configuracao(
        @Enumerated(EnumType.STRING)
        var chave: ConfiguracaoChave?,
        var valor: String?,

        @Id
        @SequenceGenerator(name = "sq_configuracao", sequenceName = "sq_configuracao", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_configuracao")
        @Column(name = "id", unique = true, nullable = false)
        var id: Long? = null,

        override var handle: String? = newHandle()

) : BaseEntity(handle = handle)