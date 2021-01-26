package db.migration.client.v1.v0

import db.migration.base.postgresql.PostgreSQLMigration

@Suppress("ClassName", "unused")
class V0001_0000_0008__create_table_usuario: PostgreSQLMigration() {
    override fun createSequences() {
        createSequence("sq_usuario")
    }

    override fun createTables() {
        execute("""
            create table usuario (
                id bigint not null default nextval('sq_usuario'),
                handle varchar(36) not null,
                nome varchar(50) not null,
                created_at timestamp with time zone not null default current_timestamp,
                updated_at timestamp with time zone,
                deleted_at timestamp with time zone,
                constraint pk_usuario primary key (id),
                constraint uk_usuario_handle unique (handle)
            )
        """.trimIndent())
    }

    override fun makeInserts() {
        execute("insert into usuario (id, handle, nome) values (nextval('sq_usuario'), '315a687f-c8c2-42c7-9a61-294511b777a0', 'Admin')")
    }
}