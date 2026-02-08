package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignPdfController {

    private static final Logger logger = LoggerFactory.getLogger(SignPdfController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_SignPdf:0}")
    private long delay_SignPdf;

    @PostMapping("/signPdf")
    public String SignPdf() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_SignPdf);

            // Фиксированный JSON-ответ
            String jsonResponse = "%PDF-1.7\n" +
                    "%????\n" +
                    "1 0 obj\n" +
                    "<</Type/Catalog/Pages 2 0 R>>\n" +
                    "...\n" +
                    "%%EOF";

            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "{\"error\": \"Error processing request\"}";
        }
    }
}