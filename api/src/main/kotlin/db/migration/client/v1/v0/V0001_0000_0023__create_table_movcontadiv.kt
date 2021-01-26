package db.migration.client.v1.v0

import db.migration.base.postgresql.PostgreSQLMigration

@Suppress("ClassName", "unused")
class V0001_0000_0023__create_table_movcontadiv: PostgreSQLMigration() {
    override fun createSequences() {
        createSequence("sq_movcontadiv")
    }

    override fun createTables() {
        execute("""
            create table movcontadiv (
                id bigint not null default nextval('sq_movcontadiv'),
                handle varchar(36) not null,
                id_movconta bigint not null,
                id_conta bigint not null,
                id_planoconta bigint,
                id_centrocusto bigint,
                descricao varchar(2000),
                data_conciliado timestamp with time zone,
                valor numeric(18, 4) not null,
                created_at timestamp with time zone not null default current_timestamp,
                updated_at timestamp with time zone,
                deleted_at timestamp with time zone,
                constraint pk_movcontadiv primary key (id),
                constraint uk_movcontadiv_handle unique (handle),
                constraint fk_movcontadiv_movconta foreign key (id_movconta) references movconta(id),
                constraint fk_movcontadiv_conta foreign key (id_conta) references conta(id),
                constraint fk_movcontadiv_planoconta foreign key (id_planoconta) references planoconta(id),
                constraint fk_movcontadiv_centrocusto foreign key (id_centrocusto) references centrocusto(id)
            )
        """.trimIndent())
    }
}