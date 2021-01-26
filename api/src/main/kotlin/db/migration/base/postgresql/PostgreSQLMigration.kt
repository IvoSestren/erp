package db.migration.base.postgresql

import db.migration.base.BaseMigration

open class PostgreSQLMigration : BaseMigration() {

    override fun createSequence(sequenceName: String) {
        this.execute("create sequence $sequenceName")
    }

    override fun getChecksum(): Int {
        return 1
    }
}