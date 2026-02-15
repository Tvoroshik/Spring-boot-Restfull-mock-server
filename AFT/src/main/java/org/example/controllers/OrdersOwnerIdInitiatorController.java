package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersOwnerIdInitiatorController {

    private static final Logger logger = LoggerFactory.getLogger(OrdersOwnerIdInitiatorController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_OrdersOwnerIdInitiator:0}")
    private long delay_OrdersOwnerIdInitiator;

    // Шаблон URL: {orderId} — переменная часть пути
    // Поддерживаются все параметры запроса (owner_id-initiator, q=...)
    @GetMapping("/orders/{orderId}")
    public String OrdersOwnerIdInitiator(@PathVariable String orderId) {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_OrdersOwnerIdInitiator);

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
