package db.migration.base

import org.flywaydb.core.api.migration.BaseJavaMigration
import org.flywaydb.core.api.migration.Context
import java.sql.Connection

abstract class BaseMigration : BaseJavaMigration() {

    lateinit var conn: Connection

    override fun migrate(context: Context?) {
        this.conn = context!!.connection

        this.run()
    }

    open fun createSequences() {}

    open fun createTables() {}

    open fun makeInserts() {}

    fun getId(table: String, handle: String): Long? {
        val stmt = conn.prepareStatement("select id from $table where handle = ?")
        stmt.use {
            stmt.setString(1, handle)

            val rs = stmt.executeQuery()
            rs.use {
                if (rs.next()) {
                    return rs.getLong("id")
                }
            }
        }
        return null
    }

    protected open fun createSequence(sequenceName: String) {
        this.execute("create sequence $sequenceName")
    }

    protected fun execute(sql: String) {
        conn.createStatement().use {
            it.execute(sql)
        }
    }

    private fun run() {
        this.createSequences()
        this.createTables()
        this.makeInserts()
    }
}