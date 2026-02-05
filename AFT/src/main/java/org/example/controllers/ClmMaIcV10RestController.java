package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClmMaIcV10RestController {

    private static final Logger logger = LoggerFactory.getLogger(ClmMaIcV10RestController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_ClmMaIcV10Rest:0}")
    private long delay_ClmMaIcV10Rest;

    @GetMapping("/health")
    public String healthCheck() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_ClmMaIcV10Rest);

            logger.info("Health check request processed successfully (delay: {} ms)", delay_ClmMaIcV10Rest);
            return "Server is running";

        } catch (InterruptedException e) {
            logger.error("Error processing health check request", e);
            Thread.currentThread().interrupt();
            return "Error processing request";
        }
    }
}
