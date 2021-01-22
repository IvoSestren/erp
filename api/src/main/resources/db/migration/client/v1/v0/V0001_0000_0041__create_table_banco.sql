create sequence sq_banco start 1000000;

create table banco (
    id bigint not null default nextval('sq_banco'),
    id_tenant bigint,
    nome varchar(50) not null,
    numero varchar(10),
    created_at timestamp with time zone not null default current_timestamp,
    updated_at timestamp with time zone,
    deleted_at timestamp with time zone,
    constraint pk_banco primary key (id),
    constraint fk_banco_tenant foreign key (id_tenant) references tenant(id)
);

insert into banco (id, numero, nome) values (  1, '001', 'Banco do Brasil');
insert into banco (id, numero, nome) values ( 33, '033', 'Santander do Brasil');
insert into banco (id, numero, nome) values (104, '104', 'Caixa Econômica Federal');
insert into banco (id, numero, nome) values (237, '237', 'Bradesco');
insert into banco (id, numero, nome) values (341, '341', 'Itau');
