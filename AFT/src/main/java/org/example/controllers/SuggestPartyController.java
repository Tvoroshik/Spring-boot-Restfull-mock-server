package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class SuggestPartyController {

    private static final Logger logger = LoggerFactory.getLogger(SuggestPartyController.class);

    @Value("${app.delay.suggest.party:0}")
    private long suggest_party_delay;

    // Массив с тестовыми данными для подстановки
    private static final List<PartyData> partyDataList = Arrays.asList(
            new PartyData("ГБУЗ ДККБ", "2309039134", "1022301425629"),
            new PartyData("ООО Ромашка", "7701234567", "1234567890123"),
            new PartyData("АО Звезда", "7726123456", "1122334455667"),
            new PartyData("ИП Иванов", "7712345678", "3216549870123"),
            new PartyData("ИП Ромашка", "7712343338", "3255559870123")
    );

    // Счетчик для циклического выбора данных из массива
    private static final AtomicInteger counter = new AtomicInteger(0);

    @PostMapping(
            value = "/suggest/party",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<String> SuggestPartyControllerResponse() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(suggest_party_delay);
        } catch (InterruptedException e) {
            logger.warn("Задержка прервана", e);
            Thread.currentThread().interrupt();
        }

        // Получаем текущие данные из массива по счетчику
        PartyData currentData = partyDataList.get(counter.getAndIncrement() % partyDataList.size());

        String jsonResponse = "{\n" +
                "  \"query\": \"5047155545\",\n" +
                "  \"suggestions\": [\n" +
                "    {\n" +
                "      \"value\": \"ООО \\\"НСЛ\\\"\",\n" +
                "      \"unrestricted_value\": \"ООО \\\"НСЛ\\\"\",\n" +
                "      \"data\": {\n" +
                "        \"kpp\": \"644901001\",\n" +
                "        \"kpp_largest\": null,\n" +
                "        \"capital\": null,\n" +
                "        \"invalid\": null,\n" +
                "        \"management\": {\n" +
                "          \"name\": \"Бельская Наталья Владимировна\",\n" +
                "          \"post\": \"ГЕНЕРАЛЬНЫЙ ДИРЕКТОР\",\n" +
                "          \"start_date\": 1717621200000,\n" +
                "          \"disqualified\": null\n" +
                "        },\n" +
                "        \"founders\": null,\n" +
                "        \"managers\": null,\n" +
                "        \"predecessors\": null,\n" +
                "        \"successors\": null,\n" +
                "        \"branch_type\": \"MAIN\",\n" +
                "        \"branch_count\": 0,\n" +
                "        \"source\": null,\n" +
                "        \"qc\": null,\n" +
                "        \"hid\": \"a26540b79c0a4c8d5412b3af1c8bfb1a6e1afd51803f32e002f574e23e51c1a5\",\n" +
                "        \"type\": \"LEGAL\",\n" +
                "        \"state\": {\n" +
                "          \"status\": \"ACTIVE\",\n" +
                "          \"code\": null,\n" +
                "          \"actuality_date\": 1751587200000,\n" +
                "          \"registration_date\": 1401667200000,\n" +
                "          \"liquidation_date\": null\n" +
                "        },\n" +
                "        \"opf\": {\n" +
                "          \"type\": \"2014\",\n" +
                "          \"code\": \"12300\",\n" +
                "          \"full\": \"Общество с ограниченной ответственностью\",\n" +
                "          \"short\": \"ООО\"\n" +
                "        },\n" +
                "        \"name\": {\n" +
                "          \"full_with_opf\": \"ОБЩЕСТВО С ОГРАНИЧЕННОЙ ОТВЕТСТВЕННОСТЬЮ \\\"НЕЗАВИСИМАЯ СТРОИТЕЛЬНАЯ ЛАБОРАТОРИЯ\\\"\",\n" +
                "          \"short_with_opf\": \"ООО \\\"НСЛ\\\"\",\n" +
                "          \"latin\": null,\n" +
                "          \"full\": \"НЕЗАВИСИМАЯ СТРОИТЕЛЬНАЯ ЛАБОРАТОРИЯ\",\n" +
                "          \"short\": \"НСЛ\"\n" +
                "        },\n" +
                "        \"inn\": \"5047155545\",\n" +
                "        \"ogrn\": \"1145047005840\",\n" +
                "        \"okpo\": \"33028746\",\n" +
                "        \"okato\": \"63250501000\",\n" +
                "        \"oktmo\": \"63650101001\",\n" +
                "        \"okogu\": \"4210014\",\n" +
                "        \"okfs\": \"16\",\n" +
                "        \"okved\": \"71.20.3\",\n" +
                "        \"okveds\": null,\n" +
                "        \"authorities\": null,\n" +
                "        \"documents\": null,\n" +
                "        \"licenses\": null,\n" +
                "        \"finance\": {\n" +
                "          \"tax_system\": null,\n" +
                "          \"income\": null,\n" +
                "          \"expense\": null,\n" +
                "          \"revenue\": null,\n" +
                "          \"debt\": null,\n" +
                "          \"penalty\": null,\n" +
                "          \"year\": null\n" +
                "        },\n" +
                "        \"address\": {\n" +
                "          \"value\": \"Саратовская обл, г Энгельс, Вологодский пер, зд 2А\",\n" +
                "          \"unrestricted_value\": \"413105, Саратовская обл, г Энгельс, Вологодский пер, зд 2А\",\n" +
                "          \"invalidity\": null,\n" +
                "          \"data\": {\n" +
                "            \"postal_code\": \"413105\",\n" +
                "            \"country\": \"Россия\",\n" +
                "            \"country_iso_code\": \"RU\",\n" +
                "            \"federal_district\": \"Приволжский\",\n" +
                "            \"region_fias_id\": \"df594e0e-a935-4664-9d26-0bae13f904fe\",\n" +
                "            \"region_kladr_id\": \"6400000000000\",\n" +
                "            \"region_iso_code\": \"RU-SAR\",\n" +
                "            \"region_with_type\": \"Саратовская обл\",\n" +
                "            \"region_type\": \"обл\",\n" +
                "            \"region_type_full\": \"область\",\n" +
                "            \"region\": \"Саратовская\",\n" +
                "            \"area_fias_id\": null,\n" +
                "            \"area_kladr_id\": null,\n" +
                "            \"area_with_type\": null,\n" +
                "            \"area_type\": null,\n" +
                "            \"area_type_full\": null,\n" +
                "            \"area\": null,\n" +
                "            \"city_fias_id\": \"c58d0505-54eb-4c34-8216-b14f7cdb0ecb\",\n" +
                "            \"city_kladr_id\": \"6400001300000\",\n" +
                "            \"city_with_type\": \"г Энгельс\",\n" +
                "            \"city_type\": \"г\",\n" +
                "            \"city_type_full\": \"город\",\n" +
                "            \"city\": \"Энгельс\",\n" +
                "            \"city_area\": null,\n" +
                "  \"city_district_fias_id\": null,\n" +
                "  \"city_district_kladr_id\": null,\n" +
                "  \"city_district_with_type\": null,\n" +
                "  \"city_district_type\": null,\n" +
                "  \"city_district_type_full\": null,\n" +
                "  \"city_district\": null,\n" +
                "  \"settlement_fias_id\": null,\n" +
                "  \"settlement_kladr_id\": null,\n" +
                "  \"settlement_with_type\": null,\n" +
                "  \"settlement_type\": null,\n" +
                "  \"settlement_type_full\": null,\n" +
                "  \"settlement\": null,\n" +
                "  \"street_fias_id\": \"b9e5d9da-ea55-4080-b910-de07d14c9551\",\n" +
                "  \"street_kladr_id\": \"64000013000004900\",\n" +
                "  \"street_with_type\": \"Вологодский пер\",\n" +
                "  \"street_type\": \"пер\",\n" +
                "  \"street_type_full\": \"переулок\",\n" +
                "  \"street\": \"Вологодский\",\n" +
                "  \"stead_fias_id\": null,\n" +
                "  \"stead_cadnum\": null,\n" +
                "  \"stead_type\": null,\n" +
                "  \"stead_type_full\": null,\n" +
                "  \"stead\": null,\n" +
                "  \"house_fias_id\": \"fd419c6a-80da-48a7-8007-16a6f63ef04a\",\n" +
                "  \"house_kladr_id\": \"6400001300000490016\",\n" +
                "  \"house_cadnum\": \"64:50:020615:695\",\n" +
                "  \"house_flat_count\": \"0\",\n" +
                "  \"house_type\": \"зд\",\n" +
                "  \"house_type_full\": \"здание\",\n" +
                "  \"house\": \"2А\",\n" +
                "  \"block_type\": null,\n" +
                "  \"block_type_full\": null,\n" +
                "  \"block\": null,\n" +
                "  \"entrance\": null,\n" +
                "  \"floor\": null,\n" +
                "  \"flat_fias_id\": null,\n" +
                "  \"flat_cadnum\": null,\n" +
                "  \"flat_type\": null,\n" +
                "  \"flat_type_full\": null,\n" +
                "  \"flat\": null,\n" +
                "  \"flat_area\": \"-1\",\n" +
                "  \"square_meter_price\": \"-1\",\n" +
                "  \"flat_price\": null,\n" +
                "  \"room_fias_id\": null,\n" +
                "  \"room_cadnum\": null,\n" +
                "  \"room_type\": null,\n" +
                "  \"room_type_full\": null,\n" +
                "  \"room\": null,\n" +
                "  \"postal_box\": null,\n" +
                "  \"fias_id\": \"fd419c6a-80da-48a7-8007-16a6f63ef04a\",\n" +
                "  \"fias_code\": \"64000013000000000490016\",\n" +
                "  \"fias_level\": \"8\",\n" +
                "  \"fias_actuality_state\": \"0\",\n" +
                "  \"kladr_id\": \"6400001300000490016\",\n" +
                "  \"geoname_id\": \"563464\",\n" +
                "  \"capital_marker\": \"0\",\n" +
                "  \"okato\": \"63250501000\",\n" +
                "  \"oktmo\": \"63650101001\",\n" +
                "  \"tax_office\": \"6449\",\n" +
                "  \"tax_office_legal\": \"6449\",\n" +
                "  \"timezone\": \"UTC+4\",\n" +
                "  \"geo_lat\": \"51.4770544\",\n" +
                "  \"geo_lon\": \"46.1155653\",\n" +
                "  \"beltway_hit\": null,\n" +
                "  \"beltway_distance\": null,\n" +
                "  \"metro\": null,\n" +
                "  \"divisions\": null,\n" +
                "  \"qc_geo\": \"0\",\n" +
                "  \"qc_complete\": null,\n" +
                "  \"qc_house\": null,\n" +
                "  \"history_values\": null,\n" +
                "  \"unparsed_parts\": null,\n" +
                "  \"source\": \"413105, САРАТОВСКАЯ ОБЛАСТЬ, М.Р-Н ЭНГЕЛЬССКИЙ, Г.П. ГОРОД ЭНГЕЛЬС, Г ЭНГЕЛЬС, ПЕР ВОЛОГОДСКИЙ, ЗД. 2А\",\n" +
                "  \"qc\": \"0\"\n" +
                "}\n" +
                "  },\n" +
                "  \"phones\": null,\n" +
                "  \"emails\": null,\n" +
                "  \"ogrn_date\": 1401667200000,\n" +
                "  \"okved_type\": \"2014\",\n" +
                "  \"employee_count\": null\n" +
                "}\n" +
                "]\n" +
                "}";


        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(jsonResponse);
    }

    // Вспомогательный класс для хранения данных организации
    private static class PartyData {
        private final String name;
        private final String inn;
        private final String ogrn;

        public PartyData(String name, String inn, String ogrn) {
            this.name = name;
            this.inn = inn;
            this.ogrn = ogrn;
        }

        public String getName() {
            return name;
        }

        public String getInn() {
            return inn;
        }

        public String getOgrn() {
            return ogrn;
        }
    }
}
