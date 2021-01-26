package db.migration.client.v1.v0

import db.migration.base.postgresql.PostgreSQLMigration

@Suppress("ClassName", "unused")
class V0001_0000_0016__create_table_tipoendereco: PostgreSQLMigration() {
    override fun createSequences() {
        createSequence("sq_tipoendereco")
    }

    override fun createTables() {
        execute("""
            create table tipoendereco (
                id bigint not null default nextval('sq_tipoendereco'),
                handle varchar(36) not null,
                nome varchar(100) not null,
                identificador varchar(100) not null,
                created_at timestamp with time zone not null default current_timestamp,
                updated_at timestamp with time zone,
                deleted_at timestamp with time zone,
                constraint pk_tipoendereco primary key (id),
                constraint uk_tipoendereco_handle unique (handle),
                constraint uk_tipoendereco unique (identificador)
            )
        """.trimIndent())
    }

    override fun makeInserts() {
        execute("insert into tipoendereco (id, handle, nome, identificador) values (nextval('sq_tipoendereco'), 'bd45be1d-c2dc-47b5-8a6b-8276fed63c7c', 'Residencial', 'RESIDENCIAL')")
        execute("insert into tipoendereco (id, handle, nome, identificador) values (nextval('sq_tipoendereco'), 'ed44738c-e682-4fd7-8fb6-1708414daac2', 'Comercial', 'COMERCIAL')")
        execute("insert into tipoendereco (id, handle, nome, identificador) values (nextval('sq_tipoendereco'), '26f47390-12e0-4212-bfbf-ff376dd9f8ca', 'Cobrança', 'COBRANCA')")
        execute("insert into tipoendereco (id, handle, nome, identificador) values (nextval('sq_tipoendereco'), 'f7d85f24-ab40-40ec-9ac3-59baaea6148a', 'Correspondência', 'CORRESPONDENCIA')")
    }
}