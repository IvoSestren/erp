package db.migration.client.v1.v0.v5

import db.migration.base.postgresql.MunicipioPostgreSQLMigration

@Suppress("ClassName")
class V0001_0000_0005_0012__insert_municipio_ac: MunicipioPostgreSQLMigration() {
    override fun inserts() {
        this.idEstado = getIdFromEstado("a2c1b4bc-8d1f-4390-8bfe-a4e8bcc1a6e9")!!

        insert("8da8eca8-3ea4-4914-bc02-577ad5c2ba8b", "1200013", "Acrelândia")
        insert("18df77b0-51c0-4591-8553-f52433beb441", "1200054", "Assis Brasil")
        insert("3fd23756-cf97-435b-8bbe-0f62e94d0e36", "1200104", "Brasiléia")
        insert("d2761ec0-84a6-4914-93d2-4816dbce42d3", "1200138", "Bujari")
        insert("367ba913-0871-407a-b1f6-27982cd08cfb", "1200179", "Capixaba")
        insert("52d7609a-3cf5-457d-acd2-aa578cac2eb1", "1200203", "Cruzeiro do Sul")
        insert("461962e3-0dfa-4225-b8ee-c59faac6600c", "1200252", "Epitaciolândia")
        insert("cf8bbb39-1f15-4d05-9920-e91e445bacd5", "1200302", "Feijó")
        insert("61fe0644-7f48-4326-86e5-a3b1d3660c42", "1200328", "Jordão")
        insert("48d75579-c978-4a86-b535-d2ba1416f53e", "1200336", "Mâncio Lima")
        insert("c1f0d1b7-857d-4960-96fc-c13bb161b03d", "1200344", "Manoel Urbano")
        insert("af46368b-83de-4843-a706-a096d8b764f9", "1200351", "Marechal Thaumaturgo")
        insert("006f12ae-70ea-4e71-a489-5bf84fdf0f16", "1200385", "Plácido de Castro")
        insert("ca22f1f0-18ad-4892-9788-292942dddf59", "1200393", "Porto Walter")
        insert("160a7be0-c87e-42dc-a67a-3da2e7ffbef1", "1200401", "Rio Branco")
        insert("6244707a-2c69-4c60-b7ba-82e472015d50", "1200427", "Rodrigues Alves")
        insert("2811e54b-a33e-4efd-b601-87aacb478570", "1200435", "Santa Rosa do Purus")
        insert("c111f3c3-e20b-4927-abe3-efd90506a89c", "1200450", "Senador Guiomard")
        insert("67dcb4b4-77eb-4cdc-9778-f1746119ecdf", "1200500", "Sena Madureira")
        insert("694bbb96-c3a1-41b2-a7c4-fdefa2062c75", "1200609", "Tarauacá")
        insert("60fe6bf1-bc72-47a7-bc3d-2f3a53f221aa", "1200708", "Xapuri")
        insert("1f9c4332-bdb1-4b8d-a699-3402c7d05901", "1200807", "Porto Acre")
    }
}