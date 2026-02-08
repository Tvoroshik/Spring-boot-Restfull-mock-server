package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurchaseNumberController {

    private static final Logger logger = LoggerFactory.getLogger(PurchaseNumberController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_PurchaseNumber:0}")
    private long delay_PurchaseNumber;

    @GetMapping("/?purchaseNumber=0345300046725000253")
    public String PurchaseNumber() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_PurchaseNumber);

            // Фиксированный JSON-ответ
            String jsonResponse = "{\n" +
                    "    \"number\": \"0345300046725000253\",\n" +
                    "    \"url\": \"https://zakupki.gov.ru/epz/order/notice/zk20/view/common-info.html?regNumber=0345300046725000253\",\n" +
                    "    \"federalLawRefId\": \"44\",\n" +
                    "    \"fz\": \"44\",\n" +
                    "    \"xmlUrl\": \"zakupki.gov.ru/44/purchase/public/notification/print-form/show.html?noticeId=0345300046725000253\",\n" +
                    "    \"tenderType\": \"Запрос котировок\",\n" +
                    "    \"placingWay\": \"Запрос котировок в электронной форме\",\n" +
                    "    \"multiLot\": false,\n" +
                    "    \"lots\": [\n" +
                    "        {\n" +
                    "            \"number\": 1,\n" +
                    "            \"maxAmount\": 349000.00,\n" +
                    "            \"currency\": \"RUB\",\n" +
                    "            \"subject\": \"Оказание услуг по ремонту видеоколоноскопов\",\n" +
                    "            \"customer\": {\n" +
                    "                \"fullName\": \"ГОСУДАРСТВЕННОЕ БЮДЖЕТНОЕ УЧРЕЖДЕНИЕ ЗДРАВООХРАНЕНИЯ ЛЕНИНГРАДСКОЙ ОБЛАСТИ \\\"ПРИОЗЕРСКАЯ МЕЖРАЙОННАЯ БОЛЬНИЦА\\\"\",\n" +
                    "                \"regNum\": \"03453000467\",\n" +
                    "                \"inn\": \"4712017259\",\n" +
                    "                \"ogrn\": \"1024701646243\",\n" +
                    "                \"maxAmount\": 349000.00,\n" +
                    "                \"contractGuaranteeAmount\": 34900.00,\n" +
                    "                \"applicationGuaranteeAmount\": null,\n" +
                    "                \"deliveryPlace\": \"Российская Федерация, \"\n" +
                    "            },\n" +
                    "            \"customers\": [\n" +
                    "                {\n" +
                    "                    \"fullName\": \"ГОСУДАРСТВЕННОЕ БЮДЖЕТНОЕ УЧРЕЖДЕНИЕ ЗДРАВООХРАНЕНИЯ ЛЕНИНГРАДСКОЙ ОБЛАСТИ \\\"ПРИОЗЕРСКАЯ МЕЖРАЙОННАЯ БОЛЬНИЦА\\\"\",\n" +
                    "                    \"regNum\": \"03453000467\",\n" +
                    "                    \"inn\": \"4712017259\",\n" +
                    "                    \"ogrn\": \"1024701646243\",\n" +
                    "                    \"maxAmount\": 349000.00,\n" +
                    "                    \"contractGuaranteeAmount\": 34900.00,\n" +
                    "                    \"applicationGuaranteeAmount\": null,\n" +
                    "                    \"deliveryPlace\": \"Российская Федерация, \"\n" +
                    "                }\n" +
                    "            ],\n" +
                    "            \"ikzList\": [\n" +
                    "                \"252471201725947120100100710023313244\"\n" +
                    "            ],\n" +
                    "            \"products\": [\n" +
                    "                {\n" +
                    "                    \"name\": \"Оказание услуг по ремонту видеоколоноскопа Pentax EC-3890LK, серийный номер K120636\",\n" +
                    "                    \"classifier\": {\n" +
                    "                        \"okdp\": {\n" +
                    "                            \"code\": null,\n" +
                    "                            \"name\": null\n" +
                    "                        },\n" +
                    "                        \"okpd\": {\n" +
                    "                            \"code\": null,\n" +
                    "                            \"name\": null\n" +
                    "                        },\n" +
                    "                        \"okpd2\": {\n" +
                    "                            \"code\": \"33.13.12.000\",\n" +
                    "                            \"name\": \"Услуги по ремонту и техническому обслуживанию облучающего, электрического диагностического и электрического терапевтического оборудования, применяемого в медицинских целях\"\n" +
                    "                        }\n" +
                    "                    },\n" +
                    "                    \"unit\": {\n" +
                    "                        \"code\": \"876\",\n" +
                    "                        \"name\": \"Условная единица\"\n" +
                    "                    },\n" +
                    "                    \"price\": 25500000,\n" +
                    "                    \"quantity\": 1.00,\n" +
                    "                    \"value\": 25500000\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"name\": \"Оказание услуг по ремонту видеоколоноскопа Pentax EC34-i10L, серийный номер K110034\",\n" +
                    "                    \"classifier\": {\n" +
                    "                        \"okdp\": {\n" +
                    "                            \"code\": null,\n" +
                    "                            \"name\": null\n" +
                    "                        },\n" +
                    "                        \"okpd\": {\n" +
                    "                            \"code\": null,\n" +
                    "                            \"name\": null\n" +
                    "                        },\n" +
                    "                        \"okpd2\": {\n" +
                    "                            \"code\": \"33.13.12.000\",\n" +
                    "                            \"name\": \"Услуги по ремонту и техническому обслуживанию облучающего, электрического диагностического и электрического терапевтического оборудования, применяемого в медицинских целях\"\n" +
                    "                        }\n" +
                    "                    },\n" +
                    "                    \"unit\": {\n" +
                    "                        \"code\": \"876\",\n" +
                    "                        \"name\": \"Условная единица\"\n" +
                    "                    },\n" +
                    "                    \"price\": 9400000,\n" +
                    "                    \"quantity\": 1.00,\n" +
                    "                    \"value\": 9400000\n" +
                    "                }\n" +
                    "            ]\n" +
                    "        }\n" +
                    "    ],\n" +
                    "    \"etp\": {\n" +
                    "        \"code\": null,\n" +
                    "        \"name\": \"РТС-тендер\",\n" +
                    "        \"url\": \"http://www.rts-tender.ru\"\n" +
                    "    },\n" +
                    "    \"subject\": \"Оказание услуг по ремонту видеоколоноскопов\",\n" +
                    "    \"publishDate\": \"2025-11-18T10:42:04\",\n" +
                    "    \"holdingDate\": null,\n" +
                    "    \"endDate\": \"2025-11-25T00:00:00\",\n" +
                    "    \"reviewStartDate\": null\n" +
                    "}";

            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "{\"error\": \"Error processing request\"}";
        }
    }
}