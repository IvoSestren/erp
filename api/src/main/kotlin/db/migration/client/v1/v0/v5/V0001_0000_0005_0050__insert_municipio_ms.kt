package db.migration.client.v1.v0.v5

import db.migration.base.postgresql.MunicipioPostgreSQLMigration

@Suppress("ClassName")
class V0001_0000_0005_0050__insert_municipio_ms: MunicipioPostgreSQLMigration() {
    override fun inserts() {
        idEstado = getIdFromEstado("333cdef7-bb03-4ff9-a195-ffddbd6a94c0")!!

        insert("ccecf42a-ec79-4d84-a65a-cd4de664b062", "5000203", "Água Clara")
        insert("6fa59939-93d0-481f-a392-858eeaa5997c", "5000252", "Alcinópolis")
        insert("d04a22c7-c2d0-4bb8-b553-3dcc06f4fdb3", "5000609", "Amambai")
        insert("edce2151-dee2-4390-a2d4-372d8bac041f", "5000708", "Anastácio")
        insert("9f847b57-d585-4167-a051-1f038889f01b", "5000807", "Anaurilândia")
        insert("c037f908-6439-4ac8-98a0-f3c613db1bc8", "5000856", "Angélica")
        insert("cfe06466-5468-46fa-abfc-2e855eddbe61", "5000906", "Antônio João")
        insert("4ecd3093-df7f-44e7-9b5b-458ce9a76df3", "5001003", "Aparecida do Taboado")
        insert("6bd3c149-393d-4935-80ce-2ae7927db1bb", "5001102", "Aquidauana")
        insert("5feecd91-01ae-4dac-b9ae-eaf30b6b79da", "5001243", "Aral Moreira")
        insert("fd1636f0-9fcf-40ed-a730-3c7e53bcce7f", "5001508", "Bandeirantes")
        insert("a9a19791-12eb-4f9a-9de3-5fefbc31cef9", "5001904", "Bataguassu")
        insert("720ff691-6f55-4ef5-b1f9-35dddbafdd7a", "5002001", "Batayporã")
        insert("af784af7-6dfd-4f6e-8ade-ee103d69b1da", "5002100", "Bela Vista")
        insert("60145e9e-b193-472a-a592-41385fbcbdeb", "5002159", "Bodoquena")
        insert("0d0127f1-abfc-48fa-8430-74dc01d03cde", "5002209", "Bonito")
        insert("e72709a0-64c0-4ecb-90b1-50358e107e82", "5002308", "Brasilândia")
        insert("1e309891-d0f2-4026-92f5-fadb2be0ceb7", "5002407", "Caarapó")
        insert("443a2aef-8e90-4209-baa0-fdacd9ea0369", "5002605", "Camapuã")
        insert("19ba0467-6743-424e-9f75-d10675c248a7", "5002704", "Campo Grande")
        insert("ed31b0f8-56ab-40de-9776-2c70c767efba", "5002803", "Caracol")
        insert("2933ebbe-7d64-460c-a011-67f204c828c5", "5002902", "Cassilândia")
        insert("cfb39831-f063-4884-821a-1fe5104403ea", "5002951", "Chapadão do Sul")
        insert("5a37a0aa-d748-4287-a47b-50d1a84406aa", "5003108", "Corguinho")
        insert("b57f44ff-72e5-43fa-9e90-5ca5361874c1", "5003157", "Coronel Sapucaia")
        insert("0c6b2481-f537-4f37-a983-82b868726c40", "5003207", "Corumbá")
        insert("bad99e94-1f91-401c-9ef0-32174a0de8b8", "5003256", "Costa Rica")
        insert("c0a7bca0-8704-453a-8949-5235cb90639f", "5003306", "Coxim")
        insert("383923d0-e293-420e-bce8-c86ecf56e636", "5003454", "Deodápolis")
        insert("58bc819c-6d92-44c8-b822-f1ae8ddeb0e2", "5003488", "Dois Irmãos do Buriti")
        insert("840be422-eed6-4f9b-9fc7-9f056da38e5a", "5003504", "Douradina")
        insert("6a44d22e-93ac-4521-ada3-2e8a46ae0610", "5003702", "Dourados")
        insert("0b2827be-3d9d-498f-9d56-7ce824e5c762", "5003751", "Eldorado")
        insert("cfa06446-222c-44e3-b297-d1fe98ae598f", "5003801", "Fátima do Sul")
        insert("c617af2c-e073-45d1-9f3e-22a23139bb34", "5003900", "Figueirão")
        insert("f34aace3-c444-4bed-b8e8-5829e74b5291", "5004007", "Glória de Dourados")
        insert("04087360-e85c-4457-8f31-0d8a9642ab85", "5004106", "Guia Lopes da Laguna")
        insert("4106f4ba-eb0f-4601-9dc9-85194f2e4b23", "5004304", "Iguatemi")
        insert("85a4a620-95ae-4339-b302-690a4ccf5100", "5004403", "Inocência")
        insert("8119c250-008d-444f-8f40-ed5cd7bfa85f", "5004502", "Itaporã")
        insert("ac57d1e7-9cfb-4c2a-a3d6-64bf0bdf3006", "5004601", "Itaquiraí")
        insert("de9d9799-1e28-4587-98b4-5aab7be3a5ce", "5004700", "Ivinhema")
        insert("4eb68eda-6bc3-4c76-b826-2d35ea1f55e8", "5004809", "Japorã")
        insert("658f893e-e146-44e2-af29-172632b4cc7c", "5004908", "Jaraguari")
        insert("9684a076-7459-479e-b3ae-b90c2ee4d2b5", "5005004", "Jardim")
        insert("6b671c1a-5008-45e7-8896-be94ed6cdae8", "5005103", "Jateí")
        insert("a4fdc089-7a1c-49c4-bb12-be9cf720f00f", "5005152", "Juti")
        insert("35186302-5a44-4508-a50d-22c1e72aa976", "5005202", "Ladário")
        insert("c4072076-69b7-418a-bf16-693f323fb2c5", "5005251", "Laguna Carapã")
        insert("5dca1b2a-6eed-487d-9b9e-37336f5e35be", "5005400", "Maracaju")
        insert("1470c8a7-dc41-4a6c-ba7c-de3dfd56a943", "5005608", "Miranda")
        insert("43b97664-7a46-41c5-ba54-a753f31a7356", "5005681", "Mundo Novo")
        insert("af05e64b-e6a0-4353-980e-3005c5693977", "5005707", "Naviraí")
        insert("48f1f125-9bdb-4563-a184-64499ab2936d", "5005806", "Nioaque")
        insert("f7e8c441-30b8-44d1-bdcf-7b6c638792a2", "5006002", "Nova Alvorada do Sul")
        insert("b5d97a2e-e027-4fdc-ae59-0517f84d6401", "5006200", "Nova Andradina")
        insert("c95e4b9c-ded3-46b2-990a-63361af2a3ca", "5006259", "Novo Horizonte do Sul")
        insert("5acdbe23-dca3-491c-81e7-a27d5b5246b8", "5006275", "Paraíso das Águas")
        insert("c62217f9-5b04-4f1c-845d-547c700aae4b", "5006309", "Paranaíba")
        insert("ce6a058a-41a3-4164-b543-0ab122f2fc90", "5006358", "Paranhos")
        insert("b472ebad-0957-466c-aa73-09326161b0f1", "5006408", "Pedro Gomes")
        insert("d209fa10-b23b-4974-bb47-89b8edb021be", "5006606", "Ponta Porã")
        insert("9fdb5800-895a-4192-8e07-7371c9b3280e", "5006903", "Porto Murtinho")
        insert("5ca1a8ff-eb9a-4c65-93f2-804c99740c5f", "5007109", "Ribas do Rio Pardo")
        insert("3ad18a12-da7a-40ec-ae91-c10e02d58a42", "5007208", "Rio Brilhante")
        insert("39120e32-8f58-4569-81fd-2faf1aa12715", "5007307", "Rio Negro")
        insert("41a4968d-71a2-4209-b5e0-be5b5d9fd3d4", "5007406", "Rio Verde de Mato Grosso")
        insert("94a16fec-d29e-40e2-a908-209cfc9db3b3", "5007505", "Rochedo")
        insert("47879dbd-3252-4b55-95ff-517b50bc0061", "5007554", "Santa Rita do Pardo")
        insert("daf75611-9eeb-408e-a245-93371d5584b7", "5007695", "São Gabriel do Oeste")
        insert("2fa337c6-901b-45a1-a31d-04fa68059f80", "5007703", "Sete Quedas")
        insert("04021e0f-7559-4147-85ab-3fda049577cf", "5007802", "Selvíria")
        insert("b09faa1d-7ad7-413d-9a1d-710aa2ad223a", "5007901", "Sidrolândia")
        insert("b64e5b88-224f-456c-b928-6d37652e3d2f", "5007935", "Sonora")
        insert("683f5c82-212e-410d-a135-8671c0fac899", "5007950", "Tacuru")
        insert("47c5fc94-b42a-4bce-a4b7-dc6a576e0b15", "5007976", "Taquarussu")
        insert("b5bd7d55-bc1c-4d3e-8d9b-f92936e17eaa", "5008008", "Terenos")
        insert("abbe22c3-0233-448d-aabc-f4b9ee41120d", "5008305", "Três Lagoas")
        insert("57323653-16fb-4d33-8d1b-6c559cbbd5bd", "5008404", "Vicentina")
    }
}