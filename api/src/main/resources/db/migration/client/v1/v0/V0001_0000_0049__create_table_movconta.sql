create sequence sq_movconta start 1000000;

create table movconta (
    id bigint not null default nextval('sq_movconta'),
    data timestamp with time zone,
    descricao text,
    created_at timestamp with time zone not null default current_timestamp,
    updated_at timestamp with time zone,
    deleted_at timestamp with time zone,
    constraint pk_movconta primary key (id)
);