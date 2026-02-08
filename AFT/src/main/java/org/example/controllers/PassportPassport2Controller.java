package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PassportPassport2Controller {

    private static final Logger logger = LoggerFactory.getLogger(PassportPassport2Controller.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_PassportPassport2:0}")
    private long delay_PassportPassport2;

    @GetMapping("/passport")
    public String passportPassport2(
            @RequestParam(name = "passport1", required = false) String passportNumber1,
            @RequestParam(name = "passport2", required = false) String passportNumber2
    ) {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_PassportPassport2);

            // Формируем JSON-ответ с подстановкой переданных номеров паспортов
            StringBuilder jsonResponse = new StringBuilder("[\n");

            // Первый паспорт
            if (passportNumber1 != null) {
                jsonResponse.append("  {\n")
                        .append("    \"passportNumber\": \"").append(passportNumber1).append("\",\n")
                        .append("    \"isInvalid\": false\n")
                        .append("  },\n");
            }

            // Второй паспорт
            if (passportNumber2 != null) {
                jsonResponse.append("  {\n")
                        .append("    \"passportNumber\": \"").append(passportNumber2).append("\",\n")
                        .append("    \"isInvalid\": false\n")
                        .append("  }\n");
            } else {
                // Если второй паспорт не передан, всё равно добавляем элемент с not_provided
                jsonResponse.append("  {\n")
                        .append("    \"passportNumber\": \"not_provided\",\n")
                        .append("    \"isInvalid\": false\n")
                        .append("  }\n");
            }

            jsonResponse.append("]");

            logger.info("Request processed for passport1={}, passport2={}, returning response",
                    passportNumber1, passportNumber2);
            return jsonResponse.toString();

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "{\"error\": \"Error processing request\"}";
        }
    }
}
