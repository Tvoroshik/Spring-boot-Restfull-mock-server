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

    @GetMapping("/purchases/purchase?reportId=2&etpId=0345300046725000253")
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
                    "                \"notificationNumber\": \"0848600003321000037\",\n" +
                    "                \"contractType\": {\n" +
                    "                    \"code\": 4,\n" +
                    "                    \"name\": \"Запрос котировок\"\n" +
                    "                },\n" +
                    "                \"sourceContractType\": \"Запрос котировок в электронной форме\",\n" +
                    "                \"purchaseLink\": \"https://zakupki.gov.ru/epz/order/notice/zk20/view/common-info.html?regNumber=0848600003321000037\",\n" +
                    "                \"publishDate\": \"2025-11-17T04:43:54\",\n" +
                    "                \"subject\": \"Катетеры баллонные для коронарной ангиопластики, стандартные\",\n" +
                    "                \"purchasePrice\": 3746440.35,\n" +
                    "                \"currency\": {\n" +
                    "                    \"code\": \"RUB\",\n" +
                    "                    \"name\": \"РОССИЙСКИЙ РУБЛЬ\"\n" +
                    "                },\n" +
                    "                \"epName\": \"АО «Сбербанк-АСТ»\",\n" +
                    "                \"epLink\": \"http://www.sberbank-ast.ru\",\n" +
                    "                \"status\": {\n" +
                    "                    \"codeStatusEIS\": 9,\n" +
                    "                    \"statusEIS\": \"Определение поставщика завершено\",\n" +
                    "                    \"codeStatusSeldon\": 3,\n" +
                    "                    \"statusSeldon\": \"Завершенная закупка\"\n" +
                    "                },\n" +
                    "                \"startDate\": \"2025-11-17T11:43:54\",\n" +
                    "                \"endDate\": \"2025-11-24T09:00:00\",\n" +
                    "                \"changeDate\": \"2025-11-25T10:33:13\",\n" +
                    "                \"openCoversDate\": null,\n" +
                    "                \"reviewStartDate\": null,\n" +
                    "                \"reviewFinishDate\": null,\n" +
                    "                \"holdingDate\": null,\n" +
                    "                \"totalDate\": \"2025-11-25T00:00:00\",\n" +
                    "                \"requestPlace\": null,\n" +
                    "                \"requestOrder\": null,\n" +
                    "                \"purchaseTypeID\": 4,\n" +
                    "                \"organizer\": {\n" +
                    "                    \"id\": 2827054,\n" +
                    "                    \"idEIS\": \"03203000906\",\n" +
                    "                    \"name\": \"КРАЕВОЕ ГОСУДАРСТВЕННОЕ БЮДЖЕТНОЕ УЧРЕЖДЕНИЕ ЗДРАВООХРАНЕНИЯ \\\"ВЛАДИВОСТОКСКАЯ КЛИНИЧЕСКАЯ БОЛЬНИЦА № 1\\\"\",\n" +
                    "                    \"inn\": \"2504001670\",\n" +
                    "                    \"kpp\": \"254001001\",\n" +
                    "                    \"ogrnSource\": \"1022502284892\",\n" +
                    "                    \"ogrnSeldon\": \"1022502284892\",\n" +
                    "                    \"regionCode\": \"25\",\n" +
                    "                    \"region\": \"Приморский край\",\n" +
                    "                    \"contactPerson\": \"Ксения   Александровна  Яглинская\",\n" +
                    "                    \"subOrdLevel\": 2,\n" +
                    "                    \"urAddress\": \"Российская Федерация, 690078, Приморский край, Владивосток г, УЛ. САДОВАЯ, Д.22\",\n" +
                    "                    \"factAddress\": \"Российская Федерация, 690078, Приморский край, Владивосток г, УЛ. САДОВАЯ, Д.22\",\n" +
                    "                    \"phone\": \"7-423-2452634\",\n" +
                    "                    \"email\": \"zakupki@vkb1.ru\"\n" +
                    "                },\n" +
                    "                \"lotsList\": [\n" +
                    "                    {\n" +
                    "                        \"id\": 71341187,\n" +
                    "                        \"lotNumber\": 1,\n" +
                    "                        \"subject\": \"Катетеры баллонные для коронарной ангиопластики, стандартные\",\n" +
                    "                        \"price\": 3746440.35,\n" +
                    "                        \"currency\": {\n" +
                    "                            \"code\": \"RUB\",\n" +
                    "                            \"name\": \"РОССИЙСКИЙ РУБЛЬ\"\n" +
                    "                        },\n" +
                    "                        \"positionsPlanList\": [\n" +
                    "                            \"202503203000906001000020\"\n" +
                    "                        ],\n" +
                    "                        \"productsList\": [\n" +
                    "                            {\n" +
                    "                                \"name\": \"Катетер баллонный для коронарной ангиопластики, стандартный\",\n" +
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
                    "                                    \"code\": \"796\",\n" +
                    "                                    \"name\": \"Штука\"\n" +
                    "                                },\n" +
                    "                                \"price\": 6466.67,\n" +
                    "                                \"quantity\": 40.00,\n" +
                    "                                \"value\": 258666.80\n" +
                    "                            },\n" +
                    "                            {\n" +
                    "                                \"name\": \"Катетер баллонный для коронарной ангиопластики, стандартный\",\n" +
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
                    "                                    \"code\": \"796\",\n" +
                    "                                    \"name\": \"Штука\"\n" +
                    "                                },\n" +
                    "                                \"price\": 5780.33,\n" +
                    "                                \"quantity\": 25.00,\n" +
                    "                                \"value\": 144508.25\n" +
                    "                            },\n" +
                    "                            {\n" +
                    "                                \"name\": \"Катетер баллонный для коронарной ангиопластики, стандартный\",\n" +
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
                    "                                    \"code\": \"796\",\n" +
                    "                                    \"name\": \"Штука\"\n" +
                    "                                },\n" +
                    "                                \"price\": 6133.33,\n" +
                    "                                \"quantity\": 65.00,\n" +
                    "                                \"value\": 398666.45\n" +
                    "                            },\n" +
                    "                            {\n" +
                    "                                \"name\": \"Катетер баллонный для коронарной ангиопластики, стандартный\",\n" +
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
                    "                                    \"code\": \"796\",\n" +
                    "                                    \"name\": \"Штука\"\n" +
                    "                                },\n" +
                    "                                \"price\": 6133.33,\n" +
                    "                                \"quantity\": 55.00,\n" +
                    "                                \"value\": 337333.15\n" +
                    "                            },\n" +
                    "                            {\n" +
                    "                                \"name\": \"Катетер баллонный для коронарной ангиопластики, стандартный\",\n" +
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
                    "                                    \"code\": \"796\",\n" +
                    "                                    \"name\": \"Штука\"\n" +
                    "                                },\n" +
                    "                                \"price\": 6133.33,\n" +
                    "                                \"quantity\": 70.00,\n" +
                    "                                \"value\": 429333.10\n" +
                    "                            },\n" +
                    "                            {\n" +
                    "                                \"name\": \"Катетер баллонный для коронарной ангиопластики, стандартный\",\n" +
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
                    "                                    \"code\": \"796\",\n" +
                    "                                    \"name\": \"Штука\"\n" +
                    "                                },\n" +
                    "                                \"price\": 6133.33,\n" +
                    "                                \"quantity\": 95.00,\n" +
                    "                                \"value\": 582666.35\n" +
                    "                            },\n" +
                    "                            {\n" +
                    "                                \"name\": \"Катетер баллонный для коронарной ангиопластики, стандартный\",\n" +
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
                    "                                    \"code\": \"796\",\n" +
                    "                                    \"name\": \"Штука\"\n" +
                    "                                },\n" +
                    "                                \"price\": 6133.33,\n" +
                    "                                \"quantity\": 125.00,\n" +
                    "                                \"value\": 766666.25\n" +
                    "                            },\n" +
                    "                            {\n" +
                    "                                \"name\": \"Катетер баллонный для коронарной ангиопластики, стандартный\",\n" +
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
                    "                                    \"code\": \"796\",\n" +
                    "                                    \"name\": \"Штука\"\n" +
                    "                                },\n" +
                    "                                \"price\": 6466.67,\n" +
                    "                                \"quantity\": 20.00,\n" +
                    "                                \"value\": 129333.40\n" +
                    "                            },\n" +
                    "                            {\n" +
                    "                                \"name\": \"Катетер баллонный для коронарной ангиопластики, стандартный\",\n" +
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
                    "                                    \"code\": \"796\",\n" +
                    "                                    \"name\": \"Штука\"\n" +
                    "                                },\n" +
                    "                                \"price\": 6133.33,\n" +
                    "                                \"quantity\": 45.00,\n" +
                    "                                \"value\": 275999.85\n" +
                    "                            },\n" +
                    "                            {\n" +
                    "                                \"name\": \"Катетер баллонный для коронарной ангиопластики, стандартный\",\n" +
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
                    "                                    \"code\": \"796\",\n" +
                    "                                    \"name\": \"Штука\"\n" +
                    "                                },\n" +
                    "                                \"price\": 6466.67,\n" +
                    "                                \"quantity\": 20.00,\n" +
                    "                                \"value\": 129333.40\n" +
                    "                            },\n" +
                    "                            {\n" +
                    "                                \"name\": \"Катетер баллонный для коронарной ангиопластики, стандартный\",\n" +
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
                    "                                    \"code\": \"796\",\n" +
                    "                                    \"name\": \"Штука\"\n" +
                    "                                },\n" +
                    "                                \"price\": 6133.33,\n" +
                    "                                \"quantity\": 10.00,\n" +
                    "                                \"value\": 61333.30\n" +
                    "                            },\n" +
                    "                            {\n" +
                    "                                \"name\": \"Катетер баллонный для коронарной ангиопластики, стандартный\",\n" +
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
                    "                                    \"code\": \"796\",\n" +
                    "                                    \"name\": \"Штука\"\n" +
                    "                                },\n" +
                    "                                \"price\": 6466.67,\n" +
                    "                                \"quantity\": 8.00,\n" +
                    "                                \"value\": 51733.36\n" +
                    "                            },\n" +
                    "                            {\n" +
                    "                                \"name\": \"Катетер баллонный для коронарной ангиопластики, стандартный\",\n" +
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
                    "                                    \"code\": \"796\",\n" +
                    "                                    \"name\": \"Штука\"\n" +
                    "                                },\n" +
                    "                                \"price\": 6466.67,\n" +
                    "                                \"quantity\": 7.00,\n" +
                    "                                \"value\": 45266.69\n" +
                    "                            },\n" +
                    "                            {\n" +
                    "                                \"name\": \"Катетер баллонный для коронарной ангиопластики, стандартный\",\n" +
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
                    "                                    \"code\": \"796\",\n" +
                    "                                    \"name\": \"Штука\"\n" +
                    "                                },\n" +
                    "                                \"price\": 6800.00,\n" +
                    "                                \"quantity\": 12.00,\n" +
                    "                                \"value\": 81600.00\n" +
                    "                            },\n" +
                    "                            {\n" +
                    "                                \"name\": \"Катетер баллонный для коронарной ангиопластики, стандартный\",\n" +
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
                    "                                    \"code\": \"796\",\n" +
                    "                                    \"name\": \"Штука\"\n" +
                    "                                },\n" +
                    "                                \"price\": 6800.00,\n" +
                    "                                \"quantity\": 4.00,\n" +
                    "                                \"value\": 27200.00\n" +
                    "                            },\n" +
                    "                            {\n" +
                    "                                \"name\": \"Катетер баллонный для коронарной ангиопластики, стандартный\",\n" +
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
                    "                                    \"code\": \"796\",\n" +
                    "                                    \"name\": \"Штука\"\n" +
                    "                                },\n" +
                    "                                \"price\": 6700.00,\n" +
                    "                                \"quantity\": 4.00,\n" +
                    "                                \"value\": 26800.00\n" +
                    "                            }\n" +
                    "                        ],\n" +
                    "                        \"customersList\": [\n" +
                    "                            {\n" +
                    "                                \"organization\": {\n" +
                    "                                    \"id\": 2827054,\n" +
                    "                                    \"idEIS\": \"03203000906\",\n" +
                    "                                    \"name\": \"КРАЕВОЕ ГОСУДАРСТВЕННОЕ БЮДЖЕТНОЕ УЧРЕЖДЕНИЕ ЗДРАВООХРАНЕНИЯ \\\"ВЛАДИВОСТОКСКАЯ КЛИНИЧЕСКАЯ БОЛЬНИЦА № 1\\\"\",\n" +
                    "                                    \"inn\": \"2504001670\",\n" +
                    "                                    \"kpp\": \"254001001\",\n" +
                    "                                    \"ogrnSource\": \"1022502284892\",\n" +
                    "                                    \"ogrnSeldon\": \"1022502284892\",\n" +
                    "                                    \"regionCode\": \"25\",\n" +
                    "                                    \"region\": \"Приморский край\",\n" +
                    "                                    \"contactPerson\": \"Ксения   Александровна  Яглинская\",\n" +
                    "                                    \"subOrdLevel\": 2,\n" +
                    "                                    \"urAddress\": \"Российская Федерация, 690078, Приморский край, Владивосток г, УЛ. САДОВАЯ, Д.22\",\n" +
                    "                                    \"factAddress\": \"Российская Федерация, 690078, Приморский край, Владивосток г, УЛ. САДОВАЯ, Д.22\",\n" +
                    "                                    \"phone\": \"7-423-2452634\",\n" +
                    "                                    \"email\": \"zakupki@vkb1.ru\"\n" +
                    "                                },\n" +
                    "                                \"amount\": 37464.40,\n" +
                    "                                \"amountCurrency\": {\n" +
                    "                                    \"code\": \"RUB\",\n" +
                    "                                    \"name\": \"РОССИЙСКИЙ РУБЛЬ\"\n" +
                    "                                },\n" +
                    "                                \"conAmount\": 749288.07,\n" +
                    "                                \"conAmountCurrency\": {\n" +
                    "                                    \"code\": \"RUB\",\n" +
                    "                                    \"name\": \"РОССИЙСКИЙ РУБЛЬ\"\n" +
                    "                                },\n" +
                    "                                \"deliveryPlace\": \"Российская Федерация, 690078, Приморский край, г. Владивосток, ул. Садовая, д. 22, склад медицинских изделий.\",\n" +
                    "                                \"deliveryTerm\": null\n" +
                    "                            }\n" +
                    "                        ],\n" +
                    "                        \"IKZList\": [\n" +
                    "                            \"252250400167025400100100151660000244\"\n" +
                    "                        ]\n" +
                    "                    }\n" +
                    "                ],\n" +
                    "                \"SeldonId\": 41249688\n" +
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