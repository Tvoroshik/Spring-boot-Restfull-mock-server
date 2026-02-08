package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientGetCustomerAccountController {

    private static final Logger logger = LoggerFactory.getLogger(ClientGetCustomerAccountController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_ClientGetCustomerAccount:0}")
    private long delay_ClientGetCustomerAccount;

    @GetMapping("/client/getCustomerAccount")
    public String clientGetCustomerAccount() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_ClientGetCustomerAccount);

            // Фиксированный JSON-ответ (сокращён для наглядности, но структура сохранена)
            String jsonResponse = "[ {\n" +
                    "\n" +
                    "  \"ean\" : \"40702810102590022952\",\n" +
                    "\n" +
                    "  \"act\" : \"CA\",\n" +
                    "\n" +
                    "  \"ccym\" : \"RUR\",\n" +
                    "\n" +
                    "  \"buh\" : \"100\",\n" +
                    "\n" +
                    "  \"actname\" : null,\n" +
                    "\n" +
                    "  \"ama\" : 2459464975,\n" +
                    "\n" +
                    "  \"amac\" : null,\n" +
                    "\n" +
                    "  \"ama2\" : null,\n" +
                    "\n" +
                    "  \"total\" : 2459464975,\n" +
                    "\n" +
                    "  \"arrest\" : null,\n" +
                    "\n" +
                    "  \"holds\" : null,\n" +
                    "\n" +
                    "  \"oad\" : \"2015-04-14\",\n" +
                    "\n" +
                    "  \"cad\" : null,\n" +
                    "\n" +
                    "  \"dle\" : null,\n" +
                    "\n" +
                    "  \"dlm\" : null,\n" +
                    "\n" +
                    "  \"ab\" : null,\n" +
                    "\n" +
                    "  \"as\" : null,\n" +
                    "\n" +
                    "  \"app\" : null,\n" +
                    "\n" +
                    "  \"acs\" : null,\n" +
                    "\n" +
                    "  \"acd\" : null,\n" +
                    "\n" +
                    "  \"sac\" : null,\n" +
                    "\n" +
                    "  \"shn\" : null,\n" +
                    "\n" +
                    "  \"cnal\" : null,\n" +
                    "\n" +
                    "  \"cnap\" : null,\n" +
                    "\n" +
                    "  \"cnar\" : null,\n" +
                    "\n" +
                    "  \"sfc\" : null,\n" +
                    "\n" +
                    "  \"stdat\" : null,\n" +
                    "\n" +
                    "  \"stnum\" : null,\n" +
                    "\n" +
                    "  \"aco\" : null,\n" +
                    "\n" +
                    "  \"p1\" : null,\n" +
                    "\n" +
                    "  \"p2\" : null,\n" +
                    "\n" +
                    "  \"p3\" : null,\n" +
                    "\n" +
                    "  \"p4\" : null,\n" +
                    "\n" +
                    "  \"p5\" : null,\n" +
                    "\n" +
                    "  \"c1\" : null,\n" +
                    "\n" +
                    "  \"c2\" : null,\n" +
                    "\n" +
                    "  \"c3\" : null,\n" +
                    "\n" +
                    "  \"c4\" : null,\n" +
                    "\n" +
                    "  \"c5\" : null,\n" +
                    "\n" +
                    "  \"sc10\" : null,\n" +
                    "\n" +
                    "  \"sc11\" : null,\n" +
                    "\n" +
                    "  \"sc21\" : null,\n" +
                    "\n" +
                    "  \"sc24\" : null,\n" +
                    "\n" +
                    "  \"sc25\" : null,\n" +
                    "\n" +
                    "  \"sc26\" : null,\n" +
                    "\n" +
                    "  \"sc13\" : null,\n" +
                    "\n" +
                    "  \"sc15\" : null,\n" +
                    "\n" +
                    "  \"sc16\" : null,\n" +
                    "\n" +
                    "  \"sc31\" : null,\n" +
                    "\n" +
                    "  \"sc32\" : null,\n" +
                    "\n" +
                    "  \"sc37\" : null,\n" +
                    "\n" +
                    "  \"sc46\" : null,\n" +
                    "\n" +
                    "  \"sc35\" : null,\n" +
                    "\n" +
                    "  \"sc36\" : null,\n" +
                    "\n" +
                    "  \"sc54\" : null,\n" +
                    "\n" +
                    "  \"sc66\" : null,\n" +
                    "\n" +
                    "  \"sc67\" : null,\n" +
                    "\n" +
                    "  \"sc71\" : null,\n" +
                    "\n" +
                    "  \"sc72\" : null,\n" +
                    "\n" +
                    "  \"sc100\" : null,\n" +
                    "\n" +
                    "  \"sc101\" : null,\n" +
                    "\n" +
                    "  \"sc102\" : null,\n" +
                    "\n" +
                    "  \"sc110\" : null,\n" +
                    "\n" +
                    "  \"sc111\" : null,\n" +
                    "\n" +
                    "  \"sc112\" : null,\n" +
                    "\n" +
                    "  \"sc113\" : null,\n" +
                    "\n" +
                    "  \"sc114\" : null,\n" +
                    "\n" +
                    "  \"sc124\" : null,\n" +
                    "\n" +
                    "  \"sc125\" : null,\n" +
                    "\n" +
                    "  \"sc127\" : null,\n" +
                    "\n" +
                    "  \"sc140\" : null,\n" +
                    "\n" +
                    "  \"sc141\" : null,\n" +
                    "\n" +
                    "  \"sc144\" : null,\n" +
                    "\n" +
                    "  \"sc150\" : null,\n" +
                    "\n" +
                    "  \"sc172\" : null,\n" +
                    "\n" +
                    "  \"sc152\" : null,\n" +
                    "\n" +
                    "  \"sc155\" : null,\n" +
                    "\n" +
                    "  \"sc156\" : null,\n" +
                    "\n" +
                    "  \"sc157\" : null,\n" +
                    "\n" +
                    "  \"sc171\" : null,\n" +
                    "\n" +
                    "  \"sc173\" : null,\n" +
                    "\n" +
                    "  \"sc174\" : null,\n" +
                    "\n" +
                    "  \"sc175\" : null,\n" +
                    "\n" +
                    "  \"sc176\" : null,\n" +
                    "\n" +
                    "  \"sc133\" : null,\n" +
                    "\n" +
                    "  \"sc134\" : null,\n" +
                    "\n" +
                    "  \"sc135\" : null,\n" +
                    "\n" +
                    "  \"sc136\" : null,\n" +
                    "\n" +
                    "  \"sc137\" : null,\n" +
                    "\n" +
                    "  \"sc60\" : null,\n" +
                    "\n" +
                    "  \"sc61\" : null,\n" +
                    "\n" +
                    "  \"sc62\" : null,\n" +
                    "\n" +
                    "  \"sc63\" : null,\n" +
                    "\n" +
                    "  \"sc64\" : null,\n" +
                    "\n" +
                    "  \"sc65\" : null,\n" +
                    "\n" +
                    "  \"sc73\" : null,\n" +
                    "\n" +
                    "  \"sc80\" : null,\n" +
                    "\n" +
                    "  \"sc81\" : null,\n" +
                    "\n" +
                    "  \"sc82\" : null,\n" +
                    "\n" +
                    "  \"sc83\" : null,\n" +
                    "\n" +
                    "  \"sc84\" : null,\n" +
                    "\n" +
                    "  \"sc85\" : null,\n" +
                    "\n" +
                    "  \"sc86\" : null,\n" +
                    "\n" +
                    "  \"sc87\" : null,\n" +
                    "\n" +
                    "  \"sc90\" : null,\n" +
                    "\n" +
                    "  \"sc91\" : null,\n" +
                    "\n" +
                    "  \"sc92\" : null,\n" +
                    "\n" +
                    "  \"sc93\" : null,\n" +
                    "\n" +
                    "  \"sc94\" : null,\n" +
                    "\n" +
                    "  \"sc95\" : null,\n" +
                    "\n" +
                    "  \"sc96\" : null,\n" +
                    "\n" +
                    "  \"sc97\" : null,\n" +
                    "\n" +
                    "  \"sc160\" : null,\n" +
                    "\n" +
                    "  \"sc161\" : null,\n" +
                    "\n" +
                    "  \"sc162\" : null,\n" +
                    "\n" +
                    "  \"sc163\" : null,\n" +
                    "\n" +
                    "  \"sc164\" : null,\n" +
                    "\n" +
                    "  \"sc165\" : null,\n" +
                    "\n" +
                    "  \"sc166\" : null,\n" +
                    "\n" +
                    "  \"sc167\" : null,\n" +
                    "\n" +
                    "  \"sc190\" : null,\n" +
                    "\n" +
                    "  \"sc191\" : null,\n" +
                    "\n" +
                    "  \"sc192\" : null,\n" +
                    "\n" +
                    "  \"sc193\" : null,\n" +
                    "\n" +
                    "  \"sc194\" : null,\n" +
                    "\n" +
                    "  \"sc195\" : null,\n" +
                    "\n" +
                    "  \"sc196\" : null,\n" +
                    "\n" +
                    "  \"sc197\" : null,\n" +
                    "\n" +
                    "  \"sc200\" : null,\n" +
                    "\n" +
                    "  \"sc201\" : null,\n" +
                    "\n" +
                    "  \"sc202\" : null,\n" +
                    "\n" +
                    "  \"sc203\" : null,\n" +
                    "\n" +
                    "  \"sc204\" : null,\n" +
                    "\n" +
                    "  \"sc205\" : null,\n" +
                    "\n" +
                    "  \"sc206\" : null,\n" +
                    "\n" +
                    "  \"sc207\" : null,\n" +
                    "\n" +
                    "  \"sc210\" : null,\n" +
                    "\n" +
                    "  \"sc211\" : null,\n" +
                    "\n" +
                    "  \"sc212\" : null,\n" +
                    "\n" +
                    "  \"sc213\" : null,\n" +
                    "\n" +
                    "  \"sc214\" : null,\n" +
                    "\n" +
                    "  \"sc215\" : null,\n" +
                    "\n" +
                    "  \"sc216\" : null,\n" +
                    "\n" +
                    "  \"sc217\" : null,\n" +
                    "\n" +
                    "  \"sc220\" : null,\n" +
                    "\n" +
                    "  \"sc221\" : null,\n" +
                    "\n" +
                    "  \"sc222\" : null,\n" +
                    "\n" +
                    "  \"sc223\" : null,\n" +
                    "\n" +
                    "  \"sc224\" : null,\n" +
                    "\n" +
                    "  \"sc225\" : null,\n" +
                    "\n" +
                    "  \"sc226\" : null,\n" +
                    "\n" +
                    "  \"sc227\" : null,\n" +
                    "\n" +
                    "  \"sc230\" : null,\n" +
                    "\n" +
                    "  \"sc231\" : null,\n" +
                    "\n" +
                    "  \"sc232\" : null,\n" +
                    "\n" +
                    "  \"sc233\" : null,\n" +
                    "\n" +
                    "  \"sc234\" : null,\n" +
                    "\n" +
                    "  \"sc235\" : null,\n" +
                    "\n" +
                    "  \"sc236\" : null,\n" +
                    "\n" +
                    "  \"sc237\" : null\n" +
                    "\n" +
                    "}, {\n" +
                    "\n" +
                    "  \"ean\" : \"40702810202590022222\",\n" +
                    "\n" +
                    "  \"act\" : \"CA\",\n" +
                    "\n" +
                    "  \"ccym\" : \"RUR\",\n" +
                    "\n" +
                    "  \"buh\" : \"100\",\n" +
                    "\n" +
                    "  \"actname\" : null,\n" +
                    "\n" +
                    "  \"ama\" : 0,\n" +
                    "\n" +
                    "  \"amac\" : null,\n" +
                    "\n" +
                    "  \"ama2\" : null,\n" +
                    "\n" +
                    "  \"total\" : 0,\n" +
                    "\n" +
                    "  \"arrest\" : null,\n" +
                    "\n" +
                    "  \"holds\" : null,\n" +
                    "\n" +
                    "  \"oad\" : \"2018-10-09\",\n" +
                    "\n" +
                    "  \"cad\" : null,\n" +
                    "\n" +
                    "  \"dle\" : null,\n" +
                    "\n" +
                    "  \"dlm\" : null,\n" +
                    "\n" +
                    "  \"ab\" : null,\n" +
                    "\n" +
                    "  \"as\" : null,\n" +
                    "\n" +
                    "  \"app\" : null,\n" +
                    "\n" +
                    "  \"acs\" : null,\n" +
                    "\n" +
                    "  \"acd\" : null,\n" +
                    "\n" +
                    "  \"sac\" : null,\n" +
                    "\n" +
                    "  \"shn\" : null,\n" +
                    "\n" +
                    "  \"cnal\" : null,\n" +
                    "\n" +
                    "  \"cnap\" : null,\n" +
                    "\n" +
                    "  \"cnar\" : null,\n" +
                    "\n" +
                    "  \"sfc\" : null,\n" +
                    "\n" +
                    "  \"stdat\" : null,\n" +
                    "\n" +
                    "  \"stnum\" : null,\n" +
                    "\n" +
                    "  \"aco\" : null,\n" +
                    "\n" +
                    "  \"p1\" : null,\n" +
                    "\n" +
                    "  \"p2\" : null,\n" +
                    "\n" +
                    "  \"p3\" : null,\n" +
                    "\n" +
                    "  \"p4\" : null,\n" +
                    "\n" +
                    "  \"p5\" : null,\n" +
                    "\n" +
                    "  \"c1\" : null,\n" +
                    "\n" +
                    "  \"c2\" : null,\n" +
                    "\n" +
                    "  \"c3\" : null,\n" +
                    "\n" +
                    "  \"c4\" : null,\n" +
                    "\n" +
                    "  \"c5\" : null,\n" +
                    "\n" +
                    "  \"sc10\" : null,\n" +
                    "\n" +
                    "  \"sc11\" : null,\n" +
                    "\n" +
                    "  \"sc21\" : null,\n" +
                    "\n" +
                    "  \"sc24\" : null,\n" +
                    "\n" +
                    "  \"sc25\" : null,\n" +
                    "\n" +
                    "  \"sc26\" : null,\n" +
                    "\n" +
                    "  \"sc13\" : null,\n" +
                    "\n" +
                    "  \"sc15\" : null,\n" +
                    "\n" +
                    "  \"sc16\" : null,\n" +
                    "\n" +
                    "  \"sc31\" : null,\n" +
                    "\n" +
                    "  \"sc32\" : null,\n" +
                    "\n" +
                    "  \"sc37\" : null,\n" +
                    "\n" +
                    "  \"sc46\" : null,\n" +
                    "\n" +
                    "  \"sc35\" : null,\n" +
                    "\n" +
                    "  \"sc36\" : null,\n" +
                    "\n" +
                    "  \"sc54\" : null,\n" +
                    "\n" +
                    "  \"sc66\" : null,\n" +
                    "\n" +
                    "  \"sc67\" : null,\n" +
                    "\n" +
                    "  \"sc71\" : null,\n" +
                    "\n" +
                    "  \"sc72\" : null,\n" +
                    "\n" +
                    "  \"sc100\" : null,\n" +
                    "\n" +
                    "  \"sc101\" : null,\n" +
                    "\n" +
                    "  \"sc102\" : null,\n" +
                    "\n" +
                    "  \"sc110\" : null,\n" +
                    "\n" +
                    "  \"sc111\" : null,\n" +
                    "\n" +
                    "  \"sc112\" : null,\n" +
                    "\n" +
                    "  \"sc113\" : null,\n" +
                    "\n" +
                    "  \"sc114\" : null,\n" +
                    "\n" +
                    "  \"sc124\" : null,\n" +
                    "\n" +
                    "  \"sc125\" : null,\n" +
                    "\n" +
                    "  \"sc127\" : null,\n" +
                    "\n" +
                    "  \"sc140\" : null,\n" +
                    "\n" +
                    "  \"sc141\" : null,\n" +
                    "\n" +
                    "  \"sc144\" : null,\n" +
                    "\n" +
                    "  \"sc150\" : null,\n" +
                    "\n" +
                    "  \"sc172\" : null,\n" +
                    "\n" +
                    "  \"sc152\" : null,\n" +
                    "\n" +
                    "  \"sc155\" : null,\n" +
                    "\n" +
                    "  \"sc156\" : null,\n" +
                    "\n" +
                    "  \"sc157\" : null,\n" +
                    "\n" +
                    "  \"sc171\" : null,\n" +
                    "\n" +
                    "  \"sc173\" : null,\n" +
                    "\n" +
                    "  \"sc174\" : null,\n" +
                    "\n" +
                    "  \"sc175\" : null,\n" +
                    "\n" +
                    "  \"sc176\" : null,\n" +
                    "\n" +
                    "  \"sc133\" : null,\n" +
                    "\n" +
                    "  \"sc134\" : null,\n" +
                    "\n" +
                    "  \"sc135\" : null,\n" +
                    "\n" +
                    "  \"sc136\" : null,\n" +
                    "\n" +
                    "  \"sc137\" : null,\n" +
                    "\n" +
                    "  \"sc60\" : null,\n" +
                    "\n" +
                    "  \"sc61\" : null,\n" +
                    "\n" +
                    "  \"sc62\" : null,\n" +
                    "\n" +
                    "  \"sc63\" : null,\n" +
                    "\n" +
                    "  \"sc64\" : null,\n" +
                    "\n" +
                    "  \"sc65\" : null,\n" +
                    "\n" +
                    "  \"sc73\" : null,\n" +
                    "\n" +
                    "  \"sc80\" : null,\n" +
                    "\n" +
                    "  \"sc81\" : null,\n" +
                    "\n" +
                    "  \"sc82\" : null,\n" +
                    "\n" +
                    "  \"sc83\" : null,\n" +
                    "\n" +
                    "  \"sc84\" : null,\n" +
                    "\n" +
                    "  \"sc85\" : null,\n" +
                    "\n" +
                    "  \"sc86\" : null,\n" +
                    "\n" +
                    "  \"sc87\" : null,\n" +
                    "\n" +
                    "  \"sc90\" : null,\n" +
                    "\n" +
                    "  \"sc91\" : null,\n" +
                    "\n" +
                    "  \"sc92\" : null,\n" +
                    "\n" +
                    "  \"sc93\" : null,\n" +
                    "\n" +
                    "  \"sc94\" : null,\n" +
                    "\n" +
                    "  \"sc95\" : null,\n" +
                    "\n" +
                    "  \"sc96\" : null,\n" +
                    "\n" +
                    "  \"sc97\" : null,\n" +
                    "\n" +
                    "  \"sc160\" : null,\n" +
                    "\n" +
                    "  \"sc161\" : null,\n" +
                    "\n" +
                    "  \"sc162\" : null,\n" +
                    "\n" +
                    "  \"sc163\" : null,\n" +
                    "\n" +
                    "  \"sc164\" : null,\n" +
                    "\n" +
                    "  \"sc165\" : null,\n" +
                    "\n" +
                    "  \"sc166\" : null,\n" +
                    "\n" +
                    "  \"sc167\" : null,\n" +
                    "\n" +
                    "  \"sc190\" : null,\n" +
                    "\n" +
                    "  \"sc191\" : null,\n" +
                    "\n" +
                    "  \"sc192\" : null,\n" +
                    "\n" +
                    "  \"sc193\" : null,\n" +
                    "\n" +
                    "  \"sc194\" : null,\n" +
                    "\n" +
                    "  \"sc195\" : null,\n" +
                    "\n" +
                    "  \"sc196\" : null,\n" +
                    "\n" +
                    "  \"sc197\" : null,\n" +
                    "\n" +
                    "  \"sc200\" : null,\n" +
                    "\n" +
                    "  \"sc201\" : null,\n" +
                    "\n" +
                    "  \"sc202\" : null,\n" +
                    "\n" +
                    "  \"sc203\" : null,\n" +
                    "\n" +
                    "  \"sc204\" : null,\n" +
                    "\n" +
                    "  \"sc205\" : null,\n" +
                    "\n" +
                    "  \"sc206\" : null,\n" +
                    "\n" +
                    "  \"sc207\" : null,\n" +
                    "\n" +
                    "  \"sc210\" : null,\n" +
                    "\n" +
                    "  \"sc211\" : null,\n" +
                    "\n" +
                    "  \"sc212\" : null,\n" +
                    "\n" +
                    "  \"sc213\" : null,\n" +
                    "\n" +
                    "  \"sc214\" : null,\n" +
                    "\n" +
                    "  \"sc215\" : null,\n" +
                    "\n" +
                    "  \"sc216\" : null,\n" +
                    "\n" +
                    "  \"sc217\" : null,\n" +
                    "\n" +
                    "  \"sc220\" : null,\n" +
                    "\n" +
                    "  \"sc221\" : null,\n" +
                    "\n" +
                    "  \"sc222\" : null,\n" +
                    "\n" +
                    "  \"sc223\" : null,\n" +
                    "\n" +
                    "  \"sc224\" : null,\n" +
                    "\n" +
                    "  \"sc225\" : null,\n" +
                    "\n" +
                    "  \"sc226\" : null,\n" +
                    "\n" +
                    "  \"sc227\" : null,\n" +
                    "\n" +
                    "  \"sc230\" : null,\n" +
                    "\n" +
                    "  \"sc231\" : null,\n" +
                    "\n" +
                    "  \"sc232\" : null,\n" +
                    "\n" +
                    "  \"sc233\" : null,\n" +
                    "\n" +
                    "  \"sc234\" : null,\n" +
                    "\n" +
                    "  \"sc235\" : null,\n" +
                    "\n" +
                    "  \"sc236\" : null,\n" +
                    "\n" +
                    "  \"sc237\" : null\n" +
                    "\n" +
                    "} ]";

            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "\"Error processing request\"";
        }
    }
}
