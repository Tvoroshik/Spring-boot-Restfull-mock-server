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

    // Шаблон URL: {orderId} — динамическая часть пути
    // Всё после {orderId} сохранено как цельная фиксированная строка
    @GetMapping("/orders/{orderId}?owner_id-initiaetoriq-bill, guaranteeLot_draft, guaranteeLot, guaranteeContract, guaranteeContractIntimit, questionnaire, guarantorCompany Contract, guarantorlersonContract")
    public String OrdersOwnerIdInitiator(
            @PathVariable String orderId
    ) {
        try {
            // Добавляем задержку (в миллисекундах)
            if (delay_OrdersOwnerIdInitiator > 0) {
                Thread.sleep(delay_OrdersOwnerIdInitiator);
            }

            // Фиксированный JSON-ответ
            String jsonResponse = "[]";

            logger.info("Successfully processed request for orderId: {}", orderId);
            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Request interrupted for orderId: {}", orderId, e);
            Thread.currentThread().interrupt();
            return "{\"error\": \"Request processing interrupted\"}";
        } catch (Exception e) {
            logger.error("Unexpected error for orderId: {}", orderId, e);
            return "{\"error\": \"Internal server error\"}";
        }
    }
}
