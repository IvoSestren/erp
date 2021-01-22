create sequence sq_bairro start 1000000;

create table bairro (
    id bigint not null default nextval('sq_bairro'),
    id_municipio bigint not null,
    nome varchar(50) not null,
    created_at timestamp with time zone not null default current_timestamp,
    updated_at timestamp with time zone,
    deleted_at timestamp with time zone,
    constraint pk_bairro primary key (id),
    constraint fk_bairro_municipio foreign key (id_municipio) references municipio (id)
);

insert into bairro (id, id_municipio, nome) values (1, 4216602, 'Centro');
insert into bairro (id, id_municipio, nome) values (2, 4216602, 'Praia Comprida');
