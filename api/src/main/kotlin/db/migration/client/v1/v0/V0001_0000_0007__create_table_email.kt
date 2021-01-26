package db.migration.client.v1.v0

import db.migration.base.postgresql.PostgreSQLMigration

@Suppress("ClassName", "unused")
class V0001_0000_0007__create_table_email : PostgreSQLMigration() {
    override fun createSequences() {
        createSequence("sq_email")
    }

    override fun createTables() {
        execute("""
            create table email (
                id bigint not null default nextval('sq_email'),
                handle varchar(36) not null,
                email varchar(100) not null,
                validado boolean not null default false,
                created_at timestamp with time zone not null default current_timestamp,
                updated_at timestamp with time zone,
                deleted_at timestamp with time zone,
                constraint pk_email primary key (id),
                constraint uk_email_handle unique (handle)
            )
        """.trimIndent())
    }

    override fun makeInserts() {
        execute("insert into email (id, handle, email, validado) values (nextval('sq_email'), '8df39e58-1706-4338-9a8d-d5ef3e62c514', 'admin@admin', true)")
    }
}