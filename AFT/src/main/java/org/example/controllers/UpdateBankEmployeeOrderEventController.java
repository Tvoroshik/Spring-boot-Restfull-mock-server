
package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateBankEmployeeOrderEventController {

    private static final Logger logger = LoggerFactory.getLogger(UpdateBankEmployeeOrderEventController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_UpdateBankEmployeeOrderEvent:0}")
    private long delay_UpdateBankEmployeeOrderEvent;

    @PostMapping("/internal/event/updateBankEmployeeOrderEvent")
    public String UpdateBankEmployeeOrderEvent() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_UpdateBankEmployeeOrderEvent);

            // Фиксированный JSON-ответ
            String jsonResponse = "{}";

            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "{\"error\": \"Error processing request\"}";
        }
    }
}