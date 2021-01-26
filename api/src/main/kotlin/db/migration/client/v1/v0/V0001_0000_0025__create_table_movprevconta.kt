package db.migration.client.v1.v0

import db.migration.base.postgresql.PostgreSQLMigration

@Suppress("ClassName", "unused")
class V0001_0000_0025__create_table_movprevconta: PostgreSQLMigration() {
    override fun createSequences() {
        createSequence("sq_movprevconta")
    }

    override fun createTables() {
        execute("""
            create table movprevconta (
                id bigint not null default nextval('sq_movprevconta'),
                handle varchar(36) not null,
                id_movprev bigint not null,
                data timestamp with time zone,
                descricao text,
                created_at timestamp with time zone not null default current_timestamp,
                updated_at timestamp with time zone,
                deleted_at timestamp with time zone,
                constraint pk_movprevconta primary key (id),
                constraint uk_movprevconta_handle unique (handle),
                constraint fk_movprevconta_movprev foreign key (id_movprev) references movprev(id)
            )
        """.trimIndent())
    }
}