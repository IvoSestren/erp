package br.com.strn.erp.api.security.tenant

import org.hibernate.engine.jdbc.connections.spi.MultiTenantConnectionProvider
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import java.sql.Connection
import javax.sql.DataSource

@Component
class TenantConnectionProvider(
        private val dataSource: DataSource
) : MultiTenantConnectionProvider {

    private val logger = LoggerFactory.getLogger(javaClass)

    override fun isUnwrappableAs(unwrapType: Class<*>?): Boolean {
        return false
    }

    override fun supportsAggressiveRelease(): Boolean {
        return false
    }

    override fun getAnyConnection(): Connection {
        return dataSource.connection
    }

    override fun releaseAnyConnection(connection: Connection?) {
        connection?.close()
    }

    override fun <T : Any?> unwrap(unwrapType: Class<T>?): T? {
        return null
    }

    override fun getConnection(tenantIdentifier: String?): Connection {
        logger.debug("Create connection to $tenantIdentifier")

        val connection = anyConnection
        connection.schema = tenantIdentifier
        return connection
    }

    override fun releaseConnection(tenantIdentifier: String?, connection: Connection?) {
        logger.debug("Release connection to $tenantIdentifier")
        connection?.schema = FlywayConfig.DEFAULT_SCHEMA
        releaseAnyConnection(connection)
    }
}