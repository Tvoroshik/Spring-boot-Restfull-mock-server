package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersBillGuaranteeLotController {

    private static final Logger logger = LoggerFactory.getLogger(OrdersBillGuaranteeLotController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_OrdersBillGuaranteeLot:0}")
    private long delay_OrdersBillGuaranteeLot;

    // Шаблон URL: {orderId} — переменная часть пути
    // Параметры запроса (g-bill,guaranteeLotDraft,...) поддерживаются автоматически
    @GetMapping("/orders/{orderId}")
    public String OrdersBillGuaranteeLot(@PathVariable String orderId) {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_OrdersBillGuaranteeLot);

            // Фиксированный JSON-ответ — всегда пустой массив
            String jsonResponse = "[]";

            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "{\"error\": \"Error processing request\"}";
        }
    }
}
