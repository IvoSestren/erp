create sequence sq_estado start 1000000;

create table estado (
    id bigint not null default nextval('sq_estado'),
    id_pais bigint not null,
    nome varchar(50) not null,
    abreviacao varchar(4),
    created_at timestamp with time zone not null default current_timestamp,
    updated_at timestamp with time zone,
    deleted_at timestamp with time zone,
    constraint pk_estado primary key (id),
    constraint fk_estado_pais foreign key (id_pais) references pais(id)
);

insert into estado (id, id_pais, nome, abreviacao) values (11, 1058, 'Rondônia', 'RO');
insert into estado (id, id_pais, nome, abreviacao) values (12, 1058, 'Acre', 'AC');
insert into estado (id, id_pais, nome, abreviacao) values (13, 1058, 'Amazonas', 'AM');
insert into estado (id, id_pais, nome, abreviacao) values (14, 1058, 'Roraima', 'RR');
insert into estado (id, id_pais, nome, abreviacao) values (15, 1058, 'Pará', 'PA');
insert into estado (id, id_pais, nome, abreviacao) values (16, 1058, 'Amapá', 'AP');
insert into estado (id, id_pais, nome, abreviacao) values (17, 1058, 'Tocantins', 'TO');
insert into estado (id, id_pais, nome, abreviacao) values (21, 1058, 'Maranhão', 'MA');
insert into estado (id, id_pais, nome, abreviacao) values (22, 1058, 'Piauí', 'PI');
insert into estado (id, id_pais, nome, abreviacao) values (23, 1058, 'Ceará', 'CE');
insert into estado (id, id_pais, nome, abreviacao) values (24, 1058, 'Rio Grande do Norte', 'RN');
insert into estado (id, id_pais, nome, abreviacao) values (25, 1058, 'Paraíba', 'PB');
insert into estado (id, id_pais, nome, abreviacao) values (26, 1058, 'Pernambuco', 'PE');
insert into estado (id, id_pais, nome, abreviacao) values (27, 1058, 'Alagoas', 'AL');
insert into estado (id, id_pais, nome, abreviacao) values (28, 1058, 'Sergipe', 'SE');
insert into estado (id, id_pais, nome, abreviacao) values (29, 1058, 'Bahia', 'BA');
insert into estado (id, id_pais, nome, abreviacao) values (31, 1058, 'Minas Gerais', 'MG');
insert into estado (id, id_pais, nome, abreviacao) values (32, 1058, 'Espírito Santo', 'ES');
insert into estado (id, id_pais, nome, abreviacao) values (33, 1058, 'Rio de Janeiro', 'RJ');
insert into estado (id, id_pais, nome, abreviacao) values (35, 1058, 'São Paulo', 'SP');
insert into estado (id, id_pais, nome, abreviacao) values (41, 1058, 'Paraná', 'PR');
insert into estado (id, id_pais, nome, abreviacao) values (42, 1058, 'Santa Catarina', 'SC');
insert into estado (id, id_pais, nome, abreviacao) values (43, 1058, 'Rio Grande do Sul', 'RS');
insert into estado (id, id_pais, nome, abreviacao) values (50, 1058, 'Mato Grosso do Sul', 'MS');
insert into estado (id, id_pais, nome, abreviacao) values (51, 1058, 'Mato Grosso', 'MT');
insert into estado (id, id_pais, nome, abreviacao) values (52, 1058, 'Goiás', 'GO');
insert into estado (id, id_pais, nome, abreviacao) values (53, 1058, 'Distrito Federal', 'DF');
