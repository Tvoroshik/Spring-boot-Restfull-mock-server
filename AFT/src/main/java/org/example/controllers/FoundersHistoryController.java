package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoundersHistoryController {

    private static final Logger logger = LoggerFactory.getLogger(FoundersHistoryController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_FoundersHistory:0}")
    private long delay_FoundersHistory;

    @GetMapping("/foundersHistory?ogrn=1177847411356&inn=7839095581")
    public String FoundersHistory() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_FoundersHistory);

            // JSON-ответ
            String jsonResponse = "[\n" +
                    "    {\n" +
                    "        \"ogrn\": \"1177847411356\",\n" +
                    "        \"inn\": \"7839095581\",\n" +
                    "        \"focusHref\": \"https://focus.kontur.ru/entity?query=1177847411356\",\n" +
                    "        \"companyHistory\": [\n" +
                    "            {\n" +
                    "                \"startDate\": \"2017-12-21\",\n" +
                    "                \"statedCapital\": 50000\n" +
                    "            }\n" +
                    "        ],\n" +
                    "        \"foundersHistory\": [\n" +
                    "            {\n" +
                    "                \"info\": {\n" +
                    "                    \"name\": \"Маценко Игорь Сергеевич\",\n" +
                    "                    \"inn\": \"784800585684\"\n" +
                    "                },\n" +
                    "                \"periods\": [\n" +
                    "                    {\n" +
                    "                        \"startDate\": \"2022-06-02\",\n" +
                    "                        \"egrul\": {\n" +
                    "                            \"share\": {\n" +
                    "                                \"sum\": 20000,\n" +
                    "                                \"percentagePlain\": 40.0\n" +
                    "                            }\n" +
                    "                        }\n" +
                    "                    }\n" +
                    "                ]\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"info\": {\n" +
                    "                    \"name\": \"Гримзе Олег Михайлович\",\n" +
                    "                    \"inn\": \"780219882850\"\n" +
                    "                },\n" +
                    "                \"periods\": [\n" +
                    "                    {\n" +
                    "                        \"startDate\": \"2018-08-16\",\n" +
                    "                        \"endDate\": \"2022-06-02\",\n" +
                    "                        \"egrul\": {\n" +
                    "                            \"share\": {\n" +
                    "                                \"sum\": 50000,\n" +
                    "                                \"percentagePlain\": 100\n" +
                    "                            }\n" +
                    "                        }\n" +
                    "                    },\n" +
                    "                    {\n" +
                    "                        \"startDate\": \"2022-06-02\",\n" +
                    "                        \"egrul\": {\n" +
                    "                            \"share\": {\n" +
                    "                                \"sum\": 13750,\n" +
                    "                                \"percentagePlain\": 27.500\n" +
                    "                            }\n" +
                    "                        }\n" +
                    "                    }\n" +
                    "                ]\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"info\": {\n" +
                    "                    \"name\": \"Гримзе Сергей Максимович\",\n" +
                    "                    \"inn\": \"780158287668\"\n" +
                    "                },\n" +
                    "                \"periods\": [\n" +
                    "                    {\n" +
                    "                        \"startDate\": \"2022-06-02\",\n" +
                    "                        \"egrul\": {\n" +
                    "                            \"share\": {\n" +
                    "                                \"sum\": 8750,\n" +
                    "                                \"percentagePlain\": 17.500\n" +
                    "                            }\n" +
                    "                        }\n" +
                    "                    }\n" +
                    "                ]\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"info\": {\n" +
                    "                    \"name\": \"Кулинич Мария Анатольевна\",\n" +
                    "                    \"inn\": \"780620399603\"\n" +
                    "                },\n" +
                    "                \"periods\": [\n" +
                    "                    {\n" +
                    "                        \"startDate\": \"2022-06-02\",\n" +
                    "                        \"egrul\": {\n" +
                    "                            \"share\": {\n" +
                    "                                \"sum\": 7500,\n" +
                    "                                \"percentagePlain\": 15.00\n" +
                    "                            }\n" +
                    "                        }\n" +
                    "                    }\n" +
                    "                ]\n" +
                    "            }\n" +
                    "        ]\n" +
                    "    }\n" +
                    "]";

            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "\"Error processing request\"";
        }
    }
}
