create sequence sq_email start 1000000;

create table email (
    id bigint not null default nextval('sq_email'),
    email varchar(100) not null,
    validado boolean not null default false,
    created_at timestamp with time zone not null default current_timestamp,
    updated_at timestamp with time zone,
    deleted_at timestamp with time zone,
    constraint pk_email primary key (id)
);

insert into email (id, email, validado) values (1, 'admin@admin', true);
