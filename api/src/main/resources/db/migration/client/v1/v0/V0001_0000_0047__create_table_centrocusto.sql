create sequence sq_centrocusto start 1000000;

create table centrocusto (
    id bigint not null default nextval('sq_centrocusto'),
    codigo varchar(20),
    nome varchar(100) not null,
    id_centrocustopai bigint,
    created_at timestamp with time zone not null default current_timestamp,
    updated_at timestamp with time zone,
    deleted_at timestamp with time zone,
    constraint pk_centrocusto primary key (id),
    constraint fk_centrocusto_pai foreign key (id_centrocustopai) references centrocusto(id)
);
