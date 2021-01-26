package db.migration.client.v1.v0

import db.migration.base.postgresql.PostgreSQLMigration

@Suppress("ClassName", "unused")
class V0001_0000_0021__create_table_pessoa:PostgreSQLMigration() {
    override fun createSequences() {
        createSequence("sq_pessoa")
    }

    override fun createTables() {
        execute("""
            create table pessoa (
                id bigint not null default nextval('sq_pessoa'),
                handle varchar(36) not null,
                nome varchar(100) not null,
                juridica boolean not null,
                cnpj varchar(20),
                created_at timestamp with time zone not null default current_timestamp,
                updated_at timestamp with time zone,
                deleted_at timestamp with time zone,
                constraint pk_pessoa primary key (id),
                constraint uk_pessoa_handle unique (handle)
            )
        """.trimIndent())
    }
}