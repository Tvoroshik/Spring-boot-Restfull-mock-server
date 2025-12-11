package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CustomerLimitController {

    private static final Logger log = LoggerFactory.getLogger(CustomerLimitController.class);

    @Value("${app.delay.customer_limit_controller:0}")
    private long customer_limit_controller_delay;

    @GetMapping(
            value = "/customer/{customerId}/account/limit",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Object getCustomerLimit(@PathVariable String customerId) {
        try {

            // Добавляем задержку (в миллисекундах)
            Thread.sleep(customer_limit_controller_delay);
            // Создаем ответ
            Map<String, Object> response = new HashMap<>();

            // Заполняем поля
            response.put("customerId", customerId);
            response.put("limit", 0);

            log.info("Получен запрос для customerId: {}", customerId);
            return response;
        } catch (Exception e) {
            log.error("Ошибка обработки запроса для customerId: {}", customerId, e);
            return Map.of("error", "Произошла ошибка при обработке запроса");
        }
    }
}
