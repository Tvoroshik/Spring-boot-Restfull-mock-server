package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DealNumbertypeController {

    private static final Logger logger = LoggerFactory.getLogger(DealNumbertypeController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_DealNumbertype:0}")
    private long delay_DealNumbertype;

    @PostMapping("/deal/number")
    public String dealNumbertype(@RequestParam(name = "type", required = false) String type) {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_DealNumbertype);

            // Фиксированный JSON-ответ
            String jsonResponse = "{\n" +
                    "  \"result\": \"success\",\n" +
                    "  \"dealNumber\": \"BG123456789\",\n" +
                    "  \"message\": \"Номер успешно зарезервирован\"\n" +
                    "}";

            logger.info("Request processed for type={}, returning fixed response", type);
            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "\"Error processing request\"";
        }
    }
}
