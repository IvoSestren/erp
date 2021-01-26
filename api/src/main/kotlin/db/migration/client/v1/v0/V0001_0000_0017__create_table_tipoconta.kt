package db.migration.client.v1.v0

import db.migration.base.postgresql.PostgreSQLMigration

@Suppress("ClassName", "unused")
class V0001_0000_0017__create_table_tipoconta:PostgreSQLMigration() {
    override fun createSequences() {
        createSequence("sq_tipoconta")
    }

    override fun createTables() {
        execute("""
            create table tipoconta (
                 id bigint not null default nextval('sq_tipoconta'),
                 handle varchar(36) not null,
                 nome varchar(100) not null,
                 created_at timestamp with time zone not null default current_timestamp,
                 updated_at timestamp with time zone,
                 deleted_at timestamp with time zone,
                 constraint pk_tipoconta primary key (id),
                 constraint uk_tipoconta_handle unique (handle),
                 constraint uk_tipoconta unique (nome)
            )
        """.trimIndent())
    }

    override fun makeInserts() {
        execute("insert into tipoconta (id, handle, nome) values (nextval('sq_tipoconta'), '79777e58-adb5-4b8d-bc01-d56ef9086f66', 'Dinheiro')")
    }
}