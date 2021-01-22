create sequence sq_tipoendereco start 1000000;

create table tipoendereco (
    id bigint not null default nextval('sq_tipoendereco'),
    id_tenant bigint,
    nome varchar(100) not null,
    identificador varchar(100) not null,
    created_at timestamp with time zone not null default current_timestamp,
    updated_at timestamp with time zone,
    deleted_at timestamp with time zone,
    constraint pk_tipoendereco primary key (id),
    constraint uk_tipoendereco unique (identificador),
    constraint fk_tipoendereco_tenant foreign key (id_tenant) references tenant (id)
);

insert into tipoendereco (id, nome, identificador) values (1, 'Residencial', 'RESIDENCIAL');
insert into tipoendereco (id, nome, identificador) values (2, 'Comercial', 'COMERCIAL');
insert into tipoendereco (id, nome, identificador) values (3, 'Cobrança', 'COBRANCA');
insert into tipoendereco (id, nome, identificador) values (4, 'Correspondência', 'CORRESPONDENCIA');
