package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class PurchaseController {

    private static final Logger logger = LoggerFactory.getLogger(PurchaseController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_PurchaseController:0}")
    private long delay_PurchaseController;

    @GetMapping("/purchases/purchase?reportId=2&etpId=0818500000825003888")
    public String Purchase() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_PurchaseController);

            // Фиксированный JSON-ответ
            String jsonResponse = "{\n" +
                    "    \"status\": {\n" +
                    "        \"code\": 200,\n" +
                    "        \"descr\": \"Операция успешна\"\n" +
                    "    },\n" +
                    "    \"result\": {\n" +
                    "        \"purchases\": [\n" +
                    "            {\n" +
                    "                \"reportId\": 2,\n" +
                    "                \"filterId\": null,\n" +
                    "                \"filterName\": null,\n" +
                    "                \"notificationNumber\": \"0818500000825003888\",\n" +
                    "                \"contractType\": {\n" +
                    "                    \"code\": 3,\n" +
                    "                    \"name\": \"Электронный аукцион\"\n" +
                    "                },\n" +
                    "                \"sourceContractType\": \"Электронный аукцион\",\n" +
                    "                \"purchaseLink\": \"https://zakupki.gov.ru/epz/order/notice/ea20/view/common-info.html?regNumber=0818500000825003888\",\n" +
                    "                \"publishDate\": \"2025-05-28T17:42:50\",\n" +
                    "                \"subject\": \"Поставка продуктов питания (молоко, кефир, сметана)\",\n" +
                    "                \"purchasePrice\": 3576717.06,\n" +
                    "                \"currency\": {\n" +
                    "                    \"code\": \"RUB\",\n" +
                    "                    \"name\": \"РОССИЙСКИЙ РУБЛЬ\"\n" +
                    "                },\n" +
                    "                \"epName\": \"РТС-тендер\",\n" +
                    "                \"epLink\": \"http://www.rts-tender.ru\",\n" +
                    "                \"status\": {\n" +
                    "                    \"codeStatusEIS\": 9,\n" +
                    "                    \"statusEIS\": \"Определение поставщика завершено\",\n" +
                    "                    \"codeStatusSeldon\": 3,\n" +
                    "                    \"statusSeldon\": \"Завершенная закупка\"\n" +
                    "                },\n" +
                    "                \"startDate\": \"2025-05-28T17:42:50\",\n" +
                    "                \"endDate\": \"2025-06-05T08:00:00\",\n" +
                    "                \"changeDate\": \"2025-06-09T19:26:52\",\n" +
                    "                \"openCoversDate\": null,\n" +
                    "                \"reviewStartDate\": null,\n" +
                    "                \"reviewFinishDate\": null,\n" +
                    "                \"holdingDate\": \"2025-06-05T00:00:00\",\n" +
                    "                \"totalDate\": \"2025-06-09T00:00:00\",\n" +
                    "                \"requestPlace\": null,\n" +
                    "                \"requestOrder\": null,\n" +
                    "                \"purchaseTypeID\": 4,\n" +
                    "                \"organizer\": {\n" +
                    "                    \"id\": 43251938,\n" +
                    "                    \"idEIS\": \"08185000008\",\n" +
                    "                    \"name\": \"ГОСУДАРСТВЕННОЕ КАЗЕННОЕ УЧРЕЖДЕНИЕ КРАСНОДАРСКОГО КРАЯ \\\"ДИРЕКЦИЯ ГОСУДАРСТВЕННЫХ ЗАКУПОК\\\"\",\n" +
                    "                    \"inn\": \"2308265684\",\n" +
                    "                    \"kpp\": \"230801001\",\n" +
                    "                    \"ogrnSource\": \"1192375039119\",\n" +
                    "                    \"ogrnSeldon\": \"1192375039119\",\n" +
                    "                    \"regionCode\": \"23\",\n" +
                    "                    \"region\": \"Краснодарский край\",\n" +
                    "                    \"contactPerson\": \"МИХАИЛ БАШИРОВИЧ МЕЙСИГОВ\",\n" +
                    "                    \"subOrdLevel\": 2,\n" +
                    "                    \"urAddress\": \"350000, КРАСНОДАРСКИЙ КРАЙ, г.о. ГОРОД КРАСНОДАР, Г КРАСНОДАР, УЛ КРАСНАЯ, Д. 35\",\n" +
                    "                    \"factAddress\": \"350014, КРАСНОДАРСКИЙ КРАЙ, г.о. ГОРОД КРАСНОДАР, Г КРАСНОДАР, УЛ КРАСНАЯ, Д. 35\",\n" +
                    "                    \"phone\": \"7-861-2115401\",\n" +
                    "                    \"email\": \"dgz@krasnodar.ru\"\n" +
                    "                },\n" +
                    "                \"lotsList\": [\n" +
                    "                    {\n" +
                    "                        \"id\": 70208646,\n" +
                    "                        \"lotNumber\": 1,\n" +
                    "                        \"subject\": \"Поставка продуктов питания (молоко, кефир, сметана)\",\n" +
                    "                        \"price\": 3576717.06,\n" +
                    "                        \"currency\": {\n" +
                    "                            \"code\": \"RUB\",\n" +
                    "                            \"name\": \"РОССИЙСКИЙ РУБЛЬ\"\n" +
                    "                        },\n" +
                    "                        \"positionsPlanList\": [\n" +
                    "                            \"202503182000281001000875\"\n" +
                    "                        ],\n" +
                    "                        \"productsList\": [\n" +
                    "                            {\n" +
                    "                                \"name\": \"Молоко питьевое\",\n" +
                    "                                \"classifier\": {\n" +
                    "                                    \"okdp\": {\n" +
                    "                                        \"code\": null,\n" +
                    "                                        \"name\": null\n" +
                    "                                    },\n" +
                    "                                    \"okpd\": {\n" +
                    "                                        \"code\": null,\n" +
                    "                                        \"name\": null\n" +
                    "                                    },\n" +
                    "                                    \"okpd2\": {\n" +
                    "                                        \"code\": null,\n" +
                    "                                        \"name\": null\n" +
                    "                                    }\n" +
                    "                                },\n" +
                    "                                \"unit\": {\n" +
                    "                                    \"code\": \"112\",\n" +
                    "                                    \"name\": \"Литр; кубический дециметр\"\n" +
                    "                                },\n" +
                    "                                \"price\": 94.67,\n" +
                    "                                \"quantity\": 15000.00,\n" +
                    "                                \"value\": 1420050.00\n" +
                    "                            },\n" +
                    "                            {\n" +
                    "                                \"name\": \"Кефир\",\n" +
                    "                                \"classifier\": {\n" +
                    "                                    \"okdp\": {\n" +
                    "                                        \"code\": null,\n" +
                    "                                        \"name\": null\n" +
                    "                                    },\n" +
                    "                                    \"okpd\": {\n" +
                    "                                        \"code\": null,\n" +
                    "                                        \"name\": null\n" +
                    "                                    },\n" +
                    "                                    \"okpd2\": {\n" +
                    "                                        \"code\": null,\n" +
                    "                                        \"name\": null\n" +
                    "                                    }\n" +
                    "                                },\n" +
                    "                                \"unit\": {\n" +
                    "                                    \"code\": \"166\",\n" +
                    "                                    \"name\": \"Килограмм\"\n" +
                    "                                },\n" +
                    "                                \"price\": 96.33,\n" +
                    "                                \"quantity\": 12682.00,\n" +
                    "                                \"value\": 1221657.06\n" +
                    "                            },\n" +
                    "                            {\n" +
                    "                                \"name\": \"Сметана\",\n" +
                    "                                \"classifier\": {\n" +
                    "                                    \"okdp\": {\n" +
                    "                                        \"code\": null,\n" +
                    "                                        \"name\": null\n" +
                    "                                    },\n" +
                    "                                    \"okpd\": {\n" +
                    "                                        \"code\": null,\n" +
                    "                                        \"name\": null\n" +
                    "                                    },\n" +
                    "                                    \"okpd2\": {\n" +
                    "                                        \"code\": null,\n" +
                    "                                        \"name\": null\n" +
                    "                                    }\n" +
                    "                                },\n" +
                    "                                \"unit\": {\n" +
                    "                                    \"code\": \"166\",\n" +
                    "                                    \"name\": \"Килограмм\"\n" +
                    "                                },\n" +
                    "                                \"price\": 311.67,\n" +
                    "                                \"quantity\": 3000.00,\n" +
                    "                                \"value\": 935010.00\n" +
                    "                            }\n" +
                    "                        ],\n" +
                    "                        \"customersList\": [\n" +
                    "                            {\n" +
                    "                                \"organization\": {\n" +
                    "                                    \"id\": 2913349,\n" +
                    "                                    \"idEIS\": \"03182000281\",\n" +
                    "                                    \"name\": \"ГОСУДАРСТВЕННОЕ БЮДЖЕТНОЕ УЧРЕЖДЕНИЕ ЗДРАВООХРАНЕНИЯ \\\"ДЕТСКАЯ КРАЕВАЯ КЛИНИЧЕСКАЯ БОЛЬНИЦА\\\" МИНИСТЕРСТВА ЗДРАВООХРАНЕНИЯ КРАСНОДАРСКОГО КРАЯ\",\n" +
                    "                                    \"inn\": \"2309039134\",\n" +
                    "                                    \"kpp\": \"230901001\",\n" +
                    "                                    \"ogrnSource\": \"1022301425629\",\n" +
                    "                                    \"ogrnSeldon\": \"1022301425629\",\n" +
                    "                                    \"regionCode\": \"23\",\n" +
                    "                                    \"region\": \"Краснодарский край\",\n" +
                    "                                    \"contactPerson\": \"Марина Леонидовна Дорошенко\",\n" +
                    "                                    \"subOrdLevel\": 2,\n" +
                    "                                    \"urAddress\": \"Российская Федерация, 350007, Краснодарский край, Краснодар г, ПЛОЩАДЬ ПОБЕДЫ, 1\",\n" +
                    "                                    \"factAddress\": \"Российская Федерация, 350007, Краснодарский край, Краснодар г, ПЛ. ПОБЕДЫ, Д.1\",\n" +
                    "                                    \"phone\": \"7-861-2680027\",\n" +
                    "                                    \"email\": \"zakupkidkkb-kk@mail.ru\"\n" +
                    "                                },\n" +
                    "                                \"amount\": 17883.59,\n" +
                    "                                \"amountCurrency\": {\n" +
                    "                                    \"code\": \"RUB\",\n" +
                    "                                    \"name\": \"РОССИЙСКИЙ РУБЛЬ\"\n" +
                    "                                },\n" +
                    "                                \"conAmount\": 357671.71,\n" +
                    "                                \"conAmountCurrency\": {\n" +
                    "                                    \"code\": \"RUB\",\n" +
                    "                                    \"name\": \"РОССИЙСКИЙ РУБЛЬ\"\n" +
                    "                                },\n" +
                    "                                \"deliveryPlace\": \"Российская Федерация, Российская Федерация, 350007, г. Краснодар, ГБУЗ ДККБ, пл. Победы, 1, эстакада пищеблока\",\n" +
                    "                                \"deliveryTerm\": null\n" +
                    "                            }\n" +
                    "                        ],\n" +
                    "                        \"IKZList\": [\n" +
                    "                            \"252230903913423090100109320011051244\"\n" +
                    "                        ]\n" +
                    "                    }\n" +
                    "                ],\n" +
                    "                \"SeldonId\": 40099370\n" +
                    "            }\n" +
                    "        ]\n" +
                    "    }\n" +
                    "}";

            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "{\"error\": \"Error processing request\"}";
        }
    }
}