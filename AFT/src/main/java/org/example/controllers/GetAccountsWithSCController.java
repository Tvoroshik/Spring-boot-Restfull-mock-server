package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetAccountsWithSCController {

    private static final Logger logger = LoggerFactory.getLogger(GetAccountsWithSCController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_GetAccountsWithSC:0}")
    private long delay_GetAccountsWithSC;

    @GetMapping("/client/getAccountsWithSC")
    public String getAccountsWithSC(@RequestParam(name = "pinEq", required = false) String pinEq) {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_GetAccountsWithSC);

            // Фиксированный JSON-ответ (пример структуры)
            String jsonResponse = "{}";

            logger.info("Request processed for pinEq={}, returning fixed response", pinEq);
            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "\"Error processing request\"";
        }
    }
}
