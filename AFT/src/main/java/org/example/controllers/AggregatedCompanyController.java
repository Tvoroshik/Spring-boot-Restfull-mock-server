package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AggregatedCompanyController {

    // Читаем значение задержки из application.properties
    @Value("${app.delay_AggregatedCompany:0}")
    private long delay_AggregatedCompany;


    private static final Logger logger = LoggerFactory.getLogger(AggregatedCompanyController.class);

    @PostMapping(value = "/aggregated/company")
    public String AggregatedCompany() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_AggregatedCompany);

            // Ваша JSON-строка (экранирована для Java)
            String jsonResponse = "{\n" +
                    "  \"reportDate\": \"2023-10-01\",\n" +
                    "  \"reportUrls\": {\n" +
                    "    \"Экифакс\": \"http://alfa-cr-test/credreg/showReport.html?id=2269466271\",\n" +
                    "    \"ОКБ\": \"http://alfa-cr-test/credreg/showReport.html?id=2269466273\",\n" +
                    "    \"НБКИ\": \"http://alfa-cr-test/credreg/showReport.html?id=2269466272\"\n" +
                    "  },\n" +
                    "  \"loans\": [\n" +
                    "    {\n" +
                    "      \"bkiCode\": 0,\n" +
                    "      \"currency\": \"810\",\n" +
                    "      \"startDate\": \"2020-10-01\",\n" +
                    "      \"amount\": 65000000,\n" +
                    "      \"currentStatus\": \"OK\",\n" +
                    "      \"currentOverdueAmount\": 0,\n" +
                    "      \"payments\": [\n" +
                    "        {\"period\": \"2021-05\", \"status\": \"OK\"},\n" +
                    "        {\"period\": \"2021-04\", \"status\": \"OK\"},\n" +
                    "        {\"period\": \"2021-03\", \"status\": \"OK\"},\n" +
                    "        {\"period\": \"2021-02\", \"status\": \"OK\"},\n" +
                    "        {\"period\": \"2021-01\", \"status\": \"OK\"},\n" +
                    "        {\"period\": \"2020-12\", \"status\": \"OK\"},\n" +
                    "        {\"period\": \"2020-11\", \"status\": \"OK\"},\n" +
                    "        {\"period\": \"2020-10\", \"status\": \"OK\"}\n" +
                    "      ]\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"bkiCode\": 0,\n" +
                    "      \"currency\": \"810\",\n" +
                    "      \"startDate\": \"2020-12-14\",\n" +
                    "      \"amount\": 19500000,\n" +
                    "      \"currentStatus\": \"OK\",\n" +
                    "      \"currentOverdueAmount\": 0,\n" +
                    "      \"payments\": [\n" +
                    "        {\"period\": \"2021-03\", \"status\": \"OK\"},\n" +
                    "        {\"period\": \"2021-02\", \"status\": \"OK\"},\n" +
                    "        {\"period\": \"2021-01\", \"status\": \"OK\"},\n" +
                    "        {\"period\": \"2020-12\", \"status\": \"OK\"}\n" +
                    "      ]\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"bkiCode\": 0,\n" +
                    "      \"currency\": \"810\",\n" +
                    "      \"startDate\": \"2021-07-16\",\n" +
                    "      \"amount\": 20000000,\n" +
                    "      \"currentStatus\": \"OK\",\n" +
                    "      \"currentOverdueAmount\": 0,\n" +
                    "      \"payments\": [\n" +
                    "        {\"period\": \"2022-09\", \"status\": \"OK\"},\n" +
                    "        {\"period\": \"2022-08\", \"status\": \"OK\"},\n" +
                    "        {\"period\": \"2022-07\", \"status\": \"OK\"},\n" +
                    "        {\"period\": \"2022-06\", \"status\": \"OK\"},\n" +
                    "        {\"period\": \"2022-05\", \"status\": \"OK\"},\n" +
                    "        {\"period\": \"2022-04\", \"status\": \"OK\"},\n" +
                    "        {\"period\": \"2022-03\", \"status\": \"OK\"},\n" +
                    "        {\"period\": \"2022-02\", \"status\": \"OK\"},\n" +
                    "        {\"period\": \"2022-01\", \"status\": \"OK\"},\n" +
                    "        {\"period\": \"2021-12\", \"status\": \"OK\"},\n" +
                    "        {\"period\": \"2021-11\", \"status\": \"OK\"},\n" +
                    "        {\"period\": \"2021-10\", \"status\": \"OK\"},\n" +
                    "        {\"period\": \"2021-09\", \"status\": \"OK\"},\n" +
                    "        {\"period\": \"2021-08\", \"status\": \"OK\"},\n" +
                    "        {\"period\": \"2021-07\", \"status\": \"OK\"}\n" +
                    "      ]\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"bkiCode\": 0,\n" +
                    "      \"currency\": \"810\",\n" +
                    "      \"startDate\": \"2021-09-27\",\n" +
                    "      \"amount\": 7000000,\n" +
                    "      \"currentStatus\": \"OK\",\n" +
                    "      \"currentOverdueAmount\": 0,\n" +
                    "      \"payments\": [\n" +
                    "        {\"period\": \"2022-05\", \"status\": \"OK\"},\n" +
                    "        {\"period\": \"2022-04\", \"status\": \"OK\"},\n" +
                    "        {\"period\": \"2022-03\", \"status\": \"OK\"},\n" +
                    "        {\"period\": \"2022-02\", \"status\": \"OK\"},\n" +
                    "        {\"period\": \"2022-01\", \"status\": \"OK\"},\n" +
                    "        {\"period\": \"2021-12\", \"status\": \"OK\"},\n" +
                    "        {\"period\": \"2021-11\",\"status\": \"OK\"},\n" +
                    "        {\"period\": \"2021-10\",\"status\": \"OK\"},\n" +
                    "        {\"period\": \"2021-09\",\"status\": \"OK\"}\n" +
                    "     ]\n" +
                    "   },\n" +
                    "   {\n" +
                    "{\n  " +
                    "\"bkiCode\": 0,\n  " +
                    "\"currency\": \"810\",\n  " +
                    "\"startDate\": \"2021-12-09\",\n  " +
                    "\"amount\": 30000000,\n  " +
                    "\"currentStatus\": \"OK\",\n  " +
                    "\"currentOverdueAmount\": 0,\n  " +
                    "\"payments\": " +
                    "[\n    " +
                    "{\"period\": \"2023-04\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2023-03\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2023-02\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2023-01\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2022-12\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2022-11\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2022-10\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2022-09\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2022-08\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2022-07\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2022-06\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2022-05\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2022-04\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2022-03\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2022-02\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2022-01\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2021-12\",\"status\": \"OK\"}\n  " +
                    "]\n" +
                    "},\n" +
                    "{\n  " +
                    "\"bkiCode\": 0,\n  " +
                    "\"currency\": \"810\",\n  " +
                    "\"startDate\": \"2022-01-28\",\n " +
                    "\"amount\": 20000,\n  " +
                    "\"currentStatus\": \"OK\",\n  " +
                    "\"currentOverdueAmount\": 0,\n  " +
                    "\"payments\": " +
                    "[\n    " +
                    "{\"period\": \"2023-09\",\"status\": \"OK\"},\n   " +
                    "{\"period\": \"2023-08\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2023-07\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2023-06\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2023-05\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2023-04\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2023-03\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2023-02\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2023-01\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2022-12\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2022-11\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2022-10\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2022-09\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2022-08\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2022-07\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2022-06\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2022-05\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2022-04\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2022-03\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2022-02\",\"status\": \"OK\"}\n  " +
                    "]\n" +
                    "},\n" +
                    "{\n  " +
                    "\"bkiCode\": 0,\n  " +
                    "\"currency\": \"810\",\n  " +
                    "\"startDate\": \"2023-03-24\",\n  " +
                    "\"amount\": 65000000,\n  " +
                    "\"currentStatus\": \"OK\",\n  " +
                    "\"currentOverdueAmount\": 0,\n  " +
                    "\"payments\": " +
                    "[\n    " +
                    "{\"period\": \"2023-04\",\"status\": \"OK\"},\n    " +
                    "{\"period\": \"2023-03\",\"status\": \"OK\"}\n  " +
                    "]\n" +
                    "},\n" +
                    "{\n  " +
                    "\"bkiCode\": 0,\n  " +
                    "\"currency\": \"810\",\n  " +
                    "\"startDate\": \"2023-05-29\",\n  " +
                    "\"amount\": 25000000,\n  " +
                    "\"currentStatus\": \"OK\",\n  " +
                    "\"currentOverdueAmount\": 0,\n  " +
                    "\"payments\": " +
                    "[]\n" +
                    "},\n" +
                    "{\"bkiCode\": 0,\n  " +
                    "\"currency\": \"810\",\n  " +
                    "\"startDate\": \"2023-05-30\",\n  " +
                    "\"amount\": 25000000,\n  " +
                    "\"currentStatus\": \"OK\",\n  " +
                    "\"currentOverdueAmount\": 0,\n  " +
                    "\"payments\": " +
                    "[]\n" +
                    "}\n" +
                    "{\n" +
                    "      \"bkiCode\": 0,\n" +
                    "      \"currency\": \"810\",\n" +
                    "      \"startDate\": \"2023-07-31\",\n" +
                    "      \"amount\": 10000000,\n" +
                    "      \"currentStatus\": \"OK\",\n" +
                    "      \"currentOverdueAmount\": 0,\n" +
                    "      \"payments\": []\n" +
                    "    }\n" +
                    "  ]\n" +
                    "}";

            logger.info("Health check request processed successfully");
            return jsonResponse;

        } catch (Exception e) {
            logger.error("Error processing health check request", e);
            return "{\"status\": \"Error processing request\", \"error\": \"" + e.getMessage() + "\"}";
        }
    }
}
