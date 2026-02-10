package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class PurchaseController {

    private static final Logger logger = LoggerFactory.getLogger(PurchaseController.class);

    @Value("${app.delay_purchase:0}")
    private long delay_purchase;

    @PostMapping("/api/common/purchases/034530004625000253")
    public String Purchase() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_purchase);
            String jsonResponse = "{\n" +
                    "  \"url\": \"https://zakupki.gov.ru/epz/order/notice/zk20/view/common-info.html?regNumber 0345300046725000253\",\n" +
                    "  \"subject\": \"Оказание услуг по ремонту видеоколоноскопов\",\n" +
                    "  \"Federal LawRefId\": \"44\",\n" +
                    "  \"lotNumber\": \"1\",\n" +
                    "  \"startAmount\": 34900000.00,\n" +
                    "  \"Ikz\": \"252471201725947120100100710023313244\",\n" +
                    "  \"customers\": [\n" +
                    "    {\n" +
                    "      \"company\": {\n" +
                    "        \"displayName\": \"ГОСУДАРСТВЕННОЕ БИДЖЕТНОЕ УЧРЕЖДЕНИЕ ЗДРАВООХРАНЕНИЯ ЛЕНИНГРАДСКОЙ ОБЛАСТИ \\\"ПРИОЗЕРСКАЯ МЕЖРАЙОННАЯ БОЛЬНИЦА\\\"\",\n" +
                    "        \"inn\": \"4712017259\",\n" +
                    "        \"ogrn\": \"1024781646243\",\n" +
                    "        \"regNum\": \"03453000467\",\n" +
                    "        \"email\": \"nachkontrakt@gbuz-pmb.ru\",\n" +
                    "        \"phone\": \"7-81379-51719\",\n" +
                    "        \"factAddress\": \"Российская Федерация, 188760, Ленинградская обл. Приозерский 8-8. Приозерск, Калинина 35\"\n" +
                    "      },\n" +
                    "      \"contractGuaranteeAmount\": 3490000.00\n" +
                    "    }\n" +
                    "  ],\n" +
                    "  \"customer\": {\n" +
                    "    \"displayName\": \"ГОСУДАРСТВЕННОЕ БЮДЖЕТНОЕ УЧРЕЖДЕНИЕ ЗДРАВООХРАНЕНИЯ ЛЕНИНГРАДСКОЙ ОБЛАСТИ \\\"ПРИОЗЕРСКАЯ МЕЖРАЙОННАЯ БОЛЬНИЦА\\\"\",\n" +
                    "    \"inn\": \"4712017259\",\n" +
                    "    \"ogrn\": \"1824701646243\",\n" +
                    "    \"regNum\": \"03453000467\",\n" +
                    "    \"email\": \"nachkontrakt@gbuz-pmb.ru\",\n" +
                    "    \"phone\": \"7-81379-51719\",\n" +
                    "    \"factAddress\": \"Российская Федерация, 188760, Ленинградская обл, Приозерский 8-8. Приозерск, Калинина 35--\"\n" +
                    "  }\n" +
                    "}";

            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request" , e);
            Thread.currentThread().interrupt();
            return "{\"error\": \"Error processing request\"}";
        }
    }
}


//
//package org.example.controllers;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.http.*;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.client.RestTemplate;
//
//@RestController
//public class PurchaseController {
//
//    private static final Logger logger = LoggerFactory.getLogger(PurchaseController.class);
//
//    @Value("${app.delay.purchase:0}")
//    private long delay_purchase;
//
//    private final RestTemplate restTemplate = new RestTemplate();
//
//    @GetMapping(value = "/purchases/purchase", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<String> getPurchase(
//            @RequestParam("reportId") String reportId,
//            @RequestParam("etpId") String etpId) {
//        try {
//            // Добавляем задержку
//            Thread.sleep(delay_purchase);
//        } catch (InterruptedException e) {
//            logger.warn("Задержка прервана", e);
//            Thread.currentThread().interrupt();
//        }
//
//        // Проверяем конкретный etpId
//        if ("0848600003321000037".equals(etpId)) {
//            String jsonResponse = "{\"data\": \"Ответ для etpId 0848600003321000037\", \"reportId\": \"" + reportId + "\"}";
//            return ResponseEntity.ok(jsonResponse);
//        }
//        else {
//            // Формируем запрос к внешнему API
//            String externalUrl = "https://aft-test.moscow.alfaintra.net/api/seldonpurchases/purchase?" +
//                    "reportId=" + reportId + "&etpId=" + etpId;
//
//            HttpHeaders headers = new HttpHeaders();
//            headers.setContentType(MediaType.APPLICATION_JSON);
//
//            HttpEntity<String> entity = new HttpEntity<>(headers);
//
//            try {
//                ResponseEntity<String> response = restTemplate.exchange(
//                        externalUrl,
//                        HttpMethod.GET,
//                        entity,
//                        String.class
//                );
//
//                return ResponseEntity.ok(response.getBody());
//            } catch (Exception e) {
//                logger.error("Ошибка при вызове внешнего API", e);
//                return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
//                        .body("{\"error\": \"Не удалось получить данные от внешнего сервиса\"}");
//            }
//        }
//    }
//}
