package org.example.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

@RestController
public class PurchaseController {

    @Value("${app.delay.purchase:0}")
    private long purchase_delay;

    @GetMapping(
            value = "/purchases/purchase",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Map<String, Object>> getPurchaseInfo(
            @RequestParam String reportId,
            @RequestParam(required = false) String seldonId,
            @RequestParam String etpId
    ) {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(purchase_delay);

            Map<String, Object> response = new HashMap<>();

            // Статус операции
            Map<String, Object> status = new HashMap<>();
            status.put("code", 200);
            status.put("descr", "Операция успешна");

            // Основная информация
            Map<String, Object> result = new HashMap<>();

            // Список закупок
            List<Map<String, Object>> purchases = new ArrayList<>();

            // Основная закупка
            Map<String, Object> purchase = new HashMap<>();
            purchase.put("reportId", 2);
            purchase.put("filterId", null);
            purchase.put("filterName", null);
            purchase.put("notificationNumber", "0818500000825003888");

            // Тип контракта
            Map<String, Object> contractType = new HashMap<>();
            contractType.put("code", 3);
            contractType.put("name", "Электронный аукцион");
            purchase.put("contractType", contractType);

            purchase.put("sourceContractType", "Электронный аукцион");
            purchase.put("purchaseLink", "https://zakupki.gov.ru/epz/order/notice/ea20/view/common-info.html?regNumber=0818500000825003888");
            purchase.put("publishDate", "2025-05-28T17:42:50");
            purchase.put("subject", "Поставка продуктов питания (молоко, кефир, сметана)");
            purchase.put("purchasePrice", 3576717.06);

            // Валюта
            Map<String, Object> currency = new HashMap<>();
            currency.put("code", "RUB");
            currency.put("name", "РОССИЙСКИЙ РУБЛЬ");
            purchase.put("currency", currency);

            purchase.put("epName", "РТС-тендер");
            purchase.put("epLink", "http://www.rts-tender.ru");

            // Статус закупки
            Map<String, Object> statusPurchase = new HashMap<>();
            statusPurchase.put("codeStatusEIS", 9);
            statusPurchase.put("statusEIS", "Определение поставщика завершено");
            statusPurchase.put("codeStatusSeldon", 3);
            statusPurchase.put("statusSeldon", "Завершенная закупка");
            purchase.put("status", statusPurchase);

            purchase.put("startDate", "2025-05-28T17:42:50");
            purchase.put("endDate", "2025-06-05T08:00:00");
            purchase.put("changeDate", "2025-06-09T19:26:52");
            purchase.put("openCoversDate", null);
            purchase.put("reviewStartDate", null);
            purchase.put("reviewFinishDate", null);
            purchase.put("holdingDate", "2025-06-05T00:00:00");
            purchase.put("totalDate", "2025-06-09T00:00:00");
            purchase.put("requestPlace", null);
            purchase.put("requestOrder", null);
            purchase.put("purchaseTypeID", 4);

            // Организатор
            Map<String, Object> organizer = new HashMap<>();
            organizer.put("id", 43251938);
            organizer.put("idEIS", "08185000008");
            organizer.put("name", "ГОСУДАРСТВЕННОЕ КАЗЕННОЕ УЧРЕЖДЕНИЕ КРАСНОДАРСКОГО КРАЯ \"ДИРЕКЦИЯ ГОСУДАРСТВЕННЫХ ЗАКУПОК\"");
            organizer.put("inn", "2308265684");
            organizer.put("kpp", "230801001");
            organizer.put("ogrnSource", "1192375039119");
            organizer.put("ogrnSeldon", "1192375039119");
            organizer.put("regionCode", "23");
            organizer.put("region", "Краснодарский край");
            organizer.put("contactPerson", "МИХАИЛ БАШИРОВИЧ МЕЙСИГОВ");
            organizer.put("subOrdLevel", 2);
            organizer.put("urAddress", "350014, КРАСНОДАРСКИЙ КРАЙ, г.о. ГОРОД КРАСНОДАР, Г КРАСНОДАР, УЛ КРАСНАЯ, Д. 35");
            organizer.put("factAddress", "350014, КРАСНОДАРСКИЙ КРАЙ, г.о. ГОРОД КРАСНОДАР, Г КРАСНОДАР, УЛ КРАСНАЯ, Д. 35");
            organizer.put("phone", "7-861-2115401");
            organizer.put("email", "dgz@krasnodar.ru");
            purchase.put("organizer", organizer);

            // Лоты
            List<Map<String, Object>> lotsList = new ArrayList<>();

            Map<String, Object> lot = new HashMap<>();
            lot.put("id", 70208646);
            lot.put("lotNumber", 1);
            lot.put("subject", "Поставка продуктов питания (молоко, кефир, сметана)");
            lot.put("price", 3576717.06);

            // Валюта лота
            Map<String, Object> lotCurrency = new HashMap<>();
            lotCurrency.put("code", "RUB");
            lotCurrency.put("name", "РОССИЙСКИЙ РУБЛЬ");
            lot.put("currency", lotCurrency);

            lot.put("positionsPlanList", List.of("202503182000281001000875"));

            // Список продуктов
            List<Map<String, Object>> productsList = new ArrayList<>();

            // Молоко
            Map<String, Object> milk = new HashMap<>();
            milk.put("name", "Молоко питьевое");

            Map<String, Object> milkClassifier = new HashMap<>();
            milkClassifier.put("okdp", Map.of("code", null, "name", null));
            milkClassifier.put("okpd", Map.of("code", null, "name", null));
            milkClassifier.put("okpd2", Map.of("code", null, "name", null));
            milk.put("classifier", milkClassifier);

            Map<String, Object> milkUnit = new HashMap<>();
            milkUnit.put("code", "112");
            milkUnit.put("name", "Литр; кубический дециметр");
            milk.put("unit", milkUnit);

            milk.put("price", 94.67);
            milk.put("quantity", 15000.00);
            milk.put("value", 1420050.00);
            productsList.add(milk);

            // Кефир
            Map<String, Object> kefir = new HashMap<>();
            kefir.put("name", "Кефир");

            Map<String, Object> kefirClassifier = new HashMap<>();
            kefirClassifier.put("okdp", Map.of("code", null, "name", null));
            kefirClassifier.put("okpd", Map.of("code", null, "name", null));
            kefirClassifier.put("okpd2", Map.of("code", null, "name", null));
            kefir.put("classifier", kefirClassifier);

            Map<String, Object> kefirUnit = new HashMap<>();
            kefirUnit.put("code", "166");
            kefirUnit.put("name", "Килограмм");
            kefir.put("unit", kefirUnit);

            kefir.put("price", 96.33);
            kefir.put("quantity", 12682.00);
            kefir.put("value", 1221657.06);
            productsList.add(kefir);

            // Сметана
            Map<String, Object> sourCream = new HashMap<>();
            sourCream.put("name", "Сметана");

            Map<String, Object> sourCreamClassifier = new HashMap<>();
            sourCreamClassifier.put("okdp", Map.of("code", null, "name", null));
            sourCreamClassifier.put("okpd", Map.of("code", null, "name", null));
            sourCreamClassifier.put("okpd2", Map.of("code", null, "name", null));
            sourCream.put("classifier", sourCreamClassifier);

            Map<String, Object> sourCreamUnit = new HashMap<>();
            sourCreamUnit.put("code", "166");
            sourCreamUnit.put("name", "Килограмм");
            sourCream.put("unit", sourCreamUnit);

            sourCream.put("price", 311.67);
            sourCream.put("quantity", 3000.00);
            sourCream.put("value", 935010.00);
            productsList.add(sourCream);

            lot.put("productsList", productsList);

            // Список заказчиков
            List<Map<String, Object>> customersList = new ArrayList<>();

            Map<String, Object> customer = new HashMap<>();

            // Организация заказчика
            Map<String, Object> organization = new HashMap<>();
            organization.put("id", 2913349);
            organization.put("idEIS", "03182000281");
            organization.put("name", "ГОСУДАРСТВЕННОЕ БЮДЖЕТНОЕ УЧРЕЖДЕНИЕ ЗДРАВООХРАНЕНИЯ \"ДЕТСКАЯ КРАЕВАЯ КЛИНИЧЕСКАЯ БОЛЬНИЦА\" МИНИСТЕРСТВА ЗДРАВООХРАНЕНИЯ КРАСНОДАРСКОГО КРАЯ");
            organization.put("inn", "2309039134");
            organization.put("kpp", "230901001");
            organization.put("ogrnSource", "1022301425629");
            organization.put("ogrnSeldon", "1022301425629");
            organization.put("regionCode", "23");
            organization.put("region", "Краснодарский край");
            organization.put("contactPerson", "Марина Леонидовна Дорошенко");
            organization.put("subOrdLevel", 2);
            organization.put("urAddress", "Российская Федерация, 350007, Краснодарский край, Краснодар г, ПЛОЩАДЬ ПОБЕДЫ, 1");
            organization.put("factAddress", "Российская Федерация, 350007, Краснодарский край, Краснодар г, ПЛ. ПОБЕДЫ, Д.1");
            organization.put("phone", "7-861-2680027");
            organization.put("email", "zakupkidkkb-kk@mail.ru");
            customer.put("organization", organization);

            customer.put("amount", 17883.59);

            // Валюта суммы
            Map<String, Object> amountCurrency = new HashMap<>();
            amountCurrency.put("code", "RUB");
            amountCurrency.put("name", "РОССИЙСКИЙ РУБЛЬ");
            customer.put("amountCurrency", amountCurrency);

            customer.put("conAmount", 357671.71);

            // Валюта контракта
            Map<String, Object> conAmountCurrency = new HashMap<>();
            conAmountCurrency.put("code", "RUB");
            conAmountCurrency.put("name", "РОССИЙСКИЙ РУБЛЬ");
            customer.put("conAmountCurrency", conAmountCurrency);

            customer.put("deliveryPlace", "Российская Федерация, Российская Федерация, 350007, г. Краснодар, ГБУЗ ДККБ, пл. Победы, 1, эстакада пищеблока");
            customer.put("deliveryTerm", null);
            customersList.add(customer);

            lot.put("customersList", customersList);

            // IKZList
            lot.put("IKZList", List.of("252230903913423090100109320011051244"));
            lot.put("SeldonId", 40099370);
            lotsList.add(lot);

            purchase.put("lotsList", lotsList);
            purchases.add(purchase);

            result.put("purchases", purchases);
            response.put("status", status);
            response.put("result", result);

            return ResponseEntity.ok(response);

        } catch (Exception e) {
            Map<String, Object> errorResponse = new HashMap<>();
            errorResponse.put("error", "Произошла ошибка при обработке запроса");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }
    }
}
