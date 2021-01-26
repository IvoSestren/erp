package db.migration.client.v1.v0

import db.migration.base.postgresql.PostgreSQLMigration

@Suppress("ClassName", "unused")
class V0001_0000_0003__create_table_estado: PostgreSQLMigration() {

    override fun createSequences() {
        createSequence("sq_estado")
    }

    override fun createTables() {
        execute("""
            create table estado (
                id bigint not null default nextval('sq_estado'),
                handle varchar(36) not null,
                id_pais bigint not null,
                nome varchar(50) not null,
                abreviacao varchar(4),
                created_at timestamp with time zone not null default current_timestamp,
                updated_at timestamp with time zone,
                deleted_at timestamp with time zone,
                constraint pk_estado primary key (id),
                constraint uk_estado_handle unique (handle),
                constraint fk_estado_pais foreign key (id_pais) references pais(id)
            )
        """.trimIndent())
    }

    override fun makeInserts() {
        val idPais = getId("pais", "97c518e3-b860-4605-8856-0236f6c6eb65")
        execute("insert into estado (id, handle, id_pais, nome, abreviacao) values (nextval('sq_estado'), '277b64cc-d03e-4722-a463-5f86bd40c0d2', $idPais, 'Rondônia', 'RO')")
        execute("insert into estado (id, handle, id_pais, nome, abreviacao) values (nextval('sq_estado'), 'a2c1b4bc-8d1f-4390-8bfe-a4e8bcc1a6e9', $idPais, 'Acre', 'AC')")
        execute("insert into estado (id, handle, id_pais, nome, abreviacao) values (nextval('sq_estado'), '3de185f3-71b3-4f04-964a-c78d41adf8ef', $idPais, 'Amazonas', 'AM')")
        execute("insert into estado (id, handle, id_pais, nome, abreviacao) values (nextval('sq_estado'), '65e2688c-1eda-4ffc-9f7c-b61273dac95e', $idPais, 'Roraima', 'RR')")
        execute("insert into estado (id, handle, id_pais, nome, abreviacao) values (nextval('sq_estado'), 'd0efddd6-9c2d-4e0a-80a3-7c2b5b802d2f', $idPais, 'Pará', 'PA')")
        execute("insert into estado (id, handle, id_pais, nome, abreviacao) values (nextval('sq_estado'), '65f539dd-c3f4-4e9b-ad5e-3009c6a70ab1', $idPais, 'Amapá', 'AP')")
        execute("insert into estado (id, handle, id_pais, nome, abreviacao) values (nextval('sq_estado'), '70140659-6c34-4e17-890a-b4dad6ba26d8', $idPais, 'Tocantins', 'TO')")
        execute("insert into estado (id, handle, id_pais, nome, abreviacao) values (nextval('sq_estado'), '1c15b6f5-c233-4675-a60c-1d5e7b843a34', $idPais, 'Maranhão', 'MA')")
        execute("insert into estado (id, handle, id_pais, nome, abreviacao) values (nextval('sq_estado'), '119b6d22-1b38-4900-a3a2-50a5c5498fcb', $idPais, 'Piauí', 'PI')")
        execute("insert into estado (id, handle, id_pais, nome, abreviacao) values (nextval('sq_estado'), '911e1c52-2253-4300-9555-f2f68cc0c889', $idPais, 'Ceará', 'CE')")
        execute("insert into estado (id, handle, id_pais, nome, abreviacao) values (nextval('sq_estado'), '4fc0d90e-1226-41fe-943c-73a8024801e5', $idPais, 'Rio Grande do Norte', 'RN')")
        execute("insert into estado (id, handle, id_pais, nome, abreviacao) values (nextval('sq_estado'), 'e48ba792-e224-4a6a-b5fb-4c28541f4a8f', $idPais, 'Paraíba', 'PB')")
        execute("insert into estado (id, handle, id_pais, nome, abreviacao) values (nextval('sq_estado'), '1dea2c1c-61b0-4e18-bd41-f0084e818fd2', $idPais, 'Pernambuco', 'PE')")
        execute("insert into estado (id, handle, id_pais, nome, abreviacao) values (nextval('sq_estado'), 'e69651fa-2b73-4156-9355-32e72fe68de0', $idPais, 'Alagoas', 'AL')")
        execute("insert into estado (id, handle, id_pais, nome, abreviacao) values (nextval('sq_estado'), '2ff1c933-2cea-46c6-a998-648a75a849a2', $idPais, 'Sergipe', 'SE')")
        execute("insert into estado (id, handle, id_pais, nome, abreviacao) values (nextval('sq_estado'), '1cc0cd44-6a16-46fa-a54c-972e405d17a1', $idPais, 'Bahia', 'BA')")
        execute("insert into estado (id, handle, id_pais, nome, abreviacao) values (nextval('sq_estado'), 'b8fc03e0-c2bc-4ea6-87f7-b490a35b31df', $idPais, 'Minas Gerais', 'MG')")
        execute("insert into estado (id, handle, id_pais, nome, abreviacao) values (nextval('sq_estado'), 'f6c7a037-f827-45bf-a335-c78c1b802941', $idPais, 'Espírito Santo', 'ES')")
        execute("insert into estado (id, handle, id_pais, nome, abreviacao) values (nextval('sq_estado'), '9db240c1-d763-41fc-824f-fb4f04db0646', $idPais, 'Rio de Janeiro', 'RJ')")
        execute("insert into estado (id, handle, id_pais, nome, abreviacao) values (nextval('sq_estado'), '4b7c7962-3fe8-4d98-ab19-7ad358c2ab8d', $idPais, 'São Paulo', 'SP')")
        execute("insert into estado (id, handle, id_pais, nome, abreviacao) values (nextval('sq_estado'), '14b0c29e-7772-46b5-ab22-d5922a4e0e8f', $idPais, 'Paraná', 'PR')")
        execute("insert into estado (id, handle, id_pais, nome, abreviacao) values (nextval('sq_estado'), '8c49753f-de55-49d9-adde-9b6ad587ceb0', $idPais, 'Santa Catarina', 'SC')")
        execute("insert into estado (id, handle, id_pais, nome, abreviacao) values (nextval('sq_estado'), '6210e5e9-fa83-41eb-a942-7cf17535fe8f', $idPais, 'Rio Grande do Sul', 'RS')")
        execute("insert into estado (id, handle, id_pais, nome, abreviacao) values (nextval('sq_estado'), '333cdef7-bb03-4ff9-a195-ffddbd6a94c0', $idPais, 'Mato Grosso do Sul', 'MS')")
        execute("insert into estado (id, handle, id_pais, nome, abreviacao) values (nextval('sq_estado'), 'c49f66a6-5443-48da-af2f-de0562953fa4', $idPais, 'Mato Grosso', 'MT')")
        execute("insert into estado (id, handle, id_pais, nome, abreviacao) values (nextval('sq_estado'), '7396f76f-fbd9-4e8f-a3ff-1f831803e71a', $idPais, 'Goiás', 'GO')")
        execute("insert into estado (id, handle, id_pais, nome, abreviacao) values (nextval('sq_estado'), 'ecef3bea-2568-42d5-b1a1-3c204f47bd8b', $idPais, 'Distrito Federal', 'DF')")
    }
}