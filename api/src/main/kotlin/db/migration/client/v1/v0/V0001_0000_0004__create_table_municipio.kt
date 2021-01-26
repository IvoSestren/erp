package db.migration.client.v1.v0

import db.migration.base.postgresql.PostgreSQLMigration

@Suppress("ClassName", "unused")
class V0001_0000_0004__create_table_municipio: PostgreSQLMigration() {
    override fun createSequences() {
        createSequence("sq_municipio")
    }

    override fun createTables() {
        execute("""
            create table municipio (
                id bigint not null default nextval('sq_municipio'),
                handle varchar(36) not null,
                id_estado bigint not null,
                nome varchar(50) not null,
                ibge varchar(10),
                created_at timestamp with time zone not null default current_timestamp,
                updated_at timestamp with time zone,
                deleted_at timestamp with time zone,
                constraint pk_municipio primary key (id),
                constraint uk_municipio_handle unique (handle),
                constraint fk_municipio_estado foreign key (id_estado) references estado (id)
            )
        """.trimIndent())
    }
}