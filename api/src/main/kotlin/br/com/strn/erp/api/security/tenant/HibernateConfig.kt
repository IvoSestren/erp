package br.com.strn.erp.api.security.tenant

import br.com.strn.erp.api.ApiApplication
import org.hibernate.MultiTenancyStrategy
import org.hibernate.cfg.Environment
import org.hibernate.context.spi.CurrentTenantIdentifierResolver
import org.hibernate.engine.jdbc.connections.spi.MultiTenantConnectionProvider
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.orm.jpa.JpaVendorAdapter
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter
import javax.sql.DataSource

@Configuration
class HibernateConfig(
        private val jpaProperties: JpaProperties
) {

    @Bean
    fun jpaVendorAdapter(): JpaVendorAdapter {
        return HibernateJpaVendorAdapter()
    }

    @Bean
    fun entityManagerFactory(dataSource: DataSource, multiTenantConnectionProvider: MultiTenantConnectionProvider, tenantIdentifierResolver: CurrentTenantIdentifierResolver): LocalContainerEntityManagerFactoryBean {
        val em = LocalContainerEntityManagerFactoryBean()
        em.dataSource = dataSource
        //em.setPackagesToScan(ApiApplication::class.java::getPackage::name.toString())
        em.setPackagesToScan(ApiApplication::class.java.packageName)
        em.jpaVendorAdapter = jpaVendorAdapter()

        val jpaPropertiesMap = HashMap<String, Any>(jpaProperties.properties)
        jpaPropertiesMap.put(Environment.MULTI_TENANT, MultiTenancyStrategy.SCHEMA)
        jpaPropertiesMap.put(Environment.MULTI_TENANT_CONNECTION_PROVIDER, multiTenantConnectionProvider)
        jpaPropertiesMap.put(Environment.MULTI_TENANT_IDENTIFIER_RESOLVER, tenantIdentifierResolver)
        em.setJpaPropertyMap(jpaPropertiesMap)
        return em
    }
}