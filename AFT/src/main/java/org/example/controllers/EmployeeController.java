package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_Employee:0}")
    private long delay_Employee;

    @GetMapping("/employee?Username=camundaadmin")
    public String Employee() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_Employee);

            // Фиксированный JSON-ответ
            String jsonResponse = "{" +
                    "\"id \": \"19787\",\"name\":\"camundaadmin\", " +
                    "\"orgUnitId\":\"50651132\", " +
                    "\"orgUnitName\": \"Отдел прямых продаж\", " +
                    "\"manager\": \"false\"}";

            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "{\"error\": \"Error processing request\"}";
        }
    }
}

