package db.migration.client.v1.v0

import db.migration.base.postgresql.PostgreSQLMigration

@Suppress("ClassName", "unused")
class V0001_0000_0022__create_table_movconta: PostgreSQLMigration() {
    override fun createSequences() {
        createSequence("sq_movconta")
    }

    override fun createTables() {
        execute("""
            create table movconta (
                id bigint not null default nextval('sq_movconta'),
                handle varchar(36) not null,
                data timestamp with time zone,
                descricao text,
                created_at timestamp with time zone not null default current_timestamp,
                updated_at timestamp with time zone,
                deleted_at timestamp with time zone,
                constraint pk_movconta primary key (id),
                constraint uk_movconta_handle unique (handle)
            )
        """.trimIndent())
    }
}