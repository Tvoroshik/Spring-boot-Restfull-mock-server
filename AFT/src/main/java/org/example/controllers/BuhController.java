package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuhController {

    private static final Logger log = LoggerFactory.getLogger(BuhController.class);

    @Value("${app.delay.buh:0}")
    private long buhDelay;


    // Два готовых JSON-ответа в виде строк
    private static final String JSON_RESPONSE_1 =
            "{\"status\":\"success\",\"inn\":\"1\",\"data\":\"Ответ для inn=1\"}";

    private static final String JSON_RESPONSE_2 =
            "{\"status\":\"success\",\"inn\":\"%s\",\"data\":\"Ответ для любого другого inn\"}";


    @GetMapping("/buh")
    public String getBuhInfo(
            @RequestParam String ogrn,
            @RequestParam String inn) {
        try {
            // Задержка, если настроена
            if (buhDelay > 0) {
                Thread.sleep(buhDelay);
            }

            String JSON_RESPONSE_1 = "[\n" +
                                     "    {\n" +
                                     "        \"inn\": \"7839095581\",\n" +
                                     "        \"ogrn\": \"1177847411356\",\n" +
                                     "        \"focusHref\": \"https://focus.kontur.ru/entity?query=1177847411356\",\n" +
                                     "        \"buhForms\": [\n" +
                                     "            {\n" +
                                     "                \"year\": 2018,\n" +
                                     "                \"organizationType\": \"Large\",\n" +
                                     "                \"form1\": [\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1100,\n" +
                                     "                        \"name\": \"Итого\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1110,\n" +
                                     "                        \"name\": \"Нематериальные активы\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1120,\n" +
                                     "                        \"name\": \"Результаты исследований и разработок\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1130,\n" +
                                     "                        \"name\": \"Нематериальные поисковые активы\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1140,\n" +
                                     "                        \"name\": \"Материальные поисковые активы\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1150,\n" +
                                     "                        \"name\": \"Основные средства\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1160,\n" +
                                     "                        \"name\": \"Доходные вложения в материальные ценности\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1170,\n" +
                                     "                        \"name\": \"Финансовые вложения\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1180,\n" +
                                     "                        \"name\": \"Отложенные налоговые активы\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1190,\n" +
                                     "                        \"name\": \"Прочие внеоборотные активы\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1200,\n" +
                                     "                        \"name\": \"Итого\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 13487000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1210,\n" +
                                     "                        \"name\": \"Запасы\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 1896000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1220,\n" +
                                     "                        \"name\": \"НДС по приобретенным ценностям\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1230,\n" +
                                     "                        \"name\": \"Дебиторская задолженность\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 10144000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1240,\n" +
                                     "                        \"name\": \"Финансовые вложения (за исключением денежных эквивалентов)\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1250,\n" +
                                     "                        \"name\": \"Денежные средства и денежные эквиваленты\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 1447000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1260,\n" +
                                     "                        \"name\": \"Прочие оборотные активы\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1300,\n" +
                                     "                        \"name\": \"Итого\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 2094000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1310,\n" +
                                     "                        \"name\": \"Уставный капитал\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1320,\n" +
                                     "                        \"name\": \"Собственные акции, выкупленные у акционеров\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1340,\n" +
                                     "                        \"name\": \"Переоценка внеоборотных активов\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1350,\n" +
                                     "                        \"name\": \"Добавочный капитал (без переоценки)\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1360,\n" +
                                     "                        \"name\": \"Резервный капитал\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1370,\n" +
                                     "                        \"name\": \"Нераспределенная прибыль (непокрытый убыток)\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1400,\n" +
                                     "                        \"name\": \"Итого\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1410,\n" +
                                     "                        \"name\": \"Заемные средства\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1420,\n" +
                                     "                        \"name\": \"Отложенные налоговые обязательства\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1430,\n" +
                                     "                        \"name\": \"Оценочные обязательства\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1450,\n" +
                                     "                        \"name\": \"Прочие обязательства\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1500,\n" +
                                     "                        \"name\": \"Итого\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 11394000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1510,\n" +
                                     "                        \"name\": \"Заемные средства\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1520,\n" +
                                     "                        \"name\": \"Кредиторская задолженность\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 11394000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1530,\n" +
                                     "                        \"name\": \"Доходы будущих периодов\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1540,\n" +
                                     "                        \"name\": \"Оценочные обязательства\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1550,\n" +
                                     "                        \"name\": \"Прочие обязательства\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1600,\n" +
                                     "                        \"name\": \"Баланс\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 13487000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1700,\n" +
                                     "                        \"name\": \"Баланс\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 13487000\n" +
                                     "                    }\n" +
                                     "                ],\n" +
                                     "                \"form2\": [\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2100,\n" +
                                     "                        \"name\": \"Валовая прибыль (убыток)\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 3720000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2110,\n" +
                                     "                        \"name\": \"Выручка\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 92928000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2120,\n" +
                                     "                        \"name\": \"Себестоимость продаж\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 89208000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2200,\n" +
                                     "                        \"name\": \"Прибыль (убыток) от продаж\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 3720000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2210,\n" +
                                     "                        \"name\": \"Коммерческие расходы\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2220,\n" +
                                     "                        \"name\": \"Управленческие расходы\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2300,\n" +
                                     "                        \"name\": \"Прибыль (убыток) до налогообложения\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 2920000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2310,\n" +
                                     "                        \"name\": \"Доходы от участия в других организациях\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2320,\n" +
                                     "                        \"name\": \"Проценты к получению\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2330,\n" +
                                     "                        \"name\": \"Проценты к уплате\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2340,\n" +
                                     "                        \"name\": \"Прочие доходы\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 29000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2350,\n" +
                                     "                        \"name\": \"Прочие расходы\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 829000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2400,\n" +
                                     "                        \"name\": \"Чистая прибыль (убыток)\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 2071000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2410,\n" +
                                     "                        \"name\": \"Текущий налог на прибыль\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 849000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2421,\n" +
                                     "                        \"name\": \"Постоянные налоговые обязательства (активы)\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2430,\n" +
                                     "                        \"name\": \"Изменение отложенных налоговых обязательств\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2450,\n" +
                                     "                        \"name\": \"Изменение отложенных налоговых активов\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2460,\n" +
                                     "                        \"name\": \"Прочее\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2500,\n" +
                                     "                        \"name\": \"Совокупный финансовый результат периода\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2510,\n" +
                                     "                        \"name\": \"Результат от переоценки внеоборотных активов, не включаемый в чистую прибыль (убыток)\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2520,\n" +
                                     "                        \"name\": \"Результат от прочих операций, не включаемый в чистую прибыль (убыток) периода\",\n" +
                                     "                        \"startValue\": 0,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    }\n" +
                                     "                ]\n" +
                                     "            },\n" +
                                     "            {\n" +
                                     "                \"year\": 2019,\n" +
                                     "                \"organizationType\": \"Small\",\n" +
                                     "                \"form1\": [\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1210,\n" +
                                     "                        \"name\": \"Запасы\",\n" +
                                     "                        \"startValue\": 1896000,\n" +
                                     "                        \"endValue\": 6186000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1230,\n" +
                                     "                        \"name\": \"Финансовые и другие оборотные активы\",\n" +
                                     "                        \"startValue\": 10144000,\n" +
                                     "                        \"endValue\": 18214000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1250,\n" +
                                     "                        \"name\": \"Денежные средства и денежные эквиваленты\",\n" +
                                     "                        \"startValue\": 1447000,\n" +
                                     "                        \"endValue\": 10715000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1300,\n" +
                                     "                        \"name\": \"Капитал и резервы\",\n" +
                                     "                        \"startValue\": 2094000,\n" +
                                     "                        \"endValue\": 9251000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1410,\n" +
                                     "                        \"name\": \"Долгосрочные заемные средства\",\n" +
                                     "                        \"endValue\": 6276000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1520,\n" +
                                     "                        \"name\": \"Кредиторская задолженность\",\n" +
                                     "                        \"startValue\": 11394000,\n" +
                                     "                        \"endValue\": 19588000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1600,\n" +
                                     "                        \"name\": \"Баланс\",\n" +
                                     "                        \"startValue\": 13487000,\n" +
                                     "                        \"endValue\": 35116000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1700,\n" +
                                     "                        \"name\": \"Баланс\",\n" +
                                     "                        \"startValue\": 13487000,\n" +
                                     "                        \"endValue\": 35116000\n" +
                                     "                    }\n" +
                                     "                ],\n" +
                                     "                \"form2\": [\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2110,\n" +
                                     "                        \"name\": \"Выручка\",\n" +
                                     "                        \"startValue\": 92928000,\n" +
                                     "                        \"endValue\": 137271000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2120,\n" +
                                     "                        \"name\": \"Расходы по обычной деятельности\",\n" +
                                     "                        \"startValue\": 89208000,\n" +
                                     "                        \"endValue\": 125322000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2340,\n" +
                                     "                        \"name\": \"Прочие доходы\",\n" +
                                     "                        \"startValue\": 29000,\n" +
                                     "                        \"endValue\": 147000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2350,\n" +
                                     "                        \"name\": \"Прочие расходы\",\n" +
                                     "                        \"startValue\": 829000,\n" +
                                     "                        \"endValue\": 1501000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2400,\n" +
                                     "                        \"name\": \"Чистая прибыль (убыток)\",\n" +
                                     "                        \"startValue\": 2071000,\n" +
                                     "                        \"endValue\": 9157000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2410,\n" +
                                     "                        \"name\": \"Налоги на прибыль (доходы)\",\n" +
                                     "                        \"startValue\": 849000,\n" +
                                     "                        \"endValue\": 1438000\n" +
                                     "                    }\n" +
                                     "                ]\n" +
                                     "            },\n" +
                                     "            {\n" +
                                     "                \"year\": 2020,\n" +
                                     "                \"organizationType\": \"Small\",\n" +
                                     "                \"form1\": [\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1210,\n" +
                                     "                        \"name\": \"Запасы\",\n" +
                                     "                        \"startValue\": 6186000,\n" +
                                     "                        \"endValue\": 3167000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1230,\n" +
                                     "                        \"name\": \"Финансовые и другие оборотные активы\",\n" +
                                     "                        \"startValue\": 18214000,\n" +
                                     "                        \"endValue\": 11471000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1250,\n" +
                                     "                        \"name\": \"Денежные средства и денежные эквиваленты\",\n" +
                                     "                        \"startValue\": 10715000,\n" +
                                     "                        \"endValue\": 8721000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1300,\n" +
                                     "                        \"name\": \"Капитал и резервы\",\n" +
                                     "                        \"startValue\": 9251000,\n" +
                                     "                        \"endValue\": 6728000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1410,\n" +
                                     "                        \"name\": \"Долгосрочные заемные средства\",\n" +
                                     "                        \"startValue\": 6276000,\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1520,\n" +
                                     "                        \"name\": \"Кредиторская задолженность\",\n" +
                                     "                        \"startValue\": 19588000,\n" +
                                     "                        \"endValue\": 16631000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1600,\n" +
                                     "                        \"name\": \"Баланс\",\n" +
                                     "                        \"startValue\": 35116000,\n" +
                                     "                        \"endValue\": 23360000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1700,\n" +
                                     "                        \"name\": \"Баланс\",\n" +
                                     "                        \"startValue\": 35116000,\n" +
                                     "                        \"endValue\": 23360000\n" +
                                     "                    }\n" +
                                     "                ],\n" +
                                     "                \"form2\": [\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2110,\n" +
                                     "                        \"name\": \"Выручка\",\n" +
                                     "                        \"startValue\": 137271000,\n" +
                                     "                        \"endValue\": 103312000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2120,\n" +
                                     "                        \"name\": \"Расходы по обычной деятельности\",\n" +
                                     "                        \"startValue\": 125322000,\n" +
                                     "                        \"endValue\": 93614000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2340,\n" +
                                     "                        \"name\": \"Прочие доходы\",\n" +
                                     "                        \"startValue\": 147000,\n" +
                                     "                        \"endValue\": 3472000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2350,\n" +
                                     "                        \"name\": \"Прочие расходы\",\n" +
                                     "                        \"startValue\": 1501000,\n" +
                                     "                        \"endValue\": 5507000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2400,\n" +
                                     "                        \"name\": \"Чистая прибыль (убыток)\",\n" +
                                     "                        \"startValue\": 9157000,\n" +
                                     "                        \"endValue\": 6428000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2410,\n" +
                                     "                        \"name\": \"Налоги на прибыль (доходы)\",\n" +
                                     "                        \"startValue\": 1438000,\n" +
                                     "                        \"endValue\": 1235000\n" +
                                     "                    }\n" +
                                     "                ]\n" +
                                     "            },\n" +
                                     "            {\n" +
                                     "                \"year\": 2021,\n" +
                                     "                \"organizationType\": \"Small\",\n" +
                                     "                \"form1\": [\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1210,\n" +
                                     "                        \"name\": \"Запасы\",\n" +
                                     "                        \"startValue\": 3167000,\n" +
                                     "                        \"endValue\": 3757000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1230,\n" +
                                     "                        \"name\": \"Финансовые и другие оборотные активы\",\n" +
                                     "                        \"startValue\": 11471000,\n" +
                                     "                        \"endValue\": 5430000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1250,\n" +
                                     "                        \"name\": \"Денежные средства и денежные эквиваленты\",\n" +
                                     "                        \"startValue\": 8721000,\n" +
                                     "                        \"endValue\": 14522000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1300,\n" +
                                     "                        \"name\": \"Капитал и резервы\",\n" +
                                     "                        \"startValue\": 6728000,\n" +
                                     "                        \"endValue\": 10326000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1410,\n" +
                                     "                        \"name\": \"Долгосрочные заемные средства\",\n" +
                                     "                        \"endValue\": 0\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1520,\n" +
                                     "                        \"name\": \"Кредиторская задолженность\",\n" +
                                     "                        \"startValue\": 16631000,\n" +
                                     "                        \"endValue\": 13382000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1600,\n" +
                                     "                        \"name\": \"Баланс\",\n" +
                                     "                        \"startValue\": 23360000,\n" +
                                     "                        \"endValue\": 23708000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1700,\n" +
                                     "                        \"name\": \"Баланс\",\n" +
                                     "                        \"startValue\": 23360000,\n" +
                                     "                        \"endValue\": 23708000\n" +
                                     "                    }\n" +
                                     "                ],\n" +
                                     "                \"form2\": [\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2110,\n" +
                                     "                        \"name\": \"Выручка\",\n" +
                                     "                        \"startValue\": 103312000,\n" +
                                     "                        \"endValue\": 109453000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2120,\n" +
                                     "                        \"name\": \"Расходы по обычной деятельности\",\n" +
                                     "                        \"startValue\": 93614000,\n" +
                                     "                        \"endValue\": 95092000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2340,\n" +
                                     "                        \"name\": \"Прочие доходы\",\n" +
                                     "                        \"startValue\": 3472000,\n" +
                                     "                        \"endValue\": 4141000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2350,\n" +
                                     "                        \"name\": \"Прочие расходы\",\n" +
                                     "                        \"startValue\": 5507000,\n" +
                                     "                        \"endValue\": 7175000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2400,\n" +
                                     "                        \"name\": \"Чистая прибыль (убыток)\",\n" +
                                     "                        \"startValue\": 6428000,\n" +
                                     "                        \"endValue\": 9997000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2410,\n" +
                                     "                        \"name\": \"Налоги на прибыль (доходы)\",\n" +
                                     "                        \"startValue\": 1235000,\n" +
                                     "                        \"endValue\": 1330000\n" +
                                     "                    }\n" +
                                     "                ]\n" +
                                     "            },\n" +
                                     "            {\n" +
                                     "                \"year\": 2022,\n" +
                                     "                \"organizationType\": \"Small\",\n" +
                                     "                \"form1\": [\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1210,\n" +
                                     "                        \"name\": \"Запасы\",\n" +
                                     "                        \"startValue\": 3757000,\n" +
                                     "                        \"endValue\": 3409000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1230,\n" +
                                     "                        \"name\": \"Финансовые и другие оборотные активы\",\n" +
                                     "                        \"startValue\": 5430000,\n" +
                                     "                        \"endValue\": 7154000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1250,\n" +
                                     "                        \"name\": \"Денежные средства и денежные эквиваленты\",\n" +
                                     "                        \"startValue\": 14522000,\n" +
                                     "                        \"endValue\": 17883000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1300,\n" +
                                     "                        \"name\": \"Капитал и резервы\",\n" +
                                     "                        \"startValue\": 10326000,\n" +
                                     "                        \"endValue\": 19697000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1520,\n" +
                                     "                        \"name\": \"Кредиторская задолженность\",\n" +
                                     "                        \"startValue\": 13382000,\n" +
                                     "                        \"endValue\": 8749000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1600,\n" +
                                     "                        \"name\": \"Баланс\",\n" +
                                     "                        \"startValue\": 23708000,\n" +
                                     "                        \"endValue\": 28446000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1700,\n" +
                                     "                        \"name\": \"Баланс\",\n" +
                                     "                        \"startValue\": 23708000,\n" +
                                     "                        \"endValue\": 28446000\n" +
                                     "                    }\n" +
                                     "                ],\n" +
                                     "                \"form2\": [\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2110,\n" +
                                     "                        \"name\": \"Выручка\",\n" +
                                     "                        \"startValue\": 109453000,\n" +
                                     "                        \"endValue\": 120514000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2120,\n" +
                                     "                        \"name\": \"Расходы по обычной деятельности\",\n" +
                                     "                        \"startValue\": 95092000,\n" +
                                     "                        \"endValue\": 105912000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2340,\n" +
                                     "                        \"name\": \"Прочие доходы\",\n" +
                                     "                        \"startValue\": 4141000,\n" +
                                     "                        \"endValue\": 4406000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2350,\n" +
                                     "                        \"name\": \"Прочие расходы\",\n" +
                                     "                        \"startValue\": 7175000,\n" +
                                     "                        \"endValue\": 2332000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2400,\n" +
                                     "                        \"name\": \"Чистая прибыль (убыток)\",\n" +
                                     "                        \"startValue\": 9997000,\n" +
                                     "                        \"endValue\": 15372000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2410,\n" +
                                     "                        \"name\": \"Налоги на прибыль (доходы)\",\n" +
                                     "                        \"startValue\": 1330000,\n" +
                                     "                        \"endValue\": 1304000\n" +
                                     "                    }\n" +
                                     "                ]\n" +
                                     "            },\n" +
                                     "            {\n" +
                                     "                \"year\": 2023,\n" +
                                     "                \"organizationType\": \"Small\",\n" +
                                     "                \"form1\": [\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1210,\n" +
                                     "                        \"name\": \"Запасы\",\n" +
                                     "                        \"startValue\": 3409000,\n" +
                                     "                        \"endValue\": 9648000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1230,\n" +
                                     "                        \"name\": \"Финансовые и другие оборотные активы\",\n" +
                                     "                        \"startValue\": 7154000,\n" +
                                     "                        \"endValue\": 17397000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1250,\n" +
                                     "                        \"name\": \"Денежные средства и денежные эквиваленты\",\n" +
                                     "                        \"startValue\": 17883000,\n" +
                                     "                        \"endValue\": 18678000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1300,\n" +
                                     "                        \"name\": \"Капитал и резервы\",\n" +
                                     "                        \"startValue\": 19697000,\n" +
                                     "                        \"endValue\": 17277000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1520,\n" +
                                     "                        \"name\": \"Кредиторская задолженность\",\n" +
                                     "                        \"startValue\": 8749000,\n" +
                                     "                        \"endValue\": 28447000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1600,\n" +
                                     "                        \"name\": \"Баланс\",\n" +
                                     "                        \"startValue\": 28446000,\n" +
                                     "                        \"endValue\": 45724000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1700,\n" +
                                     "                        \"name\": \"Баланс\",\n" +
                                     "                        \"startValue\": 28446000,\n" +
                                     "                        \"endValue\": 45724000\n" +
                                     "                    }\n" +
                                     "                ],\n" +
                                     "                \"form2\": [\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2110,\n" +
                                     "                        \"name\": \"Выручка\",\n" +
                                     "                        \"startValue\": 120514000,\n" +
                                     "                        \"endValue\": 139104000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2120,\n" +
                                     "                        \"name\": \"Расходы по обычной деятельности\",\n" +
                                     "                        \"startValue\": 105912000,\n" +
                                     "                        \"endValue\": 136142000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2340,\n" +
                                     "                        \"name\": \"Прочие доходы\",\n" +
                                     "                        \"startValue\": 4406000,\n" +
                                     "                        \"endValue\": 2246000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2350,\n" +
                                     "                        \"name\": \"Прочие расходы\",\n" +
                                     "                        \"startValue\": 2332000,\n" +
                                     "                        \"endValue\": 2648000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2400,\n" +
                                     "                        \"name\": \"Чистая прибыль (убыток)\",\n" +
                                     "                        \"startValue\": 15372000,\n" +
                                     "                        \"endValue\": 1081000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2410,\n" +
                                     "                        \"name\": \"Налоги на прибыль (доходы)\",\n" +
                                     "                        \"startValue\": 1304000,\n" +
                                     "                        \"endValue\": 1479000\n" +
                                     "                    }\n" +
                                     "                ]\n" +
                                     "            },\n" +
                                     "            {\n" +
                                     "                \"year\": 2024,\n" +
                                     "                \"organizationType\": \"Small\",\n" +
                                     "                \"form1\": [\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1210,\n" +
                                     "                        \"name\": \"Запасы\",\n" +
                                     "                        \"startValue\": 9648000,\n" +
                                     "                        \"endValue\": 16260000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1230,\n" +
                                     "                        \"name\": \"Финансовые и другие оборотные активы\",\n" +
                                     "                        \"startValue\": 17397000,\n" +
                                     "                        \"endValue\": 18222000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1250,\n" +
                                     "                        \"name\": \"Денежные средства и денежные эквиваленты\",\n" +
                                     "                        \"startValue\": 18678000,\n" +
                                     "                        \"endValue\": 8078000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1300,\n" +
                                     "                        \"name\": \"Капитал и резервы\",\n" +
                                     "                        \"startValue\": 17277000,\n" +
                                     "                        \"endValue\": 13014000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1520,\n" +
                                     "                        \"name\": \"Кредиторская задолженность\",\n" +
                                     "                        \"startValue\": 28447000,\n" +
                                     "                        \"endValue\": 29546000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1600,\n" +
                                     "                        \"name\": \"Баланс\",\n" +
                                     "                        \"startValue\": 45724000,\n" +
                                     "                        \"endValue\": 42560000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1700,\n" +
                                     "                        \"name\": \"Баланс\",\n" +
                                     "                        \"startValue\": 45724000,\n" +
                                     "                        \"endValue\": 42560000\n" +
                                     "                    }\n" +
                                     "                ],\n" +
                                     "                \"form2\": [\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2110,\n" +
                                     "                        \"name\": \"Выручка\",\n" +
                                     "                        \"startValue\": 139104000,\n" +
                                     "                        \"endValue\": 175161000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2120,\n" +
                                     "                        \"name\": \"Расходы по обычной деятельности\",\n" +
                                     "                        \"startValue\": 136142000,\n" +
                                     "                        \"endValue\": 165973000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2340,\n" +
                                     "                        \"name\": \"Прочие доходы\",\n" +
                                     "                        \"startValue\": 2246000,\n" +
                                     "                        \"endValue\": 1909000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2350,\n" +
                                     "                        \"name\": \"Прочие расходы\",\n" +
                                     "                        \"startValue\": 2648000,\n" +
                                     "                        \"endValue\": 3133000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2400,\n" +
                                     "                        \"name\": \"Чистая прибыль (убыток)\",\n" +
                                     "                        \"startValue\": 1081000,\n" +
                                     "                        \"endValue\": 6237000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2410,\n" +
                                     "                        \"name\": \"Налоги на прибыль (доходы)\",\n" +
                                     "                        \"startValue\": 1479000,\n" +
                                     "                        \"endValue\": 1727000\n" +
                                     "                    }\n" +
                                     "                ]\n" +
                                     "            }\n" +
                                     "        ]\n" +
                                     "    }\n" +
                                     "]"
                    ;
            String JSON_RESPONSE_2 = "[\n" +
                                     "    {\n" +
                                     "        \"inn\": \"4712017259\",\n" +
                                     "        \"ogrn\": \"1024701646243\",\n" +
                                     "        \"focusHref\": \"https://focus.kontur.ru/entity?query=1024701646243\",\n" +
                                     "        \"buhForms\": [\n" +
                                     "            {\n" +
                                     "                \"year\": 2019,\n" +
                                     "                \"organizationType\": \"Large\",\n" +
                                     "                \"form1\": [\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1100,\n" +
                                     "                        \"name\": \"Итого\",\n" +
                                     "                        \"startValue\": 321475000,\n" +
                                     "                        \"endValue\": 345935000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1150,\n" +
                                     "                        \"name\": \"Основные средства\",\n" +
                                     "                        \"startValue\": 300606000,\n" +
                                     "                        \"endValue\": 324665000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1160,\n" +
                                     "                        \"name\": \"Доходные вложения в материальные ценности\",\n" +
                                     "                        \"startValue\": 20869000,\n" +
                                     "                        \"endValue\": 21270000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1200,\n" +
                                     "                        \"name\": \"Итого\",\n" +
                                     "                        \"startValue\": 126989000,\n" +
                                     "                        \"endValue\": 142544000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1210,\n" +
                                     "                        \"name\": \"Запасы\",\n" +
                                     "                        \"startValue\": 48736000,\n" +
                                     "                        \"endValue\": 57144000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1230,\n" +
                                     "                        \"name\": \"Дебиторская задолженность\",\n" +
                                     "                        \"startValue\": 56249000,\n" +
                                     "                        \"endValue\": 58080000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1250,\n" +
                                     "                        \"name\": \"Денежные средства и денежные эквиваленты\",\n" +
                                     "                        \"startValue\": 22004000,\n" +
                                     "                        \"endValue\": 27320000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1300,\n" +
                                     "                        \"name\": \"Итого\",\n" +
                                     "                        \"startValue\": -499216000,\n" +
                                     "                        \"endValue\": -484577000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1370,\n" +
                                     "                        \"name\": \"Нераспределенная прибыль (непокрытый убыток)\",\n" +
                                     "                        \"startValue\": -499216000,\n" +
                                     "                        \"endValue\": -484577000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1400,\n" +
                                     "                        \"name\": \"Итого\",\n" +
                                     "                        \"startValue\": 737957000,\n" +
                                     "                        \"endValue\": 791085000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1450,\n" +
                                     "                        \"name\": \"Прочие обязательства\",\n" +
                                     "                        \"startValue\": 737957000,\n" +
                                     "                        \"endValue\": 791085000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1500,\n" +
                                     "                        \"name\": \"Итого\",\n" +
                                     "                        \"startValue\": 209723000,\n" +
                                     "                        \"endValue\": 181971000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1520,\n" +
                                     "                        \"name\": \"Кредиторская задолженность\",\n" +
                                     "                        \"startValue\": 87602000,\n" +
                                     "                        \"endValue\": 45578000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1530,\n" +
                                     "                        \"name\": \"Доходы будущих периодов\",\n" +
                                     "                        \"startValue\": 103039000,\n" +
                                     "                        \"endValue\": 117668000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1550,\n" +
                                     "                        \"name\": \"Прочие обязательства\",\n" +
                                     "                        \"startValue\": 19082000,\n" +
                                     "                        \"endValue\": 18725000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1600,\n" +
                                     "                        \"name\": \"Баланс\",\n" +
                                     "                        \"startValue\": 448464000,\n" +
                                     "                        \"endValue\": 488479000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1700,\n" +
                                     "                        \"name\": \"Баланс\",\n" +
                                     "                        \"startValue\": 448464000,\n" +
                                     "                        \"endValue\": 488479000\n" +
                                     "                    }\n" +
                                     "                ],\n" +
                                     "                \"form2\": [\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2100,\n" +
                                     "                        \"name\": \"Валовая прибыль (убыток)\",\n" +
                                     "                        \"startValue\": 12016000,\n" +
                                     "                        \"endValue\": 9803000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2110,\n" +
                                     "                        \"name\": \"Выручка\",\n" +
                                     "                        \"startValue\": 41490000,\n" +
                                     "                        \"endValue\": 39861000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2120,\n" +
                                     "                        \"name\": \"Себестоимость продаж\",\n" +
                                     "                        \"startValue\": 29474000,\n" +
                                     "                        \"endValue\": 30058000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2200,\n" +
                                     "                        \"name\": \"Прибыль (убыток) от продаж\",\n" +
                                     "                        \"startValue\": 3552000,\n" +
                                     "                        \"endValue\": 1827000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2210,\n" +
                                     "                        \"name\": \"Коммерческие расходы\",\n" +
                                     "                        \"startValue\": 8464000,\n" +
                                     "                        \"endValue\": 7976000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2300,\n" +
                                     "                        \"name\": \"Прибыль (убыток) до налогообложения\",\n" +
                                     "                        \"startValue\": 3552000,\n" +
                                     "                        \"endValue\": 1827000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2400,\n" +
                                     "                        \"name\": \"Чистая прибыль (убыток)\",\n" +
                                     "                        \"startValue\": 3552000,\n" +
                                     "                        \"endValue\": 1827000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2500,\n" +
                                     "                        \"name\": \"Совокупный финансовый результат периода\",\n" +
                                     "                        \"startValue\": 3552000,\n" +
                                     "                        \"endValue\": 1827000\n" +
                                     "                    }\n" +
                                     "                ]\n" +
                                     "            },\n" +
                                     "            {\n" +
                                     "                \"year\": 2020,\n" +
                                     "                \"organizationType\": \"Large\",\n" +
                                     "                \"form1\": [\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1100,\n" +
                                     "                        \"name\": \"Итого\",\n" +
                                     "                        \"startValue\": 345935000,\n" +
                                     "                        \"endValue\": 590035000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1150,\n" +
                                     "                        \"name\": \"Основные средства\",\n" +
                                     "                        \"startValue\": 324665000,\n" +
                                     "                        \"endValue\": 550550000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1160,\n" +
                                     "                        \"name\": \"Доходные вложения в материальные ценности\",\n" +
                                     "                        \"startValue\": 21270000,\n" +
                                     "                        \"endValue\": 39485000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1200,\n" +
                                     "                        \"name\": \"Итого\",\n" +
                                     "                        \"startValue\": 142544000,\n" +
                                     "                        \"endValue\": 132073000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1210,\n" +
                                     "                        \"name\": \"Запасы\",\n" +
                                     "                        \"startValue\": 57144000,\n" +
                                     "                        \"endValue\": 50227000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1230,\n" +
                                     "                        \"name\": \"Дебиторская задолженность\",\n" +
                                     "                        \"startValue\": 58080000,\n" +
                                     "                        \"endValue\": 64398000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1250,\n" +
                                     "                        \"name\": \"Денежные средства и денежные эквиваленты\",\n" +
                                     "                        \"startValue\": 27320000,\n" +
                                     "                        \"endValue\": 17448000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1300,\n" +
                                     "                        \"name\": \"Итого\",\n" +
                                     "                        \"startValue\": -484577000,\n" +
                                     "                        \"endValue\": -560183000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1370,\n" +
                                     "                        \"name\": \"Нераспределенная прибыль (непокрытый убыток)\",\n" +
                                     "                        \"startValue\": -484577000,\n" +
                                     "                        \"endValue\": -560183000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1400,\n" +
                                     "                        \"name\": \"Итого\",\n" +
                                     "                        \"startValue\": 791085000,\n" +
                                     "                        \"endValue\": 1038480000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1450,\n" +
                                     "                        \"name\": \"Прочие обязательства\",\n" +
                                     "                        \"startValue\": 791085000,\n" +
                                     "                        \"endValue\": 1038480000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1500,\n" +
                                     "                        \"name\": \"Итого\",\n" +
                                     "                        \"startValue\": 181971000,\n" +
                                     "                        \"endValue\": 243811000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1520,\n" +
                                     "                        \"name\": \"Кредиторская задолженность\",\n" +
                                     "                        \"startValue\": 45578000,\n" +
                                     "                        \"endValue\": 100369000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1530,\n" +
                                     "                        \"name\": \"Доходы будущих периодов\",\n" +
                                     "                        \"startValue\": 117668000,\n" +
                                     "                        \"endValue\": 111593000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1550,\n" +
                                     "                        \"name\": \"Прочие обязательства\",\n" +
                                     "                        \"startValue\": 18725000,\n" +
                                     "                        \"endValue\": 31849000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1600,\n" +
                                     "                        \"name\": \"Баланс\",\n" +
                                     "                        \"startValue\": 488479000,\n" +
                                     "                        \"endValue\": 722108000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1700,\n" +
                                     "                        \"name\": \"Баланс\",\n" +
                                     "                        \"startValue\": 488479000,\n" +
                                     "                        \"endValue\": 722108000\n" +
                                     "                    }\n" +
                                     "                ],\n" +
                                     "                \"form2\": [\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2100,\n" +
                                     "                        \"name\": \"Валовая прибыль (убыток)\",\n" +
                                     "                        \"startValue\": 9803000,\n" +
                                     "                        \"endValue\": 13190000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2110,\n" +
                                     "                        \"name\": \"Выручка\",\n" +
                                     "                        \"startValue\": 39861000,\n" +
                                     "                        \"endValue\": 38778000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2120,\n" +
                                     "                        \"name\": \"Себестоимость продаж\",\n" +
                                     "                        \"startValue\": 30058000,\n" +
                                     "                        \"endValue\": 25588000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2200,\n" +
                                     "                        \"name\": \"Прибыль (убыток) от продаж\",\n" +
                                     "                        \"startValue\": 1827000,\n" +
                                     "                        \"endValue\": -1988000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2210,\n" +
                                     "                        \"name\": \"Коммерческие расходы\",\n" +
                                     "                        \"startValue\": 7976000,\n" +
                                     "                        \"endValue\": 15178000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2300,\n" +
                                     "                        \"name\": \"Прибыль (убыток) до налогообложения\",\n" +
                                     "                        \"startValue\": 1827000,\n" +
                                     "                        \"endValue\": -1988000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2400,\n" +
                                     "                        \"name\": \"Чистая прибыль (убыток)\",\n" +
                                     "                        \"startValue\": 1827000,\n" +
                                     "                        \"endValue\": -1988000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2500,\n" +
                                     "                        \"name\": \"Совокупный финансовый результат периода\",\n" +
                                     "                        \"startValue\": 1827000,\n" +
                                     "                        \"endValue\": -1988000\n" +
                                     "                    }\n" +
                                     "                ]\n" +
                                     "            },\n" +
                                     "            {\n" +
                                     "                \"year\": 2021,\n" +
                                     "                \"organizationType\": \"Large\",\n" +
                                     "                \"form1\": [\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1100,\n" +
                                     "                        \"name\": \"Итого\",\n" +
                                     "                        \"startValue\": 590035000,\n" +
                                     "                        \"endValue\": 589733000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1150,\n" +
                                     "                        \"name\": \"Основные средства\",\n" +
                                     "                        \"startValue\": 550550000,\n" +
                                     "                        \"endValue\": 545290000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1160,\n" +
                                     "                        \"name\": \"Доходные вложения в материальные ценности\",\n" +
                                     "                        \"startValue\": 39485000,\n" +
                                     "                        \"endValue\": 44443000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1200,\n" +
                                     "                        \"name\": \"Итого\",\n" +
                                     "                        \"startValue\": 132073000,\n" +
                                     "                        \"endValue\": 132242000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1210,\n" +
                                     "                        \"name\": \"Запасы\",\n" +
                                     "                        \"startValue\": 50227000,\n" +
                                     "                        \"endValue\": 39411000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1230,\n" +
                                     "                        \"name\": \"Дебиторская задолженность\",\n" +
                                     "                        \"startValue\": 64398000,\n" +
                                     "                        \"endValue\": 63687000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1250,\n" +
                                     "                        \"name\": \"Денежные средства и денежные эквиваленты\",\n" +
                                     "                        \"startValue\": 17448000,\n" +
                                     "                        \"endValue\": 29144000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1300,\n" +
                                     "                        \"name\": \"Итого\",\n" +
                                     "                        \"startValue\": -560183000,\n" +
                                     "                        \"endValue\": -609082000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1370,\n" +
                                     "                        \"name\": \"Нераспределенная прибыль (непокрытый убыток)\",\n" +
                                     "                        \"startValue\": -560183000,\n" +
                                     "                        \"endValue\": -609082000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1400,\n" +
                                     "                        \"name\": \"Итого\",\n" +
                                     "                        \"startValue\": 1038480000,\n" +
                                     "                        \"endValue\": 1082598000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1450,\n" +
                                     "                        \"name\": \"Прочие обязательства\",\n" +
                                     "                        \"startValue\": 1038480000,\n" +
                                     "                        \"endValue\": 1082598000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1500,\n" +
                                     "                        \"name\": \"Итого\",\n" +
                                     "                        \"startValue\": 243811000,\n" +
                                     "                        \"endValue\": 248459000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1520,\n" +
                                     "                        \"name\": \"Кредиторская задолженность\",\n" +
                                     "                        \"startValue\": 100369000,\n" +
                                     "                        \"endValue\": 125508000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1530,\n" +
                                     "                        \"name\": \"Доходы будущих периодов\",\n" +
                                     "                        \"startValue\": 111593000,\n" +
                                     "                        \"endValue\": 80282000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1550,\n" +
                                     "                        \"name\": \"Прочие обязательства\",\n" +
                                     "                        \"startValue\": 31849000,\n" +
                                     "                        \"endValue\": 42669000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1600,\n" +
                                     "                        \"name\": \"Баланс\",\n" +
                                     "                        \"startValue\": 722108000,\n" +
                                     "                        \"endValue\": 721975000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1700,\n" +
                                     "                        \"name\": \"Баланс\",\n" +
                                     "                        \"startValue\": 722108000,\n" +
                                     "                        \"endValue\": 721975000\n" +
                                     "                    }\n" +
                                     "                ],\n" +
                                     "                \"form2\": [\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2100,\n" +
                                     "                        \"name\": \"Валовая прибыль (убыток)\",\n" +
                                     "                        \"startValue\": 13190000,\n" +
                                     "                        \"endValue\": 14908000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2110,\n" +
                                     "                        \"name\": \"Выручка\",\n" +
                                     "                        \"startValue\": 38778000,\n" +
                                     "                        \"endValue\": 42779000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2120,\n" +
                                     "                        \"name\": \"Себестоимость продаж\",\n" +
                                     "                        \"startValue\": 25588000,\n" +
                                     "                        \"endValue\": 27871000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2200,\n" +
                                     "                        \"name\": \"Прибыль (убыток) от продаж\",\n" +
                                     "                        \"startValue\": -1988000,\n" +
                                     "                        \"endValue\": -663000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2210,\n" +
                                     "                        \"name\": \"Коммерческие расходы\",\n" +
                                     "                        \"startValue\": 15178000,\n" +
                                     "                        \"endValue\": 15571000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2300,\n" +
                                     "                        \"name\": \"Прибыль (убыток) до налогообложения\",\n" +
                                     "                        \"startValue\": -1988000,\n" +
                                     "                        \"endValue\": -663000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2400,\n" +
                                     "                        \"name\": \"Чистая прибыль (убыток)\",\n" +
                                     "                        \"startValue\": -1988000,\n" +
                                     "                        \"endValue\": -663000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2500,\n" +
                                     "                        \"name\": \"Совокупный финансовый результат периода\",\n" +
                                     "                        \"startValue\": -1988000,\n" +
                                     "                        \"endValue\": -663000\n" +
                                     "                    }\n" +
                                     "                ]\n" +
                                     "            },\n" +
                                     "            {\n" +
                                     "                \"year\": 2022,\n" +
                                     "                \"organizationType\": \"Large\",\n" +
                                     "                \"form1\": [\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1100,\n" +
                                     "                        \"name\": \"Итого\",\n" +
                                     "                        \"startValue\": 589733000,\n" +
                                     "                        \"endValue\": 701123000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1150,\n" +
                                     "                        \"name\": \"Основные средства\",\n" +
                                     "                        \"startValue\": 545290000,\n" +
                                     "                        \"endValue\": 661864000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1160,\n" +
                                     "                        \"name\": \"Доходные вложения в материальные ценности\",\n" +
                                     "                        \"startValue\": 44443000,\n" +
                                     "                        \"endValue\": 39259000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1200,\n" +
                                     "                        \"name\": \"Итого\",\n" +
                                     "                        \"startValue\": 132242000,\n" +
                                     "                        \"endValue\": 121626000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1210,\n" +
                                     "                        \"name\": \"Запасы\",\n" +
                                     "                        \"startValue\": 39411000,\n" +
                                     "                        \"endValue\": 34030000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1230,\n" +
                                     "                        \"name\": \"Дебиторская задолженность\",\n" +
                                     "                        \"startValue\": 63687000,\n" +
                                     "                        \"endValue\": 52828000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1250,\n" +
                                     "                        \"name\": \"Денежные средства и денежные эквиваленты\",\n" +
                                     "                        \"startValue\": 29144000,\n" +
                                     "                        \"endValue\": 34768000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1300,\n" +
                                     "                        \"name\": \"Итого\",\n" +
                                     "                        \"startValue\": -609082000,\n" +
                                     "                        \"endValue\": -563048000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1370,\n" +
                                     "                        \"name\": \"Нераспределенная прибыль (непокрытый убыток)\",\n" +
                                     "                        \"startValue\": -609082000,\n" +
                                     "                        \"endValue\": -563048000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1400,\n" +
                                     "                        \"name\": \"Итого\",\n" +
                                     "                        \"startValue\": 1082598000,\n" +
                                     "                        \"endValue\": 1167783000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1450,\n" +
                                     "                        \"name\": \"Прочие обязательства\",\n" +
                                     "                        \"startValue\": 1082598000,\n" +
                                     "                        \"endValue\": 1167783000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1500,\n" +
                                     "                        \"name\": \"Итого\",\n" +
                                     "                        \"startValue\": 248459000,\n" +
                                     "                        \"endValue\": 218014000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1520,\n" +
                                     "                        \"name\": \"Кредиторская задолженность\",\n" +
                                     "                        \"startValue\": 125508000,\n" +
                                     "                        \"endValue\": 72720000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1530,\n" +
                                     "                        \"name\": \"Доходы будущих периодов\",\n" +
                                     "                        \"startValue\": 80282000,\n" +
                                     "                        \"endValue\": 76110000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1550,\n" +
                                     "                        \"name\": \"Прочие обязательства\",\n" +
                                     "                        \"startValue\": 42669000,\n" +
                                     "                        \"endValue\": 69184000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1600,\n" +
                                     "                        \"name\": \"Баланс\",\n" +
                                     "                        \"startValue\": 721975000,\n" +
                                     "                        \"endValue\": 822749000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 1700,\n" +
                                     "                        \"name\": \"Баланс\",\n" +
                                     "                        \"startValue\": 721975000,\n" +
                                     "                        \"endValue\": 822749000\n" +
                                     "                    }\n" +
                                     "                ],\n" +
                                     "                \"form2\": [\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2100,\n" +
                                     "                        \"name\": \"Валовая прибыль (убыток)\",\n" +
                                     "                        \"startValue\": 14908000,\n" +
                                     "                        \"endValue\": 17654000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2110,\n" +
                                     "                        \"name\": \"Выручка\",\n" +
                                     "                        \"startValue\": 42779000,\n" +
                                     "                        \"endValue\": 45798000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2120,\n" +
                                     "                        \"name\": \"Себестоимость продаж\",\n" +
                                     "                        \"startValue\": 27871000,\n" +
                                     "                        \"endValue\": 28144000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2200,\n" +
                                     "                        \"name\": \"Прибыль (убыток) от продаж\",\n" +
                                     "                        \"startValue\": -663000,\n" +
                                     "                        \"endValue\": -358000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2210,\n" +
                                     "                        \"name\": \"Коммерческие расходы\",\n" +
                                     "                        \"startValue\": 15571000,\n" +
                                     "                        \"endValue\": 18012000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2300,\n" +
                                     "                        \"name\": \"Прибыль (убыток) до налогообложения\",\n" +
                                     "                        \"startValue\": -663000,\n" +
                                     "                        \"endValue\": -358000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2400,\n" +
                                     "                        \"name\": \"Чистая прибыль (убыток)\",\n" +
                                     "                        \"startValue\": -663000,\n" +
                                     "                        \"endValue\": -358000\n" +
                                     "                    },\n" +
                                     "                    {\n" +
                                     "                        \"code\": 2500,\n" +
                                     "                        \"name\": \"Совокупный финансовый результат периода\",\n" +
                                     "                        \"startValue\": -663000,\n" +
                                     "                        \"endValue\": -358000\n" +
                                     "                    }\n" +
                                     "                ]\n" +
                                     "            }\n" +
                                     "        ]\n" +
                                     "    }\n" +
                                     "]"
                    ;

            // Возвращаем нужный JSON в зависимости от inn
            if ("7839095581".equals(inn)) {
                return JSON_RESPONSE_1;
            } else {
                return String.format(JSON_RESPONSE_2, inn);
            }

        } catch (InterruptedException e) {
            log.error("Запрос прерван", e);
            Thread.currentThread().interrupt();
            return "{\"error\":\"Запрос прерван\"}";
        } catch (Exception e) {
            log.error("Ошибка обработки запроса", e);
            return "{\"error\":\"Ошибка обработки запроса\"}";
        }
    }
}
