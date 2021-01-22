package br.com.strn.erp.api.database.dao.geral

import br.com.strn.erp.api.database.dao.BaseRepository
import br.com.strn.erp.api.database.entities.geral.Municipio
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.EntityGraph

interface MunicipioRepository : BaseRepository<Municipio, Long> {
    @EntityGraph("municipio.estado")
    override fun findAll(pageable: Pageable): Page<Municipio>
}