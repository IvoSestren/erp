package db.migration.client.v1.v0.v5

import db.migration.base.postgresql.MunicipioPostgreSQLMigration

@Suppress("ClassName")
class V0001_0000_0005_0017__insert_municipio_to: MunicipioPostgreSQLMigration() {
    override fun inserts() {
        idEstado = getIdFromEstado("70140659-6c34-4e17-890a-b4dad6ba26d8")!!
        
        insert("7d4dc0ca-8144-4afb-b9e7-f4ca13b3c5fe", "1700251", "Abreulândia")
        insert("ab74e437-a4fa-4717-81df-00de59316db8", "1700301", "Aguiarnópolis")
        insert("c0e695c2-5995-430b-8056-53d539595830", "1700350", "Aliança do Tocantins")
        insert("92cf1490-7ad8-4d4a-8ec3-e79684fb3f19", "1700400", "Almas")
        insert("1a2b9e06-aa7c-4b31-b516-8a19c240ec16", "1700707", "Alvorada")
        insert("4a12c17c-2519-4419-8304-b05d32895dfc", "1701002", "Ananás")
        insert("c62ee16e-d25c-46c9-8134-2891cfc87427", "1701051", "Angico")
        insert("ac3f6562-4ab3-4b47-a08b-f49bb8a03c62", "1701101", "Aparecida do Rio Negro")
        insert("3fba90ed-7732-4958-b4d9-495fc0f7f0d6", "1701309", "Aragominas")
        insert("f20df5f9-c589-4f5e-9ba7-ebe3358629bb", "1701903", "Araguacema")
        insert("b8afbfe0-98ac-4007-a123-72d6622c646d", "1702000", "Araguaçu")
        insert("f4839273-00a8-4394-aa3d-8a660b7d2203", "1702109", "Araguaína")
        insert("13039b5d-f9f3-4034-a12a-9e3ebcddee9a", "1702158", "Araguanã")
        insert("1d0bbd69-0144-4b3e-a811-272c2496910e", "1702208", "Araguatins")
        insert("fe47d43a-3a9f-4fe0-978c-5cab1073720e", "1702307", "Arapoema")
        insert("3d93d309-3e7a-4ad5-b919-4c046b841ffd", "1702406", "Arraias")
        insert("3ed718a1-357f-4bc5-9e84-2df491e6d217", "1702554", "Augustinópolis")
        insert("a6853d90-4ecb-4810-9f51-56328ee472d8", "1702703", "Aurora do Tocantins")
        insert("7d3a756c-0aab-44b5-884b-3b765565ae73", "1702901", "Axixá do Tocantins")
        insert("ac6e4511-1fbd-407c-9b30-42e0f4cb88f7", "1703008", "Babaçulândia")
        insert("e422c298-fbb5-4e73-89a9-644ce1cc7a87", "1703057", "Bandeirantes do Tocantins")
        insert("380e78b4-3c66-420d-a293-f22c52d826a0", "1703073", "Barra do Ouro")
        insert("44b4d6d4-4617-42d1-9f7b-5e1d98c340a3", "1703107", "Barrolândia")
        insert("9a9363c9-a17f-4542-bb2c-49b62f3f0559", "1703206", "Bernardo Sayão")
        insert("4063ac4b-5eda-46e8-a568-0b3e9c92c5f3", "1703305", "Bom Jesus do Tocantins")
        insert("a560d229-638f-43b5-9971-7610f1737041", "1703602", "Brasilândia do Tocantins")
        insert("d906086a-7e7e-4462-b2b3-fc9aa17cf06a", "1703701", "Brejinho de Nazaré")
        insert("a55623de-82ff-4e7d-b6fe-e31f7b5a9bed", "1703800", "Buriti do Tocantins")
        insert("51fe2ef2-fc53-4e33-8099-0d5274c9473c", "1703826", "Cachoeirinha")
        insert("8d6d658b-ab13-40f3-879f-626d125341f5", "1703842", "Campos Lindos")
        insert("f9062474-692d-4fc1-bb57-9c7a031a49ba", "1703867", "Cariri do Tocantins")
        insert("be7f9e42-975a-4b1b-a972-2892fc5b8714", "1703883", "Carmolândia")
        insert("75135a48-6521-4e21-b226-981cd7c1d66b", "1703891", "Carrasco Bonito")
        insert("7976646e-74d6-427e-b4fe-853bae1d267a", "1703909", "Caseara")
        insert("59a04dce-7e7f-4383-bdaa-a22dc8858305", "1704105", "Centenário")
        insert("68c5b107-a3b7-48a6-970a-b4cc39b9c484", "1704600", "Chapada de Areia")
        insert("5f06cc79-baf2-4ea4-bf8a-bb2b5c39a07b", "1705102", "Chapada da Natividade")
        insert("e51280f6-e4f3-42b5-a4a0-536325337abd", "1705508", "Colinas do Tocantins")
        insert("e89d7939-8fa1-4c2a-9faf-ee1fb1163fbf", "1705557", "Combinado")
        insert("d00278fb-35c5-47be-885a-492ad57253e7", "1705607", "Conceição do Tocantins")
        insert("cfc395a9-f959-4c79-8f50-b39e5b94c7c6", "1706001", "Couto Magalhães")
        insert("4d563d74-d0bc-4eeb-b6f7-fce1289e10ef", "1706100", "Cristalândia")
        insert("cac7e4f7-04b3-4565-8889-aa3993e42b8b", "1706258", "Crixás do Tocantins")
        insert("335ee6af-42a0-4638-aaa0-51cab9faf475", "1706506", "Darcinópolis")
        insert("cf14f749-85b7-47d0-ad22-c9158904efc8", "1707009", "Dianópolis")
        insert("a4bc859e-3f9d-4c01-81e8-5b045b83d834", "1707108", "Divinópolis do Tocantins")
        insert("0a2b4478-7d99-4cdd-9e3a-3ca4a3746607", "1707207", "Dois Irmãos do Tocantins")
        insert("9eabdcce-b820-4fe7-9e4a-6ee83d6237c7", "1707306", "Dueré")
        insert("801356fb-aa03-4bec-b938-e8f7c52f46ca", "1707405", "Esperantina")
        insert("4c570c20-7ed8-429a-8a0b-4fd921f0f182", "1707553", "Fátima")
        insert("e7037bbb-e067-4cce-8731-01efa80444da", "1707652", "Figueirópolis")
        insert("1589c835-b792-4bbf-993b-659c169c21e6", "1707702", "Filadélfia")
        insert("990178cd-8975-4021-b7c6-b372ee80967c", "1708205", "Formoso do Araguaia")
        insert("4d1414d0-1079-4157-b5ac-c69b6bcd14a1", "1708254", "Fortaleza do Tabocão")
        insert("4008de4e-655c-4dff-827e-55d99df6ba62", "1708304", "Goianorte")
        insert("ba511fa6-c611-4e65-9530-27b369c14eb9", "1709005", "Goiatins")
        insert("3b0b36e6-90d0-46d5-9daf-95b3e364351d", "1709302", "Guaraí")
        insert("d4873262-0b8c-483d-bb09-192aa6029542", "1709500", "Gurupi")
        insert("aaa7aa46-90fc-459f-892a-13bbbcd156dd", "1709807", "Ipueiras")
        insert("71625f9b-2577-47d8-a665-83352e92707e", "1710508", "Itacajá")
        insert("4a0ff4f3-8705-4686-8e62-be258ffc35d0", "1710706", "Itaguatins")
        insert("afb4a95c-fdcd-401c-85e4-ff2eb65bbe1a", "1710904", "Itapiratins")
        insert("1a3418ad-d3ee-46df-b1d0-cae0b120b577", "1711100", "Itaporã do Tocantins")
        insert("44446636-325c-4618-bc1c-58f0add315d6", "1711506", "Jaú do Tocantins")
        insert("d0e8ba48-62a7-4a7e-a1de-9ec1443d53b1", "1711803", "Juarina")
        insert("891fb9f8-819c-41d9-a08c-33ccc5139da1", "1711902", "Lagoa da Confusão")
        insert("cbe471e0-124e-447d-8780-27d853ca6993", "1711951", "Lagoa do Tocantins")
        insert("6651302d-bb59-4b30-9b1e-50b8022fcd60", "1712009", "Lajeado")
        insert("57f4dd16-ee36-48ed-ae99-35ecd582c58c", "1712157", "Lavandeira")
        insert("7432deb5-d68e-4efd-ba6a-a077a4fefb56", "1712405", "Lizarda")
        insert("e346937a-44af-46c0-aba2-cf0d8c8beebc", "1712454", "Luzinópolis")
        insert("88c93259-b57c-474d-9482-274882574207", "1712504", "Marianópolis do Tocantins")
        insert("b8c9c4f5-aef9-45f0-bbb8-a6451fd1b386", "1712702", "Mateiros")
        insert("9a4caf25-d805-4618-aaf9-507eec216393", "1712801", "Maurilândia do Tocantins")
        insert("d7dfebcd-4c3e-4569-a794-1b0505c8d53b", "1713205", "Miracema do Tocantins")
        insert("4031eeca-0988-45bb-8eb1-d69157baad0e", "1713304", "Miranorte")
        insert("e2f131d6-d28a-4263-9f83-51c93583c14f", "1713601", "Monte do Carmo")
        insert("22188493-1000-4cca-88b3-596978890317", "1713700", "Monte Santo do Tocantins")
        insert("bc3eb53a-ef15-4ffd-8408-5e2dd918c673", "1713809", "Palmeiras do Tocantins")
        insert("f778223e-8972-49d3-83ce-36baa4bd948f", "1713957", "Muricilândia")
        insert("3acdcdf0-76c2-42d7-9aee-f4b5f54558c0", "1714203", "Natividade")
        insert("95f4208b-ab27-4145-b0da-4675e52b8a52", "1714302", "Nazaré")
        insert("9541c651-ae9f-4389-91c8-d8e36c989d77", "1714880", "Nova Olinda")
        insert("9c9f2c6e-edb5-4ea5-a7fe-eccd5c573669", "1715002", "Nova Rosalândia")
        insert("89e78b96-5aef-43f2-9a5a-dbcccecaa036", "1715101", "Novo Acordo")
        insert("0467cdb4-9ad6-4393-9559-b85c34758cb7", "1715150", "Novo Alegre")
        insert("5ec0a491-e88d-4ddd-aca9-47bf38a18260", "1715259", "Novo Jardim")
        insert("f3a72b56-ef12-42fb-9f0f-c12cd07393ce", "1715507", "Oliveira de Fátima")
        insert("9a3eadc7-9647-42af-9de6-6871181ec5d5", "1715705", "Palmeirante")
        insert("6ff3fa7c-39a9-4533-8061-4bf4b651cc0d", "1715754", "Palmeirópolis")
        insert("dc0fef2f-8e28-42cd-b30b-ce6a91e4db3a", "1716109", "Paraíso do Tocantins")
        insert("65ee121d-726d-4ff9-9321-0bc068731cf4", "1716208", "Paranã")
        insert("e0f80016-d915-4665-9a6f-9f50af66572a", "1716307", "Pau D'Arco")
        insert("1e79ad24-a6f0-4bc7-b7c8-cb6274b837b4", "1716505", "Pedro Afonso")
        insert("3dab994a-d1f1-422a-9ce2-07a476b5cba6", "1716604", "Peixe")
        insert("9e5abe3f-b697-4d8b-8084-47be8943cf80", "1716653", "Pequizeiro")
        insert("bd92e763-f75e-406b-9b94-c27e61504a9d", "1716703", "Colméia")
        insert("3ac3b9d1-083b-4b6d-9b8a-023eade9e9ff", "1717008", "Pindorama do Tocantins")
        insert("dfd5c2bc-eb23-4dc6-9413-083a8048e9d7", "1717206", "Piraquê")
        insert("ddbf3ebd-28a7-4db4-87a6-f8569e20a99a", "1717503", "Pium")
        insert("e26c356b-7b70-40ba-85b6-605de8b4fce1", "1717800", "Ponte Alta do Bom Jesus")
        insert("59ac414e-330b-4096-883f-5422734e399f", "1717909", "Ponte Alta do Tocantins")
        insert("4d32f9a5-52ca-403d-aa0a-6c071c541b43", "1718006", "Porto Alegre do Tocantins")
        insert("c30498d7-dcff-4650-803c-1d4ff30bd5e6", "1718204", "Porto Nacional")
        insert("2e0adfc6-1ef9-4e6b-a47e-a39ec2fa2f27", "1718303", "Praia Norte")
        insert("9b97ba74-2144-4e8f-9b18-8bf69008db84", "1718402", "Presidente Kennedy")
        insert("0a0c94c7-b028-408c-a1f7-8c80fce968ed", "1718451", "Pugmil")
        insert("f6fd013e-02ff-4171-bc89-8b4d27032779", "1718501", "Recursolândia")
        insert("9648b46b-5db0-4ab7-9c9d-51915054ccd3", "1718550", "Riachinho")
        insert("4745c411-63d3-414f-aea3-e4aeff1739d5", "1718659", "Rio da Conceição")
        insert("6c745cfd-f735-4395-ba1c-3e5baba8f7c8", "1718709", "Rio dos Bois")
        insert("686f41f7-e00c-4fde-b2e5-542f0b690132", "1718758", "Rio Sono")
        insert("b6a9780d-8505-47ad-80f4-a85b52a0737c", "1718808", "Sampaio")
        insert("4e5ede9d-fa4a-4142-8753-4ad6685fe2bc", "1718840", "Sandolândia")
        insert("503127b0-59fb-4ea5-92b7-49e6318a38fa", "1718865", "Santa Fé do Araguaia")
        insert("4eaaf5dd-2cc3-4345-9a3f-04eca673016a", "1718881", "Santa Maria do Tocantins")
        insert("6fb798f4-78de-415b-a28e-8c84df818aba", "1718899", "Santa Rita do Tocantins")
        insert("0a596e81-4657-4b16-bd03-b859ce53bd0e", "1718907", "Santa Rosa do Tocantins")
        insert("861f8f86-62fa-4d9e-b03f-9398a0546fa4", "1719004", "Santa Tereza do Tocantins")
        insert("d8fbc9f2-0f75-40ee-8bd7-4c90ea749917", "1720002", "Santa Terezinha do Tocantins")
        insert("e4907723-4aaa-4082-a253-41b5a87316fe", "1720101", "São Bento do Tocantins")
        insert("d6992bd9-8c07-45de-a61b-67ea3b678955", "1720150", "São Félix do Tocantins")
        insert("db0a80ca-edc0-4dee-93be-ac9ed5259cb4", "1720200", "São Miguel do Tocantins")
        insert("3d742382-2358-415a-ab43-a67f52b9220c", "1720259", "São Salvador do Tocantins")
        insert("9cad02ff-1e79-4a26-b13a-0b041b15051e", "1720309", "São Sebastião do Tocantins")
        insert("9bd5b1ea-6181-4fa0-94b4-0395367c680e", "1720499", "São Valério")
        insert("96940450-1186-4745-9277-7a7852c3e089", "1720655", "Silvanópolis")
        insert("3762a041-a875-48d9-9a6e-b3e5cbc333e1", "1720804", "Sítio Novo do Tocantins")
        insert("b079ff76-9982-4a7d-8ac6-4a2d2df78548", "1720853", "Sucupira")
        insert("f95d7228-33bd-4029-9f70-997dece7c1c0", "1720903", "Taguatinga")
        insert("4c610e32-0f57-430c-a42e-9adebd95f2a1", "1720937", "Taipas do Tocantins")
        insert("9e080b36-19a6-4ad5-a716-7603a9ade6c3", "1720978", "Talismã")
        insert("bbedf45f-1f85-44f9-9043-54ca32f2ad04", "1721000", "Palmas")
        insert("f2885cff-bc7d-4593-8a61-6bba071ea505", "1721109", "Tocantínia")
        insert("61d271b8-3834-4532-ab82-12c0d91674b6", "1721208", "Tocantinópolis")
        insert("dbefccd3-1c08-499e-b57c-bce8b167ea21", "1721257", "Tupirama")
        insert("e9638fa5-c4e7-4217-9d6e-76ab33ab7774", "1721307", "Tupiratins")
        insert("811f76dd-bae9-4766-9574-5323607424fb", "1722081", "Wanderlândia")
        insert("a81e9678-193d-4627-82a2-059fe716142a", "1722107", "Xambioá")
    }
}