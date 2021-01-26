package db.migration.client.v1.v0.v5

import db.migration.base.postgresql.MunicipioPostgreSQLMigration

@Suppress("ClassName")
class V0001_0000_0005_0053__insert_municipio_df : MunicipioPostgreSQLMigration() {
    override fun inserts() {
        idEstado = getIdFromEstado("ecef3bea-2568-42d5-b1a1-3c204f47bd8b")!!

        insert("2b6cb649-92e9-4edc-a559-2ac7996a8de0", "5300108", "Brasília")
    }
}