package db.migration.client.v1.v0

import db.migration.base.postgresql.PostgreSQLMigration

@Suppress("ClassName", "unused")
class V0001_0000_0028__create_table_anexo: PostgreSQLMigration() {
    override fun createSequences() {
        createSequence("sq_anexo")
    }

    override fun createTables() {
        execute("""
            create table anexo (
                id bigint not null default nextval('sq_anexo'),
                handle varchar(36) not null,
                nomearquivo varchar(50),
                mimetype varchar(50),
                conteudo bytea,
                tamanho bigint,
                created_at timestamp with time zone not null default current_timestamp,
                updated_at timestamp with time zone,
                deleted_at timestamp with time zone,
                constraint pk_anexo primary key (id),
                constraint uk_anexo_handle unique (handle)
            )
        """.trimIndent())
    }
}