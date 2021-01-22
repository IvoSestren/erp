package br.com.strn.erp.api.database.entities.geral

import br.com.strn.erp.api.database.entities.BaseEntity
import org.hibernate.annotations.Where
import javax.persistence.*

@Entity
@Table(name = "anexo")
@Where(clause = "deleted_at is null")
class Anexo(
        var nomeArquivo: String,
        var mimeType: String,

        @Lob
        var conteudo: Array<Byte>,

        @Id
        @SequenceGenerator(name = "sq_anexo", sequenceName = "sq_anexo", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_anexo")
        @Column(name = "id", unique = true, nullable = false)
        var id: Long? = null
) : BaseEntity()