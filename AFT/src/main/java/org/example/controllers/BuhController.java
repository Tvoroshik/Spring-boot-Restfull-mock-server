package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BuhController {

    private static final Logger log = LoggerFactory.getLogger(BuhController.class);

    @Value("${app.delay.buh:0}")
    private long Buh_delay;

    @GetMapping("/buh")
    public Object getBuhInfo(@RequestParam String ogrn, @RequestParam String inn) {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(Buh_delay);

            // Создаем основной ответ
            Map<String, Object> response = new HashMap<>();
            response.put("inn", inn);
            response.put("ogrn", ogrn);
            response.put("focusHref", "https://focus.kontur.ru/entity?query=" + ogrn);

            // Создаем buhForms
            List<Map<String, Object>> buhForms = new ArrayList<>();

            Map<String, Object> formEntry = new HashMap<>();
            formEntry.put("year", 2012);
            formEntry.put("organizationType", "Small");

            List<Map<String, Object>> form1 = new ArrayList<>();

            // Заполняем данные для form1
            Map<String, Object> item1 = new HashMap<>();
            item1.put("code", 1110);
            item1.put("name", "Нематериальные, финансовые и другие внеоборотные активы");
            item1.put("startValue", 0);
            item1.put("endValue", 0);
            form1.add(item1);

            Map<String, Object> item2 = new HashMap<>();
            item2.put("code", 1120);
            item2.put("name", "Нематериальные, финансовые и другие внеоборотные активы");
            item2.put("startValue", 0);
            item2.put("endValue", 0);
            form1.add(item2);

            Map<String, Object> item3 = new HashMap<>();
            item3.put("code", 1130);
            item3.put("name", "Нематериальные, финансовые и другие внеоборотные активы");
            item3.put("startValue", 0);
            item3.put("endValue", 0);
            form1.add(item3);

            Map<String, Object> item4 = new HashMap<>();
            item4.put("code", 1140);
            item4.put("name", "Нематериальные, финансовые и другие внеоборотные активы");
            item4.put("startValue", 0);
            item4.put("endValue", 0);

            Map<String, Object> item5 = new HashMap<>();
            item5.put("code", 1150);
            item5.put("name", "Материальные внеоборотные активы");
            item5.put("startValue", 9595000);
            item5.put("endValue", 11985000);

            Map<String, Object> item6 = new HashMap<>();
            item6.put("code", 1160);
            item6.put("name", "Нематериальные, финансовые и другие внеоборотные активы");
            item6.put("startValue", 0);
            item6.put("endValue", 0);

            Map<String, Object> item7 = new HashMap<>();
            item7.put("code", 1170);
            item7.put("name", "Нематериальные, финансовые и другие внеоборотные активы");
            item7.put("startValue", 16000);
            item7.put("endValue", 45000);

            Map<String, Object> item8 = new HashMap<>();
            item8.put("code", 1180);
            item8.put("name", "Нематериальные, финансовые и другие внеоборотные активы");
            item8.put("startValue", 0);
            item8.put("endValue", 0);

            Map<String, Object> item9 = new HashMap<>();
            item9.put("code", 1190);
            item9.put("name", "Нематериальные, финансовые и другие внеоборотные активы");
            item9.put("startValue", 0);
            item9.put("endValue", 0);

            Map<String, Object> item10 = new HashMap<>();
            item10.put("code", 1210);
            item10.put("name", "Запасы");
            item10.put("startValue", 10773000);
            item10.put("endValue", 10000000);

            Map<String, Object> item20 = new HashMap<>();
            item20.put("code", 1220);
            item20.put("name", "Финансовые и другие оборотные активы");
            item20.put("startValue", 0);
            item20.put("endValue", 0);

            Map<String, Object> item30 = new HashMap<>();
            item30.put("code", 1230);
            item30.put("name", "Финансовые и другие оборотные активы");
            item30.put("startValue", 26067000);
            item30.put("endValue", 20321000);

            Map<String, Object> item40 = new HashMap<>();
            item40.put("code", 1240);
            item40.put("name", "Финансовые и другие оборотные активы");
            item40.put("startValue", 0);
            item40.put("endValue", 0);

            Map<String, Object> item50 = new HashMap<>();
            item50.put("code", 1250);
            item50.put("name", "Денежные средства и денежные эквиваленты");
            item50.put("startValue", 6605000);
            item50.put("endValue", 6966000);

            Map<String, Object> item60 = new HashMap<>();
            item60.put("code", 1260);
            item60.put("name", "Финансовые и другие оборотные активы");
            item60.put("startValue", 0);
            item60.put("endValue", 0);

            Map<String, Object> item1300 = new HashMap<>();
            item1300.put("code", 1300);
            item1300.put("name", "Капитал и резервы");
            item1300.put("startValue", 29342000);
            item1300.put("endValue", 29479000);

            Map<String, Object> item1410 = new HashMap<>();
            item1410.put("code", 1410);
            item1410.put("name", "Долгосрочные заемные средства");
            item1410.put("startValue", 0);
            item1410.put("endValue", 0);

            Map<String, Object> item1420 = new HashMap<>();
            item1420.put("code", 1420);
            item1420.put("name", "Другие долгосрочные обязательства");
            item1420.put("startValue", 0);
            item1420.put("endValue", 0);

            Map<String, Object> item1430 = new HashMap<>();
            item1430.put("code", 1430);
            item1430.put("name", "Другие долгосрочные обязательства");
            item1430.put("startValue", 0);
            item1430.put("endValue", 0);

            Map<String, Object> item1450 = new HashMap<>();
            item1450.put("code", 1450);
            item1450.put("name", "Другие долгосрочные обязательства");
            item1450.put("startValue", 0);
            item1450.put("endValue", 0);

            Map<String, Object> item1510 = new HashMap<>();
            item1510.put("code", 1510);
            item1510.put("name", "Краткосрочные заемные средства");
            item1510.put("startValue", 0);
            item1510.put("endValue", 280000);

            Map<String, Object> item1520 = new HashMap<>();
            item1520.put("code", 1520);
            item1520.put("name", "Кредиторская задолженность");
            item1520.put("startValue", 23441000);
            item1520.put("endValue", 19378000);

            Map<String, Object> item1530 = new HashMap<>();
            item1530.put("code", 1530);
            item1530.put("name", "Другие краткосрочные обязательства");
            item1530.put("startValue", 0);
            item1530.put("endValue", 0);

            Map<String, Object> item1540 = new HashMap<>();
            item1540.put("code", 1540);
            item1540.put("name", "Другие краткосрочные обязательства");
            item1540.put("startValue", 0);
            item1540.put("endValue", 0);

            Map<String, Object> item1550 = new HashMap<>();
            item1550.put("code", 1550);
            item1550.put("name", "Другие краткосрочные обязательства");
            item1550.put("startValue", 273000);
            item1550.put("endValue", 180000);

            Map<String, Object> item1600 = new HashMap<>();
            item1600.put("code", 1600);
            item1600.put("name", "Баланс");
            item1600.put("startValue", 53056000);
            item1600.put("endValue", 49317000);

            Map<String, Object> item1700 = new HashMap<>();
            item1700.put("code", 1700);
            item1700.put("name", "Баланс");
            item1700.put("startValue", 53056000);
            item1700.put("endValue", 49317000);

            form1.add(item1700);

            formEntry.put("form1", form1);
            buhForms.add(formEntry);

            response.put("buhForms", buhForms);

            // Логируем запрос
            log.info("Получен запрос с параметрами: ogrn={}, inn={}", ogrn, inn);
            return response;
        } catch (Exception e) {
            log.error("Ошибка обработки запроса", e);
            return Map.of("error", "Ошибка обработки запроса");
        }
    }
}
