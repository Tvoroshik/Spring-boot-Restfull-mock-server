package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerifyController {

    private static final Logger logger = LoggerFactory.getLogger(VerifyController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_Verify:0}")
    private long delay_Verify;

    @PostMapping("/verify")
    public String Verify() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_Verify);

            // Фиксированный JSON-ответ
            String jsonResponse = "{\n" +
                    "\"signType\": 0,\n" +
                    "\"signatureResult\": false,\n" +
                    "\"certResult\": false,\n" +
                    "\"certDetails\": [],\n" +
                    "\"signDetails\": [],\n" +
                    "\"signatureDetails\": \"AsnlException: ASN.1 decode error @ offset 0:\\nTag match failed: expected [UNIVERSAL 16], parsed [UNIVERSAL 5]\"\n" +
                    "}";

            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "{\"error\": \"Error processing request\"}";
        }
    }
}
