package br.com.strn.erp.api.database.entities

import br.com.strn.erp.api.database.util.newHandle
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.io.Serializable
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.MappedSuperclass

@MappedSuperclass
open class BaseEntity(
        @Column(name = "handle", nullable = false)
        open var handle: String? = newHandle(),

        @Column(name = "created_at", nullable = false, updatable = false)
        @CreationTimestamp
        var createdAt: LocalDateTime? = LocalDateTime.now(),

        @Column(name = "updated_at")
        @UpdateTimestamp
        var updatedAt: LocalDateTime? = null,

        @Column(name = "deleted_at")
        var deletedAt: LocalDateTime? = null
) : Serializable