create sequence sq_usuariologin start 1000000;

create table usuariologin (
    id bigint not null default nextval('sq_usuariologin'),
    id_tenant bigint not null,
    id_usuario bigint not null,
    id_email bigint not null,
    senha varchar(60),
    created_at timestamp with time zone not null default current_timestamp,
    updated_at timestamp with time zone,
    deleted_at timestamp with time zone,
    constraint pk_usuariologin primary key (id),
    constraint fk_usuariologin_usuario foreign key (id_usuario) references usuario(id),
    constraint fk_usuariologin_email foreign key (id_email) references email(id),
    constraint uk_usuariologin_email unique (id_tenant, id_email),
    constraint fk_usuariologin_tenant foreign key (id_tenant) references tenant (id)
);

insert into usuariologin (id, id_tenant, id_usuario, id_email, senha) values (1, 1, 1, 1, '$2a$10$uw2GHApnYZzNEmoX/yI8OOdHSHcrJupTI7.Vq89vg7RKEvLaApOuG');
