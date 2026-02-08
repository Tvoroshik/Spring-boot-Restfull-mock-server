package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SopdAddController {

    private static final Logger logger = LoggerFactory.getLogger(SopdAddController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_SopdAdd:0}")
    private long delay_SopdAdd;

    @PostMapping("/sopd/add")
    public String SopdAdd() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_SopdAdd);

            // Фиксированный JSON-ответ
            String jsonResponse = "1852274272";

            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "{\"error\": \"Error processing request\"}";
        }
    }
}