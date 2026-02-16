package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class orders1controller {

    private static final Logger logger = LoggerFactory.getLogger(orders1controller.class);

    @Value("${app.delay_Orders1:0}")
    private long delay_Orders1;

    @GetMapping("/orders/{orderId}/**")
    public ResponseEntity<String> orders1(@PathVariable String orderId) {  // ← исправлено!
        try {
            if (delay_Orders1 > 0) {
                Thread.sleep(delay_Orders1);
            }

            String jsonResponse = "[]";
            return ResponseEntity.ok(jsonResponse);

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return ResponseEntity
                    .status(500)
                    .body("{\"error\": \"Error processing request\"}");
        }
    }
}
