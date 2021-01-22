create sequence sq_perfil start 1000000;

create table perfil (
    id bigint not null default nextval('sq_perfil'),
    id_tenant bigint,
    nome varchar(50) not null,
    created_at timestamp with time zone not null default current_timestamp,
    updated_at timestamp with time zone,
    deleted_at timestamp with time zone,
    constraint pk_perfil primary key (id),
    constraint fk_perfil_tenant foreign key (id_tenant) references tenant (id)
);

insert into perfil (id, nome) values (1, 'Admin');
insert into perfil (id, nome) values (2, 'Guest');
