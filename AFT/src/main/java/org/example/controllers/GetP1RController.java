package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetP1RController {

    private static final Logger logger = LoggerFactory.getLogger(GetP1RController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_GetP1R:0}")
    private long delay_GetP1R;

    @GetMapping("/getP1R")
    public String getP1R(@RequestParam(name = "pinEq", required = false) String pinEq) {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_GetP1R);

            // Фиксированный JSON-ответ
            String jsonResponse = "L3V";

            logger.info("Request processed for pinEq={}, returning fixed response (delay: {} ms)", pinEq, delay_GetP1R);
            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "{\"error\": \"Error processing request\"}";
        }
    }
}
