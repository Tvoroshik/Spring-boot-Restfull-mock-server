package org.example.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController
public class EmployeeController {

    @Value("${app.delay.Employee:0}")
    private long Employee_delay;

    // JSON шаблон для ответа
    private static final String DEFAULT_JSON = """
        {
            "id": "19787",
            "name": "admin11",
            "orgUnitId": "50651132",
            "orgUnitName": "Отдел прямых продаж",
            "manager": false
        }
    """;

    @GetMapping(
            value = "/employee/username={username}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public String getEmployee(@PathVariable String username) {
        try {

            // Добавляем задержку (в миллисекундах)
            Thread.sleep(Employee_delay);
            // Создаем ObjectMapper для работы с JSON
            ObjectMapper objectMapper = new ObjectMapper();

            // Парсим шаблон JSON
            ObjectNode jsonNode = (ObjectNode) objectMapper.readTree(DEFAULT_JSON);

            // Обновляем имя пользователя
            jsonNode.put("name", username);

            // Добавляем новое значение для админа
            jsonNode.put("customAdminValue", "Новое значение для админа " + username);

            // Можно добавить другие поля по необходимости
            // jsonNode.put("additionalField", "любое значение");

            // Возвращаем JSON строку
            return objectMapper.writeValueAsString(jsonNode);

        } catch (Exception e) {
            return """
                {
                    "error": "Произошла ошибка при обработке запроса",
                    "message": "%s"
                }
            """.formatted(e.getMessage());
        }
    }
}
