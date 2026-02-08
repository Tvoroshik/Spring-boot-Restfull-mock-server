package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetGroupsController {

    private static final Logger logger = LoggerFactory.getLogger(GetGroupsController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_GetGroups:0}")
    private long delay_GetGroups;

    @GetMapping("/getGroups")
    public String getGroups(@RequestParam(name = "inn", required = false) String inn) {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_GetGroups);

            // Фиксированный JSON-ответ (пример структуры)
            String jsonResponse = "{\n" +
                    "    \"group\": []\n" +
                    "}";

            logger.info("Request processed for inn={}, returning fixed response", inn);
            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "\"Error processing request\"";
        }
    }
}
