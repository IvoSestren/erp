create sequence sq_permissaoperfil start 1000000;

create table permissaoperfil (
    id bigint not null default nextval('sq_permissaoperfil'),
    id_tenant bigint,
    id_permissao bigint not null,
    id_perfil bigint not null,
    created_at timestamp with time zone not null default current_timestamp,
    updated_at timestamp with time zone,
    deleted_at timestamp with time zone,
    constraint pk_permissaoperfil primary key (id),
    constraint fk_permissaoperfil_permissao foreign key (id_permissao) references permissao(id),
    constraint fk_permissaoperfil_perfil foreign key (id_perfil) references perfil(id),
    constraint uk_permissaoperfil unique (id_permissao, id_perfil),
    constraint fk_permissaoperfil_tenant foreign key (id_tenant) references tenant (id)
);

insert into permissaoperfil (id, id_permissao, id_perfil) values (1, 1, 1);
insert into permissaoperfil (id, id_permissao, id_perfil) values (2, 2, 2);
