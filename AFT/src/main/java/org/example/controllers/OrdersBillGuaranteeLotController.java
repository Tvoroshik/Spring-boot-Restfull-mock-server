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
//public class OrdersBillGuaranteeLotController {
//
//    private static final Logger logger = LoggerFactory.getLogger(OrdersBillGuaranteeLotController.class);
//
//    // Читаем значение задержки из application.properties
//    @Value("${app.delay_OrdersBillGuaranteeLot:0}")
//    private long delay_OrdersBillGuaranteeLot;
//
//    // Полный URL-шаблон без разбиения: всё после {orderId} — часть пути
//    @GetMapping("/orders/{orderId}/bill,guaranteeLot draft,guaranteelot,guaranteeContract,guaranteeContractinLimit,questionnaire,guarantorCompanyContract,guarantorPersonContract")
//    public String OrdersBillGuaranteeLot(
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
//            if (delay_OrdersBillGuaranteeLot > 0) {
//                Thread.sleep(delay_OrdersBillGuaranteeLot);
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
