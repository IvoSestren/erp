package br.com.strn.erp.api.controller.geral

import br.com.strn.erp.api.database.entities.geral.Anexo
import br.com.strn.erp.api.service.geral.AnexoService
import br.com.strn.erp.api.util.Constants.Path.Param.HANDLE
import org.apache.commons.io.IOUtils
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile
import java.io.ByteArrayInputStream
import javax.servlet.http.HttpServletResponse

@Suppress("unused")
@RestController
@RequestMapping(value = ["/anexo"], produces = [MediaType.APPLICATION_JSON_VALUE])
class AnexoController(
        private val service: AnexoService,
        private val response: HttpServletResponse
) {
    @GetMapping("/")
    fun findAll(pageable: Pageable): ResponseEntity<Page<Anexo>> {
        return ResponseEntity.ok(service.findAll(pageable))
    }

    @GetMapping(HANDLE)
    fun findByHandle(@PathVariable("handle") handle: String): ResponseEntity<Anexo> {
        return ResponseEntity.ok(service.findByHandle(handle))
    }

    @PostMapping("/")
    fun add(@RequestParam("file") file: MultipartFile): ResponseEntity<Anexo> {
        return ResponseEntity.ok(service.add(file))
    }

    @DeleteMapping(HANDLE)
    fun delete(@PathVariable("handle") handle: String): ResponseEntity<Anexo> {
        return ResponseEntity.ok(service.delete(handle))
    }

    @GetMapping("$HANDLE/download")
    @ResponseBody
    fun download(@PathVariable("handle") handle: String) {
        val anexo = service.download(handle)
        val ist = ByteArrayInputStream(anexo.conteudo)

        response.setHeader(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename = \"" + anexo.nomeArquivo + "\"")
        response.setHeader(HttpHeaders.CONTENT_TYPE, anexo.mimeType)
        response.setHeader(HttpHeaders.CONTENT_ENCODING, "binary")
        IOUtils.copy(ist, response.outputStream)
    }
}