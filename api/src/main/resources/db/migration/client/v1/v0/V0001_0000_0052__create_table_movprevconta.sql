create sequence sq_movprevconta start 1000000;

create table movprevconta (
    id bigint not null default nextval('sq_movprevconta'),
    id_movprev bigint not null,
    data timestamp with time zone,
    descricao text,
    created_at timestamp with time zone not null default current_timestamp,
    updated_at timestamp with time zone,
    deleted_at timestamp with time zone,
    constraint pk_movprevconta primary key (id),
    constraint fk_movprevconta_movprev foreign key (id_movprev) references movprev(id)
);
