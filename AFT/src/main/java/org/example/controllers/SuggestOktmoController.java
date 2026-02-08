package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SuggestOktmoController {

    private static final Logger logger = LoggerFactory.getLogger(SuggestOktmoController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_SuggestOktmo:0}")
    private long delay_SuggestOktmo;

    @PostMapping ("/suggest/oktmo")
    public String SuggestOktmo() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_SuggestOktmo);

            // Фиксированный JSON-ответ
            String jsonResponse = "{\n" +
                    "    \"suggestions\": [\n" +
                    "        {\n" +
                    "            \"value\": \"40305000\",\n" +
                    "            \"unrestricted_value\": \"40305000\",\n" +
                    "            \"data\": {\n" +
                    "                \"oktmo\": \"40305000\",\n" +
                    "                \"area_type\": \"3\",\n" +
                    "                \"area_code\": \"40305000\",\n" +
                    "                \"area\": \"муниципальный округ Измайловское\",\n" +
                    "                \"subarea_type\": null,\n" +
                    "                \"subarea_code\": null,\n" +
                    "                \"subarea\": null\n" +
                    "            }\n" +
                    "        }\n" +
                    "    ]\n" +
                    "}";

            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "{\"error\": \"Error processing request\"}";
        }
    }
}