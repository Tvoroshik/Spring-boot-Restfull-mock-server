package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeledocOrdersController {

    private static final Logger logger = LoggerFactory.getLogger(TeledocOrdersController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_TeledocOrders:0}")
    private long delay_TeledocOrders;

    @PostMapping(value = "/teledoc-api/orders/info?orderIds=019bd214-9e21-7840-9f92-19651db1103e&orderIds=726c64f5-77e5-48e6-bc97-40c329b41470&orderIds=019bd682-11d9-780b-bea9-57231fa2bec5&orderIds=019bd18d-0e5a-7973-a198-9f892fb58be7&orderIds=019b0237-3171-7909-aa11-9057d3a5acf9&orderIds=4dc98345-e428-4dc4-985b-43453743d419&orderIds=019bdb33-561e-7949-924d-00532cf59f4a&orderIds=019bd1f4-5196-72f1-bc1e-7343c4c9c9f2&orderIds=5e44a550-050f-48b9-a132-ae1c7ff8fdca&orderIds=31b9f597-68bb-4805-8b91-ab5dee01f0e6&orderIds=019bd289-bd6f-7b6e-ad24-7a1ce8d28cfd&orderIds=019abcab-8675-72c3-acef-5d678652f9c5&orderIds=019bd3a1-60a0-7142-a0ca-7204f84ab74e&orderIds=019bfbed-972b-7d18-9b4c-ec0111e23811&orderIds=019bcdfd-4c1f-70b7-a6c8-38bc00f6c46d&orderIds=1ea7d023-e37e-4de8-be5c-298eb25165f3&orderIds=019abc9e-ea77-7ff2-bb46-5a6b8725dfc4&orderIds=c301ebde-8bbf-45fe-a81d-d0310917db69&orderIds=019bf6d7-8c5f-7053-8eb2-5d8b86ac9300&orderIds=019bcebc-117d-7253-b4bc-6ef40d06035c&orderIds=019abc75-d5cd-781e-a252-8c8bef315995&orderIds=59d8a0d2-f6d0-452b-a459-f0435d16d5ca&orderIds=4f80f62f-709b-4e9c-b8d0-3b0628e999a5&orderIds=019bfe6d-f58b-76cf-bfc2-05139ce597f2&orderIds=019bccdf-491a-7a3a-8679-30c383fd543b&orderIds=019afde2-9973-7c3f-a85c-11f284c8de9e&orderIds=a4b11b52-d82e-48fc-822d-e4326ab5e770&orderIds=019bd1e6-10ab-7bd2-952d-55605910a972&orderIds=019bd220-e412-7b83-8ea5-a5fe6bd43ed6&orderIds=d07c66ed-36e5-4bfe-8cb8-73098845b97d")
    public String TeledocOrders() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_TeledocOrders);

            // Фиксированный JSON-ответ
            String jsonResponse = "{}";

            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "{\"error\": \"Error processing request\"}";
        }
    }
}