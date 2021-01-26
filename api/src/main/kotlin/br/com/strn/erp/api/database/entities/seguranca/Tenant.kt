package br.com.strn.erp.api.database.entities.seguranca

import br.com.strn.erp.api.database.entities.BaseEntity
import br.com.strn.erp.api.database.util.newHandle
import org.hibernate.annotations.Where
import javax.persistence.*

@Entity
@Table(name = "tenant", schema = "public")
@Where(clause = "deleted_at is null")
class Tenant(
        @Column(name = "tenant_name")
        var nome: String?,

        @Column(name = "schema_name")
        var schema: String?,

        @Id
        @SequenceGenerator(name = "sq_tenant", sequenceName = "sq_tenant", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tenant")
        @Column(name = "id", unique = true, nullable = false)
        var id: Long? = null,

        override var handle: String? = newHandle()
) : BaseEntity()