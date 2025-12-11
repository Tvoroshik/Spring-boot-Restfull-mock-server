package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LicencesController {

    private static final Logger log = LoggerFactory.getLogger(LicencesController.class);

    @Value("${app.delay.licences:0}")
    private long licences_delay;

    @GetMapping(
            value = "/licences",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Map<String, Object>> getLicencesInfo(
            @RequestParam String ogrn,
            @RequestParam String inn
    ) {
        try {

            // Добавляем задержку (в миллисекундах)
            Thread.sleep(licences_delay);

            Map<String, Object> response = new HashMap<>();
            Map<String, Object> licenses = new HashMap<>();

            response.put("inn", inn);
            response.put("ogrn", ogrn);
            response.put("focusHref", "https://focus.kontur.ru/entity?query=" + ogrn);
            response.put("licenses", licenses); // Пустой объект JSON в поле licenses

            return ResponseEntity.ok(response);

        } catch (Exception e) {
            log.error("Ошибка при обработке запроса для параметров: ogrn={}, inn={}", ogrn, inn, e);
            Map<String, Object> errorResponse = new HashMap<>();
            errorResponse.put("error", "Произошла ошибка при обработке запроса");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }
    }
}
