create sequence sq_endereco start 1000000;

create table endereco (
    id bigint not null default nextval('sq_endereco'),
    id_tenant bigint not null,
    id_pais bigint,
    id_estado bigint,
    id_municipio bigint,
    id_bairro bigint,
    logradouro varchar(100),
    numero varchar(100),
    complemento varchar(100),
    created_at timestamp with time zone not null default current_timestamp,
    updated_at timestamp with time zone,
    deleted_at timestamp with time zone,
    constraint pk_endereco primary key (id),
    constraint fk_endereco_tenant foreign key (id_tenant) references tenant (id),
    constraint fk_endereco_pais foreign key (id_pais) references pais (id),
    constraint fk_endereco_estado foreign key (id_estado) references estado(id),
    constraint fk_endereco_municipio foreign key (id_municipio) references municipio (id),
    constraint fk_endereco_bairro foreign key (id_bairro) references bairro (id)
);
