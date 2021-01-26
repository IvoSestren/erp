package db.migration.client.v1.v0.v5

import db.migration.base.postgresql.MunicipioPostgreSQLMigration

@Suppress("ClassName")
class V0001_0000_0005_0016__insert_municipio_ap: MunicipioPostgreSQLMigration() {
    override fun inserts() {
        idEstado = getIdFromEstado("65f539dd-c3f4-4e9b-ad5e-3009c6a70ab1")!!

        insert("b1d705fa-2fc8-4d67-9a0a-f7e3f3c88a44", "1600055", "Serra do Navio")
        insert("144d74cc-3416-4e27-a13c-d5a20a5ac57d", "1600105", "Amapá")
        insert("8b52c6b3-4c3d-4208-8277-40f7e8d083c6", "1600154", "Pedra Branca do Amapari")
        insert("d17440fa-6ed7-4378-b010-536a48f41a7d", "1600204", "Calçoene")
        insert("0bc6a045-62cb-4390-94ac-b8ca459c1543", "1600212", "Cutias")
        insert("82cf8f50-7283-46d9-82e5-ef61884eb8b0", "1600238", "Ferreira Gomes")
        insert("a00c0c12-36eb-47cc-ad65-33a9f05cb4f5", "1600253", "Itaubal")
        insert("86154850-37ef-469d-a771-7627f7d0b115", "1600279", "Laranjal do Jari")
        insert("921cbb24-7ffa-4933-bed4-d9f139381f21", "1600303", "Macapá")
        insert("d2fbe7f8-d459-4b49-8cad-dea81ce99bbe", "1600402", "Mazagão")
        insert("5a025f41-0d4f-4581-befd-d8d9bf7018e3", "1600501", "Oiapoque")
        insert("8b51d2aa-250c-430e-99fb-cb3c98c11770", "1600535", "Porto Grande")
        insert("ef4480a3-3348-4d9f-a489-d30ff7248241", "1600550", "Pracuúba")
        insert("4e64aef1-227e-4341-a040-b320950d480e", "1600600", "Santana")
        insert("9e0afda3-3275-4f08-857c-9c065c6a97cb", "1600709", "Tartarugalzinho")
        insert("c99ae0f3-ec5e-460b-83b8-09ca1e89f71b", "1600808", "Vitória do Jari")
    }
}