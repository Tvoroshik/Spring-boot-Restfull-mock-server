package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teledoc-api")
public class TeledocOrdersController {

    private static final Logger logger = LoggerFactory.getLogger(TeledocOrdersController.class);

    @Value("${app.delay_TeledocOrders:0}")
    private long delay_TeledocOrders;

    /**
     * Обрабатывает любые запросы к /teledoc-api/**:
     * - GET /teledoc-api/orders/info
     * - POST /teledoc-api/any/path/here
     * - PUT /teledoc-api/something?param=value
     * - DELETE /teledoc-api/*
     * Всегда возвращает фиксированный JSON: {}
     */
    @RequestMapping("/**")
    public ResponseEntity<String> handleAnyTeledocRequest() {
        try {
            // Добавляем задержку, если настроена (в миллисекундах)
            if (delay_TeledocOrders > 0) {
                Thread.sleep(delay_TeledocOrders);
            }

            // Фиксированный JSON-ответ
            String jsonResponse = "{}";

            return ResponseEntity.ok()
                    .contentType(org.springframework.http.MediaType.APPLICATION_JSON)
                    .body(jsonResponse);

        } catch (InterruptedException e) {
            logger.error("Error processing teledoc request", e);
            Thread.currentThread().interrupt();
            return ResponseEntity
                    .status(org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("{\"error\": \"Error processing request\"}");
        }
    }
}
