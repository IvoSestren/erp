package db.migration.seed.v1.v0

import db.migration.base.postgresql.PostgreSQLMigration

@Suppress("ClassName", "unused")
class V0001_0000_0030_0001__seed_planoconta : PostgreSQLMigration() {
    override fun makeInserts() {
        execute("insert into planoconta (handle, credito, nome, id_planocontapai) values ('717ed42d-86fe-4657-a9a3-9b25842fe3f2', true, 'Ativos', null)")
        execute("insert into planoconta (handle, credito, nome, id_planocontapai) values ('0d062cff-e7a9-47d4-9a7d-691fb4514d68', true, 'Ativos Atuais',        ${getId("717ed42d-86fe-4657-a9a3-9b25842fe3f2")})")
        execute("insert into planoconta (handle, credito, nome, id_planocontapai) values ('4a93af12-a53d-4266-a8bc-54ed8251c978', true, 'Cartão de Crédito',    ${getId("0d062cff-e7a9-47d4-9a7d-691fb4514d68")})")
        execute("insert into planoconta (handle, credito, nome, id_planocontapai) values ('4540e864-aa5b-427e-b6ce-50cc075ecc76', true, 'Acesso Card',          ${getId("4a93af12-a53d-4266-a8bc-54ed8251c978")})")
        execute("insert into planoconta (handle, credito, nome, id_planocontapai) values ('879b7d63-b990-4bea-b17a-99c9e5905a67', true, 'Conta Corrente',       ${getId("0d062cff-e7a9-47d4-9a7d-691fb4514d68")})")
        execute("insert into planoconta (handle, credito, nome, id_planocontapai) values ('4fd0128a-08e8-4835-b6d5-aba830ff81e3', true, 'Credifiesc',           ${getId("879b7d63-b990-4bea-b17a-99c9e5905a67")})")
        execute("insert into planoconta (handle, credito, nome, id_planocontapai) values ('d9f99451-692b-4b68-8589-a1c659c13a3c', true, 'Itau',                 ${getId("879b7d63-b990-4bea-b17a-99c9e5905a67")})")
        execute("insert into planoconta (handle, credito, nome, id_planocontapai) values ('19cea04c-f843-4666-be5c-5fafdb4e5fcd', true, 'Santander',            ${getId("879b7d63-b990-4bea-b17a-99c9e5905a67")})")
        execute("insert into planoconta (handle, credito, nome, id_planocontapai) values ('03213e3d-510a-4c04-b5d3-c43a86fe222c', true, 'Conta Poupanca',       ${getId("0d062cff-e7a9-47d4-9a7d-691fb4514d68")})")
        execute("insert into planoconta (handle, credito, nome, id_planocontapai) values ('6f305fce-f055-4352-bb24-07ddd0c021cb', true, 'Itau',                 ${getId("03213e3d-510a-4c04-b5d3-c43a86fe222c")})")
        execute("insert into planoconta (handle, credito, nome, id_planocontapai) values ('36dce430-aa78-42cf-a259-d1aa4d332349', true, 'Dinheiro na Carteira', ${getId("0d062cff-e7a9-47d4-9a7d-691fb4514d68")})")
        execute("insert into planoconta (handle, credito, nome, id_planocontapai) values ('e7509712-9f14-4f01-a9ce-f93cbdae5d85', true, 'FGTS',                 ${getId("717ed42d-86fe-4657-a9a3-9b25842fe3f2")})")
        execute("insert into planoconta (handle, credito, nome, id_planocontapai) values ('418ddbd1-ddea-4112-ab27-b74c7914f3a0', true, 'LabTrans',             ${getId("e7509712-9f14-4f01-a9ce-f93cbdae5d85")})")
        execute("insert into planoconta (handle, credito, nome, id_planocontapai) values ('fdf01600-4cf8-4413-b640-2b0eea046589', true, 'Investimentos',        ${getId("717ed42d-86fe-4657-a9a3-9b25842fe3f2")})")
        execute("insert into planoconta (handle, credito, nome, id_planocontapai) values ('f26e9621-a57a-479b-aed4-cd6e1fccc7f3', true, 'Rico',                 ${getId("fdf01600-4cf8-4413-b640-2b0eea046589")})")
        execute("insert into planoconta (handle, credito, nome, id_planocontapai) values ('2e6c86d1-1d9f-41fb-9e02-635db4d3384b', true, 'Tesouro Direto',       ${getId("f26e9621-a57a-479b-aed4-cd6e1fccc7f3")})")
        execute("insert into planoconta (handle, credito, nome, id_planocontapai) values ('6c2ce4cd-2262-4b86-b542-f9f44b8afdd4', true, 'IPCA+ 2045',           ${getId("2e6c86d1-1d9f-41fb-9e02-635db4d3384b")})")
        execute("insert into planoconta (handle, credito, nome, id_planocontapai) values ('d64171f9-0c60-4ea8-90e9-732501f2d24f', true, 'Selic 2025',           ${getId("2e6c86d1-1d9f-41fb-9e02-635db4d3384b")})")
        execute("insert into planoconta (handle, credito, nome, id_planocontapai) values ('b476d9aa-5d17-4397-8a1c-6acfb7c1ffbf', true, 'Vale Alimentação',     ${getId("717ed42d-86fe-4657-a9a3-9b25842fe3f2")})")
        execute("insert into planoconta (handle, credito, nome, id_planocontapai) values ('f58e4e06-496c-4540-a689-d4f8430a4cba', true, 'Alelo',                ${getId("b476d9aa-5d17-4397-8a1c-6acfb7c1ffbf")})")
        execute("insert into planoconta (handle, credito, nome, id_planocontapai) values ('c8ca1997-9218-42be-8b59-3caf9db6138a', true, '8017',                 ${getId("f58e4e06-496c-4540-a689-d4f8430a4cba")})")

        execute("insert into planoconta (handle, credito, nome, id_planocontapai) values ('2e185c73-522a-477a-a225-4677aad5c5c7', true, 'Despesas', null)")
        execute("insert into planoconta (handle, credito, nome, id_planocontapai) values ('41d7f2ff-32d4-4c28-ab8e-8bc0d3a4ef23', true, 'Passivo', null)")
        execute("insert into planoconta (handle, credito, nome, id_planocontapai) values ('1ee45194-0528-449d-863d-dc088b57733a', true, 'Receitas', null)")
    }

    private fun getId(handle: String): Long? {
        return getId("planoconta", handle)
    }
}