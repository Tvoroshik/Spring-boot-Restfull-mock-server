package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersBillComDecreaseReasonController {

    private static final Logger logger = LoggerFactory.getLogger(OrdersBillComDecreaseReasonController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_OrdersBillComDecreaseReason:0}")
    private long delay_OrdersBillComDecreaseReason;

    // Шаблон URL: {orderId} — переменная часть пути
    // Поддерживаются параметры: q=bill,comDecreaseReason,questionnaire,guaranteeContract,guaranteeContractInLimit,guarantorCompanyContract,guarantorPersonContract,guaranteelot,bgScanLot
    @GetMapping("/orders/{orderId}/27")
    public String OrdersBillComDecreaseReason(@PathVariable String orderId) {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_OrdersBillComDecreaseReason);

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
