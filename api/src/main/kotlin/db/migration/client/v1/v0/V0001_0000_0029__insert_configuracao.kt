package db.migration.client.v1.v0

import db.migration.base.postgresql.PostgreSQLMigration

@Suppress("ClassName", "unused")
class V0001_0000_0029__insert_configuracao: PostgreSQLMigration() {
    override fun makeInserts() {
        execute("insert into configuracao (handle, chave, valor) values ('51a2ba06-f4e5-4683-9f0b-e2126b66e758', 'TOKEN_PASSWORD', trim(both from (encode(decode(md5(random()::text || current_timestamp || random()),'hex'),'base64')), '='))")
    }
}