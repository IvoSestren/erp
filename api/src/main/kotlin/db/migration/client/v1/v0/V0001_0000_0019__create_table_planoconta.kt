package db.migration.client.v1.v0

import db.migration.base.postgresql.PostgreSQLMigration

@Suppress("ClassName", "unused")
class V0001_0000_0019__create_table_planoconta: PostgreSQLMigration() {
    override fun createSequences() {
        createSequence("sq_planoconta")
    }

    override fun createTables() {
        execute("""
            create table planoconta (
                id bigint not null default nextval('sq_planoconta'),
                handle varchar(36) not null,
                credito boolean not null,
                nome varchar(100) not null,
                id_planocontapai bigint,
                created_at timestamp with time zone not null default current_timestamp,
                updated_at timestamp with time zone,
                deleted_at timestamp with time zone,
                constraint pk_planoconta primary key (id),
                constraint uk_planoconta_handle unique (handle),
                constraint fk_planoconta_pai foreign key (id_planocontapai) references planoconta(id)
            )
        """.trimIndent())
    }
}