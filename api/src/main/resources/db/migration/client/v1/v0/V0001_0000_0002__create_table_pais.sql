create sequence sq_pais start 1000000;

create table pais (
    id bigint not null default nextval('sq_pais'),
    nome varchar(50) not null,
    nome_internacional varchar(50),
    codigo_bancocentral varchar(10),
    codigo_internacional varchar(10),
    abreviacao varchar(4),
    created_at timestamp with time zone not null default current_timestamp,
    updated_at timestamp with time zone,
    deleted_at timestamp with time zone,
    constraint pk_pais primary key (id)
);

insert into pais (id, nome, nome_internacional, codigo_bancocentral, codigo_internacional, abreviacao) values (1058, 'Brasil', 'Brazil', '1058', '076', 'BRA');
