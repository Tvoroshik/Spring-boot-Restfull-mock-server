package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Value("${app.delay_Employee:0}")
    private long delay_Employee;

    @GetMapping("/employee")
    public ResponseEntity<String> getEmployee(
            @RequestParam(name = "username") String username) {

        try {
            // Задержка (если настроена)
            if (delay_Employee > 0) {
                Thread.sleep(delay_Employee);
            }

            // Формируем JSON с подстановкой username
            String jsonResponse = String.format(
                    "{" +
                            "\"id\": \"19787\"," +
                            "\"name\": \"%s\"," +
                            "\"orgUnitId\": \"50651132\"," +
                            "\"orgUnitName\": \"Отдел прямых продаж\"," +
                            "\"manager\": false" +
                            "}",
                    username);

            logger.info("Successfully processed request for username: {}", username);
            return ResponseEntity.ok().body(jsonResponse);

        } catch (InterruptedException e) {
            logger.error("Request interrupted for username: {}", username, e);
            Thread.currentThread().interrupt();
            return ResponseEntity.status(500)
                    .body("{\"error\": \"Request processing interrupted\"}");
        } catch (Exception e) {
            logger.error("Unexpected error for username: {}", username, e);
            return ResponseEntity.status(500)
                    .body("{\"error\": \"Internal server error\"}");
        }
    }
}
