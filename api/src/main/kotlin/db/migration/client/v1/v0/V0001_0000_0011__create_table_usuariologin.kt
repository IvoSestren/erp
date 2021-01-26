package db.migration.client.v1.v0

import db.migration.base.postgresql.PostgreSQLMigration

@Suppress("ClassName", "unused")
class V0001_0000_0011__create_table_usuariologin: PostgreSQLMigration() {
    override fun createSequences() {
        createSequence("sq_usuariologin")
    }

    override fun createTables() {
        execute("""
            create table usuariologin (
                id bigint not null default nextval('sq_usuariologin'),
                handle varchar(36) not null,
                id_usuario bigint not null,
                id_email bigint not null,
                senha varchar(60),
                created_at timestamp with time zone not null default current_timestamp,
                updated_at timestamp with time zone,
                deleted_at timestamp with time zone,
                constraint pk_usuariologin primary key (id),
                constraint uk_usuariologin_handle unique (handle),
                constraint fk_usuariologin_usuario foreign key (id_usuario) references usuario(id),
                constraint fk_usuariologin_email foreign key (id_email) references email(id),
                constraint uk_usuariologin_email unique (id_email)
            )
        """.trimIndent())
    }

    override fun makeInserts() {
        val idUsuario = getId("usuario", "315a687f-c8c2-42c7-9a61-294511b777a0")
        val idEmail = getId("email", "8df39e58-1706-4338-9a8d-d5ef3e62c514")

        execute("insert into usuariologin (id, handle, id_usuario, id_email, senha) values (nextval('sq_usuariologin'), '1518f383-04fd-4974-9e98-444460fcb61b', $idUsuario, $idEmail, '\$2a\$10\$uw2GHApnYZzNEmoX/yI8OOdHSHcrJupTI7.Vq89vg7RKEvLaApOuG')")
    }
}