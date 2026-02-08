package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindClientWatchListController {

    private static final Logger logger = LoggerFactory.getLogger(FindClientWatchListController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_FindClientWatchList:0}")
    private long delay_FindClientWatchList;

    @PostMapping("/client/FindClientWatchList")
    public String FindClientWatch() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_FindClientWatchList);

            // JSON-ответ
            String jsonResponse = "[\n" +
                    "    {\n" +
                    "      \"subjectPinEq\": \"PIN123456\",\n" +
                    "      \"subjectLmId\": 12345,\n" +
                    "      \"zoneTypeCode\": \"ZONE_TYPE_A\",\n" +
                    "      \"zoneTypeName\": \"Zone Name Example\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"subjectPinEq\": \"PIN789012\",\n" +
                    "      \"subjectLmId\": 67890,\n" +
                    "      \"zoneTypeCode\": \"ZONE_TYPE_B\",\n" +
                    "      \"zoneTypeName\": \"Another Zone\"\n" +
                    "    }\n" +
                    "  ]}";

            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "\"Error processing request\"";
        }
    }
}

