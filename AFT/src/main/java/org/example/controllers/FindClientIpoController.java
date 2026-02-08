package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindClientIpoController {

    private static final Logger logger = LoggerFactory.getLogger(FindClientIpoController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_FindClientIpo:0}")
    private long delay_FindClientIpo;

    @PostMapping("/client/findClientWatchList")
    public String findClientIpo(@RequestParam(name = "clientId", required = false) String clientId) {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_FindClientIpo);

            // Фиксированный JSON-ответ
            String jsonResponse = "{\n" +
                    "  \"firstLevelLimitOnClient\": \"0\",\n" +
                    "  \"firstLevelLimitOnClientGroupCompany\": \"0\"\n" +
                    "}";

            logger.info("Request processed for clientId={}, returning fixed response", clientId);
            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "\"Error processing request\"";
        }
    }
}
