package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SuggestOktmoController {

    private static final Logger logger = LoggerFactory.getLogger(SuggestOktmoController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_SuggestOktmo:0}")
    private long delay_SuggestOktmo;

    @GetMapping("/health")
    public String healthCheck() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_SuggestOktmo);

            logger.info("Health check request processed successfully (delay: {} ms)", delay_SuggestOktmo);
            return "Server is running";

        } catch (InterruptedException e) {
            logger.error("Error processing health check request", e);
            Thread.currentThread().interrupt();
            return "Error processing request";
        }
    }
}
