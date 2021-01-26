package db.migration.client.v1.v0

import db.migration.base.postgresql.PostgreSQLMigration

@Suppress("ClassName", "unused")
class V0001_0000_0024__create_table_movprev: PostgreSQLMigration() {
    override fun createSequences() {
        createSequence("sq_movprev")
    }

    override fun createTables() {
        execute("""
            create table movprev (
                id bigint not null default nextval('sq_movprev'),
                handle varchar(36) not null,
                tipo varchar(100) not null, -- recorrente ou fixo (X parcelas)
                periodicidade varchar(100), -- unico, diario, semanal, 10dias, 15dias, 21dias, 28dias, mensal, bimestral, trimestral, quadrimestral, semestral, anual
                data_inicio timestamp with time zone, -- data de inicio das parcelas
                data_fim timestamp with time zone, -- data de fim das parcelas
                created_at timestamp with time zone not null default current_timestamp,
                updated_at timestamp with time zone,
                deleted_at timestamp with time zone,
                constraint pk_movprev primary key (id),
                constraint uk_movprev_handle unique (handle)
            )
        """.trimIndent())
    }
}