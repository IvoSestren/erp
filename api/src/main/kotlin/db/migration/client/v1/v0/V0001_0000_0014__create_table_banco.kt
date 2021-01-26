package db.migration.client.v1.v0

import db.migration.base.postgresql.PostgreSQLMigration

@Suppress("ClassName", "unused")
class V0001_0000_0014__create_table_banco : PostgreSQLMigration() {
    override fun createSequences() {
        createSequence("sq_banco")
    }

    override fun createTables() {
        execute("""
            create table banco (
                id bigint not null default nextval('sq_banco'),
                handle varchar(36) not null,
                nome varchar(50) not null,
                numero varchar(10),
                created_at timestamp with time zone not null default current_timestamp,
                updated_at timestamp with time zone,
                deleted_at timestamp with time zone,
                constraint pk_banco primary key (id),
                constraint uk_banco_handle unique (handle)
            )
        """.trimIndent())
    }

    override fun makeInserts() {
        execute("insert into banco (id, handle, numero, nome) values (nextval('sq_banco'), '257b61d6-03c2-4614-8cd6-9a6d421e143b', '001', 'Banco do Brasil')")
        execute("insert into banco (id, handle, numero, nome) values (nextval('sq_banco'), '368220ac-96fe-4259-ac8d-ab1b94520fca', '033', 'Santander do Brasil')")
        execute("insert into banco (id, handle, numero, nome) values (nextval('sq_banco'), 'cddd6739-f00d-4ad6-ae98-e7dfc678fabf', '104', 'Caixa Econômica Federal')")
        execute("insert into banco (id, handle, numero, nome) values (nextval('sq_banco'), '436536ca-88a4-429b-bc6c-8efa4da10fde', '237', 'Bradesco')")
        execute("insert into banco (id, handle, numero, nome) values (nextval('sq_banco'), 'df367292-e54b-4837-8eff-cc822b0325a8', '341', 'Itau')")
    }
}