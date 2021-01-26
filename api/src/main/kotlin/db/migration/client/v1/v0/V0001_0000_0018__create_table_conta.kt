package db.migration.client.v1.v0

import db.migration.base.postgresql.PostgreSQLMigration

@Suppress("ClassName", "unused")
class V0001_0000_0018__create_table_conta: PostgreSQLMigration() {
    override fun createSequences() {
        createSequence("sq_conta")
    }

    override fun createTables() {
        execute("""
            create table conta (
                id bigint not null default nextval('sq_conta'),
                handle varchar(36) not null,
                id_tipoconta bigint not null,
                id_banco bigint,
                nome varchar(100) not null,
                created_at timestamp with time zone not null default current_timestamp,
                updated_at timestamp with time zone,
                deleted_at timestamp with time zone,
                constraint pk_conta primary key (id),
                constraint uk_conta_handle unique (handle),
                constraint fk_conta_tipoconta foreign key (id_tipoconta) references tipoconta(id),
                constraint fk_conta_banco foreign key (id_banco) references banco (id)
            )
        """.trimIndent())
    }

    override fun makeInserts() {
        val idTipoConta = getId("tipoconta", "79777e58-adb5-4b8d-bc01-d56ef9086f66")
        execute("insert into conta (id, handle, id_tipoconta, nome) values (nextval('sq_conta'), '7de6cd1e-08f7-42d8-a503-8eeb2368bc58', $idTipoConta, 'Carteira')")
    }
}