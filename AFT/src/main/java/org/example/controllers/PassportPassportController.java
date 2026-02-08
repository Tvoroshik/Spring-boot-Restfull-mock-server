package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PassportPassportController {

    private static final Logger logger = LoggerFactory.getLogger(PassportPassportController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_PassportPassport:0}")
    private long delay_PassportPassport;

    @GetMapping("/passport")
    public String passportPassport(@RequestParam(name = "passport", required = false) String passportNumber) {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_PassportPassport);

            // Формируем JSON-ответ с подстановкой переданного номера паспорта
            String jsonResponse = "{\n" +
                    "  \"passportNumber\": \"" +
                    (passportNumber != null ? passportNumber : "not_provided") + "\",\n" +
                    "  \"isInvalid\": false\n" +
                    "}";

            logger.info("Request processed for passport={}, returning response", passportNumber);
            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "{\"error\": \"Error processing request\"}";
        }
    }
}
