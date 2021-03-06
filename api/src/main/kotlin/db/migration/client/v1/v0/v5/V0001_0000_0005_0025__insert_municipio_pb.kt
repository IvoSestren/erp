package db.migration.client.v1.v0.v5

import db.migration.base.postgresql.MunicipioPostgreSQLMigration

@Suppress("ClassName")
class V0001_0000_0005_0025__insert_municipio_pb: MunicipioPostgreSQLMigration() {
    override fun inserts() {
        idEstado = getIdFromEstado("e48ba792-e224-4a6a-b5fb-4c28541f4a8f")!!

        insert("00cbe776-d5e0-496e-a340-962533281069", "2500106", "Água Branca")
        insert("acd44175-a64e-4c9d-a60e-c8408085d88e", "2500205", "Aguiar")
        insert("492dbf69-8c67-4f47-b7c9-3246cefee77d", "2500304", "Alagoa Grande")
        insert("b48c4551-9a7f-4030-bc20-f294c8757b12", "2500403", "Alagoa Nova")
        insert("fd40a07d-c171-4edb-afe7-a2cb49244bad", "2500502", "Alagoinha")
        insert("02bebd0d-a36e-4562-98aa-09e982f314b7", "2500536", "Alcantil")
        insert("c84f2e7d-660d-473c-8676-970a29a2f674", "2500577", "Algodão de Jandaíra")
        insert("c6c73290-5e4b-498f-9d2d-ea3ec9e5bcfc", "2500601", "Alhandra")
        insert("73a18aac-068d-450e-90cc-8533d9356f0a", "2500700", "São João do Rio do Peixe")
        insert("c9216a83-bce5-4b6e-aab0-67fdd47fe632", "2500734", "Amparo")
        insert("c849fb8d-a7f8-42ca-a0c3-73085e0a6f40", "2500775", "Aparecida")
        insert("64984962-4985-43a8-86a1-f7c0621ef584", "2500809", "Araçagi")
        insert("85eecc3a-628c-4df8-88d6-8f9bca45c09a", "2500908", "Arara")
        insert("e1eaa0bd-880f-4f74-b8f2-a05ce0d4b0c8", "2501005", "Araruna")
        insert("dfcfbe65-c388-40b1-b3cd-4da56e88663b", "2501104", "Areia")
        insert("4b34df9f-1282-482f-b6dd-a2475ba99300", "2501153", "Areia de Baraúnas")
        insert("6dc92fab-0c52-4c8d-b6ff-f5b115c3cf2b", "2501203", "Areial")
        insert("e199e60b-76f9-48c3-aad0-e63f037cc0f5", "2501302", "Aroeiras")
        insert("4de6a25d-73f9-4ded-94a7-069c5dfb3b15", "2501351", "Assunção")
        insert("1ee34572-43d5-44bb-aa7a-4b6a5e3d90f8", "2501401", "Baía da Traição")
        insert("e033fbf9-ca8c-405d-900a-220b07325ac6", "2501500", "Bananeiras")
        insert("0d29e438-fb12-48d3-8c89-920a5c9f4dc9", "2501534", "Baraúna")
        insert("e0e8c5e5-dc2b-4303-87c8-696ab2c2d226", "2501575", "Barra de Santana")
        insert("f516ec97-0927-481a-8bcf-5e29e75bdb51", "2501609", "Barra de Santa Rosa")
        insert("34f55802-f976-4475-8d66-1e2266fb579b", "2501708", "Barra de São Miguel")
        insert("78a3af23-eae6-4489-b01b-0c9fd5ac8d64", "2501807", "Bayeux")
        insert("c9d08aba-bfbc-45f3-8bef-cb8b03a24457", "2501906", "Belém")
        insert("e93ff066-f68f-437f-9cfc-155392f2690e", "2502003", "Belém do Brejo do Cruz")
        insert("bdf4af39-3ed1-4fe1-bc07-398de1d5f3fa", "2502052", "Bernardino Batista")
        insert("9293c413-0b4b-4b1a-a246-9a4bd770557d", "2502102", "Boa Ventura")
        insert("40493315-ad7d-482f-8369-cc6a91e92d66", "2502151", "Boa Vista")
        insert("00f6fb88-c740-4c1a-bceb-0017b306a7f2", "2502201", "Bom Jesus")
        insert("d85bd70b-7028-421f-bc5e-09db9676205c", "2502300", "Bom Sucesso")
        insert("a7f6319c-c8f2-483a-8faf-989656c1fab3", "2502409", "Bonito de Santa Fé")
        insert("fb764473-a8d7-46ef-9e33-b2329c8289d3", "2502508", "Boqueirão")
        insert("a2e5cf0f-a145-4dad-af03-a939d47ad706", "2502607", "Igaracy")
        insert("1156117b-467b-459a-ac54-5c9b484e915e", "2502706", "Borborema")
        insert("7f199057-cf6b-445c-b58e-1ea4dee5e3ac", "2502805", "Brejo do Cruz")
        insert("ad419656-3fcb-466a-a7dc-eaf0a3b8f581", "2502904", "Brejo dos Santos")
        insert("450e22e9-87cd-477d-969d-61e3f62b8c88", "2503001", "Caaporã")
        insert("e7cca2d8-86b8-4b5d-a81f-ef51d0b9755b", "2503100", "Cabaceiras")
        insert("b0c52df0-6904-4769-b31b-ef81ed165b0d", "2503209", "Cabedelo")
        insert("369e60e4-3e05-4632-b74f-1b70700e86ac", "2503308", "Cachoeira dos Índios")
        insert("6d7c546e-adbe-43f7-abd6-d64bee102747", "2503407", "Cacimba de Areia")
        insert("7cbf35d1-686b-4962-9cd9-83ad090aac79", "2503506", "Cacimba de Dentro")
        insert("ae79c91a-8b85-4de6-be5f-ae847ce1eb2c", "2503555", "Cacimbas")
        insert("7aff8a79-fc33-4197-baf9-9f351683196f", "2503605", "Caiçara")
        insert("17308b62-52ce-46c4-be33-f12490c52ac5", "2503704", "Cajazeiras")
        insert("3e4ed78d-a801-45d9-928f-d2a611009dd4", "2503753", "Cajazeirinhas")
        insert("a9784827-6145-4f04-ab45-85aac3fa30f9", "2503803", "Caldas Brandão")
        insert("ae0a999b-1f0f-4611-965b-eb6aa8d48d91", "2503902", "Camalaú")
        insert("2516c2d7-20bc-4e9f-bf81-e4f8342dd237", "2504009", "Campina Grande")
        insert("88254dc6-db02-4613-afbc-22c8a5ec57df", "2504033", "Capim")
        insert("3bbc8042-b7ce-4a15-84e5-b3b40743594c", "2504074", "Caraúbas")
        insert("a7f1b63a-cb59-4bec-ae4b-8ee245715016", "2504108", "Carrapateira")
        insert("7608e2fa-d1bc-4f07-a1d4-84589551b2b5", "2504157", "Casserengue")
        insert("59e7d227-3000-49ee-9b07-a6c56e6e0c3d", "2504207", "Catingueira")
        insert("ae3bf722-2fc9-4632-8990-f535ce035edb", "2504306", "Catolé do Rocha")
        insert("931f7bbc-a001-4545-9409-7c05bb641beb", "2504355", "Caturité")
        insert("c03e0ad2-7147-4413-9fa7-11fd9d8a84f7", "2504405", "Conceição")
        insert("07f2d4ac-b2dc-4c25-959d-c29b1e4f1d9c", "2504504", "Condado")
        insert("df44afe7-4580-4125-bfc0-4cc8a0dc1534", "2504603", "Conde")
        insert("1d78b5d6-cea1-4a1c-8d6e-34c7f931b812", "2504702", "Congo")
        insert("25a2bc4d-8a2e-4a61-b8a9-dfd8bd0a2bcf", "2504801", "Coremas")
        insert("e20a0798-dd47-4fbe-952d-fd631d174782", "2504850", "Coxixola")
        insert("53f10b7a-119d-4290-826b-61df867142a5", "2504900", "Cruz do Espírito Santo")
        insert("9ed88791-02f5-4ca6-b9af-183919cad4ef", "2505006", "Cubati")
        insert("8fb67bef-4c04-4a20-8460-6c851f71ffe9", "2505105", "Cuité")
        insert("5342a705-c657-452c-830d-cdc799696dbc", "2505204", "Cuitegi")
        insert("bddeeed5-a0c3-4f1a-8ff6-df6f03fbc5cc", "2505238", "Cuité de Mamanguape")
        insert("a0d77f68-a10e-4b90-81f8-054605e85c92", "2505279", "Curral de Cima")
        insert("75595600-ef3c-425e-a6c2-d4c7d55f1ad5", "2505303", "Curral Velho")
        insert("84bc0873-7ec8-4229-a726-9f7e1e0bdc51", "2505352", "Damião")
        insert("5442db18-991d-4b98-aada-1c60d026a790", "2505402", "Desterro")
        insert("4b937f87-040b-4fe8-90d0-e85712c1ffba", "2505501", "Vista Serrana")
        insert("a5f5821c-cbb7-4c56-8e88-27d8cd8e731f", "2505600", "Diamante")
        insert("ac91b04a-65f4-4a1e-82a6-4903ce191554", "2505709", "Dona Inês")
        insert("eef00e54-bcf2-4b9f-9e2c-396ec50daf9c", "2505808", "Duas Estradas")
        insert("719aa779-c3d9-427b-b7a0-fbefc0eb01cd", "2505907", "Emas")
        insert("b9153f4f-4807-41cb-ae86-718fe4b74940", "2506004", "Esperança")
        insert("4eb6816f-577f-4e0c-875c-653b5ebb8d36", "2506103", "Fagundes")
        insert("64f75892-58a4-4433-b8ad-8e9e1b654abf", "2506202", "Frei Martinho")
        insert("97fab7cb-0952-406d-80b8-f43753cdeec8", "2506251", "Gado Bravo")
        insert("3fcded9c-2f4d-4c36-b700-c9123cfc8ac3", "2506301", "Guarabira")
        insert("20451f80-da64-47e5-869e-8a07a842e64e", "2506400", "Gurinhém")
        insert("42bab2f6-d565-4694-a13a-90b097679fac", "2506509", "Gurjão")
        insert("c3ae2ae6-5228-4229-b5ac-aa5d4a4e378e", "2506608", "Ibiara")
        insert("a3e143d3-fffa-4b8c-99eb-e22e6874c7eb", "2506707", "Imaculada")
        insert("6a64e77b-4be2-4ed1-9838-24f7be6cc729", "2506806", "Ingá")
        insert("5520bc6b-75c5-431d-80ad-652c3e5a27ec", "2506905", "Itabaiana")
        insert("588fb4e9-cc8c-483e-a2bb-8411effe5ea7", "2507002", "Itaporanga")
        insert("cb0f1f62-2c3a-4e94-ab5b-de10515bc737", "2507101", "Itapororoca")
        insert("214cb405-231b-478a-b6a2-7dd566468770", "2507200", "Itatuba")
        insert("53be27f3-6d85-4e83-895f-1e0cfb403a96", "2507309", "Jacaraú")
        insert("d3c986d9-3283-444b-83eb-74c03e8b8616", "2507408", "Jericó")
        insert("ca0defb9-b673-4000-b962-2eca9c79f942", "2507507", "João Pessoa")
        insert("656e280d-fa87-4e7a-89c7-27c0297da77c", "2507606", "Juarez Távora")
        insert("79a7e614-ee29-495d-a851-75ebd90e1cf3", "2507705", "Juazeirinho")
        insert("3ac547b6-5da7-4881-a7b3-eb8db12ce229", "2507804", "Junco do Seridó")
        insert("9db6056c-b254-420a-bcfa-4afcca5e4c59", "2507903", "Juripiranga")
        insert("5bad9b62-6b82-4754-957c-9fc94763ed7d", "2508000", "Juru")
        insert("76b9d19e-4fa6-400d-9416-af1f87ffd5a0", "2508109", "Lagoa")
        insert("87cbd8c9-b40d-4da3-8731-7e33644b5eaa", "2508208", "Lagoa de Dentro")
        insert("cfd22732-da8e-4ae8-858f-c06942a13156", "2508307", "Lagoa Seca")
        insert("1747abfa-6725-4efe-85e7-678e6cf849ab", "2508406", "Lastro")
        insert("e2263545-62e0-41ed-babb-f822804c22c5", "2508505", "Livramento")
        insert("c3ff3d4a-8502-4be8-8928-08c9858f4551", "2508554", "Logradouro")
        insert("498eefb7-6e59-4080-87a5-08454d16400d", "2508604", "Lucena")
        insert("0731972f-aeb6-46f1-afa7-52a071cf1fab", "2508703", "Mãe d'Água")
        insert("b25f2c4e-62c2-46e6-9397-e59b27f9e877", "2508802", "Malta")
        insert("da993943-cb52-468c-966c-ccbf09c0a9f6", "2508901", "Mamanguape")
        insert("5e5af379-b4f2-4d11-b683-a25095da3606", "2509008", "Manaíra")
        insert("6eeac8b9-2c3c-4c83-93df-b9ee2b385410", "2509057", "Marcação")
        insert("5f4a5202-8f16-424a-a033-901ec7ac73c9", "2509107", "Mari")
        insert("c64eb7de-9902-42cc-bb9b-6d7e2799f4d3", "2509156", "Marizópolis")
        insert("3622e057-92b3-4aec-8d05-bef9b2b8a604", "2509206", "Massaranduba")
        insert("b1be7d95-4327-4492-a9ff-d92eb3e4bad8", "2509305", "Mataraca")
        insert("0ca83eaa-d116-465a-a07b-2a4a97188fa1", "2509339", "Matinhas")
        insert("d3be9483-a940-41a2-8cbe-71926a09c820", "2509370", "Mato Grosso")
        insert("c394f80e-6967-48c0-9cda-640331ceae92", "2509396", "Maturéia")
        insert("5dfe49af-bb76-4625-9559-3efdbdf8b6cc", "2509404", "Mogeiro")
        insert("d0262f24-42e9-49b4-ac2d-220f274d3bbb", "2509503", "Montadas")
        insert("6009d9cf-3448-416e-b194-d2420d7bd46b", "2509602", "Monte Horebe")
        insert("7b394e0c-b397-492b-9126-0edc7d55a052", "2509701", "Monteiro")
        insert("1a7241d9-5591-4b0f-91df-2b3e795fe714", "2509800", "Mulungu")
        insert("a737c6cd-7831-4cb6-8311-79bf0ff290b7", "2509909", "Natuba")
        insert("14b33121-9d5d-4f73-8c60-4f68bd3e6862", "2510006", "Nazarezinho")
        insert("a3b4a830-53a4-42c4-a793-3b8a14f7b132", "2510105", "Nova Floresta")
        insert("f51ade68-c39b-490b-b5da-5e2ef4504fc4", "2510204", "Nova Olinda")
        insert("5a5dbf9f-a726-4954-9ab7-8f1e8912f87b", "2510303", "Nova Palmeira")
        insert("6000f3fe-b851-4d4a-9ae1-fef201c36242", "2510402", "Olho d'Água")
        insert("520efa99-1d19-4384-8226-120a22f3c771", "2510501", "Olivedos")
        insert("f723617a-5a04-4236-a25e-96f70de572a5", "2510600", "Ouro Velho")
        insert("57ff556d-bbdd-4d0f-8138-26602f1c1255", "2510659", "Parari")
        insert("c46bf2bc-1b2c-4eee-b747-22506e449ef6", "2510709", "Passagem")
        insert("2e34cb42-503b-49c7-a447-493bfe133237", "2510808", "Patos")
        insert("28aa54a7-a00b-4ffd-9405-9d4eb568655b", "2510907", "Paulista")
        insert("92fba189-3752-4c4d-a549-0cb94f58a40b", "2511004", "Pedra Branca")
        insert("181460d4-ec1e-401b-98ef-4a14dec867ba", "2511103", "Pedra Lavrada")
        insert("27329c00-496d-4149-89b1-abd95f550abe", "2511202", "Pedras de Fogo")
        insert("65f6511d-0ef2-42a5-b8f0-08a128e2e430", "2511301", "Piancó")
        insert("e278e9fd-c342-420e-b610-fb065fc6992f", "2511400", "Picuí")
        insert("68f3d4fb-328b-4433-ab40-8cfbd19ed642", "2511509", "Pilar")
        insert("74533bd4-f451-4d9b-9f86-a27470f3e8b6", "2511608", "Pilões")
        insert("c4e99ed1-7dfd-4e53-bfd8-6b5db02bf75f", "2511707", "Pilõezinhos")
        insert("8cf3a202-2207-4b4f-9e20-f2726f32e4e2", "2511806", "Pirpirituba")
        insert("583a8e48-dc73-4e65-9afb-808166330ab6", "2511905", "Pitimbu")
        insert("0fecec4c-1e72-40fb-93be-1064f08b5ebe", "2512002", "Pocinhos")
        insert("ebb63f5d-4c90-4af4-8f00-fe0b2bad8528", "2512036", "Poço Dantas")
        insert("c3d2e9b5-958a-4bfa-9efc-2f497fff41d6", "2512077", "Poço de José de Moura")
        insert("cd265959-bc83-4f9d-a526-62ef7495299b", "2512101", "Pombal")
        insert("a952d074-4329-4e9d-a536-70af91517713", "2512200", "Prata")
        insert("9f963cc5-7090-4ce7-97db-6aebcb4e145d", "2512309", "Princesa Isabel")
        insert("0e0d9646-a458-4f4e-94c2-a9a4ffbc04d8", "2512408", "Puxinanã")
        insert("7865b52c-8f4c-4ebd-9701-489ef4816f0e", "2512507", "Queimadas")
        insert("30054239-e58c-4d88-b8b1-e5b0299cd67f", "2512606", "Quixaba")
        insert("aa634523-f754-4aa1-bd2e-e623dffdd7d1", "2512705", "Remígio")
        insert("cef048d1-e230-4fc4-9017-b4a2c618a24c", "2512721", "Pedro Régis")
        insert("eec3e0e1-4d0b-4a52-930e-7aa5f63eb432", "2512747", "Riachão")
        insert("3630077f-2c88-4b9c-ab0c-367a4a95f39d", "2512754", "Riachão do Bacamarte")
        insert("ffc513cd-743a-4bf0-81cd-443444d92298", "2512762", "Riachão do Poço")
        insert("1a2e1234-7e47-41f9-9334-7ef151d3de39", "2512788", "Riacho de Santo Antônio")
        insert("bfef9249-4416-4c70-93f3-93e79b7e62e0", "2512804", "Riacho dos Cavalos")
        insert("ae6331b9-9485-4b82-8b84-05608ea52a69", "2512903", "Rio Tinto")
        insert("54400e4b-d7ce-4f5e-9284-6e00e5c17797", "2513000", "Salgadinho")
        insert("96215d24-a9b3-4ea4-b0da-b32f1b6dc35a", "2513109", "Salgado de São Félix")
        insert("0d3909d5-1a3a-45fa-aefa-e18e6596c6d1", "2513158", "Santa Cecília")
        insert("ccc1c982-e9e5-445c-9225-e5579ec84736", "2513208", "Santa Cruz")
        insert("fc983cf8-4e6b-432f-8aab-cd7547996ee3", "2513307", "Santa Helena")
        insert("fa5de41b-fa13-4cb7-be2a-0361c964a6f8", "2513356", "Santa Inês")
        insert("69748e6a-363c-4716-9602-6a16f4129127", "2513406", "Santa Luzia")
        insert("268f1fc8-9657-4a90-93ba-ca2054521c91", "2513505", "Santana de Mangueira")
        insert("2fb4a7b0-155c-4cae-9c75-1e6868327ec7", "2513604", "Santana dos Garrotes")
        insert("df7cae88-0011-47bc-8c8d-5a4c9c686c80", "2513653", "Joca Claudino")
        insert("f0c70ce0-3eb8-430d-b9db-dadcd18cf10d", "2513703", "Santa Rita")
        insert("4ad07489-6b05-4c4a-97bb-75b522fed957", "2513802", "Santa Teresinha")
        insert("9dcae085-2392-4943-bd9a-ebec91240305", "2513851", "Santo André")
        insert("689d5528-3230-40d9-8ad1-e138070a059c", "2513901", "São Bento")
        insert("8e46da2d-913a-4458-a70e-51c980e522d4", "2513927", "São Bentinho")
        insert("4dff0f6c-bef7-4168-b034-6552ab3498f1", "2513943", "São Domingos do Cariri")
        insert("1f980b6c-30de-449e-badd-9fc78a195b79", "2513968", "São Domingos")
        insert("e5253576-4bc9-41e2-90d7-517fd7f691ba", "2513984", "São Francisco")
        insert("0574b664-6b38-4823-938a-db14cd45a9df", "2514008", "São João do Cariri")
        insert("5f8b6e68-a4de-4db7-855d-9051956fbc1d", "2514107", "São João do Tigre")
        insert("01ffb21f-d155-4293-ada7-94228da71a7b", "2514206", "São José da Lagoa Tapada")
        insert("2f60ced2-e5f5-4df2-9e13-7e30fdbf403e", "2514305", "São José de Caiana")
        insert("a22967e3-6eca-4f89-b8f4-ff6aa2b92d57", "2514404", "São José de Espinharas")
        insert("7f413c20-e45b-4b33-99fa-4099999110b2", "2514453", "São José dos Ramos")
        insert("c0069785-4d35-4d1e-870e-ad8d7fa4dc7b", "2514503", "São José de Piranhas")
        insert("cd6b1d9f-e2b9-4aa4-8863-f016d7a7624a", "2514552", "São José de Princesa")
        insert("0971a931-8b89-49ea-9ecf-9026b0b516b6", "2514602", "São José do Bonfim")
        insert("9a457c54-fedd-4725-9aa0-29098b31c42e", "2514651", "São José do Brejo do Cruz")
        insert("1dba8aad-cec7-4f1d-8044-d77e108ce5c1", "2514701", "São José do Sabugi")
        insert("d7c21f78-4242-453d-82b1-9aafcb257d88", "2514800", "São José dos Cordeiros")
        insert("9d71b032-7733-4999-aceb-e2189c9b4faa", "2514909", "São Mamede")
        insert("be34a9e7-06af-48c1-9de6-9a04e860c2dc", "2515005", "São Miguel de Taipu")
        insert("eacdf0a6-5d1c-4485-811e-b7361e768dc3", "2515104", "São Sebastião de Lagoa de Roça")
        insert("b1141f76-743c-4add-9717-f6b62a0ada20", "2515203", "São Sebastião do Umbuzeiro")
        insert("fedd0214-18ba-4c1e-987e-6dd31e4fdfdf", "2515302", "Sapé")
        insert("9bbc2e1a-1541-473d-a3a0-204d06eeea3d", "2515401", "São Vicente do Seridó")
        insert("c44049e2-81b9-454f-b209-d37d0c593ed3", "2515500", "Serra Branca")
        insert("b905adcc-5812-4cc5-ba28-0819049d24a9", "2515609", "Serra da Raiz")
        insert("54845a24-cc11-44d2-ab4b-e4d8071ef044", "2515708", "Serra Grande")
        insert("bea3195e-e99b-440f-bebf-662e7839c63b", "2515807", "Serra Redonda")
        insert("842771a7-d569-46ce-bd02-c8b74d3e5ca0", "2515906", "Serraria")
        insert("437f4cca-78b9-45e1-9eb9-ab989b4dae87", "2515930", "Sertãozinho")
        insert("d6d37c01-fd07-466a-89f0-3ac76a685a81", "2515971", "Sobrado")
        insert("c4d145ff-cdce-4a67-8c59-0dc6c341c55a", "2516003", "Solânea")
        insert("38066920-ac6e-47ab-a459-68b1b47233d6", "2516102", "Soledade")
        insert("afceb1b6-b4cd-4006-ad25-088ed04cdb73", "2516151", "Sossêgo")
        insert("fb25eba5-65ae-4704-901d-e8f7272020e5", "2516201", "Sousa")
        insert("ac1eb6ab-b4b4-412f-ad5e-a24d4d541640", "2516300", "Sumé")
        insert("d3868b65-30de-4d0d-a8c5-6488991cacbb", "2516409", "Tacima")
        insert("6a5ab1b2-61bd-4e00-9f2a-ba0f08c2c18d", "2516508", "Taperoá")
        insert("a4550086-e38b-4f0b-ae1f-a003547edadd", "2516607", "Tavares")
        insert("15e743f7-da04-4f04-bd74-3fd11e69ccc4", "2516706", "Teixeira")
        insert("8f1feb38-64de-43f6-96ee-36496a196ca1", "2516755", "Tenório")
        insert("5660b6bb-71c5-47fd-9088-125198f551e3", "2516805", "Triunfo")
        insert("65825d81-c82d-4694-9006-a81a93e91213", "2516904", "Uiraúna")
        insert("518c298d-918f-4b68-9aff-ebe043a80f63", "2517001", "Umbuzeiro")
        insert("7222da34-4967-49ef-86c3-421482a78d42", "2517100", "Várzea")
        insert("d720f810-16d5-4b68-8460-d4a8bf90637a", "2517209", "Vieirópolis")
        insert("5b16b767-db53-499e-b7fd-06e3cc6300c4", "2517407", "Zabelê")
    }
}