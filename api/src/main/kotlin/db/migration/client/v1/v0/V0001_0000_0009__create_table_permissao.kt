package db.migration.client.v1.v0

import db.migration.base.postgresql.PostgreSQLMigration

@Suppress("ClassName", "unused")
class V0001_0000_0009__create_table_permissao: PostgreSQLMigration() {
    override fun createSequences() {
        createSequence("sq_permissao")
    }

    override fun createTables() {
        execute("""
            create table permissao (
                id bigint not null default nextval('sq_permissao'),
                handle varchar(36) not null,
                nome varchar(50) not null,
                descricao text,
                identificador varchar(50) not null,
                created_at timestamp with time zone not null default current_timestamp,
                updated_at timestamp with time zone,
                deleted_at timestamp with time zone,
                constraint pk_permissao primary key (id),
                constraint uk_permissao_handle unique (handle)
            )
        """.trimIndent())
    }

    override fun makeInserts() {
        execute("insert into permissao (id, handle, nome, descricao, identificador) values (nextval('sq_permissao'), 'd954c084-3e49-4c56-91af-cc53aa3d10a9', 'Administrador', 'Permissao de administrador', 'ADMIN')")
        execute("insert into permissao (id, handle, nome, descricao, identificador) values (nextval('sq_permissao'), '3067a516-1f7a-4474-ad24-c40daf8dad23', 'Guest', 'Guest', 'GUEST')")
    }
}