
package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class withoutPurchaseNumberReasonsController {

    private static final Logger logger = LoggerFactory.getLogger(withoutPurchaseNumberReasonsController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_withoutPurchaseNumberReasons:0}")
    private long delay_withoutPurchaseNumberReasons;

    @GetMapping("/api/common/ref/withoutPurchaseNumberReasons")
    public String withoutPurchaseNumberReasons() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_withoutPurchaseNumberReasons);

            // Фиксированный JSON-ответ
            String jsonResponse = "[{\n" +
                    "  \"code\": \"singleSupplier\",\n" +
                    "  \"value\": \"Контракт с единственным поставщиком\"\n" +
                    "},\n" +
                    "{\n" +
                    "  \"code\": \"isP2Ch11St24\",\n" +
                    "  \"value\": \"Закупка осуществляется в соответствии с п.2 ч. 11 ст. 24 Закона 44-ФЗ\"\n" +
                    "}\n]";

            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "{\"error\": \"Error processing request\"}";
        }
    }
}