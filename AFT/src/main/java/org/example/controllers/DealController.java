package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class DealController {

    private static final Logger log = LoggerFactory.getLogger(DealController.class);

    @Value("${app.delay.deal:0}")
    private long Deal_delay;

    @PutMapping(
            value = "/deal",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Object createDeal(@RequestBody Map<String, Object> requestBody) {
        try {

            Thread.sleep(Deal_delay); // ПРОСТО ЗАДЕРЖКА

            // Создаем ответ
            Map<String, Object> response = new HashMap<>();

            // Заполняем поля
            response.put("dealId", 123);
            response.put("dealStateId", 124);

            log.info("Создана сделка с параметрами: {}", requestBody);
            return response;
        } catch (Exception e) {
            log.error("Ошибка при создании сделки", e);
            return Map.of("error", "Произошла ошибка при обработке запроса");
        }
    }
}
