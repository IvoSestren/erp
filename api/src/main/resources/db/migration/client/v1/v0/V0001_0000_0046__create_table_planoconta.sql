create sequence sq_planoconta start 1000000;

create table planoconta (
    id bigint not null default nextval('sq_planoconta'),
    credito boolean not null,
    nome varchar(100) not null,
    id_planocontapai bigint,
    created_at timestamp with time zone not null default current_timestamp,
    updated_at timestamp with time zone,
    deleted_at timestamp with time zone,
    constraint pk_planoconta primary key (id),
    constraint fk_planoconta_pai foreign key (id_planocontapai) references planoconta(id)
);
