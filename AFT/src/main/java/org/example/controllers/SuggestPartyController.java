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

        String jsonResponse = "{\"app\": \"222\"}";




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
