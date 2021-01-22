create sequence sq_pessoa start 1000000;

create table pessoa (
    id bigint not null default nextval('sq_pessoa'),
    nome varchar(100) not null,
    juridica boolean not null,
    cnpj varchar(20),
    created_at timestamp with time zone not null default current_timestamp,
    updated_at timestamp with time zone,
    deleted_at timestamp with time zone,
    constraint pk_pessoa primary key (id)
);
