package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersPrincipalLetterController {

    private static final Logger logger = LoggerFactory.getLogger(OrdersPrincipalLetterController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_OrdersPrincipalLetter:0}")
    private long delay_OrdersPrincipalLetter;

    @GetMapping("/orders/019bd682-11d9-780b-bea9-57231fa2bec5/allGrouped?q=principalLetter")
    public String OrdersPrincipalLetter() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_OrdersPrincipalLetter);

            // Фиксированный JSON-ответ
            String jsonResponse = "[]";

            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "{\"error\": \"Error processing request\"}";
        }
    }
}
