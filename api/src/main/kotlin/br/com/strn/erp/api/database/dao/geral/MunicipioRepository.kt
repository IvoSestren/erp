package br.com.strn.erp.api.database.dao.geral

import br.com.strn.erp.api.database.dao.BaseRepository
import br.com.strn.erp.api.database.entities.geral.Municipio
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.EntityGraph
import org.springframework.data.jpa.repository.Query

interface MunicipioRepository : BaseRepository<Municipio> {
    @EntityGraph("municipio.estado")
    override fun findAll(pageable: Pageable): Page<Municipio>

    @EntityGraph("municipio.estado")
    @Query("select e from #{#entityName} e where e.estado.id = ?1")
    fun findByEstado(id: Long, pageable: Pageable): Page<Municipio>

    @EntityGraph("municipio.estado")
    @Query("select e from #{#entityName} e where e.estado.handle = ?1")
    fun findByEstado(handle: String, pageable: Pageable) : Page<Municipio>
}