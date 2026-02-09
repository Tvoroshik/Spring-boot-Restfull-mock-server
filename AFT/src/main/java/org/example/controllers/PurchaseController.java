package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class PurchaseController {

    private static final Logger logger = LoggerFactory.getLogger(PurchaseController.class);

    @Value("${app.delay.purchase:0}")
    private long delay_purchase;

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping(value = "/purchases/purchase", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getPurchase(
            @RequestParam("reportId") String reportId,
            @RequestParam("etpId") String etpId) {
        try {
            // Добавляем задержку
            Thread.sleep(delay_purchase);
        } catch (InterruptedException e) {
            logger.warn("Задержка прервана", e);
            Thread.currentThread().interrupt();
        }

        // Проверяем конкретный etpId
        if ("0848600003321000037".equals(etpId)) {
            String jsonResponse = "{\"data\": \"Ответ для etpId 0848600003321000037\", \"reportId\": \"" + reportId + "\"}";
            return ResponseEntity.ok(jsonResponse);
        }
        else {
            // Формируем запрос к внешнему API
            String externalUrl = "https://aft-test.moscow.alfaintra.net/api/seldonpurchases/purchase?" +
                    "reportId=" + reportId + "&etpId=" + etpId;

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            HttpEntity<String> entity = new HttpEntity<>(headers);

            try {
                ResponseEntity<String> response = restTemplate.exchange(
                        externalUrl,
                        HttpMethod.GET,
                        entity,
                        String.class
                );

                return ResponseEntity.ok(response.getBody());
            } catch (Exception e) {
                logger.error("Ошибка при вызове внешнего API", e);
                return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
                        .body("{\"error\": \"Не удалось получить данные от внешнего сервиса\"}");
            }
        }
    }
}
