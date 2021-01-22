package br.com.strn.erp.api.database.entities.geral

import br.com.strn.erp.api.database.entities.BaseEntity
import org.hibernate.annotations.Where
import javax.persistence.*

@Entity
@Table(name = "pais")
@Where(clause = "deleted_at is null")
class Pais(
        var nome: String? = null,
        var abreviacao: String? = null,

        @Column(name = "nome_internacional")
        var nomeInternacional: String? = null,

        @Column(name = "codigo_bancocentral")
        var codigoBancoCentral: String? = null,

        @Column(name = "codigo_internacional")
        var codigoInternacional: String? = null,

        @Id
        @SequenceGenerator(name = "sq_pais", sequenceName = "sq_pais", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_pais")
        @Column(name = "id", unique = true, nullable = false)
        var id: Long? = null
) : BaseEntity()