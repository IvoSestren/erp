package br.com.strn.erp.api.database.dao

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.NoRepositoryBean

@NoRepositoryBean
interface BaseRepository<T, ID> : JpaRepository<T, ID> {
    @Modifying
    @Query("update #{#entityName} e set e.deletedAt = current_timestamp where e.id = ?1")
    fun softDelete(id: ID): T?
}