package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CustomerLimitGuaranteesController {

    private static final Logger log = LoggerFactory.getLogger(CustomerLimitGuaranteesController.class);

    @Value("${app.delay.customer_limit_guarantees_controller:0}")
    private long customer_limit_guarantees_controller_delay;

    @GetMapping(
            value = "/customer/{customerId}/account/limit-guarantees",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Object getLimitGuarantees(@PathVariable String customerId) {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(customer_limit_guarantees_controller_delay);

            // Формируем простой JSON ответ
            return false;

        } catch (Exception e) {
            log.error("Ошибка обработки запроса для customerId: {}", customerId, e);
            return Map.of("error", "Произошла ошибка при обработке запроса");
        }
    }
}
