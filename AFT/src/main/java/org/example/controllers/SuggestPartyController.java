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
                "\"suggestions\": [\n" +
                "{\n" +
                "\"value\": \"" + currentData.getName() + "\",\n" +
                "\"unrestricted_value\": \"" + currentData.getName() + "\",\n" +
                "\"data\": {\n" +
                "\"kpp\": \"230901001\",\n" +
                "\"kpp_largest\": null,\n" +
                "\"capital\": null,\n" +
                "\"invalid\": null,\n" +
                "\"management\": {\n" +
                "\"name\": \"Клещенко Елена Ивановна\",\n" +
                "\"post\": \"ГЛАВНЫЙ ВРАЧ\",\n" +
                "\"start_date\": 1204837200000,\n" +
                "\"disqualified\": null\n" +
                "},\n" +
                "\"founders\": null,\n" +
                "\"managers\": null,\n" +
                "\"predecessors\": null,\n" +
                "\"successors\": null,\n" +
                "\"branch_type\": \"MAIN\",\n" +
                "\"branch_count\": 0,\n" +
                "\"source\": null,\n" +
                "\"qc\": null,\n" +
                "\"hid\": \"657833fb4a43345d5a3c5861bb492708b87903f4261ea0dae34aed3aff54a368\",\n" +
                "\"type\": \"LEGAL\",\n" +
                "\"state\": {\n" +
                "\"status\": \"ACTIVE\",\n" +
                "\"code\": null,\n" +
                "\"actuality_date\": 1754006400000,\n" +
                "\"registration_date\": 746150400000,\n" +
                "\"liquidation_date\": null\n" +
                "},\n" +
                "\"opf\": {\n" +
                "\"type\": \"2 Newton\",\n" +
                "\"code\": \"75203\",\n" +
                "\"full\": \"Государственное бюджетное учреждение субъекта Российской Федерации\",\n" +
                "\"short\": \"ГБУ\"\n" +
                "},\n" +
                "\"name\": {\n" +
                "\"full_with_opf\": \"ГОСУДАРСТВЕННОЕ БЮДЖЕТНОЕ УЧРЕЖДЕНИЕ ЗДРАВООХРАНЕНИЯ \\\"ДЕТСКАЯ КРАЕВАЯ КЛИНИЧЕСКАЯ БОЛЬНИЦА\\\" МИНИСТЕРСТВА ЗДРАВООХРАНЕНИЯ КРАСНОДАРСКОГО КРАЯ\",\n" +
                "\"short_with_opf\": \"" + currentData.getName() + "\",\n" +
                "\"latin\": null,\n" +
                "\"full\": \"ГОСУДАРСТВЕННОЕ БЮДЖЕТНОЕ УЧРЕЖДЕНИЕ ЗДРАВООХРАНЕНИЯ ДЕТСКАЯ КРАЕВАЯ КЛИНИЧЕСКАЯ БОЛЬНИЦА МИНИСТЕРСТВА ЗДРАВООХРАНЕНИЯ КРАСНОДАРСКОГО КРАЯ\",\n" +
                "\"short\": \"" + currentData.getName() + "\"\n" +
                "},\n" +
                "\"inn\": \"" + currentData.getInn() + "\",\n" +
                "\"ogrn\": \"" + currentData.getOgrn() + "\"\n" +
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
