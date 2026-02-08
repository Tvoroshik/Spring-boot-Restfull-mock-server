package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoresCacheController {

    private static final Logger logger = LoggerFactory.getLogger(ScoresCacheController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_ScoresCache:0}")
    private long delay_ScoresCache;

    // Изменён шаблон URL: {businessKey} вместо {orderId}
    @PostMapping ("/scores/{businessKey}/cache")
    public String GetScoresCache(@PathVariable String businessKey) {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_ScoresCache);

            // Формируем JSON-ответ, подставляя businessKey в соответствующее поле
            String jsonResponse = "{\n" +
                    "\"businessKey\": \"" + businessKey + "\", \n" +
                    "\"messageName\": \"WSRM_SCORING_RESULT\", \n" +
                    "\"processVariables\": {\"DECISION\": {\"type\": \"String\", \"value\": \"ACCEPT\"}, \n" +
                    "\"PD_MODEL\": {\"type\": \"String\", \"value\": \"0.0035\"}, \n" +
                    "\"ERROR_TRACE\": {\"type\": \"String\", \"value\": \"\"}, \n" +
                    "\"RATING_MODEL\": {\"type\": \"String\", \"value\": \"B3\"}}\n" +
                    "}";

            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "{\"error\": \"Error processing request\"}";
        }
    }
}
