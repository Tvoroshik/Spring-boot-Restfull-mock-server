package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetGuaranteeInformationController {

    private static final Logger logger = LoggerFactory.getLogger(GetGuaranteeInformationController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_GetGuaranteeInformation:0}")
    private long delay_GetGuaranteeInformation;

    @GetMapping("/GetGuaranteeInformation?dealStateId=0")
    public String GetGuaranteeInformation() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_GetGuaranteeInformation);

            String jsonResponse = "{\n" +
                    "    \"dealStateId\": 229873969,\n" +
                    "    \"dateEnd\": \"2025-12-29T00:00:00\",\n" +
                    "    \"dateOpen\": \"2025-08-19T00:00:00\",\n" +
                    "    \"dateClose\": \"2100-01-01T00:00:00\",\n" +
                    "    \"beneficiaryId\": 228355781,\n" +
                    "    \"guaranteeBeginDate\": \"2025-07-31T00:00:00\",\n" +
                    "    \"creditPurposeNote\": \"Коммерческий, Выполнение работ по устройству индивидуальных тепловых пунктов (в дальнейшем Работа) на Объекте и сдает результат Работ, а Застройщик принимает результат Работ и оплачивает его.\",\n" +
                    "    \"dateBegin\": \"2025-07-31T00:00:00\",\n" +
                    "    \"percentKindCode\": \"PercentKind_fixed\",\n" +
                    "    \"salesPointCode\": \"SalesPoint_MOS2\",\n" +
                    "    \"clientId\": 121593571,\n" +
                    "    \"dealDocDate\": \"2025-07-24T00:00:00\",\n" +
                    "    \"docDate\": \"2025-08-09T00:00:00\",\n" +
                    "    \"dealDocNumber\": \"0OXC0X\",\n" +
                    "    \"docNumber\": \"0OXC0X-1\",\n" +
                    "    \"sum\": 1239750,\n" +
                    "    \"currencyCode\": \"Currency_RUR\",\n" +
                    "    \"dealKindCode\": \"DealKind_GuaranteeEBG_GKRFPrepayment_NoFP\",\n" +
                    "    \"statusCode\": \"Status_ActiveEBG\",\n" +
                    "    \"dealBusinessBlockCode\": \"DealBusinessBlock_BlockMB\",\n" +
                    "    \"profitCode\": \"Profit_46W\",\n" +
                    "    \"objectAbsPin\": \"679176\",\n" +
                    "    \"dateOpenProperty\": \"2025-07-24T00:00:00\",\n" +
                    "    \"catalogFZCode\": \"CatalogFZ_GKRF\",\n" +
                    "    \"scheduleNote\": \"Единовременно, авансом\",\n" +
                    "    \"scheduleOperation\": [\n" +
                    "      {\n" +
                    "        \"date\": \"2025-08-19T00:00:00\",\n" +
                    "        \"dateDoc\": \"2025-03-29T00:00:00\",\n" +
                    "        \"sum\": 21059.25\n" +
                    "      }\n" +
                    "    ],\n" +
                    "    \"rates\": [\n" +
                    "      {\n" +
                    "        \"rate\": 5.4322,\n" +
                    "        \"rateStandard\": 0,\n" +
                    "        \"rateSpecial\": 5.4322,\n" +
                    "        \"baseDayTypeCode\": \"BaseDayType_dbday50\",\n" +
                    "        \"percentTypeCode\": \"PercentType_Bonus\",\n" +
                    "        \"percentKindCode\": \"PercentKind_fixed\",\n" +
                    "        \"rateSum\": 44573.74\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"rate\": 0.2,\n" +
                    "        \"rateSpecial\": 0.2,\n" +
                    "        \"baseDayTypeCode\": \"BaseDayType_dbday10\",\n" +
                    "        \"percentTypeCode\": \"PercentType_PenyBonus\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"rate\": 0.2,\n" +
                    "        \"rateSpecial\": 0.2,\n" +
                    "        \"baseDayTypeCode\": \"BaseDayType_dbday10\",\n" +
                    "        \"percentTypeCode\": \"PercentType_PenyCompens\"\n" +
                    "      }\n" +
                    "    ],\n" +
                    "    \"properties\": [\n" +
                    "      {\n" +
                    "        \"valueCode\": \"SalesChannel_Network\",\n" +
                    "        \"fieldTypeCode\": \"ProcParam_DealProp_SalesChannelCode\",\n" +
                    "        \"dateOpen\": \"2025-07-24T00:00:00\"\n" +
                    "      }\n" +
                    "    ],\n" +
                    "    \"relations\": [\n" +
                    "      {\n" +
                    "        \"dealId\": 227742602,\n" +
                    "        \"dealStateId\": 229874258,\n" +
                    "        \"typeCode\": \"DealType_Poruch\"\n" +
                    "      }\n" +
                    "    ]\n" +
                    "  }";

            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing health check request", e);
            Thread.currentThread().interrupt();
            return "Error processing request";
        }
    }
}
