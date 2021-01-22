create sequence sq_municipio start 10000000;

create table municipio (
    id bigint not null default nextval('sq_municipio'),
    id_estado bigint not null,
    nome varchar(50) not null,
    ibge varchar(10),
    created_at timestamp with time zone not null default current_timestamp,
    updated_at timestamp with time zone,
    deleted_at timestamp with time zone,
    constraint pk_municipio primary key (id),
    constraint fk_municipio_estado foreign key (id_estado) references estado (id)
);