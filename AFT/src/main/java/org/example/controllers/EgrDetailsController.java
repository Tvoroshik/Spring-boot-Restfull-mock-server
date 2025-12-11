package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class EgrDetailsController {

    private static final Logger log = LoggerFactory.getLogger(EgrDetailsController.class);

    @Value("${app.delay.egrDetails:0}")
    private long egrDetails_delay;

    @GetMapping(
            value = "/egrDetails",
            produces = "application/json"
    )
    public Object getEgrDetails(
            @RequestParam String ogrn,
            @RequestParam String inn
    ) {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(egrDetails_delay);

            List<Map<String, Object>> responseList = new ArrayList<>();
            Map<String, Object> response = new HashMap<>();

            // Основные поля
            response.put("inn", inn);
            response.put("ogrn", ogrn);
            response.put("focusHref", "https://focus.kontur.ru/entity?query=" + ogrn);

            // Вложенный объект UL
            Map<String, Object> ul = new HashMap<>();

            // Регистрационные данные
            Map<String, String> regNumbers = new HashMap<>();
            regNumbers.put("okpo", "87748626");
            regNumbers.put("pfrRegNumber", "1325366753");
            regNumbers.put("fssRegNumber", "1325366753");

            // Деятельность
            Map<String, Object> activities = new HashMap<>();

            // Основная деятельность
            Map<String, Object> principalActivity = new HashMap<>();
            principalActivity.put("code", "86.90.1");
            principalActivity.put("text", "Деятельность организаций санитарно-эпидемиологической службы");
            principalActivity.put("date", "2024-10-01");
            activities.put("principalActivity", principalActivity);

            // Дополнительные виды деятельности
            List<Map<String, Object>> complementaryActivities = new ArrayList<>();

            // Заполняем все виды деятельности
            addActivity(complementaryActivities, "01.61", "Предоставление услуг в области растениеводства");
            addActivity(complementaryActivities, "37.00", "Сбор и обработка сточных вод");
            addActivity(complementaryActivities, "38.11", "Сбор неопасных отходов");
            addActivity(complementaryActivities, "38.12", "Сбор опасных отходов");
            addActivity(complementaryActivities, "38.21", "Обработка и утилизация неопасных отходов");
            addActivity(complementaryActivities, "38.22", "Обработка и утилизация опасных отходов");
            addActivity(complementaryActivities, "39.00", "Предоставление услуг в области ликвидации последствий загрязнений и прочих услуг, связанных с удалением отходов");
            addActivity(complementaryActivities, "43.22", "Производство санитарно-технических работ, монтаж отопительных систем и систем кондиционирования воздуха");
            addActivity(complementaryActivities, "43.39", "Производство прочих отделочных и завершающих работ");
            addActivity(complementaryActivities, "47.78.9", "Торговля розничная непродовольственными товарами, не включенными в другие группировки, в специализированных магазинах");
            addActivity(complementaryActivities, "58.11", "Издание книг");
            addActivity(complementaryActivities, "71.20", "Технические испытания, исследования, анализ и сертификация");
            addActivity(complementaryActivities, "73.11", "Деятельность рекламных агентств");
            addActivity(complementaryActivities, "81.10", "Деятельность по комплексному обслуживанию помещений");
            addActivity(complementaryActivities, "81.22", "Деятельность по чистке и уборке жилых зданий и нежилых помещений прочая");
            addActivity(complementaryActivities, "81.29", "Деятельность по чистке и уборке прочая");
            addActivity(complementaryActivities, "81.29.1", "Дезинфекция, дезинсекция, дератизация зданий, промышленного оборудования");
            addActivity(complementaryActivities, "81.29.9", "Деятельность по чистке и уборке прочая, не включенная в другие группировки");
            addActivity(complementaryActivities, "81.30", "Деятельность по благоустройству ландшафта");
            addActivity(complementaryActivities, "85.30", "Обучение профессиональное");
            addActivity(complementaryActivities, "85.42", "Образование профессиональное дополнительное");
            addActivity(complementaryActivities, "86.10", "Деятельность больничных организаций");
            addActivity(complementaryActivities, "86.22", "Специальная врачебная практика");
            addActivity(complementaryActivities, "86.90", "Деятельность в области медицины прочая");
            addActivity(complementaryActivities, "86.90.9", "Деятельность в области медицины прочая, не включенная в другие группировки");
            addActivity(complementaryActivities, "96.01", "Стирка и химическая чистка текстильных и меховых изделий");

            activities.put("complementaryActivities", complementaryActivities);
            activities.put("okvedVersion", "2");
            ul.put("activities", activities);

            // Регистрационная информация
            Map<String, Object> regInfo = new HashMap<>();
            regInfo.put("ogrnDate", "2024-10-01");
            ul.put("regInfo", regInfo);

            // Налоговая регистрация
            Map<String, Object> nalogRegBody = new HashMap<>();
            nalogRegBody.put("nalogCode", "7716");
            nalogRegBody.put("nalogName", "Инспекция Федеральной налоговой службы № 16 по г. Москве");
            nalogRegBody.put("nalogRegDate", "2024-10-01");
            nalogRegBody.put("kpp", "771601001");
            nalogRegBody.put("date", "2024-10-01");
            ul.put("nalogRegBody", nalogRegBody);

            // Регистрирующий орган
            Map<String, Object> regBody = new HashMap<>();
            regBody.put("nalogCode", "7746");
            regBody.put("nalogName", "Межрайонная инспекция Федеральной налоговой службы № 46 по г. Москве");
            regBody.put("nalogRegAddress", "125373, г.Москва, Походный проезд, домовладение 3, стр.2");
            regBody.put("date", "2024-10-01");
            ul.put("regBody", regBody);

            // Регистратор акционеров
            Map<String, Object> registrarOfShareholders = new HashMap<>();
            registrarOfShareholders.put("name", "АО \"Независимая Регистраторская Компания Р.О.С.Т.\"");
            registrarOfShareholders.put("inn", "7726030449");
            registrarOfShareholders.put("ogrn", "1027739216757");
            registrarOfShareholders.put("date", "2024-10-01");
            registrarOfShareholders.put("firstDate", "2024-10-01");
            ul.put("registrarOfShareholders", registrarOfShareholders);

            // Уставный капитал
            Map<String, Object> statedCapital = new HashMap<>();
            statedCapital.put("sum", 514653000);
            statedCapital.put("date", "2024-10-01");
            ul.put("statedCapital", statedCapital);

            // Учредители
            List<Map<String, Object>> foundersUL = new ArrayList<>();
            Map<String, Object> founder = new HashMap<>();
            founder.put("ogrn", "1037739510423");
            founder.put("inn", "7705031674");
            founder.put("fullName", "Департамент Городского Имущества Города Москвы");
            Map<String, Object> share = new HashMap<>();
            share.put("sum", 514653000);
            founder.put("share", share);
            founder.put("date", "2024-10-01");
            founder.put("firstDate", "2024-10-01");
            founder.put("isSoleShareholder", true);
            foundersUL.add(founder);
            ul.put("foundersUL", foundersUL);

            // Предшественники
            List<Map<String, String>> predecessors = new ArrayList<>();
            Map<String, String> predecessor = new HashMap<>();
            predecessor.put("name", "Государственное унитарное предприятие Города Москвы \"Московский Городской Центр Дезинфекции\"");
            predecessor.put("inn", "7716082078");
            predecessor.put("ogrn", "1037739394990");
            predecessors.add(predecessor);
            ul.put("predecessors", predecessors);

            // Записи ЕГРЮЛ
            List<Map<String, Object>> egrRecords = new ArrayList<>();

            // Заполняем записи ЕГРЮЛ
            addEgrRecord(egrRecords, "2257715991949", "2025-04-14",
                    "Государственная регистрация изменений, внесенных в учредительный документ юридического лица, и внесение изменений в сведения о юридическом лице, содержащиеся в ЕГРЮЛ", "7746");

            addEgrRecord(egrRecords, "2257713034665", "2025-02-14",
                    "Внесение сведений о предоставлении лицензии", "7746");

            addEgrRecord(egrRecords, "2257701928196", "2025-01-14",
                    "Представление лицензирующим органом сведений о переоформлении лицензии, внесении изменений в сведения о лицензии (сведений о продлении срока действия лицензии)", "7746");

            addEgrRecord(egrRecords, "2247711006035", "2024-11-01",
                    "Представление сведений о регистрации юридического лица в качестве страхователя в Социальном фонде Российской Федерации (обязательное социальное страхование)", "7746");

            addEgrRecord(egrRecords, "2247711006024", "2024-11-01",
                    "Представление сведений о регистрации юридического лица в качестве страхователя в Социальном фонде Российской Федерации (обязательное пенсионное страхование)", "7746");

            addEgrRecord(egrRecords, "2247709888369", "2024-10-01",
                    "Внесение сведений об учете в налоговом органе", "7746");

            addEgrRecord(egrRecords, "1247700651318", "2024-10-01",
                    "Создание ЮЛ в форме преобразования", "7746");

            ul.put("egrRecords", egrRecords);
            ul.put("history", new HashMap<>());

            response.put("UL", ul);
            responseList.add(response);

            return responseList;
        } catch (Exception e) {
            log.error("Ошибка обработки запроса", e);
            return Map.of("error", "Произошла ошибка при обработке запроса");
        }
    }

    private void addActivity(List<Map<String, Object>> list, String code, String text) {
        Map<String, Object> activity = new HashMap<>();
        activity.put("code", code);
        activity.put("text", text);
        activity.put("date", "2024-10-01");
        list.add(activity);
    }

    private void addEgrRecord(List<Map<String, Object>> list, String grn, String date, String name, String regCode) {
        Map<String, Object> record = new HashMap<>();
        record.put("grn", grn);
        record.put("date", date);
        record.put("name", name);
        record.put("regName", "Межрайонная Инспекция Федеральной Налоговой Службы № 46 по г. Москве");
        record.put("regCode", regCode);

        // Документы, прилагаемые к записи
        List<Map<String, String>> documents = new ArrayList<>();

        // Для некоторых записей документы могут отличаться
        if (grn.equals("2257715991949")) {
            addDocument(documents, "Решение о внесении изменений в учредительный документ ЮЛ, либо иное решение или документ, на основании которого вносятся данные изменения");
            addDocument(documents, "Учредительный документ ЮЛ в новой редакции");
            addDocument(documents, "Р13014 Заявление об изменении учр.документа и/или иных сведений о ЮЛ");
            addDocument(documents, "Иной докум. в соотв.с законодательством РФ");
        }

        record.put("documents", documents);
        list.add(record);
    }

    private void addDocument(List<Map<String, String>> list, String documentName) {
        Map<String, String> document = new HashMap<>();
        document.put("name", documentName);
        list.add(document);
    }
}
