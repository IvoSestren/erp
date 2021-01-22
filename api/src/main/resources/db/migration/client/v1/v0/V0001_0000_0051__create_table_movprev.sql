create sequence sq_movprev start 1000000;

create table movprev (
    id bigint not null default nextval('sq_movprev'),
    tipo varchar(100) not null, -- recorrente ou fixo (X parcelas)
    periodicidade varchar(100), -- unico, diario, semanal, 10dias, 15dias, 21dias, 28dias, mensal, bimestral, trimestral, quadrimestral, semestral, anual
    data_inicio timestamp with time zone, -- data de inicio das parcelas
    data_fim timestamp with time zone, -- data de fim das parcelas
    created_at timestamp with time zone not null default current_timestamp,
    updated_at timestamp with time zone,
    deleted_at timestamp with time zone,
    constraint pk_movprev primary key (id)
);
