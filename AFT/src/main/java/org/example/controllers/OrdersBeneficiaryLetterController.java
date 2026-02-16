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
//public class OrdersBeneficiaryLetterController {
//
//    private static final Logger logger = LoggerFactory.getLogger(OrdersBeneficiaryLetterController.class);
//
//    @Value("${app.delay_OrdersBeneficiaryLetter:0}")
//    private long delay_OrdersBeneficiaryLetter;
//
//    // Ловим любые запросы по шаблону:
//    // /orders/{orderId}/
//    // /orders/{orderId}/any/path/here
//    // /orders/{orderId}/foo?q=bar
//// Полный URL-шаблон без разбиения: всё после {orderId} — часть пути
//    @GetMapping("/orders/{orderId}/allGrouped/beneficiaryLetter")
//    public String OrdersComDecreaseReason(
//            @PathVariable String orderId,
//            @RequestParam(required = false, name = "q") String q
//    ) {
//        try {
//            // Проверяем формат orderId (опционально: UUID)
//            if (!orderId.matches("[0-9a-fA-F\\-]{36}")) {
//                logger.warn("Invalid orderId format: {}", orderId);
//                return "{\"error\": \"Invalid orderId format\"}";
//            }
//
//            // Задержка, если задана
//            if (delay_OrdersBeneficiaryLetter > 0) {
//                Thread.sleep(delay_OrdersBeneficiaryLetter);
//            }
//
//            // Фиксированный ответ
//            String jsonResponse = "[]";
//
//            logger.info("Successfully processed request for orderId: {}, q: {}", orderId, q);
//            return jsonResponse;
//
//        } catch (InterruptedException e) {
//            logger.error("Request interrupted for orderId: {}, q: {}", orderId, q, e);
//            Thread.currentThread().interrupt();
//            return "{\"error\": \"Request processing interrupted\"}";
//        } catch (Exception e) {
//            logger.error("Unexpected error for orderId: {}, q: {}", orderId, q, e);
//            return "{\"error\": \"Internal server error\"}";
//        }
//    }
//}
//
