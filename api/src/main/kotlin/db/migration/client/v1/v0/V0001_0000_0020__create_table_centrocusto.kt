package db.migration.client.v1.v0

import db.migration.base.postgresql.PostgreSQLMigration

@Suppress("ClassName", "unused")
class V0001_0000_0020__create_table_centrocusto: PostgreSQLMigration() {
    override fun createSequences() {
        createSequence("sq_centrocusto")
    }

    override fun createTables() {
        execute("""
            create table centrocusto (
                id bigint not null default nextval('sq_centrocusto'),
                handle varchar(36) not null,
                codigo varchar(20),
                nome varchar(100) not null,
                id_centrocustopai bigint,
                created_at timestamp with time zone not null default current_timestamp,
                updated_at timestamp with time zone,
                deleted_at timestamp with time zone,
                constraint pk_centrocusto primary key (id),
                constraint uk_centrocusto_handle unique (handle),
                constraint fk_centrocusto_pai foreign key (id_centrocustopai) references centrocusto(id)
            )
        """.trimIndent())
    }
}