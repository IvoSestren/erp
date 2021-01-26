package db.migration.client.v1.v0

import db.migration.base.postgresql.PostgreSQLMigration

@Suppress("ClassName", "unused")
class V0001_0000_0027__create_table_configuracao: PostgreSQLMigration() {
    override fun createSequences() {
        createSequence("sq_configuracao")
    }

    override fun createTables() {
        execute("""
            create table configuracao (
                id bigint not null default nextval('sq_configuracao'),
                handle varchar(36) not null,
                chave varchar(100) not null,
                valor text,
                created_at timestamp with time zone not null default current_timestamp,
                updated_at timestamp with time zone,
                deleted_at timestamp with time zone,
                constraint pk_configuracao primary key (id),
                constraint uk_configuracao_handle unique (handle),
                constraint uk_configuracao unique (chave)
            )
        """.trimIndent())
    }
}