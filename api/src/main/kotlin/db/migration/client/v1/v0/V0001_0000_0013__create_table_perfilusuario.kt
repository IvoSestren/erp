package db.migration.client.v1.v0

import db.migration.base.postgresql.PostgreSQLMigration

@Suppress("ClassName", "unused")
class V0001_0000_0013__create_table_perfilusuario: PostgreSQLMigration() {
    override fun createSequences() {
        createSequence("sq_perfilusuario")
    }

    override fun createTables() {
        execute("""
            create table perfilusuario (
                id bigint not null default nextval('sq_perfilusuario'),
                handle varchar(36) not null,
                id_perfil bigint not null,
                id_usuario bigint not null,
                created_at timestamp with time zone not null default current_timestamp,
                updated_at timestamp with time zone,
                deleted_at timestamp with time zone,
                constraint pk_perfilusuario primary key (id),
                constraint uk_perfilusuario_handle unique (handle),
                constraint fk_perfilusuario_perfil foreign key (id_perfil) references perfil(id),
                constraint fk_perfilusuario_usuario foreign key (id_usuario) references usuario(id),
                constraint uk_perfilusuario unique (id_perfil, id_usuario)
            )
        """.trimIndent())
    }

    override fun makeInserts() {
        val idPerfil = getId("perfil", "ea861ffe-36d5-4c09-af78-0f8a578279c3")
        val idUsuario = getId("usuario", "315a687f-c8c2-42c7-9a61-294511b777a0")
        execute("insert into perfilusuario (id, handle, id_perfil, id_usuario) values (nextval('sq_perfilusuario'), 'f48f5731-de2d-454c-b0bf-86611a98db56', $idPerfil, $idUsuario)")
    }
}