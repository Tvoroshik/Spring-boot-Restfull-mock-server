package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DealDeleteController {

    private static final Logger logger = LoggerFactory.getLogger(DealDeleteController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_DealDelete:0}")
    private long delay_DealDelete;

    @PostMapping("/deal/delete")
    public String dealDelete() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_DealDelete);

            // JSON-ответ
            String jsonResponse = "{\n" +
                    "  \"dealId\": 123,\n" +
                    "  \"dealStateId\": 124\n" +
                    "}";

            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "\"Error processing request\"";
        }
    }
}
