package db.migration.client.v1.v0

import db.migration.base.postgresql.PostgreSQLMigration

@Suppress("ClassName", "unused")
class V0001_0000_0006__create_table_bairro : PostgreSQLMigration() {

    override fun createSequences() {
        createSequence("sq_bairro")
    }

    override fun createTables() {
        execute("""
            create table bairro (
                id bigint not null default nextval('sq_bairro'),
                handle varchar(36) not null,
                id_municipio bigint not null,
                nome varchar(50) not null,
                created_at timestamp with time zone not null default current_timestamp,
                updated_at timestamp with time zone,
                deleted_at timestamp with time zone,
                constraint pk_bairro primary key (id),
                constraint uk_bairro_handle unique (handle),
                constraint fk_bairro_municipio foreign key (id_municipio) references municipio (id)
            )
        """.trimIndent())
    }

    override fun makeInserts() {
        val idMunicipio = getId("municipio", "2941d54a-1ad4-4b21-8cdb-4f7b506885d5")
        execute("insert into bairro (id, handle, id_municipio, nome) values (nextval('sq_bairro'), 'ff849a10-8dfa-4760-af16-76e404cac399', $idMunicipio, 'Centro')")
        execute("insert into bairro (id, handle, id_municipio, nome) values (nextval('sq_bairro'), '37a24c5e-6704-479e-b281-4d106fe2c301', $idMunicipio, 'Praia Comprida')")
    }
}