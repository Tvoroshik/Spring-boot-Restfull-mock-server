package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AnalyticController {

    private static final Logger logger = LoggerFactory.getLogger(AnalyticController.class);

    @Value("${app.delay.analytic:0}")
    private long analyticDelay;

    // Два готовых JSON-ответа в виде строк
    private static final String JSON_RESPONSE_1 =
            "{\"status\":\"success\",\"inn\":\"1\",\"data\":\"Ответ для inn=1\"}";

    private static final String JSON_RESPONSE_2 =
            "{\"status\":\"success\",\"inn\":\"%s\",\"data\":\"Ответ для любого другого inn\"}";


    @GetMapping("/analytics")
    public ResponseEntity<String> getAnalytics(
            @RequestParam String ogrn,
            @RequestParam String inn) {

        try {
            logger.info("Received analytics request. inn={}, ogrn={}", inn, ogrn);

            if (analyticDelay > 0) {
                Thread.sleep(analyticDelay);
            }

            String jsonResponse;
            if ("7839095581".equals(inn)) {
                jsonResponse = JSON_RESPONSE_1;
            } else {
                jsonResponse = String.format(JSON_RESPONSE_2, inn);
            }

            return ResponseEntity
                    .ok()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(jsonResponse);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            logger.error("Request processing interrupted", e);
            return ResponseEntity.status(500)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body("{\"error\": \"Request was interrupted\"}");

        } catch (Exception e) {
            logger.error("Unexpected error in getAnalytics", e);
            return ResponseEntity.status(500)
                    .contentType(MediaType.APPLICATION_JSON)
                    .body("{\"error\": \"Internal server error\"}");
        }
    }
}
