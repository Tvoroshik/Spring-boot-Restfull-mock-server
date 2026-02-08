package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersBgRequestController {

    private static final Logger logger = LoggerFactory.getLogger(OrdersBgRequestController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_OrdersBgRequest:0}")
    private long delay_OrdersBgRequest;

    @GetMapping("/orders/019bfe6d-f58b-76cf-bfc2-05139ce597f2?q=bgRequest, beneficiaryLetter, principalletter, questionnaire, guaranteeContract, guaranteeLot")
    public String OrdersBgRequest() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_OrdersBgRequest);

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
