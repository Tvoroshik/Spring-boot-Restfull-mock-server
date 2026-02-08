package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersBeneficiaryLetterController {

    private static final Logger logger = LoggerFactory.getLogger(OrdersBeneficiaryLetterController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_OrdersBeneficiaryLetter:0}")
    private long delay_OrdersBeneficiaryLetter;

    @GetMapping("/orders/019bd682-11d9-780b-bea9-57231fa2bec5/allGrouped?q=beneficiaryLetter")
    public String delay_OrdersBeneficiaryLetter() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_OrdersBeneficiaryLetter);

            // Фиксированный JSON-ответ
            String jsonResponse = "[]";

            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "{\"error\": \"Error processing request\"}";
        }
    }
}
