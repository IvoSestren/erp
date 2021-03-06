package db.migration.client.v1.v0.v5

import db.migration.base.postgresql.MunicipioPostgreSQLMigration

@Suppress("ClassName")
class V0001_0000_0005_0029__insert_municipio_ba: MunicipioPostgreSQLMigration() {
    override fun inserts() {
        idEstado = getIdFromEstado("1cc0cd44-6a16-46fa-a54c-972e405d17a1")!!

        insert("3446476b-778d-4729-af6a-49d72799bb48", "2900108", "Abaíra")
        insert("867d1c50-bb2f-4f6b-ba8c-acc82ac7d3d3", "2900207", "Abaré")
        insert("8c42a482-4b57-4840-a3ad-58711f15bb65", "2900306", "Acajutiba")
        insert("148aafea-7a1f-4fc5-a50b-1c6de624ed50", "2900355", "Adustina")
        insert("be3b0f31-fa5f-4b72-b9a7-0bfeca363349", "2900405", "Água Fria")
        insert("f22b37a3-e50d-46c1-8eec-2ae26c92ed92", "2900504", "Érico Cardoso")
        insert("612152ad-5f56-45fa-9564-e31f5e254286", "2900603", "Aiquara")
        insert("6c772769-69d1-41e0-97a0-80a39ad085fd", "2900702", "Alagoinhas")
        insert("1a242506-7cd0-4050-a0c5-4bee8a0a9a24", "2900801", "Alcobaça")
        insert("328c46df-8ba6-44b6-8a73-32d02f2b32e2", "2900900", "Almadina")
        insert("75452dc3-d3b7-4ba2-91a5-19d31fba68eb", "2901007", "Amargosa")
        insert("8406e498-38e6-41da-abe8-0a4630d69b7b", "2901106", "Amélia Rodrigues")
        insert("762ee9ee-63ba-4eda-bfa3-f09dd0f7ae75", "2901155", "América Dourada")
        insert("de597971-a523-4636-83ae-c1760a4f750a", "2901205", "Anagé")
        insert("4e01d28b-9e29-4e54-bfa8-cc94c3abcb8e", "2901304", "Andaraí")
        insert("f6386883-9874-4eff-a856-a49eae57fc97", "2901353", "Andorinha")
        insert("cf08646a-3f1a-4a03-b029-38351217bf8b", "2901403", "Angical")
        insert("63f4db61-2eec-4a91-9f2f-d6f4b63a87c5", "2901502", "Anguera")
        insert("21768645-a78f-462a-8249-b437d26834ab", "2901601", "Antas")
        insert("2ab3d881-6d8d-44ac-963e-424cad65ba55", "2901700", "Antônio Cardoso")
        insert("7904009f-606c-465d-a7cf-3b1eeae1fbfa", "2901809", "Antônio Gonçalves")
        insert("5cfae0c3-de36-442d-a03e-bcc19df76411", "2901908", "Aporá")
        insert("bc62310e-a30f-4f01-8b19-5be7c4563d30", "2901957", "Apuarema")
        insert("32100091-205b-4393-b083-ec0a5cd177ab", "2902005", "Aracatu")
        insert("a35c2ddd-1d06-4668-aa89-867c4d5757e9", "2902054", "Araçás")
        insert("732280ae-3ed4-4510-85dd-80af324e2258", "2902104", "Araci")
        insert("816161f1-efbc-4776-9207-9a034d287de1", "2902203", "Aramari")
        insert("06d4639f-aacc-4abc-85b0-22870705e22a", "2902252", "Arataca")
        insert("7eb97be1-81e3-466b-aa75-cd1c5efeb78e", "2902302", "Aratuípe")
        insert("deaea232-8947-42a1-b879-e26cf2dfc08c", "2902401", "Aurelino Leal")
        insert("99991240-591e-46d8-a9f8-40b784db9213", "2902500", "Baianópolis")
        insert("adbd80fa-e968-4c7e-8d70-5e91635ba737", "2902609", "Baixa Grande")
        insert("095861e1-acf2-4a47-84de-512b6be0e72f", "2902658", "Banzaê")
        insert("3a3e4a73-322c-408e-8324-0dc36e7cdb85", "2902708", "Barra")
        insert("7c1de22d-1f5a-427f-93cd-fcc8212a4b1c", "2902807", "Barra da Estiva")
        insert("312bdb6a-2d1f-4315-ba49-5fd351c823a0", "2902906", "Barra do Choça")
        insert("677b455a-80c9-4d9b-a0c1-0e2b8acef399", "2903003", "Barra do Mendes")
        insert("1961da9b-d766-4149-a18b-6a6f893f5b8e", "2903102", "Barra do Rocha")
        insert("4c658821-b86c-458d-97ca-679afd703561", "2903201", "Barreiras")
        insert("0ea8eeb1-9143-4aa9-a243-44c8464adfb3", "2903235", "Barro Alto")
        insert("c79bd8ab-cd95-4a4e-8d33-4503c7c93995", "2903276", "Barrocas")
        insert("dc3315c9-b8e9-41fc-8608-eaab741adf01", "2903300", "Barro Preto")
        insert("18dbcb47-ef9b-428e-aeec-7ad50d6a5494", "2903409", "Belmonte")
        insert("e179ca76-43f1-4cc5-aa93-76c56a6bc838", "2903508", "Belo Campo")
        insert("b7e5dca6-3329-41af-8c4f-114ed4011c38", "2903607", "Biritinga")
        insert("76d8ac6b-0162-4dfe-960d-d5bcb9d77b28", "2903706", "Boa Nova")
        insert("eb14dfe7-470b-4bf6-8d9b-78a85a562096", "2903805", "Boa Vista do Tupim")
        insert("f541bf72-0eef-4e53-ad5f-6e9e825cfbe5", "2903904", "Bom Jesus da Lapa")
        insert("3018ec35-5f06-4147-920c-2ff3a5aa7482", "2903953", "Bom Jesus da Serra")
        insert("947e32d2-4fd0-41b6-b206-725d0d641d0c", "2904001", "Boninal")
        insert("e3dd166b-d22d-4a04-97f1-8624766879b4", "2904050", "Bonito")
        insert("80d50004-ae65-4607-b5f7-b3c26fe2c585", "2904100", "Boquira")
        insert("69b9cdcd-64ac-4660-8b3e-a4503cec1c57", "2904209", "Botuporã")
        insert("e72248a3-5cb5-42f1-b403-7c6413c04094", "2904308", "Brejões")
        insert("70a434c5-a012-4665-a80c-fef0a09311c7", "2904407", "Brejolândia")
        insert("f62f1b6e-be59-42f5-95d7-1944264e9d65", "2904506", "Brotas de Macaúbas")
        insert("89bb6d4c-e05c-444a-90cb-3201d6836006", "2904605", "Brumado")
        insert("762785fd-e2f5-4775-857d-e5b24b1c1add", "2904704", "Buerarema")
        insert("c67e71a7-7ba3-4138-bfa2-aec86341ca39", "2904753", "Buritirama")
        insert("64d613cd-726b-4262-83ec-59246f03c101", "2904803", "Caatiba")
        insert("fc54910a-2e42-42da-982d-0c38aeda9a06", "2904852", "Cabaceiras do Paraguaçu")
        insert("3c8fb8cb-e9fa-4d3a-92cc-1f8dc089e237", "2904902", "Cachoeira")
        insert("37f1ce4a-c781-43db-b71f-c9aff193e4bf", "2905008", "Caculé")
        insert("fce84e50-1544-4f60-854a-8501d0d2491e", "2905107", "Caém")
        insert("f9918e92-20a8-4770-af50-744a514655f5", "2905156", "Caetanos")
        insert("ad2ce492-6d4c-4793-b476-67e2f99a6e67", "2905206", "Caetité")
        insert("fe175f39-ca2c-44c6-841e-79ec07b8e8a1", "2905305", "Cafarnaum")
        insert("ce97a79a-0190-4286-8bd7-2cb7fcdb60db", "2905404", "Cairu")
        insert("c3d208a5-2f40-4399-bf73-88b403006896", "2905503", "Caldeirão Grande")
        insert("ecff169f-22ff-4f5a-a2c3-f91df641fd80", "2905602", "Camacan")
        insert("bddd7b12-09c4-4b6b-b9db-ee6f2b6448b1", "2905701", "Camaçari")
        insert("aac505e9-58ce-4b41-8473-1c1cefc9e249", "2905800", "Camamu")
        insert("efe3b71d-0a02-487c-81d0-77a1c410e40e", "2905909", "Campo Alegre de Lourdes")
        insert("41b86f13-508a-44f1-bd79-f87e46776f23", "2906006", "Campo Formoso")
        insert("81b3a183-e56a-4a5e-90e8-23669dfcbc64", "2906105", "Canápolis")
        insert("2d2e7a75-6371-45b4-8517-e399190e5cbb", "2906204", "Canarana")
        insert("b28d7b46-ea29-441e-b5b0-bed21a6a6ec0", "2906303", "Canavieiras")
        insert("af6e76a0-94a1-4fbb-ba7b-096d9c2fff00", "2906402", "Candeal")
        insert("7bbd2ee2-c463-42b1-9a76-276ba8045e9f", "2906501", "Candeias")
        insert("f496802a-ec74-4c50-bfa5-b726f251ffa1", "2906600", "Candiba")
        insert("714f65ed-6457-4c3d-9ec4-9fc85db4967b", "2906709", "Cândido Sales")
        insert("7f2610dd-84ef-4d86-82ca-214498322150", "2906808", "Cansanção")
        insert("58e4ad4a-7c07-49ab-acce-1bff35993740", "2906824", "Canudos")
        insert("8d1ebe86-1866-44a1-9f04-6d944224e4e0", "2906857", "Capela do Alto Alegre")
        insert("4249dbcd-914e-43a6-9b09-30c684568caa", "2906873", "Capim Grosso")
        insert("5caa196d-2403-4058-8e73-7545983917c8", "2906899", "Caraíbas")
        insert("88df288d-c119-45af-83fa-3020edec2bbb", "2906907", "Caravelas")
        insert("7b5ec33a-03d9-4a22-b2af-208072dba3c5", "2907004", "Cardeal da Silva")
        insert("5dffcf33-623c-4935-bfc3-edaba1683af7", "2907103", "Carinhanha")
        insert("e768c0c0-87a1-4853-87ef-789bd0c8565b", "2907202", "Casa Nova")
        insert("ef9f8513-5fe8-42e3-bb54-5555aac7dd0b", "2907301", "Castro Alves")
        insert("425ec0c7-d825-42cf-a40e-840e5524eb85", "2907400", "Catolândia")
        insert("f9d7047c-82b7-4055-866d-f308c2244d1d", "2907509", "Catu")
        insert("c1c483e0-23c4-4fca-8d99-5b3059313f5a", "2907558", "Caturama")
        insert("f684a421-f80d-4b79-9df6-4002feb6445d", "2907608", "Central")
        insert("912a654c-b65d-4489-9890-efc8e722237d", "2907707", "Chorrochó")
        insert("128f6470-7269-485d-bd11-d86f22c81493", "2907806", "Cícero Dantas")
        insert("916cb913-aa62-411a-8ec2-badaf28d8525", "2907905", "Cipó")
        insert("f5c979c3-ef06-4dcc-9ef5-c0b99070a2e9", "2908002", "Coaraci")
        insert("9efd3c76-1c43-4fd1-bd02-bfe2e8f98f69", "2908101", "Cocos")
        insert("9015d2f6-80c9-48ec-98ed-0c042eb4c265", "2908200", "Conceição da Feira")
        insert("de06cbbc-50d7-4fcb-915f-95fcf31cb6ce", "2908309", "Conceição do Almeida")
        insert("0847a264-47eb-4866-84a9-f17a8140e7c6", "2908408", "Conceição do Coité")
        insert("3e7bf99e-f92b-4efd-8fbb-3ea335d38d5b", "2908507", "Conceição do Jacuípe")
        insert("b901462b-eb47-400a-9849-e3239e184943", "2908606", "Conde")
        insert("ed1b8d5f-4b22-4862-8964-7daeb8440095", "2908705", "Condeúba")
        insert("eebe714a-c8eb-4528-87dd-c57f98b5bb2b", "2908804", "Contendas do Sincorá")
        insert("eb7d80b2-059e-4685-8ed3-a467986f77eb", "2908903", "Coração de Maria")
        insert("1b2c638d-c6f8-4711-975a-226893fc4ebc", "2909000", "Cordeiros")
        insert("610d003c-5a17-4251-96de-801ff5d5a06d", "2909109", "Coribe")
        insert("fa43dafa-816f-4b38-94c5-22792fe4f76d", "2909208", "Coronel João Sá")
        insert("5995f49e-394f-461a-be37-4a1faf03747e", "2909307", "Correntina")
        insert("4f7bb19b-965f-49f7-9698-636c12b46cdf", "2909406", "Cotegipe")
        insert("d9ae4216-eb2a-402a-aa6b-cf6790c62b94", "2909505", "Cravolândia")
        insert("8e1f2f6e-a363-4a24-9f47-d7cea11efada", "2909604", "Crisópolis")
        insert("9ac3414e-1a4f-48f0-92fd-b578ec48ea14", "2909703", "Cristópolis")
        insert("84673aeb-99ee-4bb2-a8b3-39f00d046415", "2909802", "Cruz das Almas")
        insert("eee8e045-ca87-487e-9c40-1a8d3d32e99c", "2909901", "Curaçá")
        insert("c6108005-5b53-4a12-baeb-76f98afc4cf8", "2910008", "Dário Meira")
        insert("edbd9392-15de-43bd-890d-9234022c5f9a", "2910057", "Dias d'Ávila")
        insert("66bdbf17-dca1-423a-a283-c9cf04f88b8a", "2910107", "Dom Basílio")
        insert("3b8aeeed-6374-4720-8116-484f16ddb9c4", "2910206", "Dom Macedo Costa")
        insert("16918b62-4902-4330-8913-0835a6d7d096", "2910305", "Elísio Medrado")
        insert("1c18b798-46de-4ab9-8600-0e326ecfb30f", "2910404", "Encruzilhada")
        insert("873a4e74-b058-413d-91fd-103e699ace9e", "2910503", "Entre Rios")
        insert("68671139-656d-4c3c-8a6b-f7bc28ef91aa", "2910602", "Esplanada")
        insert("49099571-a7f0-4e24-a9a1-326b2977ec5c", "2910701", "Euclides da Cunha")
        insert("36e9c181-561f-43bc-bf40-3ea0f9d58e8f", "2910727", "Eunápolis")
        insert("1c927f01-c331-49ef-a929-f219778482d9", "2910750", "Fátima")
        insert("03f22c92-e716-42e7-b811-ab4e323fc0b0", "2910776", "Feira da Mata")
        insert("dfc8b5a7-9c89-443b-afc0-c37e260f6e62", "2910800", "Feira de Santana")
        insert("b6f55d36-4031-4fba-971f-fb81f6e05491", "2910859", "Filadélfia")
        insert("f3fa4a5b-8192-4ae5-91ab-42eec0a95b2f", "2910909", "Firmino Alves")
        insert("219f39ff-ca92-4bb7-88cc-e4d74eb4eb8e", "2911006", "Floresta Azul")
        insert("5291c008-0405-499f-90e6-2823db7cf47c", "2911105", "Formosa do Rio Preto")
        insert("9a8c9619-e253-41e3-a20c-a040653e8eb2", "2911204", "Gandu")
        insert("bcd3d5ee-f708-4786-af5c-20bb25f9b276", "2911253", "Gavião")
        insert("df7e1c67-0ce3-4dfb-8f6b-c2a8f2c6d592", "2911303", "Gentio do Ouro")
        insert("d9581743-e44f-4867-8d56-fa22d7846855", "2911402", "Glória")
        insert("63712879-0ba6-4fa7-8d81-2114c25d76e9", "2911501", "Gongogi")
        insert("62f21011-0f37-4040-85fe-3e63a6692599", "2911600", "Governador Mangabeira")
        insert("ac23dd68-e6ec-4b16-ba17-c97068a67896", "2911659", "Guajeru")
        insert("3e5a732c-4f1d-4d4f-8eb7-558ee2259b72", "2911709", "Guanambi")
        insert("30283ee2-2cee-4221-8071-ad354ca3ed91", "2911808", "Guaratinga")
        insert("d6ad5051-db5d-40cc-98b0-5408b66f2cf2", "2911857", "Heliópolis")
        insert("d464684e-4e0b-4cce-ac87-1c95096c1c05", "2911907", "Iaçu")
        insert("53188631-b7a3-4713-a899-b8e4ef85562d", "2912004", "Ibiassucê")
        insert("daefa1bb-f818-469f-ae43-48df72df7129", "2912103", "Ibicaraí")
        insert("579959a7-c7a9-40ce-88a9-fbefc778aeaa", "2912202", "Ibicoara")
        insert("3115d629-1ea8-4f2e-bbff-3fa21a3bca71", "2912301", "Ibicuí")
        insert("0a7714a4-b7b3-4539-b4e3-64804cd9beaa", "2912400", "Ibipeba")
        insert("35fcc297-f582-471d-97cc-0494798a89d1", "2912509", "Ibipitanga")
        insert("8999d045-b653-40bb-85ab-fbf3e66c2de9", "2912608", "Ibiquera")
        insert("ea6b7bb3-4ed9-40aa-a0bf-22e71fd49507", "2912707", "Ibirapitanga")
        insert("35afe7cc-cee3-4968-886b-ba7a2c9862f4", "2912806", "Ibirapuã")
        insert("6f0f3c84-5ce2-42a0-9057-6de9893f3fc7", "2912905", "Ibirataia")
        insert("acc2f010-a1bd-4b86-bb85-bbf917bae72c", "2913002", "Ibitiara")
        insert("9d15e540-b36e-4ce3-8e01-6b9c8652c1b4", "2913101", "Ibititá")
        insert("069c56a8-93b0-46b4-8814-f2502b14f09a", "2913200", "Ibotirama")
        insert("9d6628fc-0ae9-4ba4-9114-662fd6af55dd", "2913309", "Ichu")
        insert("e0d027bd-7fd1-42d1-8aec-a4f09c0c6d62", "2913408", "Igaporã")
        insert("d84bd619-e3ef-4422-9b4d-08a83c555b1b", "2913457", "Igrapiúna")
        insert("98cdbd7e-ae0c-440f-b1c9-d2a113f9c003", "2913507", "Iguaí")
        insert("f16de7b2-c2dc-49fd-bc56-dca237140b8d", "2913606", "Ilhéus")
        insert("83f9acd9-b6c4-4c8c-811b-b1dccf8ca7c1", "2913705", "Inhambupe")
        insert("e24bc441-8816-4fad-a222-5d31e040734c", "2913804", "Ipecaetá")
        insert("c95e4794-83bb-41bf-98d7-ae2e3583c86c", "2913903", "Ipiaú")
        insert("9cdf2414-3f3c-4a2e-b772-242511a27f89", "2914000", "Ipirá")
        insert("e2e8c7cc-b4ee-4ced-b54c-74ad4ad50e1b", "2914109", "Ipupiara")
        insert("d40ed861-1a8c-4c0b-abd6-14b28dc62f3b", "2914208", "Irajuba")
        insert("093fcb66-2d51-4487-be28-a199ac128c73", "2914307", "Iramaia")
        insert("7236a36f-1229-4ab9-91ca-0ee50ca62abd", "2914406", "Iraquara")
        insert("9935a04b-3a79-4164-959c-487d47eade53", "2914505", "Irará")
        insert("f53cef09-a61a-42e3-abf8-382d821d503c", "2914604", "Irecê")
        insert("e7cd64dd-2e15-4623-aba8-bea5dfde1736", "2914653", "Itabela")
        insert("d1e09f20-e1d1-4ae5-89dd-a4aeca5b2bab", "2914703", "Itaberaba")
        insert("01f38db4-d288-442a-aa19-56b9c8265a49", "2914802", "Itabuna")
        insert("624d9d91-b138-4c13-b7d1-3a76aeafdf5a", "2914901", "Itacaré")
        insert("a253cefd-9a25-4b97-b72a-00a7c139c54f", "2915007", "Itaeté")
        insert("b7ea4db3-1531-4b79-862b-14237d9983a5", "2915106", "Itagi")
        insert("bf5e981f-5fd3-4472-bb46-416526ffb451", "2915205", "Itagibá")
        insert("b5c41ff7-b0bb-4f31-8352-5459536f248f", "2915304", "Itagimirim")
        insert("bcf4a930-023e-4e77-b100-df0f2057c5c0", "2915353", "Itaguaçu da Bahia")
        insert("492b9253-c7e6-4b3c-a821-3ce5f542a34a", "2915403", "Itaju do Colônia")
        insert("09dba5b3-cb81-4e71-be03-2ee51b49f902", "2915502", "Itajuípe")
        insert("f4a25738-4c29-4997-9058-175301999300", "2915601", "Itamaraju")
        insert("0e6e9956-9c9f-4dcf-b55f-f678ab31a46e", "2915700", "Itamari")
        insert("981d95ee-aa89-4b2a-a3a5-6b175f6717f7", "2915809", "Itambé")
        insert("142651c2-aad7-497d-93f4-e47884469d89", "2915908", "Itanagra")
        insert("dfacdce6-5bb8-4b05-9b23-9bdb12f8e5ed", "2916005", "Itanhém")
        insert("403870b6-8738-4366-a59b-e7929ba4711b", "2916104", "Itaparica")
        insert("87ceb420-396d-4131-81e2-216191c55233", "2916203", "Itapé")
        insert("5eae9eb7-5263-4802-8dae-a6ac8080dbdd", "2916302", "Itapebi")
        insert("98fd90f9-228b-483a-bfb6-02d161d9e06d", "2916401", "Itapetinga")
        insert("fe4d6643-8056-48bb-95c4-93127289ba13", "2916500", "Itapicuru")
        insert("a5d973d7-dab9-492b-96e4-a91cceea2338", "2916609", "Itapitanga")
        insert("6628ba4b-ef18-4aec-a5c4-e664ec666363", "2916708", "Itaquara")
        insert("ea771f82-b5a5-43e5-a452-892e287c008d", "2916807", "Itarantim")
        insert("fb22543f-9e00-4e05-95a0-b28675534efb", "2916856", "Itatim")
        insert("8494fd6b-b9db-4f8a-b987-d74cbbdfbe4e", "2916906", "Itiruçu")
        insert("ef6fee98-d458-4486-b1c9-14178c8b5322", "2917003", "Itiúba")
        insert("ec0dc64b-a921-418f-a5e3-19723063588c", "2917102", "Itororó")
        insert("1acaba27-cd55-413b-903b-2e120e9ab28f", "2917201", "Ituaçu")
        insert("9e481288-8dd3-44f7-ac4e-d781a89ba3cb", "2917300", "Ituberá")
        insert("21f7af42-951b-496d-aed7-2f720629e871", "2917334", "Iuiu")
        insert("238f0096-5d47-47af-aa06-1fb8698b36a2", "2917359", "Jaborandi")
        insert("ac38214a-0d6e-42a5-9b8c-c07305d72d67", "2917409", "Jacaraci")
        insert("f5121f7c-cd0e-4e22-aa72-e80c8db52d44", "2917508", "Jacobina")
        insert("d75f156b-d93e-4a65-8674-48a836bfeb7b", "2917607", "Jaguaquara")
        insert("18a6fb10-d0dc-40f3-b712-170ee7729d5e", "2917706", "Jaguarari")
        insert("cb547e7f-9b70-4a60-be4f-ea87fe2eaf96", "2917805", "Jaguaripe")
        insert("239dca43-4023-40a4-a8a1-693d56e5a952", "2917904", "Jandaíra")
        insert("afc6a523-1845-4fd3-840a-e0799887ddc2", "2918001", "Jequié")
        insert("d7196dd2-826e-433c-b095-27bf47ad2003", "2918100", "Jeremoabo")
        insert("ca975c67-5945-4e2d-9911-8d483dfc360b", "2918209", "Jiquiriçá")
        insert("21cc3bc2-fac1-4ae8-90fa-86552f0e3e69", "2918308", "Jitaúna")
        insert("f92303ce-c097-49f1-80b5-6c7b7ab98ad8", "2918357", "João Dourado")
        insert("61107192-af87-4194-a1c5-c3a6e817c08a", "2918407", "Juazeiro")
        insert("21706cbb-c92a-43d2-ac60-25796ab5dcd4", "2918456", "Jucuruçu")
        insert("ee86caf2-13c1-49b7-b130-cfc5e0567443", "2918506", "Jussara")
        insert("decbe50c-8ca8-4c73-b5fd-78e568a022ed", "2918555", "Jussari")
        insert("41d05af1-d740-4576-a970-7d1775e60f12", "2918605", "Jussiape")
        insert("3114b401-d861-4c8b-b1dc-a4d37ff6d6d8", "2918704", "Lafaiete Coutinho")
        insert("d860e663-990a-4cfa-ad55-a8aa0cff6f16", "2918753", "Lagoa Real")
        insert("361292e1-e51c-40db-86bc-95db5ddf2733", "2918803", "Laje")
        insert("af9925e2-468c-4aa9-bf3a-329daa7e17a6", "2918902", "Lajedão")
        insert("4e3273ba-7d37-474c-9486-fafaddab754a", "2919009", "Lajedinho")
        insert("90059697-0558-4b9b-b4cb-ffe133257a7c", "2919058", "Lajedo do Tabocal")
        insert("f9422b3a-aca3-467c-a7b0-cf25e1eead67", "2919108", "Lamarão")
        insert("49ad531b-0dec-48ca-add2-ed05e9a02c70", "2919157", "Lapão")
        insert("28e0b2b0-0301-480c-8edd-3e31ae986d39", "2919207", "Lauro de Freitas")
        insert("ed107f8d-1df8-4e25-9801-7bbfe0e442c8", "2919306", "Lençóis")
        insert("54eda568-b84f-406e-aec1-4e7f486c161c", "2919405", "Licínio de Almeida")
        insert("cc3fefae-7f2e-4365-93ec-52fb5538ddf8", "2919504", "Livramento de Nossa Senhora")
        insert("5d72277e-a02f-4ba6-82ce-86927880cc89", "2919553", "Luís Eduardo Magalhães")
        insert("0a3b2272-aae2-46cc-99f8-c96c911a0254", "2919603", "Macajuba")
        insert("439135b1-16d4-4b18-a8f3-af53f4563c0f", "2919702", "Macarani")
        insert("f0a45d1a-27a9-4efb-9e9b-a173859e0934", "2919801", "Macaúbas")
        insert("faf4fc96-586d-4ae4-a56c-74c219f326a5", "2919900", "Macururé")
        insert("907b2b23-3de3-4372-bfa7-b7c3164f317e", "2919926", "Madre de Deus")
        insert("f103aec9-a287-443c-b002-460a0e03f8fd", "2919959", "Maetinga")
        insert("4785e121-d24c-4b30-9655-0641d5010fa8", "2920007", "Maiquinique")
        insert("d0d92539-fd8e-4e7e-bf7e-12014dade5e2", "2920106", "Mairi")
        insert("6e3e97d6-51e5-4924-8618-55f43048fce1", "2920205", "Malhada")
        insert("b3f25c14-c210-41f2-ab2b-a785296f6157", "2920304", "Malhada de Pedras")
        insert("f58790c6-d774-4b25-9a4b-ea773d11c444", "2920403", "Manoel Vitorino")
        insert("5b72c1fd-871b-4c06-8e5b-f65b3ccca611", "2920452", "Mansidão")
        insert("0fe0436d-0a0c-455a-a3fb-adfe18dd9d09", "2920502", "Maracás")
        insert("984ba485-abc1-4d20-be05-813a6bc92ae6", "2920601", "Maragogipe")
        insert("bd07f5a8-ccd7-49aa-b75e-442eeeee5ffa", "2920700", "Maraú")
        insert("01aa12a6-c536-4d00-bd18-acc4803b279b", "2920809", "Marcionílio Souza")
        insert("f9cc41f7-2b41-4f5a-a62f-e6d1be622773", "2920908", "Mascote")
        insert("b6cd32d7-45dd-4c7f-9d05-95ee6922a2fb", "2921005", "Mata de São João")
        insert("040ebd9c-72c4-42c6-8e3e-c82a4b65be38", "2921054", "Matina")
        insert("9834409d-b0ff-471e-a222-ed3606dbc727", "2921104", "Medeiros Neto")
        insert("473491fd-f14c-4d57-bcf3-35f05a31d221", "2921203", "Miguel Calmon")
        insert("bbd4225a-2ec0-48b3-93db-d9a122a1055b", "2921302", "Milagres")
        insert("ddea8a32-d38e-4d64-b232-d68a0bb98458", "2921401", "Mirangaba")
        insert("87325cd4-e16e-49fc-ac2b-3a28b8bd6d34", "2921450", "Mirante")
        insert("06784a63-95a6-4a6a-bcc4-c62c226c1cd2", "2921500", "Monte Santo")
        insert("42d46956-4ed1-4346-a04e-5161fd036ca6", "2921609", "Morpará")
        insert("5f0be55a-ce7d-49b6-9f99-09508a88ad24", "2921708", "Morro do Chapéu")
        insert("7631d66d-b7bb-4fd3-970a-f437f8675f5f", "2921807", "Mortugaba")
        insert("b81b2ba0-466c-4eef-8786-2cc2ddd55fae", "2921906", "Mucugê")
        insert("d22ee74c-0618-4fc7-b248-fe471df6aab6", "2922003", "Mucuri")
        insert("a18b5f49-6d1f-46a0-b9e6-28ec8392d01d", "2922052", "Mulungu do Morro")
        insert("5220eb9c-f9ae-4677-aad6-084163a4a6b2", "2922102", "Mundo Novo")
        insert("7eaa4b65-b5f2-4a1a-b31f-64c9218d01f4", "2922201", "Muniz Ferreira")
        insert("4fc66a63-7bc6-4fd2-93e6-f94961c140b1", "2922250", "Muquém do São Francisco")
        insert("2f4d7326-9fc1-49a4-b9ad-d4e4298b9778", "2922300", "Muritiba")
        insert("f7db361a-813f-4276-b377-bd3d699156da", "2922409", "Mutuípe")
        insert("417499bc-0063-4aa9-9488-7e85e51702ee", "2922508", "Nazaré")
        insert("13fd411a-7f5d-482f-853b-129eb0502038", "2922607", "Nilo Peçanha")
        insert("66c06d0d-34b9-4954-a22d-8f3cd41894be", "2922656", "Nordestina")
        insert("3f9e1cf8-a7b3-43b7-8302-56846e455e1c", "2922706", "Nova Canaã")
        insert("3bc4b192-d954-4e27-a88e-967e62f97ff1", "2922730", "Nova Fátima")
        insert("a8f3efc3-b45a-4566-a85f-eb8408814523", "2922755", "Nova Ibiá")
        insert("d18e344d-1a5d-4b5b-9d52-240fa5cbf06b", "2922805", "Nova Itarana")
        insert("1f37aab3-59ed-4c39-be27-69fb5971c719", "2922854", "Nova Redenção")
        insert("5199df2a-145e-4ca0-a904-48ec96546fa9", "2922904", "Nova Soure")
        insert("ef1018bc-90d5-4a97-b495-03052cc5d1aa", "2923001", "Nova Viçosa")
        insert("f68fd595-5568-44ee-b53d-bd0d86a22621", "2923035", "Novo Horizonte")
        insert("f7c780c6-521a-49d3-a6fe-61742a4ec3f9", "2923050", "Novo Triunfo")
        insert("7e632caa-e023-44bb-bb53-556addb19197", "2923100", "Olindina")
        insert("bb2c5cd8-327b-43ff-b97b-c9dfbce60e04", "2923209", "Oliveira dos Brejinhos")
        insert("872907df-5b3a-490a-8933-f2791edcb352", "2923308", "Ouriçangas")
        insert("35afb495-bd59-4301-8d97-3a3dc3f49ced", "2923357", "Ourolândia")
        insert("3861d976-b7a6-4aab-9eb3-4693d9cfdc16", "2923407", "Palmas de Monte Alto")
        insert("19d9bd21-be7b-476c-8268-7dc7b99ce9af", "2923506", "Palmeiras")
        insert("6b206af0-4056-4a45-b4de-9be31478f49b", "2923605", "Paramirim")
        insert("108fce0d-9b8f-4d0f-9947-012915008302", "2923704", "Paratinga")
        insert("021c8253-1fea-4d16-a36f-2a6bd6087ca8", "2923803", "Paripiranga")
        insert("c0d2c440-a2aa-4553-84c2-e8ef2580a638", "2923902", "Pau Brasil")
        insert("80f3bbb9-bc96-4203-886f-75abaa9c4972", "2924009", "Paulo Afonso")
        insert("8a009682-4ede-45fb-b954-259c0feeffb5", "2924058", "Pé de Serra")
        insert("5d691c26-ffa2-4307-b986-29b78e272c9e", "2924108", "Pedrão")
        insert("ce5b52cd-362f-448e-81c6-29d009a4cdb5", "2924207", "Pedro Alexandre")
        insert("9118779b-00dd-4791-a835-0b090d2d8317", "2924306", "Piatã")
        insert("01409ac4-21c2-42f7-99e6-f89e05f83ddc", "2924405", "Pilão Arcado")
        insert("fc569f71-ac71-4b3c-92d7-c447be84e77a", "2924504", "Pindaí")
        insert("d7668e02-b5ce-404c-b461-6e8495054d08", "2924603", "Pindobaçu")
        insert("9e7f50a2-ec8e-44cb-a1f1-edcb5b6624ae", "2924652", "Pintadas")
        insert("973ae7f8-960b-4ab9-832a-db3b078bb7e9", "2924678", "Piraí do Norte")
        insert("e9cfc29c-5f6b-41c2-b2a5-8f2b03623b14", "2924702", "Piripá")
        insert("be38b601-a6f6-42de-9023-68a2ffb4f97a", "2924801", "Piritiba")
        insert("04d9d903-b251-44eb-b213-a8e8590b2c9f", "2924900", "Planaltino")
        insert("19156bbf-0e41-46a8-896b-3aa521e83e81", "2925006", "Planalto")
        insert("984dad03-6924-4e2a-8569-9289f0851240", "2925105", "Poções")
        insert("a615eaa9-4716-40dc-8792-18045ffc38f4", "2925204", "Pojuca")
        insert("33ae9282-14b9-454c-aba2-aa1d128bceeb", "2925253", "Ponto Novo")
        insert("42a7bbce-7397-47d4-99f1-d696b643dd9b", "2925303", "Porto Seguro")
        insert("5c040778-be6f-422e-b374-570baf40b216", "2925402", "Potiraguá")
        insert("808697e2-088c-492b-8eea-a41976b9cead", "2925501", "Prado")
        insert("28f2d78f-6eaf-415e-8c6a-15fc03d408ab", "2925600", "Presidente Dutra")
        insert("c0b9931d-50f7-4759-bf5b-eb4e0e6479ee", "2925709", "Presidente Jânio Quadros")
        insert("9cb51efc-8905-43e2-ae74-ebd5deac553a", "2925758", "Presidente Tancredo Neves")
        insert("aa7fe342-74d2-4540-9427-7d859aaf5104", "2925808", "Queimadas")
        insert("d9d9178c-cf7b-4946-9316-0d6d2145102d", "2925907", "Quijingue")
        insert("a80ca7e5-01c5-400d-84db-40f4f7c712a6", "2925931", "Quixabeira")
        insert("5b68db54-7f4d-4f09-b909-e486998a184c", "2925956", "Rafael Jambeiro")
        insert("3a092bb4-77cd-4801-8103-a196bbb06ca4", "2926004", "Remanso")
        insert("f0af5a05-8dec-476f-a3df-2472b78c67d9", "2926103", "Retirolândia")
        insert("37b2330c-473d-475d-9fd6-9119b1539e47", "2926202", "Riachão das Neves")
        insert("79eef490-ba38-4714-b9e6-af641680d5d2", "2926301", "Riachão do Jacuípe")
        insert("84a8ae7c-fb16-4dd5-97d1-dabfe883a017", "2926400", "Riacho de Santana")
        insert("20466ada-7b93-4aea-85db-632d36cdb98a", "2926509", "Ribeira do Amparo")
        insert("ab4c6eb8-9ccb-482b-8070-a82f54dab919", "2926608", "Ribeira do Pombal")
        insert("62d938c2-99ed-429b-bcda-f92883767205", "2926657", "Ribeirão do Largo")
        insert("f0efcd84-31f1-4b7a-9b49-1a23c70d2872", "2926707", "Rio de Contas")
        insert("163d0dcf-c0ad-452a-b849-3e08f0cabba0", "2926806", "Rio do Antônio")
        insert("23244270-b89f-42ef-b4bf-b4c206bc28a1", "2926905", "Rio do Pires")
        insert("a983bc19-e2a5-49f3-8d28-42bfcf7f1e1d", "2927002", "Rio Real")
        insert("b86c40fb-648c-496b-af53-7cdb91927a3b", "2927101", "Rodelas")
        insert("343f0c54-75af-45c4-a236-f5efa1062cb2", "2927200", "Ruy Barbosa")
        insert("20000b59-3234-485f-bd74-7fc56af68470", "2927309", "Salinas da Margarida")
        insert("9503d05e-9ae7-41c7-afcb-2381acac4407", "2927408", "Salvador")
        insert("88cc9c34-9079-421b-8238-d7ba38bbcf98", "2927507", "Santa Bárbara")
        insert("d551ed6b-9516-48c9-8d49-7ac50d7215ca", "2927606", "Santa Brígida")
        insert("1ee4afef-8dce-4d5d-aca8-b26b26f1b78e", "2927705", "Santa Cruz Cabrália")
        insert("da178f6f-ce3f-4c07-9593-7a0803fe14a6", "2927804", "Santa Cruz da Vitória")
        insert("ff4546a9-cccd-4db9-91f3-196b5f59a48c", "2927903", "Santa Inês")
        insert("c137c767-bc4c-4f94-bc1b-95f065925d83", "2928000", "Santaluz")
        insert("ff238bbc-d80c-4cfb-80b0-130a514ea97c", "2928059", "Santa Luzia")
        insert("dfb0d401-0ab1-4741-9f34-c0be65985447", "2928109", "Santa Maria da Vitória")
        insert("392cdc3c-6afe-43e9-953c-af1a0a9dfd75", "2928208", "Santana")
        insert("e4a2b350-4fe2-47af-b04b-78779ec8d864", "2928307", "Santanópolis")
        insert("8c068869-cb20-4801-9a21-b0e95642087a", "2928406", "Santa Rita de Cássia")
        insert("26460b5e-911a-4d00-91a0-4b6f6ddf38ac", "2928505", "Santa Terezinha")
        insert("ae2a2c0a-e2fb-4db4-8c8d-0b432e2de578", "2928604", "Santo Amaro")
        insert("368eb8f6-59c8-43c6-8278-66b64165d5ae", "2928703", "Santo Antônio de Jesus")
        insert("779cdbfe-f087-4781-9dd5-5cff5d421375", "2928802", "Santo Estêvão")
        insert("c6d21bc5-bf68-4e57-9ef4-cdf5985c3298", "2928901", "São Desidério")
        insert("68763998-f487-49dc-bcd1-eb9134f1451e", "2928950", "São Domingos")
        insert("f810fe69-44a8-4e19-839e-634931af17b6", "2929008", "São Félix")
        insert("91b37ae3-db54-48c1-b49e-2639afa65510", "2929057", "São Félix do Coribe")
        insert("dae0b62f-c690-40ea-8e32-3c5c4c3fde71", "2929107", "São Felipe")
        insert("b5fe3529-8e6d-4a13-a740-d10aa80dc3f8", "2929206", "São Francisco do Conde")
        insert("8a7ef075-c34b-45c7-9440-3a89857e2338", "2929255", "São Gabriel")
        insert("c69e7636-cc5c-4696-911d-36922765f0b4", "2929305", "São Gonçalo dos Campos")
        insert("ccf2302e-0115-4c45-8962-8e9dd046d6b8", "2929354", "São José da Vitória")
        insert("7d302edd-f7dd-4d17-87ef-da2d80c7b36d", "2929370", "São José do Jacuípe")
        insert("c81e4bda-e201-4ac8-89bc-094387ac893a", "2929404", "São Miguel das Matas")
        insert("30343230-7651-4ca0-9303-1219dd0a44ef", "2929503", "São Sebastião do Passé")
        insert("b077b9ba-3c14-4a85-b170-b47095341145", "2929602", "Sapeaçu")
        insert("4e93c745-edf0-475b-a2c5-5eefc8b79825", "2929701", "Sátiro Dias")
        insert("e760cf96-01c7-4eaf-bc74-439bc6d62072", "2929750", "Saubara")
        insert("d1363ee8-5da4-42a8-8551-08f46234808e", "2929800", "Saúde")
        insert("7db72d04-dd24-4663-8cb2-ff4c77ed6657", "2929909", "Seabra")
        insert("ae4a9f57-415e-49c4-b5a9-be3d57123a06", "2930006", "Sebastião Laranjeiras")
        insert("d6cf705e-cfac-4655-b312-24cc628522ce", "2930105", "Senhor do Bonfim")
        insert("22848081-68a1-4ed9-9e96-2b4d3282b89a", "2930154", "Serra do Ramalho")
        insert("c9e0426b-a3dd-4bb5-95d6-958e7f8897da", "2930204", "Sento Sé")
        insert("8fd433eb-599b-4d86-ab3c-9f97395dd8ba", "2930303", "Serra Dourada")
        insert("73b18e3e-c5c5-4627-84fd-f8a7ade2a79d", "2930402", "Serra Preta")
        insert("20bbcbd0-7425-4730-8ce7-0cdb2576ea9a", "2930501", "Serrinha")
        insert("d2e23f63-7a42-4130-93c8-674da896567c", "2930600", "Serrolândia")
        insert("4c756006-054b-455d-8e83-d36f1d96665c", "2930709", "Simões Filho")
        insert("469b6706-409c-4a98-8bc2-1a01888ee864", "2930758", "Sítio do Mato")
        insert("edc46135-cbe1-4cd9-97b8-fe218b213f72", "2930766", "Sítio do Quinto")
        insert("c6e1be2a-bca7-40df-b98d-bdc85c145444", "2930774", "Sobradinho")
        insert("413072d7-f7b1-49f9-a1c5-267c6469cec6", "2930808", "Souto Soares")
        insert("f9148a8c-e19a-4084-9333-1b7e215d0b60", "2930907", "Tabocas do Brejo Velho")
        insert("9b43324a-461c-475e-9364-f9ffe57b3581", "2931004", "Tanhaçu")
        insert("2d0ec030-0e7c-4693-ab12-6a46f3122a63", "2931053", "Tanque Novo")
        insert("12ca5e53-ef14-41b4-9509-5e413cd806e7", "2931103", "Tanquinho")
        insert("c233515d-0d59-46da-a7aa-440230807cfe", "2931202", "Taperoá")
        insert("a9033392-30ef-4d58-8059-43b8525582aa", "2931301", "Tapiramutá")
        insert("a620aaee-bd9f-4251-9914-dcd7d075dca9", "2931350", "Teixeira de Freitas")
        insert("68f958bb-6d08-41f9-b306-7b970df17188", "2931400", "Teodoro Sampaio")
        insert("4bb979f3-52b6-4d8e-b877-fd80ccd3334f", "2931509", "Teofilândia")
        insert("fa1d97a7-fbf9-403c-a61e-b7a089e96b4f", "2931608", "Teolândia")
        insert("e6c4da75-4c14-4d53-86dd-90ca9ed7ccd1", "2931707", "Terra Nova")
        insert("eda4ce05-514a-442a-9777-07daf3197a11", "2931806", "Tremedal")
        insert("e46e529b-f075-4dfe-a499-33f4900423f3", "2931905", "Tucano")
        insert("4de853c5-fbe5-457b-8f95-c4602b8b6d60", "2932002", "Uauá")
        insert("1a458acc-3b5a-4ae7-931d-0a0e174b7677", "2932101", "Ubaíra")
        insert("723296b8-5e98-49aa-90f8-a4be82bffb9a", "2932200", "Ubaitaba")
        insert("83b0059c-b8d4-4abd-86d3-57dcba583fe5", "2932309", "Ubatã")
        insert("b2e0ad08-5a47-4f38-8e1f-87cffac1c990", "2932408", "Uibaí")
        insert("3f6c8f70-f15d-42d3-9e05-fecc067a2aa7", "2932457", "Umburanas")
        insert("5a56f9b1-91dc-42d0-9c79-b85b7866c6d9", "2932507", "Una")
        insert("3ab58fd5-5d07-438b-ab5e-54c5d87d95ec", "2932606", "Urandi")
        insert("380474af-1988-4278-973a-c0bc86c2686e", "2932705", "Uruçuca")
        insert("2f94925f-2e77-4f83-92d0-43449a08a14d", "2932804", "Utinga")
        insert("575ddb1e-a6d3-446e-8aac-c608062c782a", "2932903", "Valença")
        insert("46cc36a4-fdc5-4dff-b8ea-074e960fbf29", "2933000", "Valente")
        insert("9c54f54a-5e68-45a6-8463-9d25f8b5a0ca", "2933059", "Várzea da Roça")
        insert("e23e8d8a-55a7-45d3-8b5f-9c0d851633be", "2933109", "Várzea do Poço")
        insert("8dba69aa-1893-41ea-b96a-bdd98b6a0b23", "2933158", "Várzea Nova")
        insert("adab1986-3272-42df-9e9b-1ea0e7cb79a1", "2933174", "Varzedo")
        insert("3ff4d36a-39d0-4f19-b786-db93754d0ad4", "2933208", "Vera Cruz")
        insert("de34c230-fa11-4fab-8804-6398bee2b287", "2933257", "Vereda")
        insert("f41e9805-228e-4c07-b9d9-b716901d765f", "2933307", "Vitória da Conquista")
        insert("ffb173c3-fc02-4934-b788-d2726643ff2c", "2933406", "Wagner")
        insert("8652f675-ada8-43fd-a129-9f8b35b11f60", "2933455", "Wanderley")
        insert("b79d6e17-12c7-48ef-ac24-c5f559a02dc7", "2933505", "Wenceslau Guimarães")
        insert("8aadfd93-39fa-40a2-bcd6-77701dd16d9b", "2933604", "Xique-Xique")
    }
}