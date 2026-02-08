package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientActualDateController {

    private static final Logger logger = LoggerFactory.getLogger(ClientActualDateController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_ClientActualDate:0}")
    private long delay_ClientActualDate;

    @GetMapping("/client/actualdate")
    public String clientActualDate(@RequestParam(name = "pinEq", required = false) String pinEq) {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_ClientActualDate);

            // JSON-строка с датой (можно оформить как полноценный JSON, если нужно)
            String jsonResponse = "\"2021-02-17\"";

            logger.info("Request processed for pinEq={}, returning: {}", pinEq, jsonResponse);
            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "\"Error processing request\"";
        }
    }
}
