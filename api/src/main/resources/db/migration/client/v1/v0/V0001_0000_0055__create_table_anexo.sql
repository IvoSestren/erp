create sequence sq_anexo start 1000000;

create table anexo (
    id bigint not null default nextval('sq_anexo'),
    nomearquivo varchar(50),
    mimetype varchar(50),
    conteudo bytea,
    constraint pk_anexo primary key (id)
);