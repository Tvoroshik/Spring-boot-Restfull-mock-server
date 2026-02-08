package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SopdWsrmAddController {

    private static final Logger logger = LoggerFactory.getLogger(SopdWsrmAddController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_SopdWsrmAdd:0}")
    private long delay_SopdWsrmAdd;

    @PostMapping("/sopd/wsrm/add")
    public String SopdWsrmAdd() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_SopdWsrmAdd);

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