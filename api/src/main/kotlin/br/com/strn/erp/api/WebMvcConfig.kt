package br.com.strn.erp.api

import br.com.strn.erp.api.converter.entities.financeiro.*
import br.com.strn.erp.api.converter.entities.geral.*
import br.com.strn.erp.api.converter.entities.identificacao.GsonEmail
import br.com.strn.erp.api.converter.entities.identificacao.GsonEndereco
import br.com.strn.erp.api.converter.entities.identificacao.GsonPessoa
import br.com.strn.erp.api.converter.entities.seguranca.*
import br.com.strn.erp.api.converter.types.GsonLocalDateTime
import br.com.strn.erp.api.converter.types.GsonPage
import br.com.strn.erp.api.converter.types.GsonPageable
import br.com.strn.erp.api.converter.types.GsonSort
import br.com.strn.erp.api.database.entities.financeiro.*
import br.com.strn.erp.api.database.entities.geral.*
import br.com.strn.erp.api.database.entities.identificacao.Email
import br.com.strn.erp.api.database.entities.identificacao.Endereco
import br.com.strn.erp.api.database.entities.identificacao.Pessoa
import br.com.strn.erp.api.database.entities.seguranca.*
import br.com.strn.erp.api.security.permission.PermissionInterceptor
import br.com.strn.erp.api.security.tenant.TenantInterceptor
import com.google.gson.GsonBuilder
import org.springframework.context.annotation.Configuration
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.http.converter.json.GsonHttpMessageConverter
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import java.time.LocalDateTime

@Configuration
@EnableWebMvc
class WebMvcConfig(
        private val permissionInterceptor: PermissionInterceptor,
        private val tenantInterceptor: TenantInterceptor
) : WebMvcConfigurer {

    override fun addInterceptors(registry: InterceptorRegistry) {
        super.addInterceptors(registry)

        // var i = Ordered.HIGHEST_PRECEDENCE

        registry.addInterceptor(tenantInterceptor) //.order(i++) // Alway need to be zero
        registry.addInterceptor(permissionInterceptor) //.order(i++)
    }

    override fun configureMessageConverters(converters: MutableList<HttpMessageConverter<*>>) {
        super.configureMessageConverters(converters)
        converters.add(createGsonHttpMessageConverter())
    }

    private fun createGsonHttpMessageConverter(): GsonHttpMessageConverter {
        val gson = GsonBuilder()
                // Types
                .registerTypeAdapter(LocalDateTime::class.java, GsonLocalDateTime())
                .registerTypeAdapter(Page::class.java, GsonPage())
//                .registerTypeAdapter(PageImpl::class.java, GsonPageImpl())
                .registerTypeAdapter(Pageable::class.java, GsonPageable())
                .registerTypeAdapter(Sort::class.java, GsonSort())

                // Entities
                .registerTypeAdapter(CentroCusto::class.java, GsonCentroCusto())
                .registerTypeAdapter(Conta::class.java, GsonConta())
                .registerTypeAdapter(MovConta::class.java, GsonMovConta())
                .registerTypeAdapter(MovContaDiv::class.java, GsonMovContaDiv())
                .registerTypeAdapter(MovPrev::class.java, GsonMovPrev())
                .registerTypeAdapter(MovPrevConta::class.java, GsonMovPrevConta())
                .registerTypeAdapter(MovPrevContaDiv::class.java, GsonMovPrevContaDiv())
                .registerTypeAdapter(PlanoConta::class.java, GsonPlanoConta())
                .registerTypeAdapter(TipoConta::class.java, GsonTipoConta())

                .registerTypeAdapter(Anexo::class.java, GsonAnexo())
                .registerTypeAdapter(Bairro::class.java, GsonBairro())
                .registerTypeAdapter(Configuracao::class.java, GsonConfiguracao())
                .registerTypeAdapter(Estado::class.java, GsonEstado())
                .registerTypeAdapter(Municipio::class.java, GsonMunicipio())
                .registerTypeAdapter(Pais::class.java, GsonPais())
                .registerTypeAdapter(TipoEndereco::class.java, GsonTipoEndereco())

                .registerTypeAdapter(Email::class.java, GsonEmail())
                .registerTypeAdapter(Endereco::class.java, GsonEndereco())
                .registerTypeAdapter(Pessoa::class.java, GsonPessoa())

                .registerTypeAdapter(Perfil::class.java, GsonPerfil())
                .registerTypeAdapter(PerfilUsuario::class.java, GsonPerfilUsuario())
                .registerTypeAdapter(Permissao::class.java, GsonPermissao())
                .registerTypeAdapter(PermissaoPerfil::class.java, GsonPermissaoPerfil())
                .registerTypeAdapter(Tenant::class.java, GsonTenant())
                .registerTypeAdapter(Usuario::class.java, GsonUsuario())
                .registerTypeAdapter(UsuarioLogin::class.java, GsonUsuarioLogin())

                .create()

        val gsonConverter = GsonHttpMessageConverter()
        gsonConverter.gson = gson

        return gsonConverter
    }
}