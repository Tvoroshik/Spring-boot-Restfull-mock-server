package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocumentGenerateController {

    private static final Logger logger = LoggerFactory.getLogger(DocumentGenerateController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_DocumentGenerate:0}")
    private long delay_DocumentGenerate;

    @PostMapping("/health")
    public String DocumentGenerate() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_DocumentGenerate);

            // JSON-ответ
            String jsonResponse = "{}";

            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "\"Error processing request\"";
        }
    }
}
