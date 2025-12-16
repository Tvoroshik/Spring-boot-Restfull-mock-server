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


    @Value("${app.delay.teledoc-orders:0}")
    private long teledocOrdersDelay;

    @PostMapping(value = "/teledoc-api/orders/info", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getOrdersInfo(@RequestParam("orderIds") List<String> orderIds) {
        try {
            Thread.sleep(teledocOrdersDelay);
        } catch (InterruptedException e) {
            logger.warn("Задержка прервана", e);
            Thread.currentThread().interrupt();
            return ResponseEntity.status(503).body("{\"error\":\"Request interrupted\"}");
        }

        String jsonResponse = """
        {
          "019a33f5-72bc-724b-94f8-b70e846133b1": {
            "teledocOrders": [
              {
                "bank": {
                  "code": "AbsolutBank",
                  "value": "Абсолют банк"
                },
                "status": {
                  "code": "Task",
                  "value": "Прикрепить документы"
                }
              },
              {
                "bank": {
                  "code": "SberBank",
                  "value": "Сбербанк"
                },
                "status": {
                  "code": "Task",
                  "value": "Прикрепить документы"
                }
              },
              {
                "bank": {
                  "code": "PromLinkBank",
                  "value": "Промсвязьбанк"
                },
                "status": {
                  "code": "Task",
                  "value": "Прикрепить документы"
                }
              },
              {
                "bank": {
                  "code": "BaikalInvestBank",
                  "value": "Реалист Банк"
                },
                "status": {
                  "code": "Task",
                  "value": "Прикрепить документы"
                }
              },
              {
                "bank": {
                  "code": "VTB",
                  "value": "ВТБ"
                },
                "status": {
                  "code": "Task",
                  "value": "Прикрепить документы"
                }
              },
              {
                "bank": {
                  "code": "SovcomBank",
                  "value": "Совкомбанк"
                },
                "status": {
                  "code": "Task",
                  "value": "Прикрепить документы"
                }
              }
            ]
          }
        }""";

        return ResponseEntity.ok(jsonResponse);
    }
}
