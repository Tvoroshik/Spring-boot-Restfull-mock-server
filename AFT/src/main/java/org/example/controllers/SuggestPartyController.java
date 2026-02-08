package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class SuggestPartyController {

    private static final Logger logger = LoggerFactory.getLogger(SuggestPartyController.class);

    @Value("${app.delay.suggest.party:0}")
    private long suggest_party_delay;

    private final RestTemplate restTemplate = new RestTemplate();

    @PostMapping(value = "/suggest-party", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> suggestParty(@RequestBody String requestBody) {
        try {
            // Добавляем задержку
            Thread.sleep(suggest_party_delay);
        } catch (InterruptedException e) {
            logger.warn("Задержка прервана", e);
            Thread.currentThread().interrupt();
        }

        // Проверяем содержимое запроса
        if (requestBody.contains("\"q\":\"000\"")) {
            String jsonResponse = "{\"suggestions\": [\r\n" +
                    "        {\r\n" +
                    "            \"value\": \"ООО \\\"ТЕХНО-М\\\"\",\r\n" +
                    "            \"unrestricted_value\": \"ООО \\\"ТЕХНО-М\\\"\",\r\n" +
                    "            \"data\": {\r\n" +
                    "                \"kpp\": \"644301001\",\r\n" +
                    "                \"kpp_largest\": null,\r\n" +
                    "                \"capital\": null,\r\n" +
                    "                \"invalid\": null,\r\n" +
                    "                \"management\": {\r\n" +
                    "                    \"name\": \"Яковлев Андрей Александрович\",\r\n" +
                    "                    \"post\": \"ДИРЕКТОР\",\r\n" +
                    "                    \"start_date\": 1757019600000,\r\n" +
                    "                    \"disqualified\": null\r\n" +
                    "                },\r\n" +
                    "                \"founders\": null,\r\n" +
                    "                \"managers\": null,\r\n" +
                    "                \"predecessors\": null,\r\n" +
                    "                \"successors\": null,\r\n" +
                    "                \"branch_type\": \"MAIN\",\r\n" +
                    "                \"branch_count\": 0,\r\n" +
                    "                \"source\": null,\r\n" +
                    "                \"qc\": null,\r\n" +
                    "                \"hid\": \"bdc090afc80b520607e4ccd11e795368e242590bb61a44068f3a473edf7f9753\",\r\n" +
                    "                \"type\": \"LEGAL\",\r\n" +
                    "                \"state\": {\r\n" +
                    "                    \"status\": \"ACTIVE\",\r\n" +
                    "                    \"code\": null,\r\n" +
                    "                    \"actuality_date\": 1757030400000,\r\n" +
                    "                    \"registration_date\": 1389916800000,\r\n" +
                    "                    \"liquidation_date\": null\r\n" +
                    "                },\r\n" +
                    "                \"opf\": {\r\n" +
                    "                    \"type\": \"2014\",\r\n" +
                    "                    \"code\": \"12300\",\r\n" +
                    "                    \"full\": \"Общество с ограниченной ответственностью\",\r\n" +
                    "                    \"short\": \"ООО\"\r\n" +
                    "                },\r\n" +
                    "                \"name\": {\r\n" +
                    "                    \"full_with_opf\": \"ОБЩЕСТВО С ОГРАНИЧЕННОЙ ОТВЕТСТВЕННОСТЬЮ \\\"ТЕХНО-М\\\"\",\r\n" +
                    "                    \"short_with_opf\": \"ООО \\\"ТЕХНО-М\\\"\",\r\n" +
                    "                    \"latin\": null,\r\n" +
                    "                    \"full\": \"ТЕХНО-М\",\r\n" +
                    "                    \"short\": \"ТЕХНО-М\"\r\n" +
                    "                },\r\n" +
                    "                \"inn\": \"6443021579\",\r\n" +
                    "                \"ogrn\": \"1146449000114\",\r\n" +
                    "                \"okpo\": \"26820077\",\r\n" +
                    "                \"okato\": \"63226501000\",\r\n" +
                    "                \"oktmo\": \"63626101001\",\r\n" +
                    "                \"okogu\": \"4210014\",\r\n" +
                    "                \"okfs\": \"16\",\r\n" +
                    "                \"okved\": \"43.21\",\r\n" +
                    "                \"okveds\": null,\r\n" +
                    "                \"authorities\": null,\r\n" +
                    "                \"documents\": null,\r\n" +
                    "                \"licenses\": null,\r\n" +
                    "                \"finance\": {\r\n" +
                    "                    \"tax_system\": null,\r\n" +
                    "                    \"income\": null,\r\n" +
                    "                    \"expense\": null,\r\n" +
                    "                    \"revenue\": null,\r\n" +
                    "                    \"debt\": null,\r\n" +
                    "                    \"penalty\": null,\r\n" +
                    "                    \"year\": null\r\n" +
                    "                },\r\n" +
                    "                \"address\": {\r\n" +
                    "                    \"value\": \"Саратовская обл, г Маркс, пр-кт Ленина, д 117А\",\r\n" +
                    "                    \"unrestricted_value\": \"413093, Саратовская обл, г Маркс, пр-кт Ленина, д 117А\",\r\n" +
                    "                    \"invalidity\": null,\r\n" +
                    "                    \"data\": {\r\n" +
                    "                        \"postal_code\": \"413093\",\r\n" +
                    "                        \"country\": \"Россия\",\r\n" +
                    "                        \"country_iso_code\": \"RU\",\r\n" +
                    "                        \"federal_district\": \"Приволжский\",\r\n" +
                    "                        \"region_fias_id\": \"df594e0e-a935-4664-9d26-0bae13f904fe\",\r\n" +
                    "                        \"region_kladr_id\": \"6400000000000\",\r\n" +
                    "                        \"region_iso_code\": \"RU-SAR\",\r\n" +
                    "                        \"region_with_type\": \"Саратовская обл\",\r\n" +
                    "                        \"region_type\": \"обл\",\r\n" +
                    "                        \"region_type_full\": \"область\",\r\n" +
                    "                        \"region\": \"Саратовская\",\r\n" +
                    "                        \"area_fias_id\": null,\r\n" +
                    "                        \"area_kladr_id\": null,\r\n" +
                    "                        \"area_with_type\": null,\r\n" +
                    "                        \"area_type\": null,\r\n" +
                    "                        \"area_type_full\": null,\r\n" +
                    "                        \"area\": null,\r\n" +
                    "                        \"city_fias_id\": \"c1a0ca30-8b42-4cc8-a16d-2d3392937621\",\r\n" +
                    "                        \"city_kladr_id\": \"6400000800000\",\r\n" +
                    "                        \"city_with_type\": \"г Маркс\",\r\n" +
                    "                        \"city_type\": \"г\",\r\n" +
                    "                        \"city_type_full\": \"город\",\r\n" +
                    "                        \"city\": \"Маркс\",\r\n" +
                    "                        \"city_area\": null,\r\n" +
                    "                        \"city_district_fias_id\": null,\r\n" +
                    "                        \"city_district_kladr_id\": null,\r\n" +
                    "                        \"city_district_with_type\": null,\r\n" +
                    "                        \"city_district_type\": null,\r\n" +
                    "                        \"city_district_type_full\": null,\r\n" +
                    "                        \"city_district\": null,\r\n" +
                    "                        \"settlement_fias_id\": null,\r\n" +
                    "                        \"settlement_kladr_id\": null,\r\n" +
                    "                        \"settlement_with_type\": null,\r\n" +
                    "                        \"settlement_type\": null,\r\n" +
                    "                        \"settlement_type_full\": null,\r\n" +
                    "                        \"settlement\": null,\r\n" +
                    "                        \"street_fias_id\": \"af82afc7-ee25-41a4-84ec-b41a8f37bd17\",\r\n" +
                    "                        \"street_kladr_id\": \"64000008000005900\",\r\n" +
                    "                        \"street_with_type\": \"пр-кт Ленина\",\r\n" +
                    "                        \"street_type\": \"пр-кт\",\r\n" +
                    "                        \"street_type_full\": \"проспект\",\r\n" +
                    "                        \"street\": \"Ленина\",\r\n" +
                    "                        \"stead_fias_id\": null,\r\n" +
                    "                        \"stead_cadnum\": null,\r\n" +
                    "                        \"stead_type\": null,\r\n" +
                    "                        \"stead_type_full\": null,\r\n" +
                    "                        \"stead\": null,\r\n" +
                    "                        \"house_fias_id\": \"204c4143-980d-4b1c-b4d8-6f649b29184a\",\r\n" +
                    "                        \"house_kladr_id\": \"6400000800000590012\",\r\n" +
                    "                        \"house_cadnum\": null,\r\n" +
                    "                        \"house_flat_count\": \"0\",\r\n" +
                    "                        \"house_type\": \"д\",\r\n" +
                    "                        \"house_type_full\": \"дом\",\r\n" +
                    "                        \"house\": \"117А\",\r\n" +
                    "                        \"block_type\": null,\r\n" +
                    "                        \"block_type_full\": null,\r\n" +
                    "                        \"block\": null,\r\n" +
                    "                        \"entrance\": null,\r\n" +
                    "                        \"floor\": null,\r\n" +
                    "                        \"flat_fias_id\": null,\r\n" +
                    "                        \"flat_cadnum\": null,\r\n" +
                    "                        \"flat_type\": null,\r\n" +
                    "                        \"flat_type_full\": null,\r\n" +
                    "                        \"flat\": null,\r\n" +
                    "                        \"flat_area\": \"-1\",\r\n" +
                    "                        \"square_meter_price\": \"-1\",\r\n" +
                    "                        \"flat_price\": null,\r\n" +
                    "                        \"room_fias_id\": null,\r\n" +
                    "                        \"room_cadnum\": null,\r\n" +
                    "                        \"room_type\": null,\r\n" +
                    "                        \"room_type_full\": null,\r\n" +
                    "                        \"room\": null,\r\n" +
                    "                        \"postal_box\": null,\r\n" +
                    "                        \"fias_id\": \"204c4143-980d-4b1c-b4d8-6f649b29184a\",\r\n" +
                    "                        \"fias_code\": \"64000008000000000590012\",\r\n" +
                    "                        \"fias_level\": \"8\",\r\n" +
                    "                        \"fias_actuality_state\": \"0\",\r\n" +
                    "                        \"kladr_id\": \"6400000800000590012\",\r\n" +
                    "                        \"geoname_id\": \"529073\",\r\n" +
                    "                        \"capital_marker\": \"0\",\r\n" +
                    "                        \"okato\": \"63226501000\",\r\n" +
                    "                        \"oktmo\": \"63626101001\",\r\n" +
                    "                        \"tax_office\": \"6449\",\r\n" +
                    "                        \"tax_office_legal\": \"6449\",\r\n" +
                    "                        \"timezone\": \"UTC+4\",\r\n" +
                    "                        \"geo_lat\": \"51.704198\",\r\n" +
                    "                        \"geo_lon\": \"46.764446\",\r\n" +
                    "                        \"beltway_hit\": null,\r\n" +
                    "                        \"beltway_distance\": null,\r\n" +
                    "                        \"metro\": null,\r\n" +
                    "                        \"divisions\": null,\r\n" +
                    "                        \"qc_geo\": \"0\",\r\n" +
                    "                        \"qc_complete\": null,\r\n" +
                    "                        \"qc_house\": null,\r\n" +
                    "                        \"history_values\": null,\r\n" +
                    "                        \"unparsed_parts\": null,\r\n" +
                    "                        \"source\": \"413093, САРАТОВСКАЯ ОБЛАСТЬ, Г. МАРКС, ПР-КТ ЛЕНИНА, Д.117 А\",\r\n" +
                    "                        \"qc\": \"0\"\r\n" +
                    "                    }\r\n" +
                    "                },\r\n" +
                    "                \"phones\": null,\r\n" +
                    "                \"emails\": null,\r\n" +
                    "                \"ogrn_date\": 1389916800000,\r\n" +
                    "                \"okved_type\": \"2014\",\r\n" +
                    "                \"employee_count\": null\r\n" +
                    "            }\r\n" +
                    "        },\r\n" +
                    "        {\r\n" +
                    "            \"value\": \"ГКУ МО \\\"МОЦ ИКТ\\\"\",\r\n" +
                    "            \"unrestricted_value\": \"ГКУ МО \\\"МОЦ ИКТ\\\"\",\r\n" +
                    "            \"data\": {\r\n" +
                    "                \"kpp\": \"502401001\",\r\n" +
                    "                \"kpp_largest\": null,\r\n" +
                    "                \"capital\": null,\r\n" +
                    "                \"invalid\": null,\r\n" +
                    "                \"management\": {\r\n" +
                    "                    \"name\": \"Плотников Алексей Михайлович\",\r\n" +
                    "                    \"post\": \"ИСПОЛНЯЮЩИЙ ОБЯЗАННОСТИ ДИРЕКТОРА\",\r\n" +
                    "                    \"start_date\": 1761512400000,\r\n" +
                    "                    \"disqualified\": null\r\n" +
                    "                },\r\n" +
                    "                \"founders\": null,\r\n" +
                    "                \"managers\": null,\r\n" +
                    "                \"predecessors\": null,\r\n" +
                    "                \"successors\": null,\r\n" +
                    "                \"branch_type\": \"MAIN\",\r\n" +
                    "                \"branch_count\": 0,\r\n" +
                    "                \"source\": null,\r\n" +
                    "                \"qc\": null,\r\n" +
                    "                \"hid\": \"570064a77c1a71c14a99ba7f0bb588e3fa1b11291cbf30d76ae50316ee68b78c\",\r\n" +
                    "                \"type\": \"LEGAL\",\r\n" +
                    "                \"state\": {\r\n" +
                    "                    \"status\": \"ACTIVE\",\r\n" +
                    "                    \"code\": null,\r\n" +
                    "                    \"actuality_date\": 1764979200000,\r\n" +
                    "                    \"registration_date\": 1347235200000,\r\n" +
                    "                    \"liquidation_date\": null\r\n" +
                    "                },\r\n" +
                    "                \"opf\": {\r\n" +
                    "                    \"type\": \"2014\",\r\n" +
                    "                    \"code\": \"75204\",\r\n" +
                    "                    \"full\": \"Государственное казенное учреждение субъекта Российской Федерации\",\r\n" +
                    "                    \"short\": \"ГКУ\"\r\n" +
                    "                },\r\n" +
                    "                \"name\": {\r\n" +
                    "                    \"full_with_opf\": \"ГОСУДАРСТВЕННОЕ КАЗЕННОЕ УЧРЕЖДЕНИЕ МОСКОВСКОЙ ОБЛАСТИ \\\"МОСКОВСКИЙ ОБЛАСТНОЙ ЦЕНТР ИНФОРМАЦИОННО-КОММУНИКАЦИОННЫХ ТЕХНОЛОГИЙ\\\"\",\r\n" +
                    "                    \"short_with_opf\": \"ГКУ МО \\\"МОЦ ИКТ\\\"\",\r\n" +
                    "                    \"latin\": null,\r\n" +
                    "                    \"full\": \"ГОСУДАРСТВЕННОЕ КАЗЕННОЕ УЧРЕЖДЕНИЕ МОСКОВСКОЙ ОБЛАСТИ МОСКОВСКИЙ ОБЛАСТНОЙ ЦЕНТР ИНФОРМАЦИОННО-КОММУНИКАЦИОННЫХ ТЕХНОЛОГИЙ\",\r\n" +
                    "                    \"short\": \"ГКУ МО МОЦ ИКТ\"\r\n" +
                    "                },\r\n" +
                    "                \"inn\": \"5024130840\",\r\n" +
                    "                \"ogrn\": \"1125024006304\",\r\n" +
                    "                \"okpo\": \"13303771\",\r\n" +
                    "                \"okato\": \"46439000000\",\r\n" +
                    "                \"oktmo\": \"46744000001\",\r\n" +
                    "                \"okogu\": \"2300232\",\r\n" +
                    "                \"okfs\": \"13\",\r\n" +
                    "                \"okved\": \"62.09\",\r\n" +
                    "                \"okveds\": null,\r\n" +
                    "                \"authorities\": null,\r\n" +
                    "                \"documents\": null,\r\n" +
                    "                \"licenses\": null,\r\n" +
                    "                \"finance\": null,\r\n" +
                    "                \"address\": {\r\n" +
                    "                    \"value\": \"Московская обл, г Красногорск, б-р Строителей, д 4 к 1\",\r\n" +
                    "                    \"unrestricted_value\": \"143401, Московская обл, г Красногорск, б-р Строителей, д 4 к 1\",\r\n" +
                    "                    \"invalidity\": null,\r\n" +
                    "                    \"data\": {\r\n" +
                    "                        \"postal_code\": \"143401\",\r\n" +
                    "                        \"country\": \"Россия\",\r\n" +
                    "                        \"country_iso_code\": \"RU\",\r\n" +
                    "                        \"federal_district\": \"Центральный\",\r\n" +
                    "                        \"region_fias_id\": \"29251dcf-00a1-4e34-98d4-5c47484a36d4\",\r\n" +
                    "                        \"region_kladr_id\": \"5000000000000\",\r\n" +
                    "                        \"region_iso_code\": \"RU-MOS\",\r\n" +
                    "                        \"region_with_type\": \"Московская обл\",\r\n" +
                    "                        \"region_type\": \"обл\",\r\n" +
                    "                        \"region_type_full\": \"область\",\r\n" +
                    "                        \"region\": \"Московская\",\r\n" +
                    "                        \"area_fias_id\": null,\r\n" +
                    "                        \"area_kladr_id\": null,\r\n" +
                    "                        \"area_with_type\": null,\r\n" +
                    "                        \"area_type\": null,\r\n" +
                    "                        \"area_type_full\": null,\r\n" +
                    "                        \"area\": null,\r\n" +
                    "                        \"city_fias_id\": \"63fcf18a-365e-451f-baee-8d09ac50b773\",\r\n" +
                    "                        \"city_kladr_id\": \"5000004900000\",\r\n" +
                    "                        \"city_with_type\": \"г Красногорск\",\r\n" +
                    "                        \"city_type\": \"г\",\r\n" +
                    "                        \"city_type_full\": \"город\",\r\n" +
                    "                        \"city\": \"Красногорск\",\r\n" +
                    "                        \"city_area\": null,\r\n" +
                    "                        \"city_district_fias_id\": null,\r\n" +
                    "                        \"city_district_kladr_id\": null,\r\n" +
                    "                        \"city_district_with_type\": null,\r\n" +
                    "                        \"city_district_type\": null,\r\n" +
                    "                        \"city_district_type_full\": null,\r\n" +
                    "                        \"city_district\": null,\r\n" +
                    "                        \"settlement_fias_id\": null,\r\n" +
                    "                        \"settlement_kladr_id\": null,\r\n" +
                    "                        \"settlement_with_type\": null,\r\n" +
                    "                        \"settlement_type\": null,\r\n" +
                    "                        \"settlement_type_full\": null,\r\n" +
                    "                        \"settlement\": null,\r\n" +
                    "                        \"street_fias_id\": \"160d30c2-dff2-4d11-84f8-2e2ef83e9141\",\r\n" +
                    "                        \"street_kladr_id\": \"50000049000012700\",\r\n" +
                    "                        \"street_with_type\": \"б-р Строителей\",\r\n" +
                    "                        \"street_type\": \"б-р\",\r\n" +
                    "                        \"street_type_full\": \"бульвар\",\r\n" +
                    "                        \"street\": \"Строителей\",\r\n" +
                    "                        \"stead_fias_id\": null,\r\n" +
                    "                        \"stead_cadnum\": null,\r\n" +
                    "                        \"stead_type\": null,\r\n" +
                    "                        \"stead_type_full\": null,\r\n" +
                    "                        \"stead\": null,\r\n" +
                    "                        \"house_fias_id\": \"d16f3a47-6a4f-481d-8465-591c4e9c294b\",\r\n" +
                    "                        \"house_kladr_id\": \"5000004900001270013\",\r\n" +
                    "                        \"house_cadnum\": \"50:11:0020213:564\",\r\n" +
                    "                        \"house_flat_count\": \"0\",\r\n" +
                    "                        \"house_type\": \"д\",\r\n" +
                    "                        \"house_type_full\": \"дом\",\r\n" +
                    "                        \"house\": \"4\",\r\n" +
                    "                        \"block_type\": \"к\",\r\n" +
                    "                        \"block_type_full\": \"корпус\",\r\n" +
                    "                        \"block\": \"1\",\r\n" +
                    "                        \"entrance\": null,\r\n" +
                    "                        \"floor\": null,\r\n" +
                    "                        \"flat_fias_id\": null,\r\n" +
                    "                        \"flat_cadnum\": null,\r\n" +
                    "                        \"flat_type\": null,\r\n" +
                    "                        \"flat_type_full\": null,\r\n" +
                    "                        \"flat\": null,\r\n" +
                    "                        \"flat_area\": \"-1\",\r\n" +
                    "                        \"square_meter_price\": \"-1\",\r\n" +
                    "                        \"flat_price\": null,\r\n" +
                    "                        \"room_fias_id\": null,\r\n" +
                    "                        \"room_cadnum\": null,\r\n" +
                    "                        \"room_type\": null,\r\n" +
                    "                        \"room_type_full\": null,\r\n" +
                    "                        \"room\": null,\r\n" +
                    "                        \"postal_box\": null,\r\n" +
                    "                        \"fias_id\": \"d16f3a47-6a4f-481d-8465-591c4e9c294b\",\r\n" +
                    "                        \"fias_code\": \"50000049000000001270013\",\r\n" +
                    "                        \"fias_level\": \"8\",\r\n" +
                    "                        \"fias_actuality_state\": \"0\",\r\n" +
                    "                        \"kladr_id\": \"5000004900001270013\",\r\n" +
                    "                        \"geoname_id\": \"542374\",\r\n" +
                    "                        \"capital_marker\": \"0\",\r\n" +
                    "                        \"okato\": \"46439000000\",\r\n" +
                    "                        \"oktmo\": \"46744000001\",\r\n" +
                    "                        \"tax_office\": \"5024\",\r\n" +
                    "                        \"tax_office_legal\": \"5024\",\r\n" +
                    "                        \"timezone\": \"UTC+3\",\r\n" +
                    "                        \"geo_lat\": \"55.814434\",\r\n" +
                    "                        \"geo_lon\": \"37.385389\",\r\n" +
                    "                        \"beltway_hit\": \"OUT_MKAD\",\r\n" +
                    "                        \"beltway_distance\": \"1\",\r\n" +
                    "                        \"metro\": [\r\n" +
                    "                            {\r\n" +
                    "                                \"name\": \"Мякинино\",\r\n" +
                    "                                \"line\": \"Арбатско-Покровская\",\r\n" +
                    "                                \"distance\": 1.0\r\n" +
                    "                            },\r\n" +
                    "                            {\r\n" +
                    "                                \"name\": \"Строгино\",\r\n" +
                    "                                \"line\": \"Арбатско-Покровская\",\r\n" +
                    "                                \"distance\": 1.6\r\n" +
                    "                            },\r\n" +
                    "                            {\r\n" +
                    "                                \"name\": \"Пенягино\",\r\n" +
                    "                                \"line\": \"Курско-Рижский\",\r\n" +
                    "                                \"distance\": 1.8\r\n" +
                    "                            }\r\n" +
                    "                        ],\r\n" +
                    "                        \"divisions\": null,\r\n" +
                    "                        \"qc_geo\": \"0\",\r\n" +
                    "                        \"qc_complete\": null,\r\n" +
                    "                        \"qc_house\": null,\r\n" +
                    "                        \"history_values\": null,\r\n" +
                    "                        \"unparsed_parts\": null,\r\n" +
                    "                        \"source\": \"143401, МОСКОВСКАЯ ОБЛАСТЬ, Г.О. КРАСНОГОРСК, Г КРАСНОГОРСК, Б-Р СТРОИТЕЛЕЙ, Д. 4, К. 1\",\r\n" +
                    "                        \"qc\": \"0\"\r\n" +
                    "                    }\r\n" +
                    "                },\r\n" +
                    "                \"phones\": null,\r\n" +
                    "                \"emails\": null,\r\n" +
                    "                \"ogrn_date\": 1347235200000,\r\n" +
                    "                \"okved_type\": \"2014\",\r\n" +
                    "                \"employee_count\": null\r\n" +
                    "            }\r\n" +
                    "        },\r\n" +
                    "        {\r\n" +
                    "            \"value\": \"ООО \\\"СТРОЙМЕТАЛЛ-2\\\"\",\r\n" +
                    "            \"unrestricted_value\": \"ООО \\\"СТРОЙМЕТАЛЛ-2\\\"\",\r\n" +
                    "            \"data\": {\r\n" +
                    "                \"kpp\": \"325701001\",\r\n" +
                    "                \"kpp_largest\": null,\r\n" +
                    "                \"capital\": null,\r\n" +
                    "                \"invalid\": null,\r\n" +
                    "                \"management\": {\r\n" +
                    "                    \"name\": \"Кулеш Галина Анатольевна\",\r\n" +
                    "                    \"post\": \"ДИРЕКТОР\",\r\n" +
                    "                    \"start_date\": 1465506000000,\r\n" +
                    "                    \"disqualified\": null\r\n" +
                    "                },\r\n" +
                    "                \"founders\": null,\r\n" +
                    "                \"managers\": null,\r\n" +
                    "                \"predecessors\": null,\r\n" +
                    "                \"successors\": null,\r\n" +
                    "                \"branch_type\": \"MAIN\",\r\n" +
                    "                \"branch_count\": 0,\r\n" +
                    "                \"source\": null,\r\n" +
                    "                \"qc\": null,\r\n" +
                    "                \"hid\": \"800a8ba4c45487c69eb8f18ebc6df47787d763ab0769e0ab4cfc8e3d0163b772\",\r\n" +
                    "                \"type\": \"LEGAL\",\r\n" +
                    "                \"state\": {\r\n" +
                    "                    \"status\": \"ACTIVE\",\r\n" +
                    "                    \"code\": null,\r\n" +
                    "                    \"actuality_date\": 1753574400000,\r\n" +
                    "                    \"registration_date\": 1265155200000,\r\n" +
                    "                    \"liquidation_date\": null\r\n" +
                    "                },\r\n" +
                    "                \"opf\": {\r\n" +
                    "                    \"type\": \"2014\",\r\n" +
                    "                    \"code\": \"12300\",\r\n" +
                    "                    \"full\": \"Общество с ограниченной ответственностью\",\r\n" +
                    "                    \"short\": \"ООО\"\r\n" +
                    "                },\r\n" +
                    "                \"name\": {\r\n" +
                    "                    \"full_with_opf\": \"ОБЩЕСТВО С ОГРАНИЧЕННОЙ ОТВЕТСТВЕННОСТЬЮ \\\"СТРОЙМЕТАЛЛ-2\\\"\",\r\n" +
                    "                    \"short_with_opf\": \"ООО \\\"СТРОЙМЕТАЛЛ-2\\\"\",\r\n" +
                    "                    \"latin\": null,\r\n" +
                    "                    \"full\": \"СТРОЙМЕТАЛЛ-2\",\r\n" +
                    "                    \"short\": \"СТРОЙМЕТАЛЛ-2\"\r\n" +
                    "                },\r\n" +
                    "                \"inn\": \"3241011572\",\r\n" +
                    "                \"ogrn\": \"1103241000103\",\r\n" +
                    "                \"okpo\": \"63348359\",\r\n" +
                    "                \"okato\": \"15401375000\",\r\n" +
                    "                \"oktmo\": \"15701000001\",\r\n" +
                    "                \"okogu\": \"4210014\",\r\n" +
                    "                \"okfs\": \"16\",\r\n" +
                    "                \"okved\": \"81.10\",\r\n" +
                    "                \"okveds\": null,\r\n" +
                    "                \"authorities\": null,\r\n" +
                    "                \"documents\": null,\r\n" +
                    "                \"licenses\": null,\r\n" +
                    "                \"finance\": {\r\n" +
                    "                    \"tax_system\": null,\r\n" +
                    "                    \"income\": null,\r\n" +
                    "                    \"expense\": null,\r\n" +
                    "                    \"revenue\": null,\r\n" +
                    "                    \"debt\": null,\r\n" +
                    "                    \"penalty\": null,\r\n" +
                    "                    \"year\": null\r\n" +
                    "                },\r\n" +
                    "                \"address\": {\r\n" +
                    "                    \"value\": \"г Брянск, ул Красноармейская, д 138, офис 105\",\r\n" +
                    "                    \"unrestricted_value\": \"241019, Брянская обл, г Брянск, Советский р-н, ул Красноармейская, д 138, офис 105\",\r\n" +
                    "                    \"invalidity\": null,\r\n" +
                    "                    \"data\": {\r\n" +
                    "                        \"postal_code\": \"241019\",\r\n" +
                    "                        \"country\": \"Россия\",\r\n" +
                    "                        \"country_iso_code\": \"RU\",\r\n" +
                    "                        \"federal_district\": \"Центральный\",\r\n" +
                    "                        \"region_fias_id\": \"f5807226-8be0-4ea8-91fc-39d053aec1e2\",\r\n" +
                    "                        \"region_kladr_id\": \"3200000000000\",\r\n" +
                    "                        \"region_iso_code\": \"RU-BRY\",\r\n" +
                    "                        \"region_with_type\": \"Брянская обл\",\r\n" +
                    "                        \"region_type\": \"обл\",\r\n" +
                    "                        \"region_type_full\": \"область\",\r\n" +
                    "                        \"region\": \"Брянская\",\r\n" +
                    "                        \"area_fias_id\": null,\r\n" +
                    "                        \"area_kladr_id\": null,\r\n" +
                    "                        \"area_with_type\": null,\r\n" +
                    "                        \"area_type\": null,\r\n" +
                    "                        \"area_type_full\": null,\r\n" +
                    "                        \"area\": null,\r\n" +
                    "                        \"city_fias_id\": \"414b71cf-921e-4bfc-b6e0-f7395d16aaef\",\r\n" +
                    "                        \"city_kladr_id\": \"3200000100000\",\r\n" +
                    "                        \"city_with_type\": \"г Брянск\",\r\n" +
                    "                        \"city_type\": \"г\",\r\n" +
                    "                        \"city_type_full\": \"город\",\r\n" +
                    "                        \"city\": \"Брянск\",\r\n" +
                    "                        \"city_area\": null,\r\n" +
                    "                        \"city_district_fias_id\": null,\r\n" +
                    "                        \"city_district_kladr_id\": null,\r\n" +
                    "                        \"city_district_with_type\": \"Советский р-н\",\r\n" +
                    "                        \"city_district_type\": \"р-н\",\r\n" +
                    "                        \"city_district_type_full\": \"район\",\r\n" +
                    "                        \"city_district\": \"Советский\",\r\n" +
                    "                        \"settlement_fias_id\": null,\r\n" +
                    "                        \"settlement_kladr_id\": null,\r\n" +
                    "                        \"settlement_with_type\": null,\r\n" +
                    "                        \"settlement_type\": null,\r\n" +
                    "                        \"settlement_type_full\": null,\r\n" +
                    "                        \"settlement\": null,\r\n" +
                    "                        \"street_fias_id\": \"679d3ad2-1836-498f-b3c1-e413acbf0556\",\r\n" +
                    "                        \"street_kladr_id\": \"32000001000157300\",\r\n" +
                    "                        \"street_with_type\": \"ул Красноармейская\",\r\n" +
                    "                        \"street_type\": \"ул\",\r\n" +
                    "                        \"street_type_full\": \"улица\",\r\n" +
                    "                        \"street\": \"Красноармейская\",\r\n" +
                    "                        \"stead_fias_id\": null,\r\n" +
                    "                        \"stead_cadnum\": null,\r\n" +
                    "                        \"stead_type\": null,\r\n" +
                    "                        \"stead_type_full\": null,\r\n" +
                    "                        \"stead\": null,\r\n" +
                    "                        \"house_fias_id\": \"46781597-ae5b-46c3-85da-b7ceadadeda4\",\r\n" +
                    "                        \"house_kladr_id\": \"3200000100015730118\",\r\n" +
                    "                        \"house_cadnum\": \"32:28:0031506:95\",\r\n" +
                    "                        \"house_flat_count\": \"0\",\r\n" +
                    "                        \"house_type\": \"д\",\r\n" +
                    "                        \"house_type_full\": \"дом\",\r\n" +
                    "                        \"house\": \"138\",\r\n" +
                    "                        \"block_type\": null,\r\n" +
                    "                        \"block_type_full\": null,\r\n" +
                    "                        \"block\": null,\r\n" +
                    "                        \"entrance\": null,\r\n" +
                    "                        \"floor\": null,\r\n" +
                    "                        \"flat_fias_id\": null,\r\n" +
                    "                        \"flat_cadnum\": null,\r\n" +
                    "                        \"flat_type\": \"офис\",\r\n" +
                    "                        \"flat_type_full\": \"офис\",\r\n" +
                    "                        \"flat\": \"105\",\r\n" +
                    "                        \"flat_area\": \"-1\",\r\n" +
                    "                        \"square_meter_price\": \"-1\",\r\n" +
                    "                        \"flat_price\": null,\r\n" +
                    "                        \"room_fias_id\": null,\r\n" +
                    "                        \"room_cadnum\": null,\r\n" +
                    "                        \"room_type\": null,\r\n" +
                    "                        \"room_type_full\": null,\r\n" +
                    "                        \"room\": null,\r\n" +
                    "                        \"postal_box\": null,\r\n" +
                    "                        \"fias_id\": \"46781597-ae5b-46c3-85da-b7ceadadeda4\",\r\n" +
                    "                        \"fias_code\": \"32000001000000015730118\",\r\n" +
                    "                        \"fias_level\": \"8\",\r\n" +
                    "                        \"fias_actuality_state\": \"0\",\r\n" +
                    "                        \"kladr_id\": \"3200000100015730118\",\r\n" +
                    "                        \"geoname_id\": \"571476\",\r\n" +
                    "                        \"capital_marker\": \"2\",\r\n" +
                    "                        \"okato\": \"15401375000\",\r\n" +
                    "                        \"oktmo\": \"15701000001\",\r\n" +
                    "                        \"tax_office\": \"3200\",\r\n" +
                    "                        \"tax_office_legal\": \"3200\",\r\n" +
                    "                        \"timezone\": \"UTC+3\",\r\n" +
                    "                        \"geo_lat\": \"53.24556\",\r\n" +
                    "                        \"geo_lon\": \"34.338619\",\r\n" +
                    "                        \"beltway_hit\": null,\r\n" +
                    "                        \"beltway_distance\": null,\r\n" +
                    "                        \"metro\": null,\r\n" +
                    "                        \"divisions\": null,\r\n" +
                    "                        \"qc_geo\": \"0\",\r\n" +
                    "                        \"qc_complete\": null,\r\n" +
                    "                        \"qc_house\": null,\r\n" +
                    "                        \"history_values\": null,\r\n" +
                    "                        \"unparsed_parts\": null,\r\n" +
                    "                        \"source\": \"241019, БРЯНСКАЯ ОБЛАСТЬ, Г.О. ГОРОД БРЯНСК, Г БРЯНСК, УЛ КРАСНОАРМЕЙСКАЯ, Д. 138, ОФИС 105\",\r\n" +
                    "                        \"qc\": \"0\"\r\n" +
                    "                    }\r\n" +
                    "                },\r\n" +
                    "                \"phones\": null,\r\n" +
                    "                \"emails\": null,\r\n" +
                    "                \"ogrn_date\": 1265155200000,\r\n" +
                    "                \"okved_type\": \"2014\",\r\n" +
                    "                \"employee_count\": null\r\n" +
                    "            }\r\n" +
                    "        },\r\n" +
                    "        {\r\n" +
                    "            \"value\": \"ГБУЗ ДККБ\",\r\n" +
                    "            \"unrestricted_value\": \"ГБУЗ ДККБ\",\r\n" +
                    "            \"data\": {\r\n" +
                    "                \"kpp\": \"230901001\",\r\n" +
                    "                \"kpp_largest\": null,\r\n" +
                    "                \"capital\": null,\r\n" +
                    "                \"invalid\": null,\r\n" +
                    "                \"management\": {\r\n" +
                    "                    \"name\": \"Клещенко Елена Ивановна\",\r\n" +
                    "                    \"post\": \"ГЛАВНЫЙ ВРАЧ\",\r\n" +
                    "                    \"start_date\": 1204837200000,\r\n" +
                    "                    \"disqualified\": null\r\n" +
                    "                },\r\n" +
                    "                \"founders\": null,\r\n" +
                    "                \"managers\": null,\r\n" +
                    "                \"predecessors\": null,\r\n" +
                    "                \"successors\": null,\r\n" +
                    "                \"branch_type\": \"MAIN\",\r\n" +
                    "                \"branch_count\": 0,\r\n" +
                    "                \"source\": null,\r\n" +
                    "                \"qc\": null,\r\n" +
                    "                \"hid\": \"657833fb4a43345d5a3c5861bb492708b87903f4261ea0dae34aed3aff54a368\",\r\n" +
                    "                \"type\": \"LEGAL\",\r\n" +
                    "                \"state\": {\r\n" +
                    "                    \"status\": \"ACTIVE\",\r\n" +
                    "                    \"code\": null,\r\n" +
                    "                    \"actuality_date\": 1767052800000,\r\n" +
                    "                    \"registration_date\": 746150400000,\r\n" +
                    "                    \"liquidation_date\": null\r\n" +
                    "                },\r\n" +
                    "                \"opf\": {\r\n" +
                    "                    \"type\": \"2014\",\r\n" +
                    "                    \"code\": \"75203\",\r\n" +
                    "                    \"full\": \"Государственное бюджетное учреждение субъекта Российской Федерации\",\r\n" +
                    "                    \"short\": \"ГБУ\"\r\n" +
                    "                },\r\n" +
                    "                \"name\": {\r\n" +
                    "                    \"full_with_opf\": \"ГОСУДАРСТВЕННОЕ БЮДЖЕТНОЕ УЧРЕЖДЕНИЕ ЗДРАВООХРАНЕНИЯ \\\"ДЕТСКАЯ КРАЕВАЯ КЛИНИЧЕСКАЯ БОЛЬНИЦА\\\" МИНИСТЕРСТВА ЗДРАВООХРАНЕНИЯ КРАСНОДАРСКОГО КРАЯ\",\r\n" +
                    "                    \"short_with_opf\": \"ГБУЗ ДККБ\",\r\n" +
                    "                    \"latin\": null,\r\n" +
                    "                    \"full\": \"ГОСУДАРСТВЕННОЕ БЮДЖЕТНОЕ УЧРЕЖДЕНИЕ ЗДРАВООХРАНЕНИЯ ДЕТСКАЯ КРАЕВАЯ КЛИНИЧЕСКАЯ БОЛЬНИЦА МИНИСТЕРСТВА ЗДРАВООХРАНЕНИЯ КРАСНОДАРСКОГО КРАЯ\",\r\n" +
                    "                    \"short\": \"ГБУЗ ДККБ\"\r\n" +
                    "                },\r\n" +
                    "                \"inn\": \"2309039134\",\r\n" +
                    "                \"ogrn\": \"1022301425629\",\r\n" +
                    "                \"okpo\": \"02800816\",\r\n" +
                    "                \"okato\": \"03401364000\",\r\n" +
                    "                \"oktmo\": \"03701000001\",\r\n" +
                    "                \"okogu\": \"2300229\",\r\n" +
                    "                \"okfs\": \"13\",\r\n" +
                    "                \"okved\": \"86.10\",\r\n" +
                    "                \"okveds\": null,\r\n" +
                    "                \"authorities\": null,\r\n" +
                    "                \"documents\": null,\r\n" +
                    "                \"licenses\": null,\r\n" +
                    "                \"finance\": null,\r\n" +
                    "                \"address\": {\r\n" +
                    "                    \"value\": \"г Краснодар, пл Победы, д 1\",\r\n" +
                    "                    \"unrestricted_value\": \"350007, Краснодарский край, г Краснодар, пл Победы, д 1\",\r\n" +
                    "                    \"invalidity\": null,\r\n" +
                    "                    \"data\": {\r\n" +
                    "                        \"postal_code\": \"350007\",\r\n" +
                    "                        \"country\": \"Россия\",\r\n" +
                    "                        \"country_iso_code\": \"RU\",\r\n" +
                    "                        \"federal_district\": \"Южный\",\r\n" +
                    "                        \"region_fias_id\": \"d00e1013-16bd-4c09-b3d5-3cb09fc54bd8\",\r\n" +
                    "                        \"region_kladr_id\": \"2300000000000\",\r\n" +
                    "                        \"region_iso_code\": \"RU-KDA\",\r\n" +
                    "                        \"region_with_type\": \"Краснодарский край\",\r\n" +
                    "                        \"region_type\": \"край\",\r\n" +
                    "                        \"region_type_full\": \"край\",\r\n" +
                    "                        \"region\": \"Краснодарский\",\r\n" +
                    "                        \"area_fias_id\": null,\r\n" +
                    "                        \"area_kladr_id\": null,\r\n" +
                    "                        \"area_with_type\": null,\r\n" +
                    "                        \"area_type\": null,\r\n" +
                    "                        \"area_type_full\": null,\r\n" +
                    "                        \"area\": null,\r\n" +
                    "                        \"city_fias_id\": \"7dfa745e-aa19-4688-b121-b655c11e482f\",\r\n" +
                    "                        \"city_kladr_id\": \"2300000100000\",\r\n" +
                    "                        \"city_with_type\": \"г Краснодар\",\r\n" +
                    "                        \"city_type\": \"г\",\r\n" +
                    "                        \"city_type_full\": \"город\",\r\n" +
                    "                        \"city\": \"Краснодар\",\r\n" +
                    "                        \"city_area\": null,\r\n" +
                    "                        \"city_district_fias_id\": null,\r\n" +
                    "                        \"city_district_kladr_id\": null,\r\n" +
                    "                        \"city_district_with_type\": null,\r\n" +
                    "                        \"city_district_type\": null,\r\n" +
                    "                        \"city_district_type_full\": null,\r\n" +
                    "                        \"city_district\": null,\r\n" +
                    "                        \"settlement_fias_id\": null,\r\n" +
                    "                        \"settlement_kladr_id\": null,\r\n" +
                    "                        \"settlement_with_type\": null,\r\n" +
                    "                        \"settlement_type\": null,\r\n" +
                    "                        \"settlement_type_full\": null,\r\n" +
                    "                        \"settlement\": null,\r\n" +
                    "                        \"street_fias_id\": \"d19c58bd-865c-4083-9a75-ccc909d3ee77\",\r\n" +
                    "                        \"street_kladr_id\": \"23000001000058100\",\r\n" +
                    "                        \"street_with_type\": \"пл Победы\",\r\n" +
                    "                        \"street_type\": \"пл\",\r\n" +
                    "                        \"street_type_full\": \"площадь\",\r\n" +
                    "                        \"street\": \"Победы\",\r\n" +
                    "                        \"stead_fias_id\": null,\r\n" +
                    "                        \"stead_cadnum\": null,\r\n" +
                    "                        \"stead_type\": null,\r\n" +
                    "                        \"stead_type_full\": null,\r\n" +
                    "                        \"stead\": null,\r\n" +
                    "                        \"house_fias_id\": \"d8a6003d-17c4-4a79-a150-dd755016d96a\",\r\n" +
                    "                        \"house_kladr_id\": \"2300000100005810001\",\r\n" +
                    "                        \"house_cadnum\": null,\r\n" +
                    "                        \"house_flat_count\": \"0\",\r\n" +
                    "                        \"house_type\": \"д\",\r\n" +
                    "                        \"house_type_full\": \"дом\",\r\n" +
                    "                        \"house\": \"1\",\r\n" +
                    "                        \"block_type\": null,\r\n" +
                    "                        \"block_type_full\": null,\r\n" +
                    "                        \"block\": null,\r\n" +
                    "                        \"entrance\": null,\r\n" +
                    "                        \"floor\": null,\r\n" +
                    "                        \"flat_fias_id\": null,\r\n" +
                    "                        \"flat_cadnum\": null,\r\n" +
                    "                        \"flat_type\": null,\r\n" +
                    "                        \"flat_type_full\": null,\r\n" +
                    "                        \"flat\": null,\r\n" +
                    "                        \"flat_area\": \"-1\",\r\n" +
                    "                        \"square_meter_price\": \"-1\",\r\n" +
                    "                        \"flat_price\": null,\r\n" +
                    "                        \"room_fias_id\": null,\r\n" +
                    "                        \"room_cadnum\": null,\r\n" +
                    "                        \"room_type\": null,\r\n" +
                    "                        \"room_type_full\": null,\r\n" +
                    "                        \"room\": null,\r\n" +
                    "                        \"postal_box\": null,\r\n" +
                    "                        \"fias_id\": \"d8a6003d-17c4-4a79-a150-dd755016d96a\",\r\n" +
                    "                        \"fias_code\": \"23000001000000005810001\",\r\n" +
                    "                        \"fias_level\": \"8\",\r\n" +
                    "                        \"fias_actuality_state\": \"0\",\r\n" +
                    "                        \"kladr_id\": \"2300000100005810001\",\r\n" +
                    "                        \"geoname_id\": \"542420\",\r\n" +
                    "                        \"capital_marker\": \"2\",\r\n" +
                    "                        \"okato\": \"03401000000\",\r\n" +
                    "                        \"oktmo\": \"03701000001\",\r\n" +
                    "                        \"tax_office\": \"2309\",\r\n" +
                    "                        \"tax_office_legal\": \"2309\",\r\n" +
                    "                        \"timezone\": \"UTC+3\",\r\n" +
                    "                        \"geo_lat\": \"45.013028\",\r\n" +
                    "                        \"geo_lon\": \"38.966943\",\r\n" +
                    "                        \"beltway_hit\": null,\r\n" +
                    "                        \"beltway_distance\": null,\r\n" +
                    "                        \"metro\": null,\r\n" +
                    "                        \"divisions\": null,\r\n" +
                    "                        \"qc_geo\": \"0\",\r\n" +
                    "                        \"qc_complete\": null,\r\n" +
                    "                        \"qc_house\": null,\r\n" +
                    "                        \"history_values\": null,\r\n" +
                    "                        \"unparsed_parts\": null,\r\n" +
                    "                        \"source\": \"350007, КРАСНОДАРСКИЙ КРАЙ, Г. КРАСНОДАР, ПЛ. ПОБЕДЫ, Д.1\",\r\n" +
                    "                        \"qc\": \"0\"\r\n" +
                    "                    }\r\n" +
                    "                },\r\n" +
                    "                \"phones\": null,\r\n" +
                    "                \"emails\": null,\r\n" +
                    "                \"ogrn_date\": 1029715200000,\r\n" +
                    "                \"okved_type\": \"2014\",\r\n" +
                    "                \"employee_count\": null\r\n" +
                    "            }\r\n" +
                    "        },\r\n" +
                    "        {\r\n" +
                    "            \"value\": \"ООО \\\"ЭВОТРЕЙД\\\"\",\r\n" +
                    "            \"unrestricted_value\": \"ООО \\\"ЭВОТРЕЙД\\\"\",\r\n" +
                    "            \"data\": {\r\n" +
                    "                \"kpp\": \"783901001\",\r\n" +
                    "                \"kpp_largest\": null,\r\n" +
                    "                \"capital\": null,\r\n" +
                    "                \"invalid\": null,\r\n" +
                    "                \"management\": {\r\n" +
                    "                    \"name\": \"Гримзе Олег Михайлович\",\r\n" +
                    "                    \"post\": \"ГЕНЕРАЛЬНЫЙ ДИРЕКТОР\",\r\n" +
                    "                    \"start_date\": 1513803600000,\r\n" +
                    "                    \"disqualified\": null\r\n" +
                    "                },\r\n" +
                    "                \"founders\": null,\r\n" +
                    "                \"managers\": null,\r\n" +
                    "                \"predecessors\": null,\r\n" +
                    "                \"successors\": null,\r\n" +
                    "                \"branch_type\": \"MAIN\",\r\n" +
                    "                \"branch_count\": 0,\r\n" +
                    "                \"source\": null,\r\n" +
                    "                \"qc\": null,\r\n" +
                    "                \"hid\": \"506f33a65cd221779f5a394231012a1607af58c0eac3a7b4b33e2d51df30aea7\",\r\n" +
                    "                \"type\": \"LEGAL\",\r\n" +
                    "                \"state\": {\r\n" +
                    "                    \"status\": \"ACTIVE\",\r\n" +
                    "                    \"code\": null,\r\n" +
                    "                    \"actuality_date\": 1737936000000,\r\n" +
                    "                    \"registration_date\": 1513814400000,\r\n" +
                    "                    \"liquidation_date\": null\r\n" +
                    "                },\r\n" +
                    "                \"opf\": {\r\n" +
                    "                    \"type\": \"2014\",\r\n" +
                    "                    \"code\": \"12300\",\r\n" +
                    "                    \"full\": \"Общество с ограниченной ответственностью\",\r\n" +
                    "                    \"short\": \"ООО\"\r\n" +
                    "                },\r\n" +
                    "                \"name\": {\r\n" +
                    "                    \"full_with_opf\": \"ОБЩЕСТВО С ОГРАНИЧЕННОЙ ОТВЕТСТВЕННОСТЬЮ \\\"ЭВОТРЕЙД\\\"\",\r\n" +
                    "                    \"short_with_opf\": \"ООО \\\"ЭВОТРЕЙД\\\"\",\r\n" +
                    "                    \"latin\": null,\r\n" +
                    "                    \"full\": \"ЭВОТРЕЙД\",\r\n" +
                    "                    \"short\": \"ЭВОТРЕЙД\"\r\n" +
                    "                },\r\n" +
                    "                \"inn\": \"7839095581\",\r\n" +
                    "                \"ogrn\": \"1177847411356\",\r\n" +
                    "                \"okpo\": \"22103410\",\r\n" +
                    "                \"okato\": \"40262000000\",\r\n" +
                    "                \"oktmo\": \"40305000000\",\r\n" +
                    "                \"okogu\": \"4210014\",\r\n" +
                    "                \"okfs\": \"16\",\r\n" +
                    "                \"okved\": \"33.13\",\r\n" +
                    "                \"okveds\": null,\r\n" +
                    "                \"authorities\": null,\r\n" +
                    "                \"documents\": null,\r\n" +
                    "                \"licenses\": null,\r\n" +
                    "                \"finance\": {\r\n" +
                    "                    \"tax_system\": null,\r\n" +
                    "                    \"income\": null,\r\n" +
                    "                    \"expense\": null,\r\n" +
                    "                    \"revenue\": null,\r\n" +
                    "                    \"debt\": null,\r\n" +
                    "                    \"penalty\": null,\r\n" +
                    "                    \"year\": null\r\n" +
                    "                },\r\n" +
                    "                \"address\": {\r\n" +
                    "                    \"value\": \"190005, Г.САНКТ-ПЕТЕРБУРГ, ВН.ТЕР.Г. МУНИЦИПАЛЬНЫЙ ОКРУГ ИЗМАЙЛОВСКОЕ, НАБ ОБВОДНОГО КАНАЛА, Д. 118А, ЛИТЕРА Б, ПОМЕЩ. 2Н, 3Н, 4Н, ОФИС 544, 549\",\r\n" +
                    "                    \"unrestricted_value\": \"190005, Г.САНКТ-ПЕТЕРБУРГ, ВН.ТЕР.Г. МУНИЦИПАЛЬНЫЙ ОКРУГ ИЗМАЙЛОВСКОЕ, НАБ ОБВОДНОГО КАНАЛА, Д. 118А, ЛИТЕРА Б, ПОМЕЩ. 2Н, 3Н, 4Н, ОФИС 544, 549\",\r\n" +
                    "                    \"invalidity\": null,\r\n" +
                    "                    \"data\": {\r\n" +
                    "                        \"postal_code\": \"190005\",\r\n" +
                    "                        \"country\": \"Россия\",\r\n" +
                    "                        \"country_iso_code\": \"RU\",\r\n" +
                    "                        \"federal_district\": \"Северо-Западный\",\r\n" +
                    "                        \"region_fias_id\": \"c2deb16a-0330-4f05-821f-1d09c93331e6\",\r\n" +
                    "                        \"region_kladr_id\": \"7800000000000\",\r\n" +
                    "                        \"region_iso_code\": \"RU-SPE\",\r\n" +
                    "                        \"region_with_type\": \"г Санкт-Петербург\",\r\n" +
                    "                        \"region_type\": \"г\",\r\n" +
                    "                        \"region_type_full\": \"город\",\r\n" +
                    "                        \"region\": \"Санкт-Петербург\",\r\n" +
                    "                        \"area_fias_id\": null,\r\n" +
                    "                        \"area_kladr_id\": null,\r\n" +
                    "                        \"area_with_type\": null,\r\n" +
                    "                        \"area_type\": null,\r\n" +
                    "                        \"area_type_full\": null,\r\n" +
                    "                        \"area\": null,\r\n" +
                    "                        \"city_fias_id\": \"c2deb16a-0330-4f05-821f-1d09c93331e6\",\r\n" +
                    "                        \"city_kladr_id\": \"7800000000000\",\r\n" +
                    "                        \"city_with_type\": \"г Санкт-Петербург\",\r\n" +
                    "                        \"city_type\": \"г\",\r\n" +
                    "                        \"city_type_full\": \"город\",\r\n" +
                    "                        \"city\": \"Санкт-Петербург\",\r\n" +
                    "                        \"city_area\": null,\r\n" +
                    "                        \"city_district_fias_id\": null,\r\n" +
                    "                        \"city_district_kladr_id\": null,\r\n" +
                    "                        \"city_district_with_type\": \"Адмиралтейский р-н\",\r\n" +
                    "                        \"city_district_type\": \"р-н\",\r\n" +
                    "                        \"city_district_type_full\": \"район\",\r\n" +
                    "                        \"city_district\": \"Адмиралтейский\",\r\n" +
                    "                        \"settlement_fias_id\": null,\r\n" +
                    "                        \"settlement_kladr_id\": null,\r\n" +
                    "                        \"settlement_with_type\": null,\r\n" +
                    "                        \"settlement_type\": null,\r\n" +
                    "                        \"settlement_type_full\": null,\r\n" +
                    "                        \"settlement\": null,\r\n" +
                    "                        \"street_fias_id\": \"51d261e7-f8d4-43c8-97d2-9fb758176388\",\r\n" +
                    "                        \"street_kladr_id\": \"78000000000094700\",\r\n" +
                    "                        \"street_with_type\": \"наб Обводного канала\",\r\n" +
                    "                        \"street_type\": \"наб\",\r\n" +
                    "                        \"street_type_full\": \"набережная\",\r\n" +
                    "                        \"street\": \"Обводного канала\",\r\n" +
                    "                        \"stead_fias_id\": null,\r\n" +
                    "                        \"stead_cadnum\": null,\r\n" +
                    "                        \"stead_type\": null,\r\n" +
                    "                        \"stead_type_full\": null,\r\n" +
                    "                        \"stead\": null,\r\n" +
                    "                        \"house_fias_id\": \"0fffdcc8-2648-4682-9182-80371100410f\",\r\n" +
                    "                        \"house_kladr_id\": \"7800000000009470256\",\r\n" +
                    "                        \"house_cadnum\": \"78:32:0750101:1037\",\r\n" +
                    "                        \"house_flat_count\": \"0\",\r\n" +
                    "                        \"house_type\": \"д\",\r\n" +
                    "                        \"house_type_full\": \"дом\",\r\n" +
                    "                        \"house\": \"118А\",\r\n" +
                    "                        \"block_type\": \"литера\",\r\n" +
                    "                        \"block_type_full\": \"литера\",\r\n" +
                    "                        \"block\": \"б\",\r\n" +
                    "                        \"entrance\": null,\r\n" +
                    "                        \"floor\": null,\r\n" +
                    "                        \"flat_fias_id\": null,\r\n" +
                    "                        \"flat_cadnum\": null,\r\n" +
                    "                        \"flat_type\": \"помещ\",\r\n" +
                    "                        \"flat_type_full\": \"помещение\",\r\n" +
                    "                        \"flat\": \"2Н\",\r\n" +
                    "                        \"flat_area\": \"-1\",\r\n" +
                    "                        \"square_meter_price\": \"-1\",\r\n" +
                    "                        \"flat_price\": null,\r\n" +
                    "                        \"room_fias_id\": null,\r\n" +
                    "                        \"room_cadnum\": null,\r\n" +
                    "                        \"room_type\": null,\r\n" +
                    "                        \"room_type_full\": null,\r\n" +
                    "                        \"room\": null,\r\n" +
                    "                        \"postal_box\": null,\r\n" +
                    "                        \"fias_id\": \"0fffdcc8-2648-4682-9182-80371100410f\",\r\n" +
                    "                        \"fias_code\": \"78000000000000009470256\",\r\n" +
                    "                        \"fias_level\": \"8\",\r\n" +
                    "                        \"fias_actuality_state\": \"0\",\r\n" +
                    "                        \"kladr_id\": \"7800000000009470256\",\r\n" +
                    "                        \"geoname_id\": \"498817\",\r\n" +
                    "                        \"capital_marker\": \"0\",\r\n" +
                    "                        \"okato\": \"40262565000\",\r\n" +
                    "                        \"oktmo\": \"40305000\",\r\n" +
                    "                        \"tax_office\": \"7838\",\r\n" +
                    "                        \"tax_office_legal\": \"7838\",\r\n" +
                    "                        \"timezone\": \"UTC+3\",\r\n" +
                    "                        \"geo_lat\": \"59.902912\",\r\n" +
                    "                        \"geo_lon\": \"30.30552\",\r\n" +
                    "                        \"beltway_hit\": \"IN_KAD\",\r\n" +
                    "                        \"beltway_distance\": null,\r\n" +
                    "                        \"metro\": [\r\n" +
                    "                            {\r\n" +
                    "                                \"name\": \"Балтийская\",\r\n" +
                    "                                \"line\": \"Кировско-Выборгская\",\r\n" +
                    "                                \"distance\": 0.6\r\n" +
                    "                            },\r\n" +
                    "                            {\r\n" +
                    "                                \"name\": \"Фрунзенская\",\r\n" +
                    "                                \"line\": \"Московско-Петроградская\",\r\n" +
                    "                                \"distance\": 0.8\r\n" +
                    "                            },\r\n" +
                    "                            {\r\n" +
                    "                                \"name\": \"Московские ворота\",\r\n" +
                    "                                \"line\": \"Московско-Петроградская\",\r\n" +
                    "                                \"distance\": 1.4\r\n" +
                    "                            }\r\n" +
                    "                        ],\r\n" +
                    "                        \"divisions\": null,\r\n" +
                    "                        \"qc_geo\": \"0\",\r\n" +
                    "                        \"qc_complete\": null,\r\n" +
                    "                        \"qc_house\": null,\r\n" +
                    "                        \"history_values\": null,\r\n" +
                    "                        \"unparsed_parts\": null,\r\n" +
                    "                        \"source\": \"190005, Г.САНКТ-ПЕТЕРБУРГ, ВН.ТЕР.Г. МУНИЦИПАЛЬНЫЙ ОКРУГ ИЗМАЙЛОВСКОЕ, НАБ ОБВОДНОГО КАНАЛА, Д. 118А, ЛИТЕРА Б, ПОМЕЩ. 2Н, 3Н, 4Н, ОФИС 544, 549\",\r\n" +
                    "                        \"qc\": \"1\"\r\n" +
                    "                    }\r\n" +
                    "                },\r\n" +
                    "                \"phones\": null,\r\n" +
                    "                \"emails\": null,\r\n" +
                    "                \"ogrn_date\": 1513814400000,\r\n" +
                    "                \"okved_type\": \"2014\",\r\n" +
                    "                \"employee_count\": null\r\n" +
                    "            }\r\n" +
                    "        },\r\n" +
                    "        {\r\n" +
                    "            \"value\": \"ГБУЗ ЛО \\\"ПРИОЗЕРСКАЯ МБ\\\"\",\r\n" +
                    "            \"unrestricted_value\": \"ГБУЗ ЛО \\\"ПРИОЗЕРСКАЯ МБ\\\"\",\r\n" +
                    "            \"data\": {\r\n" +
                    "                \"kpp\": \"471201001\",\r\n" +
                    "                \"kpp_largest\": null,\r\n" +
                    "                \"capital\": null,\r\n" +
                    "                \"invalid\": null,\r\n" +
                    "                \"management\": {\r\n" +
                    "                    \"name\": \"Тарасов Виктор Сергеевич\",\r\n" +
                    "                    \"post\": \"ГЛАВНЫЙ ВРАЧ\",\r\n" +
                    "                    \"start_date\": 1684789200000,\r\n" +
                    "                    \"disqualified\": null\r\n" +
                    "                },\r\n" +
                    "                \"founders\": null,\r\n" +
                    "                \"managers\": null,\r\n" +
                    "                \"predecessors\": null,\r\n" +
                    "                \"successors\": null,\r\n" +
                    "                \"branch_type\": \"MAIN\",\r\n" +
                    "                \"branch_count\": 0,\r\n" +
                    "                \"source\": null,\r\n" +
                    "                \"qc\": null,\r\n" +
                    "                \"hid\": \"c2f4ad7b8dfb22c036f239ba302e61c0b87590419f5fd2fbfa818f8ba8d402ef\",\r\n" +
                    "                \"type\": \"LEGAL\",\r\n" +
                    "                \"state\": {\r\n" +
                    "                    \"status\": \"ACTIVE\",\r\n" +
                    "                    \"code\": null,\r\n" +
                    "                    \"actuality_date\": 1766275200000,\r\n" +
                    "                    \"registration_date\": 945907200000,\r\n" +
                    "                    \"liquidation_date\": null\r\n" +
                    "                },\r\n" +
                    "                \"opf\": {\r\n" +
                    "                    \"type\": \"2014\",\r\n" +
                    "                    \"code\": \"75203\",\r\n" +
                    "                    \"full\": \"Государственное бюджетное учреждение субъекта Российской Федерации\",\r\n" +
                    "                    \"short\": \"ГБУ\"\r\n" +
                    "                },\r\n" +
                    "                \"name\": {\r\n" +
                    "                    \"full_with_opf\": \"ГОСУДАРСТВЕННОЕ БЮДЖЕТНОЕ УЧРЕЖДЕНИЕ ЗДРАВООХРАНЕНИЯ ЛЕНИНГРАДСКОЙ ОБЛАСТИ \\\"ПРИОЗЕРСКАЯ МЕЖРАЙОННАЯ БОЛЬНИЦА\\\"\",\r\n" +
                    "                    \"short_with_opf\": \"ГБУЗ ЛО \\\"ПРИОЗЕРСКАЯ МБ\\\"\",\r\n" +
                    "                    \"latin\": null,\r\n" +
                    "                    \"full\": \"ГОСУДАРСТВЕННОЕ БЮДЖЕТНОЕ УЧРЕЖДЕНИЕ ЗДРАВООХРАНЕНИЯ ЛЕНИНГРАДСКОЙ ОБЛАСТИ ПРИОЗЕРСКАЯ МЕЖРАЙОННАЯ БОЛЬНИЦА\",\r\n" +
                    "                    \"short\": \"ГБУЗ ЛО ПРИОЗЕРСКАЯ МБ\"\r\n" +
                    "                },\r\n" +
                    "                \"inn\": \"4712017259\",\r\n" +
                    "                \"ogrn\": \"1024701646243\",\r\n" +
                    "                \"okpo\": \"05278964\",\r\n" +
                    "                \"okato\": \"41239501000\",\r\n" +
                    "                \"oktmo\": \"41639101001\",\r\n" +
                    "                \"okogu\": \"2300229\",\r\n" +
                    "                \"okfs\": \"13\",\r\n" +
                    "                \"okved\": \"86.10\",\r\n" +
                    "                \"okveds\": null,\r\n" +
                    "                \"authorities\": null,\r\n" +
                    "                \"documents\": null,\r\n" +
                    "                \"licenses\": null,\r\n" +
                    "                \"finance\": {\r\n" +
                    "                    \"tax_system\": null,\r\n" +
                    "                    \"income\": null,\r\n" +
                    "                    \"expense\": null,\r\n" +
                    "                    \"revenue\": null,\r\n" +
                    "                    \"debt\": null,\r\n" +
                    "                    \"penalty\": null,\r\n" +
                    "                    \"year\": null\r\n" +
                    "                },\r\n" +
                    "                \"address\": {\r\n" +
                    "                    \"value\": \"Ленинградская обл, г Приозерск, ул Калинина, д 35\",\r\n" +
                    "                    \"unrestricted_value\": \"188760, Ленинградская обл, Приозерский р-н, г Приозерск, ул Калинина, д 35\",\r\n" +
                    "                    \"invalidity\": null,\r\n" +
                    "                    \"data\": {\r\n" +
                    "                        \"postal_code\": \"188760\",\r\n" +
                    "                        \"country\": \"Россия\",\r\n" +
                    "                        \"country_iso_code\": \"RU\",\r\n" +
                    "                        \"federal_district\": \"Северо-Западный\",\r\n" +
                    "                        \"region_fias_id\": \"6d1ebb35-70c6-4129-bd55-da3969658f5d\",\r\n" +
                    "                        \"region_kladr_id\": \"4700000000000\",\r\n" +
                    "                        \"region_iso_code\": \"RU-LEN\",\r\n" +
                    "                        \"region_with_type\": \"Ленинградская обл\",\r\n" +
                    "                        \"region_type\": \"обл\",\r\n" +
                    "                        \"region_type_full\": \"область\",\r\n" +
                    "                        \"region\": \"Ленинградская\",\r\n" +
                    "                        \"area_fias_id\": \"b435ee4b-d67c-4fa9-b2e6-209edbb133f8\",\r\n" +
                    "                        \"area_kladr_id\": \"4701500000000\",\r\n" +
                    "                        \"area_with_type\": \"Приозерский р-н\",\r\n" +
                    "                        \"area_type\": \"р-н\",\r\n" +
                    "                        \"area_type_full\": \"район\",\r\n" +
                    "                        \"area\": \"Приозерский\",\r\n" +
                    "                        \"city_fias_id\": \"59a9c284-72fb-49e6-8380-10ca044d0bd7\",\r\n" +
                    "                        \"city_kladr_id\": \"4701500100000\",\r\n" +
                    "                        \"city_with_type\": \"г Приозерск\",\r\n" +
                    "                        \"city_type\": \"г\",\r\n" +
                    "                        \"city_type_full\": \"город\",\r\n" +
                    "                        \"city\": \"Приозерск\",\r\n" +
                    "                        \"city_area\": null,\r\n" +
                    "                        \"city_district_fias_id\": null,\r\n" +
                    "                        \"city_district_kladr_id\": null,\r\n" +
                    "                        \"city_district_with_type\": null,\r\n" +
                    "                        \"city_district_type\": null,\r\n" +
                    "                        \"city_district_type_full\": null,\r\n" +
                    "                        \"city_district\": null,\r\n" +
                    "                        \"settlement_fias_id\": null,\r\n" +
                    "                        \"settlement_kladr_id\": null,\r\n" +
                    "                        \"settlement_with_type\": null,\r\n" +
                    "                        \"settlement_type\": null,\r\n" +
                    "                        \"settlement_type_full\": null,\r\n" +
                    "                        \"settlement\": null,\r\n" +
                    "                        \"street_fias_id\": \"9bbaa2ce-dec9-4117-92d1-1a40de1314a5\",\r\n" +
                    "                        \"street_kladr_id\": \"47015001000002400\",\r\n" +
                    "                        \"street_with_type\": \"ул Калинина\",\r\n" +
                    "                        \"street_type\": \"ул\",\r\n" +
                    "                        \"street_type_full\": \"улица\",\r\n" +
                    "                        \"street\": \"Калинина\",\r\n" +
                    "                        \"stead_fias_id\": null,\r\n" +
                    "                        \"stead_cadnum\": null,\r\n" +
                    "                        \"stead_type\": null,\r\n" +
                    "                        \"stead_type_full\": null,\r\n" +
                    "                        \"stead\": null,\r\n" +
                    "                        \"house_fias_id\": \"33cad95e-57e5-47cd-948f-d974e4ac06a4\",\r\n" +
                    "                        \"house_kladr_id\": \"4701500100000240045\",\r\n" +
                    "                        \"house_cadnum\": \"47:03:0301008:127\",\r\n" +
                    "                        \"house_flat_count\": \"0\",\r\n" +
                    "                        \"house_type\": \"д\",\r\n" +
                    "                        \"house_type_full\": \"дом\",\r\n" +
                    "                        \"house\": \"35\",\r\n" +
                    "                        \"block_type\": null,\r\n" +
                    "                        \"block_type_full\": null,\r\n" +
                    "                        \"block\": null,\r\n" +
                    "                        \"entrance\": null,\r\n" +
                    "                        \"floor\": null,\r\n" +
                    "                        \"flat_fias_id\": null,\r\n" +
                    "                        \"flat_cadnum\": null,\r\n" +
                    "                        \"flat_type\": null,\r\n" +
                    "                        \"flat_type_full\": null,\r\n" +
                    "                        \"flat\": null,\r\n" +
                    "                        \"flat_area\": \"-1\",\r\n" +
                    "                        \"square_meter_price\": \"-1\",\r\n" +
                    "                        \"flat_price\": null,\r\n" +
                    "                        \"room_fias_id\": null,\r\n" +
                    "                        \"room_cadnum\": null,\r\n" +
                    "                        \"room_type\": null,\r\n" +
                    "                        \"room_type_full\": null,\r\n" +
                    "                        \"room\": null,\r\n" +
                    "                        \"postal_box\": null,\r\n" +
                    "                        \"fias_id\": \"33cad95e-57e5-47cd-948f-d974e4ac06a4\",\r\n" +
                    "                        \"fias_code\": \"47015001000000000240045\",\r\n" +
                    "                        \"fias_level\": \"8\",\r\n" +
                    "                        \"fias_actuality_state\": \"0\",\r\n" +
                    "                        \"kladr_id\": \"4701500100000240045\",\r\n" +
                    "                        \"geoname_id\": \"505230\",\r\n" +
                    "                        \"capital_marker\": \"1\",\r\n" +
                    "                        \"okato\": \"41239501000\",\r\n" +
                    "                        \"oktmo\": \"41639101001\",\r\n" +
                    "                        \"tax_office\": \"4704\",\r\n" +
                    "                        \"tax_office_legal\": \"4704\",\r\n" +
                    "                        \"timezone\": \"UTC+3\",\r\n" +
                    "                        \"geo_lat\": \"61.0373549\",\r\n" +
                    "                        \"geo_lon\": \"30.1290996\",\r\n" +
                    "                        \"beltway_hit\": \"OUT_KAD\",\r\n" +
                    "                        \"beltway_distance\": \"105\",\r\n" +
                    "                        \"metro\": null,\r\n" +
                    "                        \"divisions\": null,\r\n" +
                    "                        \"qc_geo\": \"0\",\r\n" +
                    "                        \"qc_complete\": null,\r\n" +
                    "                        \"qc_house\": null,\r\n" +
                    "                        \"history_values\": null,\r\n" +
                    "                        \"unparsed_parts\": null,\r\n" +
                    "                        \"source\": \"188760, ЛЕНИНГРАДСКАЯ ОБЛАСТЬ, Р-Н ПРИОЗЕРСКИЙ, Г. ПРИОЗЕРСК, УЛ. КАЛИНИНА, Д.35, --, --\",\r\n" +
                    "                        \"qc\": \"0\"\r\n" +
                    "                    }\r\n" +
                    "                },\r\n" +
                    "                \"phones\": null,\r\n" +
                    "                \"emails\": null,\r\n" +
                    "                \"ogrn_date\": 1028678400000,\r\n" +
                    "                \"okved_type\": \"2014\",\r\n" +
                    "                \"employee_count\": null\r\n" +
                    "            }\r\n" +
                    "        }\r\n" +
                    "    ]\r\n" +
                    "}";
            return ResponseEntity.ok(jsonResponse);
        }
        else if (requestBody.contains("\"q\":\"Любой ИНН\"")) {
            // Формируем запрос к внешнему API
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            String externalRequest = "{\"q\": \"Любой ИНН\"}";
            HttpEntity<String> entity = new HttpEntity<>(externalRequest, headers);

            try {
                ResponseEntity<String> response = restTemplate.exchange(
                        "https://aft-test.moscow.alfaintra.net/api/dadata/suggest/party",
                        HttpMethod.POST,
                        entity,
                        String.class
                );

                return ResponseEntity.ok(response.getBody());
            } catch (Exception e) {
                logger.error("Ошибка при вызове внешнего API", e);
                return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
                        .body("{\"error\": \"Не удалось получить данные от внешнего сервиса\"}");
            }
        }
        else {
            return ResponseEntity.badRequest()
                    .body("{\"error\": \"Неподдерживаемый запрос\"}");
        }
    }
}
