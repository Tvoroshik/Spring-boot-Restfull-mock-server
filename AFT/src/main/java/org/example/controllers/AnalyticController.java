package org.example.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class AnalyticController {
    private static final Logger logger = LoggerFactory.getLogger(AnalyticController.class);

    @Value("${app.delay.analytic:0}")
    private long analyc_delay;

    @GetMapping("/analytics")
    public Object getAnalytics(@RequestParam String ogrn, @RequestParam String inn) {
        try {

            Thread.sleep(analyc_delay); // ПРОСТО ЗАДЕРЖКА

            Map<String, Object> response = new HashMap<>();
            response.put("inn", inn);
            response.put("ogrn", ogrn);
            response.put("focusHref", "https://focus.kontur.ru/entity?query=" + ogrn);;

            // Добавляем блок analytics
            Map<String, Object> analytics = new HashMap<>();
            analytics.put("q2002", 1);
            analytics.put("q2003", 6);
            analytics.put("q2004", 9);
            analytics.put("s2002", 149621.54);
            analytics.put("s2003", 561366885.95);
            analytics.put("s2004", 750227828.85);
            analytics.put("q2013", 1);
            analytics.put("s2013", 149621.54);
            analytics.put("q2023", 3);
            analytics.put("q2024", 1);
            analytics.put("q2025", 1);
            analytics.put("q2026", 4);
            analytics.put("s2023", 188945216.70);
            analytics.put("s2024", 118369745.13);
            analytics.put("s2026", 442912867.02);
            analytics.put("q4002", 1);
            analytics.put("s4002", 21666666.66);
            analytics.put("q4003", 24);
            analytics.put("s4003", 635614013.27);
            analytics.put("q7005", 2);
            analytics.put("q7007", 24);
            analytics.put("q7009", 239);
            analytics.put("d7010", "2024-04-01");
            analytics.put("q7018", 1);
            analytics.put("q7019", 13);
            analytics.put("q7020", 2);
            analytics.put("q7021", 59);
            analytics.put("q8001", 1);
            analytics.put("m8001", true);
            analytics.put("q9001", 2);
            analytics.put("q1102", 23);
            analytics.put("q1202", 1);

            response.put("analytics", analytics);

            List<Map<String, Object>> result = new ArrayList<>();
            result.add(response);

            logger.info("Успешная обработка запроса. INN: {}, OGRN: {}", inn, ogrn);
            return result;
        } catch (Exception e) {
            logger.error("Ошибка обработки запроса", e);
            return Map.of("error", "Ошибка обработки запроса");
        }
    }
}
