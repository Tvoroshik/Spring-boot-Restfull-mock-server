
package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class generateDocTypebgApprovedController {

    private static final Logger logger = LoggerFactory.getLogger(generateDocTypebgApprovedController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_GenerateDocTypebgApproved:0}")
    private long delay_generateDocTypebgApproved;

    @GetMapping("/api/bg-api-doc-template/generate?docType-bgApproved&isDraft=false&orderld-019hf6d7-8c5f-7053-8eb2-5d8b86ac9300")
    public String enerateDocTypebgApproved() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_generateDocTypebgApproved);

            // Фиксированный JSON-ответ (можно заменить на нужную структуру)
            String jsonResponse = "[]";

            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "\"Error processing request\"";
        }
    }
}
