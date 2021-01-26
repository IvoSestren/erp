package db.migration.client.v1.v0

import db.migration.base.postgresql.PostgreSQLMigration

@Suppress("ClassName", "unused")
class V0001_0000_0010__create_table_perfil: PostgreSQLMigration() {
    override fun createSequences() {
        createSequence("sq_perfil")
    }

    override fun createTables() {
        execute("""
            create table perfil (
                id bigint not null default nextval('sq_perfil'),
                handle varchar(36) not null,
                nome varchar(50) not null,
                created_at timestamp with time zone not null default current_timestamp,
                updated_at timestamp with time zone,
                deleted_at timestamp with time zone,
                constraint pk_perfil primary key (id),
                constraint uk_perfil_handle unique (handle)
            )
        """.trimIndent())
    }

    override fun makeInserts() {
        execute("insert into perfil (id, handle, nome) values (nextval('sq_perfil'), 'ea861ffe-36d5-4c09-af78-0f8a578279c3', 'Admin')")
        execute("insert into perfil (id, handle, nome) values (nextval('sq_perfil'), 'b1991786-c2af-445e-a543-7c915cff1dea', 'Guest')")
    }
}