package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EgrDetailsController {

    private static final Logger log = LoggerFactory.getLogger(EgrDetailsController.class);


    @Value("${app.delay.egrDetails:0}")
    private long egrDetailsDelay;

    // JSON-ответы для разных INN/OGRN (можно вынести в файлы или базу)
    private static final String JSON_RESPONSE_1 = "";

    private static final String JSON_RESPONSE_2 = "[\n" +
                                                  "    {\n" +
                                                  "        \"inn\": \"4712017259\",\n" +
                                                  "        \"ogrn\": \"1024701646243\",\n" +
                                                  "        \"focusHref\": \"https://focus.kontur.ru/entity?query=1024701646243\",\n" +
                                                  "        \"UL\": {\n" +
                                                  "            \"kpp\": \"471201001\",\n" +
                                                  "            \"okpo\": \"05278964\",\n" +
                                                  "            \"okato\": \"41239501000\",\n" +
                                                  "            \"okfs\": \"13\",\n" +
                                                  "            \"oktmo\": \"41639101001\",\n" +
                                                  "            \"okogu\": \"2300229\",\n" +
                                                  "            \"okopf\": \"75203\",\n" +
                                                  "            \"opf\": \"Государственные бюджетные учреждения субъектов Российской Федерации\",\n" +
                                                  "            \"legalName\": {\n" +
                                                  "                \"short\": \"ГБУЗ ЛО \\\"ПРИОЗЕРСКАЯ МБ\\\"\",\n" +
                                                  "                \"full\": \"ГОСУДАРСТВЕННОЕ БЮДЖЕТНОЕ УЧРЕЖДЕНИЕ ЗДРАВООХРАНЕНИЯ ЛЕНИНГРАДСКОЙ ОБЛАСТИ \\\"ПРИОЗЕРСКАЯ МЕЖРАЙОННАЯ БОЛЬНИЦА\\\"\",\n" +
                                                  "                \"readable\": \"ГБУЗ Ленинградской Области \\\"Приозерская Межрайонная Больница\\\"\",\n" +
                                                  "                \"date\": \"2013-12-27\"\n" +
                                                  "            },\n" +
                                                  "            \"legalAddress\": {\n" +
                                                  "                \"parsedAddressRF\": {\n" +
                                                  "                    \"zipCode\": \"188760\",\n" +
                                                  "                    \"kladrCode\": \"470150010000024\",\n" +
                                                  "                    \"regionCode\": \"47\",\n" +
                                                  "                    \"regionName\": {\n" +
                                                  "                        \"topoShortName\": \"обл.\",\n" +
                                                  "                        \"topoFullName\": \"область\",\n" +
                                                  "                        \"topoValue\": \"Ленинградская\"\n" +
                                                  "                    },\n" +
                                                  "                    \"district\": {\n" +
                                                  "                        \"topoShortName\": \"р-н\",\n" +
                                                  "                        \"topoFullName\": \"район\",\n" +
                                                  "                        \"topoValue\": \"Приозерский\"\n" +
                                                  "                    },\n" +
                                                  "                    \"city\": {\n" +
                                                  "                        \"topoShortName\": \"г.\",\n" +
                                                  "                        \"topoFullName\": \"город\",\n" +
                                                  "                        \"topoValue\": \"Приозерск\"\n" +
                                                  "                    },\n" +
                                                  "                    \"street\": {\n" +
                                                  "                        \"topoShortName\": \"ул.\",\n" +
                                                  "                        \"topoFullName\": \"улица\",\n" +
                                                  "                        \"topoValue\": \"Калинина\"\n" +
                                                  "                    },\n" +
                                                  "                    \"house\": {\n" +
                                                  "                        \"topoShortName\": \"д.\",\n" +
                                                  "                        \"topoFullName\": \"дом\",\n" +
                                                  "                        \"topoValue\": \"35\"\n" +
                                                  "                    },\n" +
                                                  "                    \"houseRaw\": \"Д.35\",\n" +
                                                  "                    \"bulkRaw\": \"--\",\n" +
                                                  "                    \"flatRaw\": \"--\",\n" +
                                                  "                    \"oneLineFormatOfAddress\": \"188760, Ленинградская область, р-н Приозерский, г. Приозерск, ул. Калинина, д. 35\"\n" +
                                                  "                },\n" +
                                                  "                \"parsedAddressRFFias\": {\n" +
                                                  "                    \"fiasId\": 10274360,\n" +
                                                  "                    \"fiasGUID\": \"33cad95e-57e5-47cd-948f-d974e4ac06a4\",\n" +
                                                  "                    \"zipCode\": \"188760\",\n" +
                                                  "                    \"regionCode\": \"47\",\n" +
                                                  "                    \"region\": {\n" +
                                                  "                        \"topoShortName\": \"обл.\",\n" +
                                                  "                        \"topoFullName\": \"область\",\n" +
                                                  "                        \"topoValue\": \"Ленинградская\"\n" +
                                                  "                    },\n" +
                                                  "                    \"municipalDistrict\": {\n" +
                                                  "                        \"topoShortName\": \"м.р-н\",\n" +
                                                  "                        \"topoFullName\": \"муниципальный район\",\n" +
                                                  "                        \"topoValue\": \"Приозерский\"\n" +
                                                  "                    },\n" +
                                                  "                    \"urbanSettlement\": {\n" +
                                                  "                        \"topoShortName\": \"г.п.\",\n" +
                                                  "                        \"topoFullName\": \"городское поселение\",\n" +
                                                  "                        \"topoValue\": \"Приозерское\"\n" +
                                                  "                    },\n" +
                                                  "                    \"city\": {\n" +
                                                  "                        \"topoShortName\": \"г.\",\n" +
                                                  "                        \"topoFullName\": \"город\",\n" +
                                                  "                        \"topoValue\": \"Приозерск\"\n" +
                                                  "                    },\n" +
                                                  "                    \"street\": {\n" +
                                                  "                        \"topoShortName\": \"ул.\",\n" +
                                                  "                        \"topoFullName\": \"улица\",\n" +
                                                  "                        \"topoValue\": \"Калинина\"\n" +
                                                  "                    },\n" +
                                                  "                    \"buildings\": [\n" +
                                                  "                        {\n" +
                                                  "                            \"topoShortName\": \"д.\",\n" +
                                                  "                            \"topoFullName\": \"дом\",\n" +
                                                  "                            \"topoValue\": \"35\"\n" +
                                                  "                        }\n" +
                                                  "                    ],\n" +
                                                  "                    \"isConverted\": true,\n" +
                                                  "                    \"oneLineFormatOfAddressFias\": \"188760, Ленинградская область, м.р-н Приозерский, г.п. Приозерское, г. Приозерск, ул. Калинина, д. 35\"\n" +
                                                  "                },\n" +
                                                  "                \"date\": \"2016-02-17\",\n" +
                                                  "                \"firstDate\": \"2002-08-07\"\n" +
                                                  "            },\n" +
                                                  "            \"status\": {\n" +
                                                  "                \"statusString\": \"Действующее\"\n" +
                                                  "            },\n" +
                                                  "            \"registrationDate\": \"1999-12-23\",\n" +
                                                  "            \"heads\": [\n" +
                                                  "                {\n" +
                                                  "                    \"fio\": \"Тарасов Виктор Сергеевич\",\n" +
                                                  "                    \"innfl\": \"230810744612\",\n" +
                                                  "                    \"position\": \"Главный врач\",\n" +
                                                  "                    \"date\": \"2024-09-23\",\n" +
                                                  "                    \"firstDate\": \"2023-05-23\",\n" +
                                                  "                    \"structuredFio\": {\n" +
                                                  "                        \"firstName\": \"Виктор\",\n" +
                                                  "                        \"lastName\": \"Тарасов\",\n" +
                                                  "                        \"middleName\": \"Сергеевич\"\n" +
                                                  "                    }\n" +
                                                  "                }\n" +
                                                  "            ],\n" +
                                                  "            \"history\": {\n" +
                                                  "                \"legalNames\": [\n" +
                                                  "                    {\n" +
                                                  "                        \"short\": \"МБУЗ \\\"Приозерская ЦРБ\\\"\",\n" +
                                                  "                        \"full\": \"Муниципальное бюджетное учреждение здравоохранения \\\"Приозерская центральная районная больница\\\"\",\n" +
                                                  "                        \"readable\": \"Муниципальное бюджетное учреждение здравоохранения \\\"Приозерская центральная районная больница\\\"\",\n" +
                                                  "                        \"date\": \"2011-12-23\"\n" +
                                                  "                    },\n" +
                                                  "                    {\n" +
                                                  "                        \"short\": \"МУЗ \\\"Приозерская ЦРБ\\\"\",\n" +
                                                  "                        \"readable\": \"МУЗ \\\"Приозерская ЦРБ\\\"\"\n" +
                                                  "                    },\n" +
                                                  "                    {\n" +
                                                  "                        \"full\": \"Муниципальное учреждение здравоохранения \\\"Приозерская центральная районная больница\\\"\",\n" +
                                                  "                        \"readable\": \"Муниципальное учреждение здравоохранения \\\"Приозерская центральная районная больница\\\"\"\n" +
                                                  "                    }\n" +
                                                  "                ],\n" +
                                                  "                \"legalAddresses\": [\n" +
                                                  "                    {\n" +
                                                  "                        \"parsedAddressRF\": {\n" +
                                                  "                            \"zipCode\": \"188760\",\n" +
                                                  "                            \"kladrCode\": \"470150010000024\",\n" +
                                                  "                            \"regionCode\": \"47\",\n" +
                                                  "                            \"regionName\": {\n" +
                                                  "                                \"topoShortName\": \"обл.\",\n" +
                                                  "                                \"topoFullName\": \"область\",\n" +
                                                  "                                \"topoValue\": \"Ленинградская\"\n" +
                                                  "                            },\n" +
                                                  "                            \"city\": {\n" +
                                                  "                                \"topoShortName\": \"г.\",\n" +
                                                  "                                \"topoFullName\": \"город\",\n" +
                                                  "                                \"topoValue\": \"Приозерск\"\n" +
                                                  "                            },\n" +
                                                  "                            \"street\": {\n" +
                                                  "                                \"topoShortName\": \"ул.\",\n" +
                                                  "                                \"topoFullName\": \"улица\",\n" +
                                                  "                                \"topoValue\": \"Калинина\"\n" +
                                                  "                            },\n" +
                                                  "                            \"house\": {\n" +
                                                  "                                \"topoShortName\": \"д.\",\n" +
                                                  "                                \"topoFullName\": \"дом\",\n" +
                                                  "                                \"topoValue\": \"35\"\n" +
                                                  "                            },\n" +
                                                  "                            \"houseRaw\": \"35\",\n" +
                                                  "                            \"oneLineFormatOfAddress\": \"188760, Ленинградская область, г. Приозерск, ул. Калинина, д. 35\"\n" +
                                                  "                        },\n" +
                                                  "                        \"date\": \"2002-08-07\",\n" +
                                                  "                        \"firstDate\": \"2002-08-07\"\n" +
                                                  "                    }\n" +
                                                  "                ],\n" +
                                                  "                \"heads\": [\n" +
                                                  "                    {\n" +
                                                  "                        \"fio\": \"Корнилов Евгений Владимирович\",\n" +
                                                  "                        \"innfl\": \"471204801172\",\n" +
                                                  "                        \"position\": \"Главный врач\",\n" +
                                                  "                        \"date\": \"2011-03-15\",\n" +
                                                  "                        \"firstDate\": \"2011-03-15\",\n" +
                                                  "                        \"structuredFio\": {\n" +
                                                  "                            \"firstName\": \"Евгений\",\n" +
                                                  "                            \"lastName\": \"Корнилов\",\n" +
                                                  "                            \"middleName\": \"Владимирович\"\n" +
                                                  "                        }\n" +
                                                  "                    },\n" +
                                                  "                    {\n" +
                                                  "                        \"fio\": \"Хворова Мария Викторовна\",\n" +
                                                  "                        \"innfl\": \"280112339422\",\n" +
                                                  "                        \"position\": \"Исполняющая обязанности главного врача\",\n" +
                                                  "                        \"date\": \"2019-03-27\",\n" +
                                                  "                        \"firstDate\": \"2019-03-27\",\n" +
                                                  "                        \"structuredFio\": {\n" +
                                                  "                            \"firstName\": \"Мария\",\n" +
                                                  "                            \"lastName\": \"Хворова\",\n" +
                                                  "                            \"middleName\": \"Викторовна\"\n" +
                                                  "                        }\n" +
                                                  "                    },\n" +
                                                  "                    {\n" +
                                                  "                        \"fio\": \"Никифоренко Андрей Владимирович\",\n" +
                                                  "                        \"innfl\": \"780229525953\",\n" +
                                                  "                        \"position\": \"Исполняющий обязанности главного врача\",\n" +
                                                  "                        \"date\": \"2019-05-08\",\n" +
                                                  "                        \"firstDate\": \"2019-05-08\",\n" +
                                                  "                        \"structuredFio\": {\n" +
                                                  "                            \"firstName\": \"Андрей\",\n" +
                                                  "                            \"lastName\": \"Никифоренко\",\n" +
                                                  "                            \"middleName\": \"Владимирович\"\n" +
                                                  "                        }\n" +
                                                  "                    },\n" +
                                                  "                    {\n" +
                                                  "                        \"fio\": \"Замятнин Сергей Алексеевич\",\n" +
                                                  "                        \"innfl\": \"782506079908\",\n" +
                                                  "                        \"position\": \"Главный врач\",\n" +
                                                  "                        \"date\": \"2021-08-12\",\n" +
                                                  "                        \"firstDate\": \"2020-06-09\",\n" +
                                                  "                        \"structuredFio\": {\n" +
                                                  "                            \"firstName\": \"Сергей\",\n" +
                                                  "                            \"lastName\": \"Замятнин\",\n" +
                                                  "                            \"middleName\": \"Алексеевич\"\n" +
                                                  "                        }\n" +
                                                  "                    }\n" +
                                                  "                ]\n" +
                                                  "            }\n" +
                                                  "        },\n" +
                                                  "        \"briefReport\": {\n" +
                                                  "            \"summary\": {\n" +
                                                  "                \"greenStatements\": true,\n" +
                                                  "                \"yellowStatements\": true\n" +
                                                  "            }\n" +
                                                  "        },\n" +
                                                  "        \"contactPhones\": {\n" +
                                                  "            \"count\": 10\n" +
                                                  "        },\n" +
                                                  "        \"contactEmails\": {}\n" +
                                                  "    }\n" +
                                                  "]";

    @GetMapping(
            value = "/egrDetails",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<String> getEgrDetails(
            @RequestParam String ogrn,
            @RequestParam String inn) {

        try {
            // Логируем входные параметры
            log.info("Received request: inn={}, ogrn={}", inn, ogrn);

            // Добавляем задержку, если настроена
            if (egrDetailsDelay > 0) {
                Thread.sleep(egrDetailsDelay);
            }

            // Определяем, какой JSON вернуть (пример логики)
            String jsonResponse;
            if ("4712017259".equals(inn) && "1024701646243".equals(ogrn)) {
                jsonResponse = JSON_RESPONSE_1;
            } else {
                jsonResponse = JSON_RESPONSE_2;
            }

            return ResponseEntity.ok(jsonResponse);

        } catch (InterruptedException e) {log.error("Request processing interrupted", e);
            Thread.currentThread().interrupt();return ResponseEntity.status(500)
                    .body("{\"error\": \"Internal server error\"}");} catch (Exception e) {
            log.error("Unexpected error processing request", e);return ResponseEntity.status(500)
                    .body("{\"error\": \"Unexpected error\"}");
        }
    }
}
