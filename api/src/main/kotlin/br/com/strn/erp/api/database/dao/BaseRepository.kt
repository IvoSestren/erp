package br.com.strn.erp.api.database.dao

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.NoRepositoryBean

@NoRepositoryBean
interface BaseRepository<T> : JpaRepository<T, Long> {
    @Modifying
    @Query("update #{#entityName} e set e.deletedAt = current_timestamp where e.id = ?1")
    fun softDelete(id: Long): T?

    @Modifying
    @Query("update #{#entityName} e set e.deletedAt = current_timestamp where e.handle = ?1")
    fun softDelete(handle: String): T?

    @Query("select e from #{#entityName} e where e.handle = ?1")
    fun findByHandle(handle: String): T?
}