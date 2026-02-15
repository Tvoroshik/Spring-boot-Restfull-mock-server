package org.example.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @GetMapping(
            value = "/req",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<String> handleRequest(
            @RequestParam(required = false) String inn,
            @RequestParam(required = false) String ogrn) {

        // Фиксированный JSON-ответ (можно изменить на любой нужный)
        String jsonResponse = """
                [
                    {
                        "inn": "4712017259",
                        "ogrn": "1024701646243",
                        "focusHref": "https://focus.kontur.ru/entity?query=1024701646243",
                        "UL": {
                            "kpp": "471201001",
                            "okpo": "05278964",
                            "okato": "41239501000",
                            "okfs": "13",
                            "oktmo": "41639101001",
                            "okogu": "2300229",
                            "okopf": "75203",
                            "opf": "Государственные бюджетные учреждения субъектов Российской Федерации",
                            "legalName": {
                                "short": "ГБУЗ ЛО \\"ПРИОЗЕРСКАЯ МБ\\"",
                                "full": "ГОСУДАРСТВЕННОЕ БЮДЖЕТНОЕ УЧРЕЖДЕНИЕ ЗДРАВООХРАНЕНИЯ ЛЕНИНГРАДСКОЙ ОБЛАСТИ \\"ПРИОЗЕРСКАЯ МЕЖРАЙОННАЯ БОЛЬНИЦА\\"",
                                "readable": "ГБУЗ Ленинградской Области \\"Приозерская Межрайонная Больница\\"",
                                "date": "2013-12-27"
                            },
                            "legalAddress": {
                                "parsedAddressRF": {
                                    "zipCode": "188760",
                                    "kladrCode": "470150010000024",
                                    "regionCode": "47",
                                    "regionName": {
                                        "topoShortName": "обл.",
                                        "topoFullName": "область",
                                        "topoValue": "Ленинградская"
                                    },
                                    "district": {
                                        "topoShortName": "р-н",
                                        "topoFullName": "район",
                                        "topoValue": "Приозерский"
                                    },
                                    "city": {
                                        "topoShortName": "г.",
                                        "topoFullName": "город",
                                        "topoValue": "Приозерск"
                                    },
                                    "street": {
                                        "topoShortName": "ул.",
                                        "topoFullName": "улица",
                                        "topoValue": "Калинина"
                                    },
                                    "house": {
                                        "topoShortName": "д.",
                                        "topoFullName": "дом",
                                        "topoValue": "35"
                                    },
                                    "houseRaw": "Д.35",
                                    "bulkRaw": "--",
                                    "flatRaw": "--",
                                    "oneLineFormatOfAddress": "188760, Ленинградская область, р-н Приозерский, г. Приозерск, ул. Калинина, д. 35"
                                },
                                "parsedAddressRFFias": {
                                    "fiasId": 10274360,
                                    "fiasGUID": "33cad95e-57e5-47cd-948f-d974e4ac06a4",
                                    "zipCode": "188760",
                                    "regionCode": "47",
                                    "region": {
                                        "topoShortName": "обл.",
                                        "topoFullName": "область",
                                        "topoValue": "Ленинградская"
                                    },
                                    "municipalDistrict": {
                                        "topoShortName": "м.р-н",
                                        "topoFullName": "муниципальный район",
                                        "topoValue": "Приозерский"
                                    },
                                    "urbanSettlement": {
                                        "topoShortName": "г.п.",
                                        "topoFullName": "городское поселение",
                                        "topoValue": "Приозерское"
                                    },
                                    "city": {
                                        "topoShortName": "г.",
                                        "topoFullName": "город",
                                        "topoValue": "Приозерск"
                                    },
                                    "street": {
                                        "topoShortName": "ул.",
                                        "topoFullName": "улица",
                                        "topoValue": "Калинина"
                                    },
                                    "buildings": [
                                        {
                                            "topoShortName": "д.",
                                            "topoFullName": "дом",
                                            "topoValue": "35"
                                        }
                                    ],
                                    "isConverted": true,
                                    "oneLineFormatOfAddressFias": "188760, Ленинградская область, м.р-н Приозерский, г.п. Приозерское, г. Приозерск, ул. Калинина, д. 35"
                                },
                                "date": "2016-02-17",
                                "firstDate": "2002-08-07"
                            },
                            "status": {
                                "statusString": "Действующее"
                            },
                            "registrationDate": "1999-12-23",
                            "heads": [
                                {
                                    "fio": "Тарасов Виктор Сергеевич",
                                    "innfl": "230810744612",
                                    "position": "Главный врач",
                                    "date": "2024-09-23",
                                    "firstDate": "2023-05-23",
                                    "structuredFio": {
                                        "firstName": "Виктор",
                                        "lastName": "Тарасов",
                                        "middleName": "Сергеевич"
                                    }
                                }
                            ],
                            "history": {
                                "legalNames": [
                                    {
                                        "short": "МБУЗ \\"Приозерская ЦРБ\\"",
                                        "full": "Муниципальное бюджетное учреждение здравоохранения \\"Приозерская центральная районная больница\\"",
                                        "readable": "Муниципальное бюджетное учреждение здравоохранения \\"Приозерская центральная районная больница\\"",
                                        "date": "2011-12-23"
                                    },
                                    {
                                        "short": "МУЗ \\"Приозерская ЦРБ\\"",
                                        "readable": "МУЗ \\"Приозерская ЦРБ\\""
                                    },
                                    {
                                        "full": "Муниципальное учреждение здравоохранения \\"Приозерская центральная районная больница\\"",
                                        "readable": "Муниципальное учреждение здравоохранения \\"Приозерская центральная районная больница\\""
                                    }
                                ],
                                "legalAddresses": [
                                    {
                                        "parsedAddressRF": {
                                            "zipCode": "188760",
                                            "kladrCode": "470150010000024",
                                            "regionCode": "47",
                                            "regionName": {
                                                "topoShortName": "обл.",
                                                "topoFullName": "область",
                                                "topoValue": "Ленинградская"
                                            },
                                            "city": {
                                                "topoShortName": "г.",
                                                "topoFullName": "город",
                                                "topoValue": "Приозерск"
                                            },
                                            "street": {
                                                "topoShortName": "ул.",
                                                "topoFullName": "улица",
                                                "topoValue": "Калинина"
                                            },
                                            "house": {
                                                "topoShortName": "д.",
                                                "topoFullName": "дом",
                                                "topoValue": "35"
                                            },
                                            "houseRaw": "35",
                                            "oneLineFormatOfAddress": "188760, Ленинградская область, г. Приозерск, ул. Калинина, д. 35"
                                        },
                                        "date": "2002-08-07",
                                        "firstDate": "2002-08-07"
                                    }
                                ],
                                "heads": [
                                    {
                                        "fio": "Корнилов Евгений Владимирович",
                                        "innfl": "471204801172",
                                        "position": "Главный врач",
                                        "date": "2011-03-15",
                                        "firstDate": "2011-03-15",
                                        "structuredFio": {
                                            "firstName": "Евгений",
                                            "lastName": "Корнилов",
                                            "middleName": "Владимирович"
                                        }
                                    },
                                    {
                                        "fio": "Хворова Мария Викторовна",
                                        "innfl": "280112339422",
                                        "position": "Исполняющая обязанности главного врача",
                                        "date": "2019-03-27",
                                        "firstDate": "2019-03-27",
                                        "structuredFio": {
                                            "firstName": "Мария",
                                            "lastName": "Хворова",
                                            "middleName": "Викторовна"
                                        }
                                    },
                                    {
                                        "fio": "Никифоренко Андрей Владимирович",
                                        "innfl": "780229525953",
                                        "position": "Исполняющий обязанности главного врача",
                                        "date": "2019-05-08",
                                        "firstDate": "2019-05-08",
                                        "structuredFio": {
                                            "firstName": "Андрей",
                                            "lastName": "Никифоренко",
                                            "middleName": "Владимирович"
                                        }
                                    },
                                    {
                                        "fio": "Замятнин Сергей Алексеевич",
                                        "innfl": "782506079908",
                                        "position": "Главный врач",
                                        "date": "2021-08-12",
                                        "firstDate": "2020-06-09",
                                        "structuredFio": {
                                            "firstName": "Сергей",
                                            "lastName": "Замятнин",
                                            "middleName": "Алексеевич"
                                        }
                                    }
                                ]
                            }
                        },
                        "briefReport": {
                            "summary": {
                                "greenStatements": true,
                                "yellowStatements": true
                            }
                        },
                        "contactPhones": {
                            "count": 10
                        },
                        "contactEmails": {}
                    }
                ]
        """;

        return ResponseEntity.ok().body(jsonResponse);
    }
}
