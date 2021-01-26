package br.com.strn.erp.api.database.entities.geral

import br.com.strn.erp.api.database.entities.BaseEntity
import br.com.strn.erp.api.database.util.newHandle
import org.hibernate.annotations.Type
import org.hibernate.annotations.Where
import javax.persistence.*

@Entity
@Table(name = "anexo")
@Where(clause = "deleted_at is null")
class Anexo(
        var nomeArquivo: String?,
        var mimeType: String?,
        var tamanho: Long?,

        @Lob
        @Basic(fetch = FetchType.LAZY)
        @Type(type = "org.hibernate.type.BinaryType")
        var conteudo: ByteArray? = null,

        @Id
        @SequenceGenerator(name = "sq_anexo", sequenceName = "sq_anexo", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_anexo")
        @Column(name = "id", unique = true, nullable = false)
        var id: Long? = null,

        override var handle: String? = newHandle()
) : BaseEntity(handle = handle)