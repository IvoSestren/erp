create sequence sq_permissao start 1000000;

create table permissao (
    id bigint not null default nextval('sq_permissao'),
    id_tenant bigint,
    nome varchar(50) not null,
    descricao text,
    identificador varchar(50) not null,
    created_at timestamp with time zone not null default current_timestamp,
    updated_at timestamp with time zone,
    deleted_at timestamp with time zone,
    constraint pk_permissao primary key (id),
    constraint fk_permissao_tenant foreign key (id_tenant) references tenant (id)
);

insert into permissao (id, nome, descricao, identificador) values (1, 'Administrador', 'Permissao de administrador', 'ADMIN');
insert into permissao (id, nome, descricao, identificador) values (2, 'Guest', 'Guest', 'GUEST');
