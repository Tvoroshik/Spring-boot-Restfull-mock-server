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
//public class OrdersBgRequestController {
//
//    private static final Logger logger = LoggerFactory.getLogger(OrdersBgRequestController.class);
//
//    // Читаем значение задержки из application.properties
//    @Value("${app.delay_OrdersBgRequest:0}")
//    private long delay_OrdersBgRequest;
//
//    // Шаблон URL: {orderId} — динамическая часть пути
//    // Параметр q поддерживает список значений через запятую
//    @GetMapping("/orders/{orderId}?q=bgRequest,beneficiaryLetter,principalletter,questionnaire,guaranteeContract,guaranteeLot")
//    public String OrdersBgRequest(
//            @PathVariable String orderId,
//            @RequestParam(required = false) String q
//    ) {
//        try {
//            // Добавляем задержку (в миллисекундах)
//            Thread.sleep(delay_OrdersBgRequest);
//
//            // Фиксированный JSON-ответ
//            String jsonResponse = "[]";
//
//            return jsonResponse;
//
//        } catch (InterruptedException e) {
//            logger.error("Error processing request for orderId: {}, q: {}", orderId, q, e);
//            Thread.currentThread().interrupt();
//            return "{\"error\": \"Error processing request\"}";
//        }
//    }
//}
