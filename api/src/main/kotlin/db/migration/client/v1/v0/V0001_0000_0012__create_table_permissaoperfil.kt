package db.migration.client.v1.v0

import db.migration.base.postgresql.PostgreSQLMigration

@Suppress("ClassName", "unused")
class V0001_0000_0012__create_table_permissaoperfil: PostgreSQLMigration() {
    override fun createSequences() {
        createSequence("sq_permissaoperfil")
    }

    override fun createTables() {
        execute("""
            create table permissaoperfil (
                id bigint not null default nextval('sq_permissaoperfil'),
                handle varchar(36) not null,
                id_permissao bigint not null,
                id_perfil bigint not null,
                created_at timestamp with time zone not null default current_timestamp,
                updated_at timestamp with time zone,
                deleted_at timestamp with time zone,
                constraint pk_permissaoperfil primary key (id),
                constraint uk_permissaoperfil_handle unique (handle),
                constraint fk_permissaoperfil_permissao foreign key (id_permissao) references permissao(id),
                constraint fk_permissaoperfil_perfil foreign key (id_perfil) references perfil(id),
                constraint uk_permissaoperfil unique (id_permissao, id_perfil)
            )
        """.trimIndent())
    }

    override fun makeInserts() {
        var idPermissao = getId("permissao", "d954c084-3e49-4c56-91af-cc53aa3d10a9")
        var idPerfil = getId("perfil", "ea861ffe-36d5-4c09-af78-0f8a578279c3")
        execute("insert into permissaoperfil (id, handle, id_permissao, id_perfil) values (nextval('sq_permissaoperfil'), '030bfb0d-aa1c-472e-9190-6f89d57f21d5', $idPermissao, $idPerfil)")

        idPermissao = getId("permissao", "3067a516-1f7a-4474-ad24-c40daf8dad23")
        idPerfil = getId("perfil", "b1991786-c2af-445e-a543-7c915cff1dea")
        execute("insert into permissaoperfil (id, handle, id_permissao, id_perfil) values (nextval('sq_permissaoperfil'), '5d6da017-755e-45c2-925a-0ca015420211', $idPermissao, $idPerfil)")
    }
}