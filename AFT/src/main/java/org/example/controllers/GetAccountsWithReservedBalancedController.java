package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetAccountsWithReservedBalancedController {

    private static final Logger logger = LoggerFactory.getLogger(GetAccountsWithReservedBalancedController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_GetAccountsWithReservedBalanced:0}")
    private long delay_GetAccountsWithReservedBalanced;

    @GetMapping("/client/getAccountsWithReservedBalanced?pinEq=UAU2IU")
    public String getAccountsWithReservedBalanced() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_GetAccountsWithReservedBalanced);

            // Фиксированный JSON-ответ (можно заменить на нужную структуру)
            String jsonResponse = "15000000.75";

            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "\"Error processing request\"";
        }
    }
}
