package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitWithoutGranteesController {

    private static final Logger logger = LoggerFactory.getLogger(LimitWithoutGranteesController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_LimitWithoutGrantees:0}")
    private long delay_LimitWithoutGrantees;

    // Изменяем URL: делаем идентификатор переменным через {customerId}
    @GetMapping("/customer/{customerId}/account/limit-without-guarantees")
    public String LimitWithoutGrantees(@PathVariable String customerId) {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_LimitWithoutGrantees);

            // Формируем JSON-ответ, подставляя customerId из URL
            String jsonResponse = "{\n" +
                    "    \"customerId\": \"" + customerId + "\",\n" +
                    "    \"limit\": 0\n" +
                    "}";

            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "{\"error\": \"Error processing request\"}";
        }
    }
}
