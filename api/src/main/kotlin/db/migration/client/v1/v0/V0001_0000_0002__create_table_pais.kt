package db.migration.client.v1.v0

import db.migration.base.postgresql.PostgreSQLMigration

@Suppress("ClassName", "unused")
class V0001_0000_0002__create_table_pais: PostgreSQLMigration() {
    override fun createSequences() {
        createSequence("sq_pais")
    }

    override fun createTables() {
        execute("""
            create table pais (
                id bigint not null default nextval('sq_pais'),
                handle varchar(36) not null,
                nome varchar(50) not null,
                nome_internacional varchar(50),
                codigo_bancocentral varchar(10),
                codigo_internacional varchar(10),
                abreviacao varchar(4),
                created_at timestamp with time zone not null default current_timestamp,
                updated_at timestamp with time zone,
                deleted_at timestamp with time zone,
                constraint pk_pais primary key (id),
                constraint uk_pais_handle unique (handle)
            )
        """.trimIndent())
    }

    override fun makeInserts() {
        execute("insert into pais (id, handle, nome, nome_internacional, codigo_bancocentral, codigo_internacional, abreviacao) values (nextval('sq_pais'), '97c518e3-b860-4605-8856-0236f6c6eb65', 'Brasil', 'Brazil', '1058', '076', 'BRA')")
    }
}