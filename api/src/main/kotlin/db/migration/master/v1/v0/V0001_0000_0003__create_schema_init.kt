package db.migration.master.v1.v0

import db.migration.base.postgresql.PostgreSQLMigration

@Suppress("ClassName", "unused")
class V0001_0000_0003__create_schema_init : PostgreSQLMigration() {
    override fun makeInserts() {
        execute("create schema if not exists clie5b2d36f75dad4954b60eb0d19d1c1dc6")
    }

    override fun getDescription(): String {
        return "Create schema"
    }
}