create sequence sq_movprevcontadiv start 1000000;

create table movprevcontadiv (
    id bigint not null default nextval('sq_movprevcontadiv'),
    id_movprevconta bigint not null,
    id_conta bigint not null,
    id_planoconta bigint,
    id_centrocusto bigint,
    descricao text,
    valor numeric(18, 4) not null,
    created_at timestamp with time zone not null default current_timestamp,
    updated_at timestamp with time zone,
    deleted_at timestamp with time zone,
    constraint pk_movprevcontadiv primary key (id),
    constraint fk_movprevcontadiv_movprevconta foreign key (id_movprevconta) references movprevconta(id),
    constraint fk_movprevcontadiv_conta foreign key (id_conta) references conta(id),
    constraint fk_movprevcontadiv_planoconta foreign key (id_planoconta) references planoconta(id),
    constraint fk_movprevcontadiv_centrocusto foreign key (id_centrocusto) references centrocusto(id)
);
