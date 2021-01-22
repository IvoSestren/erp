create sequence sq_usuario start 1000000;

create table usuario (
    id bigint not null default nextval('sq_usuario'),
    id_tenant bigint not null,
    nome varchar(50) not null,
    created_at timestamp with time zone not null default current_timestamp,
    updated_at timestamp with time zone,
    deleted_at timestamp with time zone,
    constraint pk_usuario primary key (id),
    constraint fk_usuario_tenant foreign key (id_tenant) references tenant (id)
);

insert into usuario (id, id_tenant, nome) values (1, 1, 'Admin');
