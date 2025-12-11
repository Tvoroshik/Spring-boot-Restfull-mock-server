package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

@RestController
public class LimitController {

    private static final Logger log = LoggerFactory.getLogger(LimitController.class);

    @Value("${app.delay.limit:0}")
    private long limit_delay;

    @GetMapping(
            value = "/limit/FindLimitsFromBinding",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Map<String, Object>> findLimitsFromBinding(
            @RequestParam String inn
    ) throws IOException {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(limit_delay);

            // Формируем пустой JSON ответ
            Map<String, Object> response = new HashMap<>();

            return ResponseEntity.ok(response);

        } catch (Exception e) {
            log.error("Ошибка при обработке запроса для параметра inn: {}", inn, e);
            Map<String, Object> errorResponse = new HashMap<>();
            errorResponse.put("error", "Произошла ошибка при обработке запроса");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }
    }
}
