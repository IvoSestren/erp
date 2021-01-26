package br.com.strn.erp.api.security.tenant

import br.com.strn.erp.api.database.dao.seguranca.TenantRepository
import br.com.strn.erp.api.security.profile.Profile
import org.flywaydb.core.Flyway
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.sql.DataSource

@Suppress("unused")
@Configuration
class FlywayConfig(
        private val profile: Profile
) {

    private val logger = LoggerFactory.getLogger(javaClass)

    @Bean
    fun flyway(dataSource: DataSource): Flyway {
        logger.info("Migration schema public")
        val flyway = Flyway
                .configure()
                .locations("db/migration/master")
                .dataSource(dataSource)
                .schemas(DEFAULT_SCHEMA)
                .outOfOrder(true)
                .table("migrations")
                .load()
        flyway.migrate()
        return flyway
    }

    @Bean
    fun tenantsFlyway(repository: TenantRepository, dataSource: DataSource): Boolean {
        repository.findAll().forEach {
            val schema = it.schema

            logger.info("Migration schema $schema")

            if (!profile.isDev()) {
                Flyway.configure()
                        .locations("db/migration/client")
                        .dataSource(dataSource)
                        .schemas(schema)
                        .outOfOrder(true)
                        .table("migrations")
                        .load()
                        .migrate()
            } else {
                Flyway.configure()
                        .locations("db/migration/client", "db/migration/seed")
                        .dataSource(dataSource)
                        .schemas(schema)
                        .outOfOrder(true)
                        .table("migrations")
                        .load()
                        .migrate()
            }
        }
        return true
    }

    companion object {
        const val DEFAULT_SCHEMA = "public"
    }
}