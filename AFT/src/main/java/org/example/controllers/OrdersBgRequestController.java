package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersBgRequestController {

    private static final Logger logger = LoggerFactory.getLogger(OrdersBgRequestController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_OrdersBgRequest:0}")
    private long delay_OrdersBgRequest;

    // Шаблон URL: {orderId} — переменная часть пути
    // Сохраняем все параметры запроса q=... как в оригинальном URL
    @GetMapping("/orders/{orderId}")
    public String OrdersBgRequest(@PathVariable String orderId) {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_OrdersBgRequest);

            // Фиксированный ответ — строка "1" (не JSON-массив!)
            String response = "[]";

            return response;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "{\"error\": \"Error processing request\"}";
        }
    }
}
