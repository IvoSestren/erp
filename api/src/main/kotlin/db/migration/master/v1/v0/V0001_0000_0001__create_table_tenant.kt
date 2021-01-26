package db.migration.master.v1.v0

import db.migration.base.postgresql.PostgreSQLMigration

@Suppress("ClassName", "unused")
class V0001_0000_0001__create_table_tenant : PostgreSQLMigration() {
    override fun createSequences() {
        createSequence("sq_tenant")
    }

    override fun createTables() {
        execute("""
            create table tenant (
                id bigint not null default nextval('sq_tenant'),
                handle varchar(36) not null,
                tenant_name varchar(36) not null,
                host varchar(250),
                port integer,
                database_name varchar(250),
                schema_name varchar(36) not null,
                created_at timestamp with time zone not null default current_timestamp,
                updated_at timestamp with time zone,
                deleted_at timestamp with time zone,
                constraint pk_tenant primary key (id),
                constraint uk_handle unique (handle),
                constraint uk_tenant unique (tenant_name)
            )
        """.trimIndent())
    }

    override fun makeInserts() {
        execute("insert into tenant (id, handle, tenant_name, schema_name) values (nextval('sq_tenant'), '5b2d36f7-5dad-4954-b60e-b0d19d1c1dc6', '5b2d36f7-5dad-4954-b60e-b0d19d1c1dc6', 'clie5b2d36f75dad4954b60eb0d19d1c1dc6')")
    }

    override fun getDescription(): String {
        return "Create table tenant"
    }
}