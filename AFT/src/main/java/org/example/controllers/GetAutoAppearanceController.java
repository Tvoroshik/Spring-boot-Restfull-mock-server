package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetAutoAppearanceController {

    private static final Logger logger = LoggerFactory.getLogger(GetAutoAppearanceController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_GetAutoAppearance:0}")
    private long delay_GetAutoAppearance;

    @PostMapping ("/getAutoAppearance")
    public String GetAutoAppearance() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_GetAutoAppearance);

            // Фиксированный JSON-ответ (можно заменить на нужную структуру)
            String jsonResponse = "{}";

            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "\"Error processing request\"";
        }
    }
}

