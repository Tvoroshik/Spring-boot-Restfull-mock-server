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
    @Value("${app.delay_passport:0}")
    private long delayPassport;

    /**
     * Обрабатывает GET-запрос на /passport
     * Поддерживает:
     * - /passport?passport=1234567890
     * - /passport?passport=111,222
     */
    @GetMapping("/passport")
    public String PassportPassportRequest(
            @RequestParam(name = "passport", required = false) String passportParam
    ) {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delayPassport);

            StringBuilder jsonResponse = new StringBuilder();

            if (passportParam == null || passportParam.trim().isEmpty()) {
                // Если параметр не передан
                jsonResponse.append("{\n")
                        .append("  \"passportNumber\": \"not_provided\",\n")
                        .append("  \"isInvalid\": false\n")
                        .append("}");
            } else {
                // Разделяем по запятой
                String[] passportNumbers = passportParam.split(",");

                if (passportNumbers.length == 1) {
                    // Один номер паспорта
                    String passportNumber = passportNumbers[0].trim();
                    jsonResponse.append("{\n")
                            .append("  \"passportNumber\": \"").append(passportNumber).append("\",\n")
                            .append("  \"isInvalid\": false\n")
                            .append("}");
                } else if (passportNumbers.length >= 2) {
                    // Два или более номеров (берём первые два)
                    String passportNumber1 = passportNumbers[0].trim();
                    String passportNumber2 = passportNumbers[1].trim();

                    jsonResponse.append("[\n");

                    // Первый паспорт
                    jsonResponse.append("  {\n")
                            .append("    \"passportNumber\": \"").append(passportNumber1).append("\",\n")
                            .append("    \"isInvalid\": false\n")
                            .append("  },\n");

                    // Второй паспорт
                    jsonResponse.append("  {\n")
                            .append("    \"passportNumber\": \"").append(passportNumber2).append("\",\n")
                            .append("    \"isInvalid\": false\n")
                            .append("  }\n");

                    jsonResponse.append("]");
                }
            }

            logger.info("Request processed with passport='{}', returning response", passportParam);
            return jsonResponse.toString();

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "{\"error\": \"Error processing request\"}";
        }
    }
}
