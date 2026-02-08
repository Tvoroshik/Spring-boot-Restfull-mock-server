package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClmSendPinClientController {

    private static final Logger logger = LoggerFactory.getLogger(ClmSendPinClientController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_ClmSendPinClient:0}")
    private long delay_ClmSendPinClient;

    @GetMapping("/clm/sendPinClient")
    public String ClmSendPinClient() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_ClmSendPinClient);

            // JSON-строка с датой (можно оформить как полноценный JSON, если нужно)
            String jsonResponse = "\n" +
                    "    \"pxObjClass\": \"string\",\n" +
                    "\n" +
                    "    \"errors\": [\n" +
                    "\n" +
                    "      {\n" +
                    "\n" +
                    "        \"message\": \"string\",\n" +
                    "\n" +
                    "        \"pxObjClass\": \"string\",\n" +
                    "\n" +
                    "        \"ID\": \"string\"\n" +
                    "\n" +
                    "      }\n" +
                    "\n" +
                    "    ],\n" +
                    "\n" +
                    "    \"ID\": \"string\"\n" +
                    "\n" +
                    "  }";


            logger.info("Health check request processed successfully (delay: {} ms)", delay_ClmSendPinClient);
            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing health check request", e);
            Thread.currentThread().interrupt();
            return "Error processing request";
        }
    }
}
