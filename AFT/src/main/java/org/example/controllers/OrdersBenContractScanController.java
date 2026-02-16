//package org.example.controllers;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class OrdersBenContractScanController {
//
//    private static final Logger logger = LoggerFactory.getLogger(OrdersBenContractScanController.class);
//
//    // Читаем значение задержки из application.properties
//    @Value("${app.delay_OrdersBenContractScan:0}")
//    private long delay_OrdersBenContractScan;
//
//    /**
//     * Endpoint для получения данных по заказу.
//     * Принимает любой orderId и проверяет параметр q=benContractScan.
//     *
//     * Пример валидного запроса:
//     * GET /orders/12345/allGrouped?q=benContractScan
//     */
//    @GetMapping("/orders/{orderId}/allGrouped?q=benContractScan")
//    public String getOrdersBenContractScan(@PathVariable String orderId) {
//        try {
//
//            // Имитируем задержку обработки
//            if (delay_OrdersBenContractScan > 0) {
//                Thread.sleep(delay_OrdersBenContractScan);
//            }
//
//            // Возвращаем фиксированный JSON-ответ
//            return "[]";
//
//        } catch (InterruptedException e) {
//            logger.error("Ошибка при обработке запроса", e);
//            Thread.currentThread().interrupt();
//            return "{\"error\": \"Ошибка при обработке запроса\"}";
//        }
//    }
//}
