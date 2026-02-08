package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@RestController
public class ClientCompanyContractController {

    private static final Logger logger = LoggerFactory.getLogger(ClientCompanyContractController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_ClientCompanyContract:0}")
    private long delay_ClientCompanyContract;

    @GetMapping("/company/contracts")
    public String clientCompanyContract() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_ClientCompanyContract);

            // Читаем JSON из файла resources/jsonResponse2.json
            String jsonResponse = readJsonFromResource("jsonResponse2.json");

            logger.info("Response loaded from jsonResponse2.json successfully");
            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Request processing interrupted", e);
            Thread.currentThread().interrupt();
            return "{\"error\": \"Request interrupted\"}";
        } catch (IOException e) {
            logger.error("Failed to read JSON response file jsonResponse2.json", e);
            return "{\"error\": \"Failed to load response file jsonResponse2.json\"}";
        }
    }

    /**
     * Метод для чтения JSON из ресурса (файла в classpath)
     */
    private String readJsonFromResource(String filename) throws IOException {
        ClassPathResource resource = new ClassPathResource(filename);
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(resource.getInputStream()))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            return content.toString().trim();
        }
    }
}
