package db.migration.client.v1.v0.v5

import db.migration.base.postgresql.MunicipioPostgreSQLMigration

@Suppress("ClassName")
class V0001_0000_0005_0014__insert_municipio_rr: MunicipioPostgreSQLMigration() {
    override fun inserts() {
        this.idEstado = getIdFromEstado("65e2688c-1eda-4ffc-9f7c-b61273dac95e")!!

        insert("1ade2f3b-db33-49e0-b87c-981f7c4cdcac", "1400027", "Amajari")
        insert("dc4db536-0033-4c69-af93-bb3125bba0d3", "1400050", "Alto Alegre")
        insert("e64b6450-5d0b-4b6a-9f5b-ee498cb2faf1", "1400100", "Boa Vista")
        insert("22e4f8b9-e323-4a00-a5c5-5d255665dc87", "1400159", "Bonfim")
        insert("7691e2bf-8f8e-4a62-9d4e-dc8bc015d628", "1400175", "Cantá")
        insert("3b99e23b-0f64-4f46-ab5c-044aa27d7efe", "1400209", "Caracaraí")
        insert("b985a7ca-1686-418b-ab75-e83caa5ed13d", "1400233", "Caroebe")
        insert("a73205e6-9491-4acc-b304-25e217f2513e", "1400282", "Iracema")
        insert("a28c7ddb-64b8-4369-998c-621503d861c2", "1400308", "Mucajaí")
        insert("102fa142-258b-46ce-b952-2ab5a5b09f5e", "1400407", "Normandia")
        insert("5b69a926-c4ee-48d5-a253-4a650ca598b5", "1400456", "Pacaraima")
        insert("e34b25cb-aa0c-4b6b-b66b-2e0b0caaf7ac", "1400472", "Rorainópolis")
        insert("b9c54afb-b203-491f-b27b-779958de800e", "1400506", "São João da Baliza")
        insert("1852048c-653b-4888-a3da-69bb95479d53", "1400605", "São Luiz")
        insert("e268ee97-d435-49bd-b944-fcf5b7187a26", "1400704", "Uiramutã")
    }
}