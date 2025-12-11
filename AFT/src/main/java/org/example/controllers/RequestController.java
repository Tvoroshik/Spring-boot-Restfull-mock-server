package org.example.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class RequestController {

    @Value("${app.delay.Request:0}")
    private long Request_delay;


    @PostMapping(
            value = "/req",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<List<Map<String, Object>>> RequestControllerResponse(
            @RequestParam String inn,
            @RequestParam String ogrn
    ) {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(Request_delay);

            // Создаем основной список
            List<Map<String, Object>> responseList = new ArrayList<>();

            // Создаем основной объект
            Map<String, Object> response = new HashMap<>();
            response.put("inn", inn);
            response.put("ogrn", ogrn);
            response.put("focusHref", "https://focus.kontur.ru/entity?query=" + ogrn);

            // Создаем вложенный объект UL
            Map<String, Object> ul = new HashMap<>();

            // Заполняем параметры UL
            Map<String, Object> legalName = new HashMap<>();
            legalName.put("short", "АО \"МГЦД\"");
            legalName.put("full", "АКЦИОНЕРНОЕ ОБЩЕСТВО \"МОСКОВСКИЙ ГОРОДСКОЙ ЦЕНТР ДЕЗИНФЕКЦИИ\"");
            legalName.put("readable", "АО \"Московский Городской Центр Дезинфекции\"");
            legalName.put("date", "2024-10-01");

            // Заполняем адрес
            Map<String, Object> legalAddress = new HashMap<>();

            Map<String, Object> parsedAddressRF = new HashMap<>();
            // ... (остальные параметры адреса)

            Map<String, Object> parsedAddressRFFias = new HashMap<>();
            // ... (остальные параметры адреса)

            legalAddress.put("parsedAddressRF", parsedAddressRF);
            legalAddress.put("parsedAddressRFFias", parsedAddressRFFias);
            legalAddress.put("date", "2024-10-01");
            legalAddress.put("firstDate", "2024-10-01");

            // Заполняем остальные параметры UL
            ul.put("kpp", "771601001");
            ul.put("okpo", "87748626");
            ul.put("okato", "45280597000");
            ul.put("okfs", "13");
            ul.put("oktmo", "45365000000");
            ul.put("okogu", "4210001");
            ul.put("okopf", "12267");
            ul.put("opf", "Непубличные акционерные общества");
            ul.put("legalName", legalName);
            ul.put("legalAddress", legalAddress);

            // Статус
            Map<String, String> status = new HashMap<>();
            status.put("statusString", "Действующее");
            ul.put("status", status);

            // Дата регистрации
            ul.put("registrationDate", "2024-10-01");

            // Руководители
            List<Map<String, Object>> heads = new ArrayList<>();
            Map<String, Object> head = new HashMap<>();
            // Заполняем данные руководителя
            Map<String, String> structuredFio = new HashMap<>();
            structuredFio.put("firstName", "Павел");
            structuredFio.put("lastName", "Юнаков");
            structuredFio.put("middleName", "Анатольевич");

            head.put("fio", "Юнаков Павел Анатольевич");
            head.put("innfl", "773377437940");
            head.put("position", "Генеральный директор");
            head.put("date", "2024-10-01");
            head.put("firstDate", "2024-10-01");
            head.put("structuredFio", structuredFio);
            heads.add(head);
            ul.put("heads", heads);

// История
            ul.put("history", new HashMap<>());

// Добавляем UL в основной ответ
            response.put("UL", ul);

// briefReport
            Map<String, Object> briefReport = new HashMap<>();
            Map<String, Object> summary = new HashMap<>();
            summary.put("greenStatements", true);
            briefReport.put("summary", summary);
            response.put("briefReport", briefReport);

// contactPhones
            Map<String, Object> contactPhones = new HashMap<>();
            contactPhones.put("count", 10);
            response.put("contactPhones", contactPhones);

// contactEmails
            Map<String, Object> contactEmails = new HashMap<>();
            contactEmails.put("count", 3);
            response.put("contactEmails", contactEmails);

// Добавляем ответ в список
            responseList.add(response);

            return ResponseEntity.ok(responseList);

        } catch (Exception e) {
            // Создаем список для ошибки, чтобы соответствовать возвращаемому типу
            List<Map<String, Object>> errorList = new ArrayList<>();
            Map<String, Object> errorResponse = new HashMap<>();
            errorResponse.put("error", "Произошла ошибка при обработке запроса");
            errorList.add(errorResponse);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorList);
        }
    }
}
