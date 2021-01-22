create sequence sq_perfilusuario start 1000000;

create table perfilusuario (
    id bigint not null default nextval('sq_perfilusuario'),
    id_tenant bigint not null,
    id_perfil bigint not null,
    id_usuario bigint not null,
    created_at timestamp with time zone not null default current_timestamp,
    updated_at timestamp with time zone,
    deleted_at timestamp with time zone,
    constraint pk_perfilusuario primary key (id),
    constraint fk_perfilusuario_perfil foreign key (id_perfil) references perfil(id),
    constraint fk_perfilusuario_usuario foreign key (id_usuario) references usuario(id),
    constraint uk_perfilusuario unique (id_perfil, id_usuario),
    constraint fk_perfilusuario_tenant foreign key (id_tenant) references tenant(id)
);

insert into perfilusuario (id, id_tenant, id_perfil, id_usuario) values (1, 1, 1, 1);
