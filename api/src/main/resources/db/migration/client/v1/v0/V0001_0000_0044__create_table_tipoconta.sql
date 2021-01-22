create sequence sq_tipoconta start 1000000;

create table tipoconta (
     id bigint not null default nextval('sq_tipoconta'),
     id_tenant bigint,
     nome varchar(100) not null,
     created_at timestamp with time zone not null default current_timestamp,
     updated_at timestamp with time zone,
     deleted_at timestamp with time zone,
     constraint pk_tipoconta primary key (id),
     constraint uk_tipoconta unique (nome),
     constraint fk_tipoconta_tenant foreign key (id_tenant) references tenant (id)
);

insert into tipoconta (id, nome) values (1, 'Dinheiro');
