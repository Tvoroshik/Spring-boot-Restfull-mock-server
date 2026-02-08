package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetDealsGroupCompaniesController {

    private static final Logger logger = LoggerFactory.getLogger(GetDealsGroupCompaniesController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_GetDealsGroupCompanies:0}")
    private long delay_GetDealsGroupCompanies;

    @GetMapping("/deal/GetDealsGroupsCompaniesByInnClient?inn=7839095581")
    public String GetDealsGroupCompanies() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_GetDealsGroupCompanies);

            // Фиксированный JSON-ответ (пример структуры)
            String jsonResponse =  "{\n" +
                    "    \"dataDeal\": [\n" +
                    "        {\n" +
                    "            \"dealId\": 266431434,\n" +
                    "            \"dealStateId\": 266431435,\n" +
                    "            \"dealType\": \"Гарантия\",\n" +
                    "            \"dealTypeCode\": \"DealType_Guarantee\",\n" +
                    "            \"dealKind\": \"Электронная банковская гарантия - Исполнение без ФП\",\n" +
                    "            \"dealKindCode\": \"DealKind_GuaranteeEBG_EBGExecution_NoFP\",\n" +
                    "            \"fullName\": \"ООО \\\"ЭВОТРЕЙД\\\"\",\n" +
                    "            \"clientId\": 63275892,\n" +
                    "            \"clientPin\": \"UAU2IU\",\n" +
                    "            \"dealDocNumber\": \"1EXS9X\",\n" +
                    "            \"docDate\": \"2025-12-04\",\n" +
                    "            \"beginDate\": \"2025-12-05\",\n" +
                    "            \"endDate\": \"2027-02-01\",\n" +
                    "            \"guaranteeBeginDate\": \"2025-12-05\",\n" +
                    "            \"sum\": 100000.0000,\n" +
                    "            \"sumRest\": 100000.0000,\n" +
                    "            \"currency\": \"RUR\",\n" +
                    "            \"inn\": \"7839095581\",\n" +
                    "            \"status\": \"Действует ЭБГ\",\n" +
                    "            \"additionalStatus\": \"Open\",\n" +
                    "            \"fz\": \"223-ФЗ «О закупках товаров, работ, услуг отдельными видами юридических лиц» \",\n" +
                    "            \"reserveCategoryCbName\": \"II\",\n" +
                    "            \"reserveRateCb\": 2.0,\n" +
                    "            \"portfolioName\": \"Портфель Гарантий МБ и СРКБ БОО до 10 млн рублей\",\n" +
                    "            \"beneficiaryId\": 188042144,\n" +
                    "            \"beneficiaryInn\": \"3804002194\",\n" +
                    "            \"beneficiaryOgrn\": \"1023800837280\",\n" +
                    "            \"beneficiaryKpp\": \"380401001\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dealId\": 266853448,\n" +
                    "            \"dealStateId\": 266853449,\n" +
                    "            \"dealType\": \"Гарантия\",\n" +
                    "            \"dealTypeCode\": \"DealType_Guarantee\",\n" +
                    "            \"dealKind\": \"Электронная банковская гарантия - Исполнение без ФП\",\n" +
                    "            \"dealKindCode\": \"DealKind_GuaranteeEBG_EBGExecution_NoFP\",\n" +
                    "            \"fullName\": \"ООО \\\"ЭВОТРЕЙД\\\"\",\n" +
                    "            \"clientId\": 63275892,\n" +
                    "            \"clientPin\": \"UAU2IU\",\n" +
                    "            \"dealDocNumber\": \"1FIC1X\",\n" +
                    "            \"docDate\": \"2025-12-10\",\n" +
                    "            \"beginDate\": \"2025-12-11\",\n" +
                    "            \"endDate\": \"2026-05-01\",\n" +
                    "            \"guaranteeBeginDate\": \"2025-12-11\",\n" +
                    "            \"sum\": 22629.1700,\n" +
                    "            \"sumRest\": 22629.1700,\n" +
                    "            \"currency\": \"RUR\",\n" +
                    "            \"inn\": \"7839095581\",\n" +
                    "            \"status\": \"Действует ЭБГ\",\n" +
                    "            \"additionalStatus\": \"Open\",\n" +
                    "            \"fz\": \"44-Ф \\\"О гос. закупках\\\" \",\n" +
                    "            \"reserveCategoryCbName\": \"II\",\n" +
                    "            \"reserveRateCb\": 2.0,\n" +
                    "            \"portfolioName\": \"Портфель Гарантий МБ и СРКБ БОО до 10 млн рублей\",\n" +
                    "            \"beneficiaryId\": 147128610,\n" +
                    "            \"beneficiaryInn\": \"3703007051\",\n" +
                    "            \"beneficiaryOgrn\": \"1023701273144\",\n" +
                    "            \"beneficiaryKpp\": \"370301001\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dealId\": 266853463,\n" +
                    "            \"dealStateId\": 266853464,\n" +
                    "            \"dealType\": \"Гарантия\",\n" +
                    "            \"dealTypeCode\": \"DealType_Guarantee\",\n" +
                    "            \"dealKind\": \"Электронная банковская гарантия - Исполнение без ФП\",\n" +
                    "            \"dealKindCode\": \"DealKind_GuaranteeEBG_EBGExecution_NoFP\",\n" +
                    "            \"fullName\": \"ООО \\\"ЭВОТРЕЙД\\\"\",\n" +
                    "            \"clientId\": 63275892,\n" +
                    "            \"clientPin\": \"UAU2IU\",\n" +
                    "            \"dealDocNumber\": \"1FIC2X\",\n" +
                    "            \"docDate\": \"2025-12-10\",\n" +
                    "            \"beginDate\": \"2025-12-11\",\n" +
                    "            \"endDate\": \"2026-05-01\",\n" +
                    "            \"guaranteeBeginDate\": \"2025-12-11\",\n" +
                    "            \"sum\": 27097.5000,\n" +
                    "            \"sumRest\": 27097.5000,\n" +
                    "            \"currency\": \"RUR\",\n" +
                    "            \"inn\": \"7839095581\",\n" +
                    "            \"status\": \"Действует ЭБГ\",\n" +
                    "            \"additionalStatus\": \"Open\",\n" +
                    "            \"fz\": \"44-Ф \\\"О гос. закупках\\\" \",\n" +
                    "            \"reserveCategoryCbName\": \"II\",\n" +
                    "            \"reserveRateCb\": 2.0,\n" +
                    "            \"portfolioName\": \"Портфель Гарантий МБ и СРКБ БОО до 10 млн рублей\",\n" +
                    "            \"beneficiaryId\": 147128610,\n" +
                    "            \"beneficiaryInn\": \"3703007051\",\n" +
                    "            \"beneficiaryOgrn\": \"1023701273144\",\n" +
                    "            \"beneficiaryKpp\": \"370301001\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dealId\": 266903756,\n" +
                    "            \"dealStateId\": 266903757,\n" +
                    "            \"dealType\": \"Гарантия\",\n" +
                    "            \"dealTypeCode\": \"DealType_Guarantee\",\n" +
                    "            \"dealKind\": \"Электронная банковская гарантия - Гарантийный период без ФП\",\n" +
                    "            \"dealKindCode\": \"DealKind_GuaranteeEBG_EBGGuaranteePeriod_NoFP\",\n" +
                    "            \"fullName\": \"ООО \\\"ЭВОТРЕЙД\\\"\",\n" +
                    "            \"clientId\": 63275892,\n" +
                    "            \"clientPin\": \"UAU2IU\",\n" +
                    "            \"dealDocNumber\": \"1FKI1X\",\n" +
                    "            \"docDate\": \"2025-12-11\",\n" +
                    "            \"beginDate\": \"2025-12-12\",\n" +
                    "            \"endDate\": \"2026-10-31\",\n" +
                    "            \"guaranteeBeginDate\": \"2025-12-12\",\n" +
                    "            \"sum\": 33000.0000,\n" +
                    "            \"sumRest\": 33000.0000,\n" +
                    "            \"currency\": \"RUR\",\n" +
                    "            \"inn\": \"7839095581\",\n" +
                    "            \"status\": \"Действует ЭБГ\",\n" +
                    "            \"additionalStatus\": \"Open\",\n" +
                    "            \"fz\": \"44-Ф \\\"О гос. закупках\\\" \",\n" +
                    "            \"reserveCategoryCbName\": \"II\",\n" +
                    "            \"reserveRateCb\": 2.0,\n" +
                    "            \"portfolioName\": \"Портфель Гарантий МБ и СРКБ БОО до 10 млн рублей\",\n" +
                    "            \"beneficiaryId\": 218991345,\n" +
                    "            \"beneficiaryInn\": \"6820008689\",\n" +
                    "            \"beneficiaryOgrn\": \"1026800885803\",\n" +
                    "            \"beneficiaryKpp\": \"682001001\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dealId\": 267418757,\n" +
                    "            \"dealStateId\": 267418758,\n" +
                    "            \"dealType\": \"Гарантия\",\n" +
                    "            \"dealTypeCode\": \"DealType_Guarantee\",\n" +
                    "            \"dealKind\": \"Электронная банковская гарантия - Исполнение без ФП\",\n" +
                    "            \"dealKindCode\": \"DealKind_GuaranteeEBG_EBGExecution_NoFP\",\n" +
                    "            \"fullName\": \"ООО \\\"ЭВОТРЕЙД\\\"\",\n" +
                    "            \"clientId\": 63275892,\n" +
                    "            \"clientPin\": \"UAU2IU\",\n" +
                    "            \"dealDocNumber\": \"1G6P6X\",\n" +
                    "            \"docDate\": \"2025-12-17\",\n" +
                    "            \"beginDate\": \"2025-12-19\",\n" +
                    "            \"endDate\": \"2026-07-01\",\n" +
                    "            \"guaranteeBeginDate\": \"2025-12-19\",\n" +
                    "            \"sum\": 62947.5000,\n" +
                    "            \"sumRest\": 62947.5000,\n" +
                    "            \"currency\": \"RUR\",\n" +
                    "            \"inn\": \"7839095581\",\n" +
                    "            \"status\": \"Действует ЭБГ\",\n" +
                    "            \"additionalStatus\": \"Open\",\n" +
                    "            \"fz\": \"44-Ф \\\"О гос. закупках\\\" \",\n" +
                    "            \"reserveCategoryCbName\": \"II\",\n" +
                    "            \"reserveRateCb\": 2.0,\n" +
                    "            \"portfolioName\": \"Портфель Гарантий МБ и СРКБ БОО до 10 млн рублей\",\n" +
                    "            \"beneficiaryId\": 98140288,\n" +
                    "            \"beneficiaryInn\": \"6902010174\",\n" +
                    "            \"beneficiaryOgrn\": \"1036900016537\",\n" +
                    "            \"beneficiaryKpp\": \"695201001\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dealId\": 267484451,\n" +
                    "            \"dealStateId\": 267484452,\n" +
                    "            \"dealType\": \"Гарантия\",\n" +
                    "            \"dealTypeCode\": \"DealType_Guarantee\",\n" +
                    "            \"dealKind\": \"Электронная банковская гарантия - Гарантийный период без ФП\",\n" +
                    "            \"dealKindCode\": \"DealKind_GuaranteeEBG_EBGGuaranteePeriod_NoFP\",\n" +
                    "            \"fullName\": \"ООО \\\"ЭВОТРЕЙД\\\"\",\n" +
                    "            \"clientId\": 63275892,\n" +
                    "            \"clientPin\": \"UAU2IU\",\n" +
                    "            \"dealDocNumber\": \"1GAT2X\",\n" +
                    "            \"docDate\": \"2025-12-18\",\n" +
                    "            \"beginDate\": \"2025-12-18\",\n" +
                    "            \"endDate\": \"2026-10-31\",\n" +
                    "            \"guaranteeBeginDate\": \"2025-12-18\",\n" +
                    "            \"sum\": 29750.0000,\n" +
                    "            \"sumRest\": 29750.0000,\n" +
                    "            \"currency\": \"RUR\",\n" +
                    "            \"inn\": \"7839095581\",\n" +
                    "            \"status\": \"Действует ЭБГ\",\n" +
                    "            \"additionalStatus\": \"Open\",\n" +
                    "            \"fz\": \"44-Ф \\\"О гос. закупках\\\" \",\n" +
                    "            \"reserveCategoryCbName\": \"II\",\n" +
                    "            \"reserveRateCb\": 2.0,\n" +
                    "            \"portfolioName\": \"Портфель Гарантий МБ и СРКБ БОО до 10 млн рублей\",\n" +
                    "            \"beneficiaryId\": 173839422,\n" +
                    "            \"beneficiaryInn\": \"4027001785\",\n" +
                    "            \"beneficiaryOgrn\": \"1024001192500\",\n" +
                    "            \"beneficiaryKpp\": \"402701001\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dealId\": 267692498,\n" +
                    "            \"dealStateId\": 267692499,\n" +
                    "            \"dealType\": \"Гарантия\",\n" +
                    "            \"dealTypeCode\": \"DealType_Guarantee\",\n" +
                    "            \"dealKind\": \"Электронная банковская гарантия - Гарантийный период без ФП\",\n" +
                    "            \"dealKindCode\": \"DealKind_GuaranteeEBG_EBGGuaranteePeriod_NoFP\",\n" +
                    "            \"fullName\": \"ООО \\\"ЭВОТРЕЙД\\\"\",\n" +
                    "            \"clientId\": 63275892,\n" +
                    "            \"clientPin\": \"UAU2IU\",\n" +
                    "            \"dealDocNumber\": \"1GJX2X\",\n" +
                    "            \"docDate\": \"2025-12-22\",\n" +
                    "            \"beginDate\": \"2025-12-22\",\n" +
                    "            \"endDate\": \"2026-10-31\",\n" +
                    "            \"guaranteeBeginDate\": \"2025-12-22\",\n" +
                    "            \"sum\": 17450.0000,\n" +
                    "            \"sumRest\": 17450.0000,\n" +
                    "            \"currency\": \"RUR\",\n" +
                    "            \"inn\": \"7839095581\",\n" +
                    "            \"status\": \"Действует ЭБГ\",\n" +
                    "            \"additionalStatus\": \"Open\",\n" +
                    "            \"fz\": \"44-Ф \\\"О гос. закупках\\\" \",\n" +
                    "            \"reserveCategoryCbName\": \"II\",\n" +
                    "            \"reserveRateCb\": 2.0,\n" +
                    "            \"portfolioName\": \"Портфель Гарантий МБ и СРКБ БОО до 10 млн рублей\",\n" +
                    "            \"beneficiaryId\": 143856572,\n" +
                    "            \"beneficiaryInn\": \"4712017259\",\n" +
                    "            \"beneficiaryOgrn\": \"1024701646243\",\n" +
                    "            \"beneficiaryKpp\": \"471201001\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dealId\": 264346080,\n" +
                    "            \"dealStateId\": 264346081,\n" +
                    "            \"dealType\": \"Гарантия\",\n" +
                    "            \"dealTypeCode\": \"DealType_Guarantee\",\n" +
                    "            \"dealKind\": \"Электронная банковская гарантия - Исполнение без ФП\",\n" +
                    "            \"dealKindCode\": \"DealKind_GuaranteeEBG_EBGExecution_NoFP\",\n" +
                    "            \"fullName\": \"ООО \\\"ЭВОТРЕЙД\\\"\",\n" +
                    "            \"clientId\": 63275892,\n" +
                    "            \"clientPin\": \"UAU2IU\",\n" +
                    "            \"dealDocNumber\": \"1CMX9X\",\n" +
                    "            \"docDate\": \"2025-11-06\",\n" +
                    "            \"beginDate\": \"2025-11-07\",\n" +
                    "            \"endDate\": \"2026-01-31\",\n" +
                    "            \"guaranteeBeginDate\": \"2025-11-07\",\n" +
                    "            \"sum\": 59500.0000,\n" +
                    "            \"sumRest\": 59500.0000,\n" +
                    "            \"currency\": \"RUR\",\n" +
                    "            \"inn\": \"7839095581\",\n" +
                    "            \"status\": \"Действует ЭБГ\",\n" +
                    "            \"additionalStatus\": \"Open\",\n" +
                    "            \"fz\": \"44-Ф \\\"О гос. закупках\\\" \",\n" +
                    "            \"reserveCategoryCbName\": \"II\",\n" +
                    "            \"reserveRateCb\": 2.0,\n" +
                    "            \"portfolioName\": \"Портфель Гарантий МБ и СРКБ БОО до 10 млн рублей\",\n" +
                    "            \"beneficiaryId\": 173839422,\n" +
                    "            \"beneficiaryInn\": \"4027001785\",\n" +
                    "            \"beneficiaryOgrn\": \"1024001192500\",\n" +
                    "            \"beneficiaryKpp\": \"402701001\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dealId\": 264812695,\n" +
                    "            \"dealStateId\": 264812696,\n" +
                    "            \"dealType\": \"Гарантия\",\n" +
                    "            \"dealTypeCode\": \"DealType_Guarantee\",\n" +
                    "            \"dealKind\": \"Электронная банковская гарантия - Исполнение без ФП\",\n" +
                    "            \"dealKindCode\": \"DealKind_GuaranteeEBG_EBGExecution_NoFP\",\n" +
                    "            \"fullName\": \"ООО \\\"ЭВОТРЕЙД\\\"\",\n" +
                    "            \"clientId\": 63275892,\n" +
                    "            \"clientPin\": \"UAU2IU\",\n" +
                    "            \"dealDocNumber\": \"1D634X\",\n" +
                    "            \"docDate\": \"2025-11-13\",\n" +
                    "            \"beginDate\": \"2025-11-14\",\n" +
                    "            \"endDate\": \"2027-01-31\",\n" +
                    "            \"guaranteeBeginDate\": \"2025-11-14\",\n" +
                    "            \"sum\": 70000.0000,\n" +
                    "            \"sumRest\": 70000.0000,\n" +
                    "            \"currency\": \"RUR\",\n" +
                    "            \"inn\": \"7839095581\",\n" +
                    "            \"status\": \"Действует ЭБГ\",\n" +
                    "            \"additionalStatus\": \"Open\",\n" +
                    "            \"fz\": \"44-Ф \\\"О гос. закупках\\\" \",\n" +
                    "            \"reserveCategoryCbName\": \"II\",\n" +
                    "            \"reserveRateCb\": 2.0,\n" +
                    "            \"portfolioName\": \"Портфель Гарантий МБ и СРКБ БОО до 10 млн рублей\",\n" +
                    "            \"beneficiaryId\": 165479789,\n" +
                    "            \"beneficiaryInn\": \"5903072767\",\n" +
                    "            \"beneficiaryOgrn\": \"1065903037694\",\n" +
                    "            \"beneficiaryKpp\": \"590301001\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dealId\": 265607459,\n" +
                    "            \"dealStateId\": 265607460,\n" +
                    "            \"dealType\": \"Гарантия\",\n" +
                    "            \"dealTypeCode\": \"DealType_Guarantee\",\n" +
                    "            \"dealKind\": \"Электронная банковская гарантия - Исполнение без ФП\",\n" +
                    "            \"dealKindCode\": \"DealKind_GuaranteeEBG_EBGExecution_NoFP\",\n" +
                    "            \"fullName\": \"ООО \\\"ЭВОТРЕЙД\\\"\",\n" +
                    "            \"clientId\": 63275892,\n" +
                    "            \"clientPin\": \"UAU2IU\",\n" +
                    "            \"dealDocNumber\": \"1E109X\",\n" +
                    "            \"docDate\": \"2025-11-25\",\n" +
                    "            \"beginDate\": \"2025-11-25\",\n" +
                    "            \"endDate\": \"2026-01-31\",\n" +
                    "            \"guaranteeBeginDate\": \"2025-11-25\",\n" +
                    "            \"sum\": 34900.0000,\n" +
                    "            \"sumRest\": 34900.0000,\n" +
                    "            \"currency\": \"RUR\",\n" +
                    "            \"inn\": \"7839095581\",\n" +
                    "            \"status\": \"Действует ЭБГ\",\n" +
                    "            \"additionalStatus\": \"Open\",\n" +
                    "            \"fz\": \"44-Ф \\\"О гос. закупках\\\" \",\n" +
                    "            \"reserveCategoryCbName\": \"II\",\n" +
                    "            \"reserveRateCb\": 2.0,\n" +
                    "            \"portfolioName\": \"Портфель Гарантий МБ и СРКБ БОО до 10 млн рублей\",\n" +
                    "            \"beneficiaryId\": 143856572,\n" +
                    "            \"beneficiaryInn\": \"4712017259\",\n" +
                    "            \"beneficiaryOgrn\": \"1024701646243\",\n" +
                    "            \"beneficiaryKpp\": \"471201001\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dealId\": 266001442,\n" +
                    "            \"dealStateId\": 266001443,\n" +
                    "            \"dealType\": \"Гарантия\",\n" +
                    "            \"dealTypeCode\": \"DealType_Guarantee\",\n" +
                    "            \"dealKind\": \"Электронная банковская гарантия - Исполнение без ФП\",\n" +
                    "            \"dealKindCode\": \"DealKind_GuaranteeEBG_EBGExecution_NoFP\",\n" +
                    "            \"fullName\": \"ООО \\\"ЭВОТРЕЙД\\\"\",\n" +
                    "            \"clientId\": 63275892,\n" +
                    "            \"clientPin\": \"UAU2IU\",\n" +
                    "            \"dealDocNumber\": \"1EDQ1X\",\n" +
                    "            \"docDate\": \"2025-11-28\",\n" +
                    "            \"beginDate\": \"2025-12-01\",\n" +
                    "            \"endDate\": \"2027-04-30\",\n" +
                    "            \"guaranteeBeginDate\": \"2025-12-01\",\n" +
                    "            \"sum\": 22055.6000,\n" +
                    "            \"sumRest\": 22055.6000,\n" +
                    "            \"currency\": \"RUR\",\n" +
                    "            \"inn\": \"7839095581\",\n" +
                    "            \"status\": \"Действует ЭБГ\",\n" +
                    "            \"additionalStatus\": \"Open\",\n" +
                    "            \"fz\": \"44-Ф \\\"О гос. закупках\\\" \",\n" +
                    "            \"reserveCategoryCbName\": \"II\",\n" +
                    "            \"reserveRateCb\": 2.0,\n" +
                    "            \"portfolioName\": \"Портфель Гарантий МБ и СРКБ БОО до 10 млн рублей\",\n" +
                    "            \"beneficiaryId\": 59352376,\n" +
                    "            \"beneficiaryInn\": \"2901009355\",\n" +
                    "            \"beneficiaryOgrn\": \"1022900551024\",\n" +
                    "            \"beneficiaryKpp\": \"290101001\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dealId\": 260453110,\n" +
                    "            \"dealStateId\": 260453111,\n" +
                    "            \"dealType\": \"Гарантия\",\n" +
                    "            \"dealTypeCode\": \"DealType_Guarantee\",\n" +
                    "            \"dealKind\": \"Электронная банковская гарантия - Исполнение без ФП\",\n" +
                    "            \"dealKindCode\": \"DealKind_GuaranteeEBG_EBGExecution_NoFP\",\n" +
                    "            \"fullName\": \"ООО \\\"ЭВОТРЕЙД\\\"\",\n" +
                    "            \"clientId\": 63275892,\n" +
                    "            \"clientPin\": \"UAU2IU\",\n" +
                    "            \"dealDocNumber\": \"19IZ1X\",\n" +
                    "            \"docDate\": \"2025-09-09\",\n" +
                    "            \"beginDate\": \"2025-09-09\",\n" +
                    "            \"endDate\": \"2026-01-31\",\n" +
                    "            \"guaranteeBeginDate\": \"2025-09-09\",\n" +
                    "            \"sum\": 34200.0000,\n" +
                    "            \"sumRest\": 34200.0000,\n" +
                    "            \"currency\": \"RUR\",\n" +
                    "            \"inn\": \"7839095581\",\n" +
                    "            \"status\": \"Действует ЭБГ\",\n" +
                    "            \"additionalStatus\": \"Open\",\n" +
                    "            \"fz\": \"44-Ф \\\"О гос. закупках\\\" \",\n" +
                    "            \"reserveCategoryCbName\": \"II\",\n" +
                    "            \"reserveRateCb\": 2.0,\n" +
                    "            \"portfolioName\": \"Портфель Гарантий МБ и СРКБ БОО до 10 млн рублей\",\n" +
                    "            \"beneficiaryId\": 125078830,\n" +
                    "            \"beneficiaryInn\": \"4101039153\",\n" +
                    "            \"beneficiaryOgrn\": \"1024101035199\",\n" +
                    "            \"beneficiaryKpp\": \"410101001\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dealId\": 261342929,\n" +
                    "            \"dealStateId\": 261342930,\n" +
                    "            \"dealType\": \"Гарантия\",\n" +
                    "            \"dealTypeCode\": \"DealType_Guarantee\",\n" +
                    "            \"dealKind\": \"Электронная банковская гарантия - Исполнение без ФП\",\n" +
                    "            \"dealKindCode\": \"DealKind_GuaranteeEBG_EBGExecution_NoFP\",\n" +
                    "            \"fullName\": \"ООО \\\"ЭВОТРЕЙД\\\"\",\n" +
                    "            \"clientId\": 63275892,\n" +
                    "            \"clientPin\": \"UAU2IU\",\n" +
                    "            \"dealDocNumber\": \"1A311X\",\n" +
                    "            \"docDate\": \"2025-09-19\",\n" +
                    "            \"beginDate\": \"2025-09-19\",\n" +
                    "            \"endDate\": \"2026-02-01\",\n" +
                    "            \"guaranteeBeginDate\": \"2025-09-19\",\n" +
                    "            \"sum\": 174933.3300,\n" +
                    "            \"sumRest\": 174933.3300,\n" +
                    "            \"currency\": \"RUR\",\n" +
                    "            \"inn\": \"7839095581\",\n" +
                    "            \"status\": \"Действует ЭБГ\",\n" +
                    "            \"additionalStatus\": \"Open\",\n" +
                    "            \"fz\": \"44-Ф \\\"О гос. закупках\\\" \",\n" +
                    "            \"reserveCategoryCbName\": \"II\",\n" +
                    "            \"reserveRateCb\": 2.0,\n" +
                    "            \"portfolioName\": \"Портфель Гарантий МБ и СРКБ БОО до 10 млн рублей\",\n" +
                    "            \"beneficiaryId\": 146116378,\n" +
                    "            \"beneficiaryInn\": \"2504001670\",\n" +
                    "            \"beneficiaryOgrn\": \"1022502284892\",\n" +
                    "            \"beneficiaryKpp\": \"254001001\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dealId\": 262542920,\n" +
                    "            \"dealStateId\": 262542921,\n" +
                    "            \"dealType\": \"Гарантия\",\n" +
                    "            \"dealTypeCode\": \"DealType_Guarantee\",\n" +
                    "            \"dealKind\": \"Электронная банковская гарантия - Гарантийный период без ФП\",\n" +
                    "            \"dealKindCode\": \"DealKind_GuaranteeEBG_EBGGuaranteePeriod_NoFP\",\n" +
                    "            \"fullName\": \"ООО \\\"ЭВОТРЕЙД\\\"\",\n" +
                    "            \"clientId\": 63275892,\n" +
                    "            \"clientPin\": \"UAU2IU\",\n" +
                    "            \"dealDocNumber\": \"1B321X\",\n" +
                    "            \"docDate\": \"2025-10-09\",\n" +
                    "            \"beginDate\": \"2025-10-09\",\n" +
                    "            \"endDate\": \"2026-12-31\",\n" +
                    "            \"guaranteeBeginDate\": \"2025-10-09\",\n" +
                    "            \"sum\": 87466.6700,\n" +
                    "            \"sumRest\": 87466.6700,\n" +
                    "            \"currency\": \"RUR\",\n" +
                    "            \"inn\": \"7839095581\",\n" +
                    "            \"status\": \"Действует ЭБГ\",\n" +
                    "            \"additionalStatus\": \"Open\",\n" +
                    "            \"fz\": \"44-Ф \\\"О гос. закупках\\\" \",\n" +
                    "            \"reserveCategoryCbName\": \"II\",\n" +
                    "            \"reserveRateCb\": 2.0,\n" +
                    "            \"portfolioName\": \"Портфель Гарантий МБ и СРКБ БОО до 10 млн рублей\",\n" +
                    "            \"beneficiaryId\": 146116378,\n" +
                    "            \"beneficiaryInn\": \"2504001670\",\n" +
                    "            \"beneficiaryOgrn\": \"1022502284892\",\n" +
                    "            \"beneficiaryKpp\": \"254001001\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dealId\": 262720939,\n" +
                    "            \"dealStateId\": 262720940,\n" +
                    "            \"dealType\": \"Гарантия\",\n" +
                    "            \"dealTypeCode\": \"DealType_Guarantee\",\n" +
                    "            \"dealKind\": \"Электронная банковская гарантия - Исполнение без ФП\",\n" +
                    "            \"dealKindCode\": \"DealKind_GuaranteeEBG_EBGExecution_NoFP\",\n" +
                    "            \"fullName\": \"ООО \\\"ЭВОТРЕЙД\\\"\",\n" +
                    "            \"clientId\": 63275892,\n" +
                    "            \"clientPin\": \"UAU2IU\",\n" +
                    "            \"dealDocNumber\": \"1B8N6X\",\n" +
                    "            \"docDate\": \"2025-10-13\",\n" +
                    "            \"beginDate\": \"2025-10-14\",\n" +
                    "            \"endDate\": \"2026-03-31\",\n" +
                    "            \"guaranteeBeginDate\": \"2025-10-14\",\n" +
                    "            \"sum\": 82300.0000,\n" +
                    "            \"sumRest\": 82300.0000,\n" +
                    "            \"currency\": \"RUR\",\n" +
                    "            \"inn\": \"7839095581\",\n" +
                    "            \"status\": \"Действует ЭБГ\",\n" +
                    "            \"additionalStatus\": \"Open\",\n" +
                    "            \"fz\": \"44-Ф \\\"О гос. закупках\\\" \",\n" +
                    "            \"reserveCategoryCbName\": \"II\",\n" +
                    "            \"reserveRateCb\": 2.0,\n" +
                    "            \"portfolioName\": \"Портфель Гарантий МБ и СРКБ БОО до 10 млн рублей\",\n" +
                    "            \"beneficiaryId\": 125078830,\n" +
                    "            \"beneficiaryInn\": \"4101039153\",\n" +
                    "            \"beneficiaryOgrn\": \"1024101035199\",\n" +
                    "            \"beneficiaryKpp\": \"410101001\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dealId\": 262738695,\n" +
                    "            \"dealStateId\": 262738697,\n" +
                    "            \"dealType\": \"Гарантия\",\n" +
                    "            \"dealTypeCode\": \"DealType_Guarantee\",\n" +
                    "            \"dealKind\": \"Электронная банковская гарантия - Исполнение без ФП\",\n" +
                    "            \"dealKindCode\": \"DealKind_GuaranteeEBG_EBGExecution_NoFP\",\n" +
                    "            \"fullName\": \"ООО \\\"ЭВОТРЕЙД\\\"\",\n" +
                    "            \"clientId\": 63275892,\n" +
                    "            \"clientPin\": \"UAU2IU\",\n" +
                    "            \"dealDocNumber\": \"1B9J1X\",\n" +
                    "            \"docDate\": \"2025-10-13\",\n" +
                    "            \"beginDate\": \"2025-10-14\",\n" +
                    "            \"endDate\": \"2026-01-31\",\n" +
                    "            \"guaranteeBeginDate\": \"2025-10-14\",\n" +
                    "            \"sum\": 21700.0000,\n" +
                    "            \"sumRest\": 21700.0000,\n" +
                    "            \"currency\": \"RUR\",\n" +
                    "            \"inn\": \"7839095581\",\n" +
                    "            \"status\": \"Действует ЭБГ\",\n" +
                    "            \"additionalStatus\": \"Open\",\n" +
                    "            \"fz\": \"44-Ф \\\"О гос. закупках\\\" \",\n" +
                    "            \"reserveCategoryCbName\": \"II\",\n" +
                    "            \"reserveRateCb\": 2.0,\n" +
                    "            \"portfolioName\": \"Портфель Гарантий МБ и СРКБ БОО до 10 млн рублей\",\n" +
                    "            \"beneficiaryId\": 93556282,\n" +
                    "            \"beneficiaryInn\": \"4027022873\",\n" +
                    "            \"beneficiaryOgrn\": \"1024001194580\",\n" +
                    "            \"beneficiaryKpp\": \"402701001\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dealId\": 262738699,\n" +
                    "            \"dealStateId\": 262738700,\n" +
                    "            \"dealType\": \"Гарантия\",\n" +
                    "            \"dealTypeCode\": \"DealType_Guarantee\",\n" +
                    "            \"dealKind\": \"Электронная банковская гарантия - Исполнение без ФП\",\n" +
                    "            \"dealKindCode\": \"DealKind_GuaranteeEBG_EBGExecution_NoFP\",\n" +
                    "            \"fullName\": \"ООО \\\"ЭВОТРЕЙД\\\"\",\n" +
                    "            \"clientId\": 63275892,\n" +
                    "            \"clientPin\": \"UAU2IU\",\n" +
                    "            \"dealDocNumber\": \"1B9J2X\",\n" +
                    "            \"docDate\": \"2025-10-13\",\n" +
                    "            \"beginDate\": \"2025-10-14\",\n" +
                    "            \"endDate\": \"2026-01-31\",\n" +
                    "            \"guaranteeBeginDate\": \"2025-10-14\",\n" +
                    "            \"sum\": 45080.0000,\n" +
                    "            \"sumRest\": 45080.0000,\n" +
                    "            \"currency\": \"RUR\",\n" +
                    "            \"inn\": \"7839095581\",\n" +
                    "            \"status\": \"Действует ЭБГ\",\n" +
                    "            \"additionalStatus\": \"Open\",\n" +
                    "            \"fz\": \"44-Ф \\\"О гос. закупках\\\" \",\n" +
                    "            \"reserveCategoryCbName\": \"II\",\n" +
                    "            \"reserveRateCb\": 2.0,\n" +
                    "            \"portfolioName\": \"Портфель Гарантий МБ и СРКБ БОО до 10 млн рублей\",\n" +
                    "            \"beneficiaryId\": 93556282,\n" +
                    "            \"beneficiaryInn\": \"4027022873\",\n" +
                    "            \"beneficiaryOgrn\": \"1024001194580\",\n" +
                    "            \"beneficiaryKpp\": \"402701001\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dealId\": 262738804,\n" +
                    "            \"dealStateId\": 262738805,\n" +
                    "            \"dealType\": \"Гарантия\",\n" +
                    "            \"dealTypeCode\": \"DealType_Guarantee\",\n" +
                    "            \"dealKind\": \"Электронная банковская гарантия - Исполнение без ФП\",\n" +
                    "            \"dealKindCode\": \"DealKind_GuaranteeEBG_EBGExecution_NoFP\",\n" +
                    "            \"fullName\": \"ООО \\\"ЭВОТРЕЙД\\\"\",\n" +
                    "            \"clientId\": 63275892,\n" +
                    "            \"clientPin\": \"UAU2IU\",\n" +
                    "            \"dealDocNumber\": \"1B9J6X\",\n" +
                    "            \"docDate\": \"2025-10-13\",\n" +
                    "            \"beginDate\": \"2025-10-14\",\n" +
                    "            \"endDate\": \"2026-01-31\",\n" +
                    "            \"guaranteeBeginDate\": \"2025-10-14\",\n" +
                    "            \"sum\": 44050.0000,\n" +
                    "            \"sumRest\": 44050.0000,\n" +
                    "            \"currency\": \"RUR\",\n" +
                    "            \"inn\": \"7839095581\",\n" +
                    "            \"status\": \"Действует ЭБГ\",\n" +
                    "            \"additionalStatus\": \"Open\",\n" +
                    "            \"fz\": \"44-Ф \\\"О гос. закупках\\\" \",\n" +
                    "            \"reserveCategoryCbName\": \"II\",\n" +
                    "            \"reserveRateCb\": 2.0,\n" +
                    "            \"portfolioName\": \"Портфель Гарантий МБ и СРКБ БОО до 10 млн рублей\",\n" +
                    "            \"beneficiaryId\": 172773084,\n" +
                    "            \"beneficiaryInn\": \"6439024400\",\n" +
                    "            \"beneficiaryOgrn\": \"1026401404270\",\n" +
                    "            \"beneficiaryKpp\": \"643901001\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dealId\": 262742500,\n" +
                    "            \"dealStateId\": 262742501,\n" +
                    "            \"dealType\": \"Гарантия\",\n" +
                    "            \"dealTypeCode\": \"DealType_Guarantee\",\n" +
                    "            \"dealKind\": \"Электронная банковская гарантия - Исполнение без ФП\",\n" +
                    "            \"dealKindCode\": \"DealKind_GuaranteeEBG_EBGExecution_NoFP\",\n" +
                    "            \"fullName\": \"ООО \\\"ЭВОТРЕЙД\\\"\",\n" +
                    "            \"clientId\": 63275892,\n" +
                    "            \"clientPin\": \"UAU2IU\",\n" +
                    "            \"dealDocNumber\": \"1B9R0X\",\n" +
                    "            \"docDate\": \"2025-10-13\",\n" +
                    "            \"beginDate\": \"2025-10-14\",\n" +
                    "            \"endDate\": \"2026-01-31\",\n" +
                    "            \"guaranteeBeginDate\": \"2025-10-14\",\n" +
                    "            \"sum\": 75662.8500,\n" +
                    "            \"sumRest\": 75662.8500,\n" +
                    "            \"currency\": \"RUR\",\n" +
                    "            \"inn\": \"7839095581\",\n" +
                    "            \"status\": \"Действует ЭБГ\",\n" +
                    "            \"additionalStatus\": \"Open\",\n" +
                    "            \"fz\": \"223-ФЗ «О закупках товаров, работ, услуг отдельными видами юридических лиц» \",\n" +
                    "            \"reserveCategoryCbName\": \"II\",\n" +
                    "            \"reserveRateCb\": 2.0,\n" +
                    "            \"portfolioName\": \"Портфель Гарантий МБ и СРКБ БОО до 10 млн рублей\",\n" +
                    "            \"beneficiaryId\": 144240073,\n" +
                    "            \"beneficiaryInn\": \"6454102117\",\n" +
                    "            \"beneficiaryOgrn\": \"1106454004172\",\n" +
                    "            \"beneficiaryKpp\": \"645401001\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dealId\": 263419059,\n" +
                    "            \"dealStateId\": 263419060,\n" +
                    "            \"dealType\": \"Гарантия\",\n" +
                    "            \"dealTypeCode\": \"DealType_Guarantee\",\n" +
                    "            \"dealKind\": \"Электронная банковская гарантия - Исполнение без ФП\",\n" +
                    "            \"dealKindCode\": \"DealKind_GuaranteeEBG_EBGExecution_NoFP\",\n" +
                    "            \"fullName\": \"ООО \\\"ЭВОТРЕЙД\\\"\",\n" +
                    "            \"clientId\": 63275892,\n" +
                    "            \"clientPin\": \"UAU2IU\",\n" +
                    "            \"dealDocNumber\": \"1BXZ4X\",\n" +
                    "            \"docDate\": \"2025-10-24\",\n" +
                    "            \"beginDate\": \"2025-10-24\",\n" +
                    "            \"endDate\": \"2027-03-31\",\n" +
                    "            \"guaranteeBeginDate\": \"2025-10-24\",\n" +
                    "            \"sum\": 80000.0000,\n" +
                    "            \"sumRest\": 80000.0000,\n" +
                    "            \"currency\": \"RUR\",\n" +
                    "            \"inn\": \"7839095581\",\n" +
                    "            \"status\": \"Действует ЭБГ\",\n" +
                    "            \"additionalStatus\": \"Open\",\n" +
                    "            \"fz\": \"44-Ф \\\"О гос. закупках\\\" \",\n" +
                    "            \"reserveCategoryCbName\": \"II\",\n" +
                    "            \"reserveRateCb\": 2.0,\n" +
                    "            \"portfolioName\": \"Портфель Гарантий МБ и СРКБ БОО до 10 млн рублей\",\n" +
                    "            \"beneficiaryId\": 98140288,\n" +
                    "            \"beneficiaryInn\": \"6902010174\",\n" +
                    "            \"beneficiaryOgrn\": \"1036900016537\",\n" +
                    "            \"beneficiaryKpp\": \"695201001\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dealId\": 259309927,\n" +
                    "            \"dealStateId\": 259309928,\n" +
                    "            \"dealType\": \"Гарантия\",\n" +
                    "            \"dealTypeCode\": \"DealType_Guarantee\",\n" +
                    "            \"dealKind\": \"Электронная банковская гарантия - Исполнение без ФП\",\n" +
                    "            \"dealKindCode\": \"DealKind_GuaranteeEBG_EBGExecution_NoFP\",\n" +
                    "            \"fullName\": \"ООО \\\"ЭВОТРЕЙД\\\"\",\n" +
                    "            \"clientId\": 63275892,\n" +
                    "            \"clientPin\": \"UAU2IU\",\n" +
                    "            \"dealDocNumber\": \"18M28X\",\n" +
                    "            \"docDate\": \"2025-08-21\",\n" +
                    "            \"beginDate\": \"2025-08-26\",\n" +
                    "            \"endDate\": \"2026-04-06\",\n" +
                    "            \"guaranteeBeginDate\": \"2025-08-26\",\n" +
                    "            \"sum\": 45631.1500,\n" +
                    "            \"sumRest\": 45631.1500,\n" +
                    "            \"currency\": \"RUR\",\n" +
                    "            \"inn\": \"7839095581\",\n" +
                    "            \"status\": \"Действует ЭБГ\",\n" +
                    "            \"additionalStatus\": \"Open\",\n" +
                    "            \"fz\": \"223-ФЗ «О закупках товаров, работ, услуг отдельными видами юридических лиц» \",\n" +
                    "            \"reserveCategoryCbName\": \"II\",\n" +
                    "            \"reserveRateCb\": 2.0,\n" +
                    "            \"portfolioName\": \"Портфель Гарантий МБ и СРКБ БОО до 10 млн рублей\",\n" +
                    "            \"beneficiaryId\": 12808773,\n" +
                    "            \"beneficiaryInn\": \"2536014538\",\n" +
                    "            \"beneficiaryOgrn\": \"1022501297785\",\n" +
                    "            \"beneficiaryKpp\": \"254001001\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dealId\": 259769300,\n" +
                    "            \"dealStateId\": 259769301,\n" +
                    "            \"dealType\": \"Гарантия\",\n" +
                    "            \"dealTypeCode\": \"DealType_Guarantee\",\n" +
                    "            \"dealKind\": \"Электронная банковская гарантия - Исполнение без ФП\",\n" +
                    "            \"dealKindCode\": \"DealKind_GuaranteeEBG_EBGExecution_NoFP\",\n" +
                    "            \"fullName\": \"ООО \\\"ЭВОТРЕЙД\\\"\",\n" +
                    "            \"clientId\": 63275892,\n" +
                    "            \"clientPin\": \"UAU2IU\",\n" +
                    "            \"dealDocNumber\": \"18YJ8X\",\n" +
                    "            \"docDate\": \"2025-08-28\",\n" +
                    "            \"beginDate\": \"2025-08-29\",\n" +
                    "            \"endDate\": \"2026-01-31\",\n" +
                    "            \"guaranteeBeginDate\": \"2025-08-29\",\n" +
                    "            \"sum\": 47000.0000,\n" +
                    "            \"sumRest\": 47000.0000,\n" +
                    "            \"currency\": \"RUR\",\n" +
                    "            \"inn\": \"7839095581\",\n" +
                    "            \"status\": \"Действует ЭБГ\",\n" +
                    "            \"additionalStatus\": \"Open\",\n" +
                    "            \"fz\": \"44-Ф \\\"О гос. закупках\\\" \",\n" +
                    "            \"reserveCategoryCbName\": \"II\",\n" +
                    "            \"reserveRateCb\": 2.0,\n" +
                    "            \"portfolioName\": \"Портфель Гарантий МБ и СРКБ БОО до 10 млн рублей\",\n" +
                    "            \"beneficiaryId\": 172221813,\n" +
                    "            \"beneficiaryInn\": \"7819000831\",\n" +
                    "            \"beneficiaryOgrn\": \"1027808916926\",\n" +
                    "            \"beneficiaryKpp\": \"781901001\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dealId\": 247576015,\n" +
                    "            \"dealStateId\": 247576016,\n" +
                    "            \"dealType\": \"Гарантия\",\n" +
                    "            \"dealTypeCode\": \"DealType_Guarantee\",\n" +
                    "            \"dealKind\": \"Электронная банковская гарантия - Гарантийный период без ФП\",\n" +
                    "            \"dealKindCode\": \"DealKind_GuaranteeEBG_EBGGuaranteePeriod_NoFP\",\n" +
                    "            \"fullName\": \"ООО \\\"ЭВОТРЕЙД\\\"\",\n" +
                    "            \"clientId\": 63275892,\n" +
                    "            \"clientPin\": \"UAU2IU\",\n" +
                    "            \"dealDocNumber\": \"105H6X\",\n" +
                    "            \"docDate\": \"2025-03-17\",\n" +
                    "            \"beginDate\": \"2025-03-18\",\n" +
                    "            \"endDate\": \"2026-01-31\",\n" +
                    "            \"guaranteeBeginDate\": \"2025-03-18\",\n" +
                    "            \"sum\": 85708.3300,\n" +
                    "            \"sumRest\": 85708.3300,\n" +
                    "            \"currency\": \"RUR\",\n" +
                    "            \"inn\": \"7839095581\",\n" +
                    "            \"status\": \"Действует ЭБГ\",\n" +
                    "            \"additionalStatus\": \"Open\",\n" +
                    "            \"fz\": \"44-Ф \\\"О гос. закупках\\\" \",\n" +
                    "            \"reserveCategoryCbName\": \"II\",\n" +
                    "            \"reserveRateCb\": 2.0,\n" +
                    "            \"portfolioName\": \"Портфель Гарантий МБ и СРКБ БОО до 10 млн рублей\",\n" +
                    "            \"beneficiaryId\": 161505661,\n" +
                    "            \"beneficiaryInn\": \"1435026510\",\n" +
                    "            \"beneficiaryOgrn\": \"1021401068897\",\n" +
                    "            \"beneficiaryKpp\": \"143501001\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dealId\": 249247702,\n" +
                    "            \"dealStateId\": 249247703,\n" +
                    "            \"dealType\": \"Гарантия\",\n" +
                    "            \"dealTypeCode\": \"DealType_Guarantee\",\n" +
                    "            \"dealKind\": \"Электронная банковская гарантия - Исполнение без ФП\",\n" +
                    "            \"dealKindCode\": \"DealKind_GuaranteeEBG_EBGExecution_NoFP\",\n" +
                    "            \"fullName\": \"ООО \\\"ЭВОТРЕЙД\\\"\",\n" +
                    "            \"clientId\": 63275892,\n" +
                    "            \"clientPin\": \"UAU2IU\",\n" +
                    "            \"dealDocNumber\": \"11CI3X\",\n" +
                    "            \"docDate\": \"2025-04-04\",\n" +
                    "            \"beginDate\": \"2025-04-15\",\n" +
                    "            \"endDate\": \"2026-02-09\",\n" +
                    "            \"guaranteeBeginDate\": \"2025-04-15\",\n" +
                    "            \"sum\": 121305.4300,\n" +
                    "            \"sumRest\": 121305.4300,\n" +
                    "            \"currency\": \"RUR\",\n" +
                    "            \"inn\": \"7839095581\",\n" +
                    "            \"status\": \"Действует ЭБГ\",\n" +
                    "            \"additionalStatus\": \"Open\",\n" +
                    "            \"fz\": \"223-ФЗ «О закупках товаров, работ, услуг отдельными видами юридических лиц» \",\n" +
                    "            \"reserveCategoryCbName\": \"II\",\n" +
                    "            \"reserveRateCb\": 2.0,\n" +
                    "            \"portfolioName\": \"Портфель Гарантий МБ и СРКБ БОО до 10 млн рублей\",\n" +
                    "            \"beneficiaryId\": 12808773,\n" +
                    "            \"beneficiaryInn\": \"2536014538\",\n" +
                    "            \"beneficiaryOgrn\": \"1022501297785\",\n" +
                    "            \"beneficiaryKpp\": \"254001001\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dealId\": 249639532,\n" +
                    "            \"dealStateId\": 249639533,\n" +
                    "            \"dealType\": \"Гарантия\",\n" +
                    "            \"dealTypeCode\": \"DealType_Guarantee\",\n" +
                    "            \"dealKind\": \"Электронная банковская гарантия - Исполнение без ФП\",\n" +
                    "            \"dealKindCode\": \"DealKind_GuaranteeEBG_EBGExecution_NoFP\",\n" +
                    "            \"fullName\": \"ООО \\\"ЭВОТРЕЙД\\\"\",\n" +
                    "            \"clientId\": 63275892,\n" +
                    "            \"clientPin\": \"UAU2IU\",\n" +
                    "            \"dealDocNumber\": \"11NM0X\",\n" +
                    "            \"docDate\": \"2025-04-10\",\n" +
                    "            \"beginDate\": \"2025-04-14\",\n" +
                    "            \"endDate\": \"2026-01-31\",\n" +
                    "            \"guaranteeBeginDate\": \"2025-04-14\",\n" +
                    "            \"sum\": 30691.6700,\n" +
                    "            \"sumRest\": 30691.6700,\n" +
                    "            \"currency\": \"RUR\",\n" +
                    "            \"inn\": \"7839095581\",\n" +
                    "            \"status\": \"Действует ЭБГ\",\n" +
                    "            \"additionalStatus\": \"Open\",\n" +
                    "            \"fz\": \"44-Ф \\\"О гос. закупках\\\" \",\n" +
                    "            \"reserveCategoryCbName\": \"II\",\n" +
                    "            \"reserveRateCb\": 2.0,\n" +
                    "            \"portfolioName\": \"Портфель Гарантий МБ и СРКБ БОО до 10 млн рублей\",\n" +
                    "            \"beneficiaryId\": 162351641,\n" +
                    "            \"beneficiaryInn\": \"1434016164\",\n" +
                    "            \"beneficiaryOgrn\": \"1021401005933\",\n" +
                    "            \"beneficiaryKpp\": \"143401001\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dealId\": 249639707,\n" +
                    "            \"dealStateId\": 249639708,\n" +
                    "            \"dealType\": \"Гарантия\",\n" +
                    "            \"dealTypeCode\": \"DealType_Guarantee\",\n" +
                    "            \"dealKind\": \"Электронная банковская гарантия - Исполнение без ФП\",\n" +
                    "            \"dealKindCode\": \"DealKind_GuaranteeEBG_EBGExecution_NoFP\",\n" +
                    "            \"fullName\": \"ООО \\\"ЭВОТРЕЙД\\\"\",\n" +
                    "            \"clientId\": 63275892,\n" +
                    "            \"clientPin\": \"UAU2IU\",\n" +
                    "            \"dealDocNumber\": \"11NM1X\",\n" +
                    "            \"docDate\": \"2025-04-10\",\n" +
                    "            \"beginDate\": \"2025-04-14\",\n" +
                    "            \"endDate\": \"2026-03-03\",\n" +
                    "            \"guaranteeBeginDate\": \"2025-04-14\",\n" +
                    "            \"sum\": 150000.0000,\n" +
                    "            \"sumRest\": 150000.0000,\n" +
                    "            \"currency\": \"RUR\",\n" +
                    "            \"inn\": \"7839095581\",\n" +
                    "            \"status\": \"Действует ЭБГ\",\n" +
                    "            \"additionalStatus\": \"Open\",\n" +
                    "            \"fz\": \"44-Ф \\\"О гос. закупках\\\" \",\n" +
                    "            \"reserveCategoryCbName\": \"II\",\n" +
                    "            \"reserveRateCb\": 2.0,\n" +
                    "            \"portfolioName\": \"Портфель Гарантий МБ и СРКБ БОО до 10 млн рублей\",\n" +
                    "            \"beneficiaryId\": 59353102,\n" +
                    "            \"beneficiaryInn\": \"1435111251\",\n" +
                    "            \"beneficiaryOgrn\": \"1021401053057\",\n" +
                    "            \"beneficiaryKpp\": \"143501001\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dealId\": 253246556,\n" +
                    "            \"dealStateId\": 253246557,\n" +
                    "            \"dealType\": \"Гарантия\",\n" +
                    "            \"dealTypeCode\": \"DealType_Guarantee\",\n" +
                    "            \"dealKind\": \"Электронная банковская гарантия - Исполнение без ФП\",\n" +
                    "            \"dealKindCode\": \"DealKind_GuaranteeEBG_EBGExecution_NoFP\",\n" +
                    "            \"fullName\": \"ООО \\\"ЭВОТРЕЙД\\\"\",\n" +
                    "            \"clientId\": 63275892,\n" +
                    "            \"clientPin\": \"UAU2IU\",\n" +
                    "            \"dealDocNumber\": \"148Y9X\",\n" +
                    "            \"docDate\": \"2025-05-29\",\n" +
                    "            \"beginDate\": \"2025-05-30\",\n" +
                    "            \"endDate\": \"2026-01-31\",\n" +
                    "            \"guaranteeBeginDate\": \"2025-05-30\",\n" +
                    "            \"sum\": 107000.0000,\n" +
                    "            \"sumRest\": 107000.0000,\n" +
                    "            \"currency\": \"RUR\",\n" +
                    "            \"inn\": \"7839095581\",\n" +
                    "            \"status\": \"Действует ЭБГ\",\n" +
                    "            \"additionalStatus\": \"Open\",\n" +
                    "            \"fz\": \"44-Ф \\\"О гос. закупках\\\" \",\n" +
                    "            \"reserveCategoryCbName\": \"II\",\n" +
                    "            \"reserveRateCb\": 2.0,\n" +
                    "            \"portfolioName\": \"Портфель Гарантий МБ и СРКБ БОО до 10 млн рублей\",\n" +
                    "            \"beneficiaryId\": 210718203,\n" +
                    "            \"beneficiaryInn\": \"6150022117\",\n" +
                    "            \"beneficiaryOgrn\": \"1026102229372\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dealId\": 253808247,\n" +
                    "            \"dealStateId\": 253808248,\n" +
                    "            \"dealType\": \"Гарантия\",\n" +
                    "            \"dealTypeCode\": \"DealType_Guarantee\",\n" +
                    "            \"dealKind\": \"Электронная банковская гарантия - Исполнение без ФП\",\n" +
                    "            \"dealKindCode\": \"DealKind_GuaranteeEBG_EBGExecution_NoFP\",\n" +
                    "            \"fullName\": \"ООО \\\"ЭВОТРЕЙД\\\"\",\n" +
                    "            \"clientId\": 63275892,\n" +
                    "            \"clientPin\": \"UAU2IU\",\n" +
                    "            \"dealDocNumber\": \"14S66X\",\n" +
                    "            \"docDate\": \"2025-06-06\",\n" +
                    "            \"beginDate\": \"2025-06-09\",\n" +
                    "            \"endDate\": \"2026-01-31\",\n" +
                    "            \"guaranteeBeginDate\": \"2025-06-09\",\n" +
                    "            \"sum\": 40000.0000,\n" +
                    "            \"sumRest\": 40000.0000,\n" +
                    "            \"currency\": \"RUR\",\n" +
                    "            \"inn\": \"7839095581\",\n" +
                    "            \"status\": \"Действует ЭБГ\",\n" +
                    "            \"additionalStatus\": \"Open\",\n" +
                    "            \"fz\": \"44-Ф \\\"О гос. закупках\\\" \",\n" +
                    "            \"reserveCategoryCbName\": \"II\",\n" +
                    "            \"reserveRateCb\": 2.0,\n" +
                    "            \"portfolioName\": \"Портфель Гарантий МБ и СРКБ БОО до 10 млн рублей\",\n" +
                    "            \"beneficiaryId\": 214454324,\n" +
                    "            \"beneficiaryInn\": \"6153007420\",\n" +
                    "            \"beneficiaryOgrn\": \"1026102514371\"\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"dealId\": 243517888,\n" +
                    "            \"dealStateId\": 243517889,\n" +
                    "            \"dealType\": \"Гарантия\",\n" +
                    "            \"dealTypeCode\": \"DealType_Guarantee\",\n" +
                    "            \"dealKind\": \"Электронная банковская гарантия - Исполнение без ФП\",\n" +
                    "            \"dealKindCode\": \"DealKind_GuaranteeEBG_EBGExecution_NoFP\",\n" +
                    "            \"fullName\": \"ООО \\\"ЭВОТРЕЙД\\\"\",\n" +
                    "            \"clientId\": 63275892,\n" +
                    "            \"clientPin\": \"UAU2IU\",\n" +
                    "            \"dealDocNumber\": \"0XN38X\",\n" +
                    "            \"docDate\": \"2025-01-24\",\n" +
                    "            \"beginDate\": \"2025-01-24\",\n" +
                    "            \"endDate\": \"2026-01-31\",\n" +
                    "            \"guaranteeBeginDate\": \"2025-01-24\",\n" +
                    "            \"sum\": 159200.0000,\n" +
                    "            \"sumRest\": 159200.0000,\n" +
                    "            \"currency\": \"RUR\",\n" +
                    "            \"inn\": \"7839095581\",\n" +
                    "            \"status\": \"Действует ЭБГ\",\n" +
                    "            \"additionalStatus\": \"Open\",\n" +
                    "            \"fz\": \"44-Ф \\\"О гос. закупках\\\" \",\n" +
                    "            \"reserveCategoryCbName\": \"II\",\n" +
                    "            \"reserveRateCb\": 2.0,\n" +
                    "            \"portfolioName\": \"Портфель Гарантий МБ и СРКБ БОО до 10 млн рублей\",\n" +
                    "            \"beneficiaryId\": 173839422,\n" +
                    "            \"beneficiaryInn\": \"4027001785\",\n" +
                    "            \"beneficiaryOgrn\": \"1024001192500\",\n" +
                    "            \"beneficiaryKpp\": \"402701001\"\n" +
                    "        }\n" +
                    "    ]\n" +
                    "}\n";


            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "\"Error processing request\"";
        }
    }
}
