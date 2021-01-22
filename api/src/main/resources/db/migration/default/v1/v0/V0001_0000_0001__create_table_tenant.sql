create sequence sq_tenant start 1000000;

create table tenant (
    id bigint not null default nextval('sq_tenant'),
    tenant_name varchar(36) not null,
    schema_name varchar(36) not null,
    created_at timestamp with time zone not null default current_timestamp,
    updated_at timestamp with time zone,
    deleted_at timestamp with time zone,
    constraint pk_tenant primary key (id),
    constraint uk_tenant unique (tenant_name)
);

insert into tenant (id, tenant_name, schema_name) values (1, '5b2d36f7-5dad-4954-b60e-b0d19d1c1dc6', 'clie5b2d36f75dad4954b60eb0d19d1c1dc6');
