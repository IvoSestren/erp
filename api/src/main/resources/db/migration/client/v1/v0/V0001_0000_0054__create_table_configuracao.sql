create sequence sq_configuracao start 1000000;

create table configuracao (
    id bigint not null default nextval('sq_configuracao'),
    chave varchar(100) not null,
    valor text,
    created_at timestamp with time zone not null default current_timestamp,
    updated_at timestamp with time zone,
    deleted_at timestamp with time zone,
    constraint pk_configuracao primary key (id),
    constraint uk_configuracao unique (chave)
);
