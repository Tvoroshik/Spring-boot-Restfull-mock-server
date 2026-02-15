package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersPrincipalLetterController {

    private static final Logger logger = LoggerFactory.getLogger(OrdersPrincipalLetterController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_OrdersPrincipalLetter:0}")
    private long delay_OrdersPrincipalLetter;

    @GetMapping("/orders/{orderId}/allGrouped")
    public String ordersPrincipalLetter(
            @PathVariable String orderId,
            @RequestParam(name = "q") String queryParam
    ) {
        try {
            // Проверяем, что параметр q равен "principalLetter"
            if (!"principalLetter".equals(queryParam)) {
                return "{\"error\": \"Invalid query parameter 'q'\"}";
            }

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
