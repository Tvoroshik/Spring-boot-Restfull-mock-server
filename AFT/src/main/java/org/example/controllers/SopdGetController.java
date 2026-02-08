package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SopdGetController {

    private static final Logger logger = LoggerFactory.getLogger(SopdGetController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_SopdGet:0}")
    private long delay_SopdGet;

    @PostMapping("/sopd/get")
    public String SopdGet() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_SopdGet);

            // Фиксированный JSON-ответ
            String jsonResponse = "{\n" +
                    "    \"exists\": \"Y\",\n" +
                    "    \"collect\": \" \",\n" +
                    "    \"resultSet\": {\n" +
                    "      \"resultSetRows\": [\n" +
                    "        {\n" +
                    "          \"cus\": \"UAU2IU\",\n" +
                    "          \"clc\": \"\",\n" +
                    "          \"id\": 1852274272,\n" +
                    "          \"dts\": \"2024-05-02T00:00:00.000+00:00\",\n" +
                    "          \"dte\": \"2024-11-02T00:00:00.000+00:00\",\n" +
                    "          \"sys\": \"AFT\",\n" +
                    "          \"ch\": \"1\",\n" +
                    "          \"frmt\": \"1\",\n" +
                    "          \"purp\": \"31\",\n" +
                    "          \"purpbr\": \"\",\n" +
                    "          \"pdsc\": \"\",\n" +
                    "          \"cust\": \"1\",\n" +
                    "          \"cusn\": \"�� �����-����\",\n" +
                    "          \"cn\": \"\",\n" +
                    "          \"mod\": \"\",\n" +
                    "          \"lnm\": \"\",\n" +
                    "          \"pnm\": \"\",\n" +
                    "          \"fnm\": \"\",\n" +
                    "          \"dtbd\": \"0001-01-03T00:00:00.000+00:00\",\n" +
                    "          \"doctp\": \"\",\n" +
                    "          \"ser\": \"\",\n" +
                    "          \"num\": \"\",\n" +
                    "          \"isdt\": \"0001-01-03T00:00:00.000+00:00\",\n" +
                    "          \"cnm\": \"\",\n" +
                    "          \"inn\": \"\",\n" +
                    "          \"ogrn\": \"\",\n" +
                    "          \"kpp\": \"\",\n" +
                    "          \"ctp\": \"\",\n" +
                    "          \"rtp\": \"01\",\n" +
                    "          \"extd\": \"01\",\n" +
                    "          \"trpt\": \"Y\",\n" +
                    "          \"opn\": \"02\",\n" +
                    "          \"trdt\": null,\n" +
                    "          \"andt\": null,\n" +
                    "          \"cch\": \"\",\n" +
                    "          \"rsp\": \"08\",\n" +
                    "          \"rsn\": \"\",\n" +
                    "          \"tcr\": \"2024-05-02T06:36:44.607+00:00\",\n" +
                    "          \"ucr\": \"u_061f3\",\n" +
                    "          \"tlm\": null,\n" +
                    "          \"ulm\": \"\"\n" +
                    "        }\n" +
                    "      ]\n" +
                    "    }\n" +
                    "  }";

            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "{\"error\": \"Error processing request\"}";
        }
    }
}