package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetClosedDealsGroupCompaniesController {

    private static final Logger logger = LoggerFactory.getLogger(GetClosedDealsGroupCompaniesController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_GetClosedDealsGroupCompanies:0}")
    private long delay_GetClosedDealsGroupCompanies;

    @PostMapping("/deal/GetClosedDealsGroupsCompaniesByClient")
    public String GetClosedDealsGroupCompanies() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_GetClosedDealsGroupCompanies);

            // Фиксированный JSON-ответ (можно заменить на нужную структуру)
            String jsonResponse = "{\n" +
                    "\n" +
                    "    \"dataDeal\": [\n" +
                    "\n" +
                    "      {\n" +
                    "\n" +
                    "        \"dealId\": 123,\n" +
                    "\n" +
                    "        \"dealStateId\": 1,\n" +
                    "\n" +
                    "        \"dealType\": \"Кредит\",\n" +
                    "\n" +
                    "        \"dealTypeCode\": \"CRD\",\n" +
                    "\n" +
                    "        \"dealKind\": \"Основной\",\n" +
                    "\n" +
                    "        \"dealKindCode\": \"MAIN\",\n" +
                    "\n" +
                    "        \"fullName\": \"ООО Ромашка\",\n" +
                    "\n" +
                    "        \"clientId\": 456,\n" +
                    "\n" +
                    "        \"clientPin\": \"1234567890\",\n" +
                    "\n" +
                    "        \"dealDocNumber\": \"№12345\",\n" +
                    "\n" +
                    "        \"docDate\": \"2025-06-06\",\n" +
                    "\n" +
                    "        \"beginDate\": \"2025-06-06\",\n" +
                    "\n" +
                    "        \"endDate\": \"2025-06-06\",\n" +
                    "\n" +
                    "        \"guaranteeBeginDate\": \"2025-06-06\",\n" +
                    "\n" +
                    "        \"dealCloseDate\": \"2025-06-06\",\n" +
                    "\n" +
                    "        \"sum\": 1000000,\n" +
                    "\n" +
                    "        \"sumRest\": 500000,\n" +
                    "\n" +
                    "        \"currency\": \"RUB\",\n" +
                    "\n" +
                    "        \"inn\": \"7707083893\",\n" +
                    "\n" +
                    "        \"status\": \"Активна\",\n" +
                    "\n" +
                    "        \"additionalStatus\": \"Нет\",\n" +
                    "\n" +
                    "        \"fz\": \"Залог\",\n" +
                    "\n" +
                    "        \"reserveCategoryCDName\": \"Стандартный\",\n" +
                    "\n" +
                    "        \"reserveRateCD\": 10,\n" +
                    "\n" +
                    "        \"portfolioName\": \"Основной\",\n" +
                    "\n" +
                    "        \"beneficiaryId\": 789,\n" +
                    "\n" +
                    "        \"beneficiaryInn\": \"7712345678\",\n" +
                    "\n" +
                    "        \"beneficiaryOgrn\": \"1122334455667\",\n" +
                    "\n" +
                    "        \"beneficiaryKpp\": \"123456789\"\n" +
                    "\n" +
                    "      }\n" +
                    "\n" +
                    "    ]\n" +
                    "\n" +
                    "  }";

            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "\"Error processing request\"";
        }
    }
}
