package br.com.strn.erp.api.database.entities.identificacao

import br.com.strn.erp.api.database.entities.BaseEntity
import br.com.strn.erp.api.database.entities.geral.Bairro
import br.com.strn.erp.api.database.entities.geral.Estado
import br.com.strn.erp.api.database.entities.geral.Municipio
import br.com.strn.erp.api.database.entities.geral.Pais
import org.hibernate.annotations.Where
import javax.persistence.*

@Entity
@Table(name = "endereco")
@Where(clause = "deleted_at is null")
class Endereco(
        var logradouro: String,
        var numero: String,
        var complemento: String,

        @ManyToOne
        @JoinColumn(name = "id_pais")
        var pais: Pais?,

        @ManyToOne
        @JoinColumn(name = "id_estado")
        var estado: Estado?,

        @ManyToOne
        @JoinColumn(name = "id_municipio")
        var municipio: Municipio?,

        @ManyToOne
        @JoinColumn(name = "id_bairro")
        var bairro: Bairro?,

        @Id
        @SequenceGenerator(name = "sq_endereco", sequenceName = "sq_endereco", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_endereco")
        @Column(name = "id", unique = true, nullable = false)
        var id: Long? = null
) : BaseEntity() {
}