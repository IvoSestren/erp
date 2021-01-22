create sequence sq_conta start 1000000;

create table conta (
    id bigint not null default nextval('sq_conta'),
    id_tenant bigint not null,
    id_tipoconta bigint not null,
    id_banco bigint,
    nome varchar(100) not null,
    created_at timestamp with time zone not null default current_timestamp,
    updated_at timestamp with time zone,
    deleted_at timestamp with time zone,
    constraint pk_conta primary key (id),
    constraint fk_conta_tipoconta foreign key (id_tipoconta) references tipoconta(id),
    constraint fk_conta_tenant foreign key (id_tenant) references tenant (id),
    constraint fk_conta_banco foreign key (id_banco) references banco (id)
);

insert into conta (id, id_tenant, id_tipoconta, nome) values (1, 1, 1, 'Carteira');
