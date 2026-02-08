package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EbgDealController {

    private static final Logger logger = LoggerFactory.getLogger(EbgDealController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay.health-check:0}")
    private long delay_EbgDeal;

    @PutMapping("/ebg/deal")
    public String EbgDeal() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_EbgDeal);

            // JSON-ответ
            String jsonResponse = "{\n" +
                    "    \"dealId\": 0,\n" +
                    "    \"dealStateId\": 0\n" +
                    "}";

            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "\"Error processing request\"";
        }
    }
}

