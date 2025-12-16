package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DealClosedController {

    private static final Logger logger = LoggerFactory.getLogger(DealClosedController.class);

    @Value("${app.delay.deal-controller:0}")
    private long dealControllerDelay;

    @PostMapping(
            value = "/deal/GetClosedDealsGroupsCompaniesByClient",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<String> getClosedDealsGroupsCompaniesByClient() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(dealControllerDelay);
        } catch (InterruptedException e) {
            logger.warn("Задержка прервана", e);
            Thread.currentThread().interrupt();
            return ResponseEntity.status(503)
                    .body("{\"error\":\"Request interrupted\"}");
        }

        String jsonResponse = """
        {
          "dataDeal": [
            {
              "dealId": 123,
              "dealStateId": 1,
              "dealType": "Кредит",
              "dealTypeCode": "CRD",
              "dealKind": "Основной",
              "dealKindCode": "MAIN",
              "fullName": "ООО Ромашка",
              "clientId": 456,
              "clientPin": "1234567890",
              "dealDocNumber": "№12345",
              "docDate": "2025-06-06",
              "beginDate": "2025-06-06",
              "endDate": "2025-06-06",
              "guaranteeBeginDate": "2025-06-06",
              "dealCloseDate": "2025-06-06",
              "sum": 1000000,
              "sumRest": 500000,
              "currency": "RUB",
              "inn": "7707083893",
              "status": "Активна",
              "additionalStatus": "Нет",
              "fz": "Залог",
              "reserveCategoryCDName": "Стандартный",
              "reserveRateCD": 10,
              "portfolioName": "Основной",
              "beneficiaryId": 789,
              "beneficiaryInn": "7712345678",
              "beneficiaryOgrn": "1122334455667",
              "beneficiaryKpp": "123456789"
            }
          ]
        }""";

        return ResponseEntity.ok(jsonResponse);
    }
}
