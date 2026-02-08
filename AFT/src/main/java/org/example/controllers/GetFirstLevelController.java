package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetFirstLevelController {

    private static final Logger logger = LoggerFactory.getLogger(GetFirstLevelController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_GetFirstLevel:0}")
    private long delay_GetFirstLevel;

    @GetMapping("/limit/getFirstLevelLimitsOnClients")
    public String getFirstLevel(@RequestParam("clientId") String clientId) {
        try {
            // Добавляем задержку (в миллисекундах), если задана
            if (delay_GetFirstLevel > 0) {
                Thread.sleep(delay_GetFirstLevel);
            }

            // Фиксированный JSON-ответ
            String jsonResponse = "{\n" +
                    "    \"firstLevelLimitsOnClient\": 0,\n" +
                    "    \"firstLevelLimitsOnClientGroupCompany\": 0\n" +
                    "}";

            logger.info("Returned static JSON for clientId={}", clientId);
            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request for clientId={}: {}", clientId, e.getMessage());
            Thread.currentThread().interrupt();
            return "{\"error\": \"Error processing request\"}";
        }
    }
}
