package db.migration.base.postgresql

import java.sql.PreparedStatement

abstract class MunicipioPostgreSQLMigration : PostgreSQLMigration() {

    protected var idEstado: Long = 0
    private lateinit var stmt: PreparedStatement

    abstract fun inserts()

    override fun makeInserts() {
        this.stmt = conn.prepareStatement("insert into municipio (id, handle, ibge, id_estado, nome) values (nextval('sq_municipio'), ?, ?, ?, ?)")

        inserts()

        this.stmt.close()
    }

    protected fun getIdFromEstado(handle: String): Long? {
        return this.getId("estado", handle)
    }

    protected open fun insert(handle: String, ibge: String, nome: String) {
        var i = 0

        stmt.setString(++i, handle)
        stmt.setString(++i, ibge)
        stmt.setLong(++i, idEstado)
        stmt.setString(++i, nome)

        stmt.execute()
    }
}