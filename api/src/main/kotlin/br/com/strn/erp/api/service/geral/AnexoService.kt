package br.com.strn.erp.api.service.geral

import br.com.strn.erp.api.database.dao.geral.AnexoRepository
import br.com.strn.erp.api.database.entities.geral.Anexo
import br.com.strn.erp.api.errors.RecordNotFoundException
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile

@Service
class AnexoService(
        private val repository: AnexoRepository
) {
    fun add(file: MultipartFile): Anexo {
        if (file.isEmpty)
            throw RuntimeException("Content file not found")

        val anexo = Anexo(
                nomeArquivo = file.originalFilename!!,
                mimeType = file.contentType ?: "application/octet-stream",
                tamanho = file.size,
                conteudo = file.bytes
        )
        return repository.save(anexo)
    }

    fun download(id: Long): Anexo {
        return findById(id)
    }

    fun download(handle: String): Anexo {
        return findByHandle(handle)
    }

    fun findAll(pageable: Pageable): Page<Anexo> {
        return repository.findAll(pageable)
    }

    fun findById(id: Long): Anexo {
        return repository.findById(id).orElseThrow { RecordNotFoundException(Anexo::class, id) }
    }

    fun findByHandle(handle: String): Anexo {
        return repository.findByHandle(handle) ?: throw RecordNotFoundException(Anexo::class, handle)
    }

    fun delete(id: Long): Anexo {
        return repository.softDelete(id) ?: throw RecordNotFoundException(Anexo::class, id)
    }

    fun delete(handle: String): Anexo {
        return repository.softDelete(handle) ?: throw RecordNotFoundException(Anexo::class, handle)
    }
}