package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class eqidController {

    private static final Logger logger = LoggerFactory.getLogger(eqidController.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_eqid:0}")
    private long delay_eqid;

    @PostMapping ("/eq/id")
    public String eqid() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_eqid);

            // JSON-ответ
            String jsonResponse = "[ {\n" +
                    "    \"ean\" : \"40702810102590022952\",\n" +
                    "    \"act\" : \"CA\",\n" +
                    "    \"ccym\" : \"RUR\",\n" +
                    "    \"buh\" : \"100\",\n" +
                    "    \"actname\" : null,\n" +
                    "    \"ama\" : 2459464975,\n" +
                    "    \"amac\" : null,\n" +
                    "    \"ama2\" : null,\n" +
                    "    \"total\" : 2459464975,\n" +
                    "    \"arrest\" : null,\n" +
                    "    \"holds\" : null,\n" +
                    "    \"oad\" : \"2015-04-14\",\n" +
                    "    \"cad\" : null,\n" +
                    "    \"dle\" : null,\n" +
                    "    \"dlm\" : null,\n" +
                    "    \"ab\" : null,\n" +
                    "    \"as\" : null,\n" +
                    "    \"app\" : null,\n" +
                    "    \"acs\" : null,\n" +
                    "    \"acd\" : null,\n" +
                    "    \"sac\" : null,\n" +
                    "    \"shn\" : null,\n" +
                    "    \"cnal\" : null,\n" +
                    "    \"cnap\" : null,\n" +
                    "    \"cnar\" : null,\n" +
                    "    \"sfc\" : null,\n" +
                    "    \"stdat\" : null,\n" +
                    "    \"stnum\" : null,\n" +
                    "    \"aco\" : null,\n" +
                    "    \"p1\" : null,\n" +
                    "    \"p2\" : null,\n" +
                    "    \"p3\" : null,\n" +
                    "    \"p4\" : null,\n" +
                    "    \"p5\" : null,\n" +
                    "    \"c1\" : null,\n" +
                    "    \"c2\" : null,\n" +
                    "    \"c3\" : null,\n" +
                    "    \"c4\" : null,\n" +
                    "    \"c5\" : null,\n" +
                    "    \"sc10\" : null,\n" +
                    "    \"sc11\" : null,\n" +
                    "    \"sc21\" : null,\n" +
                    "    \"sc24\" : null,\n" +
                    "    \"sc25\" : null,\n" +
                    "    \"sc26\" : null,\n" +
                    "    \"sc13\" : null,\n" +
                    "    \"sc15\" : null,\n" +
                    "    \"sc16\" : null,\n" +
                    "    \"sc31\" : null,\n" +
                    "    \"sc32\" : null,\n" +
                    "    \"sc37\" : null,\n" +
                    "    \"sc46\" : null,\n" +
                    "    \"sc35\" : null,\n" +
                    "    \"sc36\" : null,\n" +
                    "    \"sc54\" : null,\n" +
                    "    \"sc66\" : null,\n" +
                    "    \"sc67\" : null,\n" +
                    "    \"sc71\" : null,\n" +
                    "    \"sc72\" : null,\n" +
                    "    \"sc100\" : null,\n" +
                    "    \"sc101\" : null,\n" +
                    "    \"sc102\" : null,\n" +
                    "    \"sc110\" : null,\n" +
                    "    \"sc111\" : null,\n" +
                    "    \"sc112\" : null,\n" +
                    "    \"sc113\" : null,\n" +
                    "    \"sc114\" : null,\n" +
                    "    \"sc124\" : null,\n" +
                    "    \"sc125\" : null,\n" +
                    "    \"sc127\" : null,\n" +
                    "    \"sc140\" : null,\n" +
                    "    \"sc141\" : null,\n" +
                    "    \"sc144\" : null,\n" +
                    "    \"sc150\" : null,\n" +
                    "    \"sc172\" : null,\n" +
                    "    \"sc152\" : null,\n" +
                    "    \"sc155\" : null,\n" +
                    "    \"sc156\" : null,\n" +
                    "    \"sc157\" : null,\n" +
                    "    \"sc171\" : null,\n" +
                    "    \"sc173\" : null,\n" +
                    "    \"sc174\" : null,\n" +
                    "    \"sc175\" : null,\n" +
                    "    \"sc176\" : null,\n" +
                    "    \"sc133\" : null,\n" +
                    "    \"sc134\" : null,\n" +
                    "    \"sc135\" : null,\n" +
                    "    \"sc136\" : null,\n" +
                    "    \"sc137\" : null,\n" +
                    "    \"sc60\" : null,\n" +
                    "    \"sc61\" : null,\n" +
                    "    \"sc62\" : null,\n" +
                    "    \"sc63\" : null,\n" +
                    "    \"sc64\" : null,\n" +
                    "    \"sc65\" : null,\n" +
                    "    \"sc73\" : null,\n" +
                    "    \"sc80\" : null,\n" +
                    "    \"sc81\" : null,\n" +
                    "    \"sc82\" : null,\n" +
                    "    \"sc83\" : null,\n" +
                    "    \"sc84\" : null,\n" +
                    "    \"sc85\" : null,\n" +
                    "    \"sc86\" : null,\n" +
                    "    \"sc87\" : null,\n" +
                    "    \"sc90\" : null,\n" +
                    "    \"sc91\" : null,\n" +
                    "    \"sc92\" : null,\n" +
                    "    \"sc93\" : null,\n" +
                    "    \"sc94\" : null,\n" +
                    "    \"sc95\" : null,\n" +
                    "    \"sc96\" : null,\n" +
                    "    \"sc97\" : null,\n" +
                    "    \"sc160\" : null,\n" +
                    "    \"sc161\" : null,\n" +
                    "    \"sc162\" : null,\n" +
                    "    \"sc163\" : null,\n" +
                    "    \"sc164\" : null,\n" +
                    "    \"sc165\" : null,\n" +
                    "    \"sc166\" : null,\n" +
                    "    \"sc167\" : null,\n" +
                    "    \"sc190\" : null,\n" +
                    "    \"sc191\" : null,\n" +
                    "    \"sc192\" : null,\n" +
                    "    \"sc193\" : null,\n" +
                    "    \"sc194\" : null,\n" +
                    "    \"sc195\" : null,\n" +
                    "    \"sc196\" : null,\n" +
                    "    \"sc197\" : null,\n" +
                    "    \"sc200\" : null,\n" +
                    "    \"sc201\" : null,\n" +
                    "    \"sc202\" : null,\n" +
                    "    \"sc203\" : null,\n" +
                    "    \"sc204\" : null,\n" +
                    "    \"sc205\" : null,\n" +
                    "    \"sc206\" : null,\n" +
                    "    \"sc207\" : null,\n" +
                    "    \"sc210\" : null,\n" +
                    "    \"sc211\" : null,\n" +
                    "    \"sc212\" : null,\n" +
                    "    \"sc213\" : null,\n" +
                    "    \"sc214\" : null,\n" +
                    "    \"sc215\" : null,\n" +
                    "    \"sc216\" : null,\n" +
                    "    \"sc217\" : null,\n" +
                    "    \"sc220\" : null,\n" +
                    "    \"sc221\" : null,\n" +
                    "    \"sc222\" : null,\n" +
                    "    \"sc223\" : null,\n" +
                    "    \"sc224\" : null,\n" +
                    "    \"sc225\" : null,\n" +
                    "    \"sc226\" : null,\n" +
                    "    \"sc227\" : null,\n" +
                    "    \"sc230\" : null,\n" +
                    "    \"sc231\" : null,\n" +
                    "    \"sc232\" : null,\n" +
                    "    \"sc233\" : null,\n" +
                    "    \"sc234\" : null,\n" +
                    "    \"sc235\" : null,\n" +
                    "    \"sc236\" : null,\n" +
                    "    \"sc237\" : null\n" +
                    "  }, {\n" +
                    "    \"ean\" : \"40702810202590022222\",\n" +
                    "    \"act\" : \"CA\",\n" +
                    "    \"ccym\" : \"RUR\",\n" +
                    "    \"buh\" : \"100\",\n" +
                    "    \"actname\" : null,\n" +
                    "    \"ama\" : 0,\n" +
                    "    \"amac\" : null,\n" +
                    "    \"ama2\" : null,\n" +
                    "    \"total\" : 0,\n" +
                    "    \"arrest\" : null,\n" +
                    "    \"holds\" : null,\n" +
                    "    \"oad\" : \"2018-10-09\",\n" +
                    "    \"cad\" : null,\n" +
                    "    \"dle\" : null,\n" +
                    "    \"dlm\" : null,\n" +
                    "    \"ab\" : null,\n" +
                    "    \"as\" : null,\n" +
                    "    \"app\" : null,\n" +
                    "    \"acs\" : null,\n" +
                    "    \"acd\" : null,\n" +
                    "    \"sac\" : null,\n" +
                    "    \"shn\" : null,\n" +
                    "    \"cnal\" : null,\n" +
                    "    \"cnap\" : null,\n" +
                    "    \"cnar\" : null,\n" +
                    "    \"sfc\" : null,\n" +
                    "    \"stdat\" : null,\n" +
                    "    \"stnum\" : null,\n" +
                    "    \"aco\" : null,\n" +
                    "    \"p1\" : null,\n" +
                    "    \"p2\" : null,\n" +
                    "    \"p3\" : null,\n" +
                    "    \"p4\" : null,\n" +
                    "    \"p5\" : null,\n" +
                    "    \"c1\" : null,\n" +
                    "    \"c2\" : null,\n" +
                    "    \"c3\" : null,\n" +
                    "    \"c4\" : null,\n" +
                    "    \"c5\" : null,\n" +
                    "    \"sc10\" : null,\n" +
                    "    \"sc11\" : null,\n" +
                    "    \"sc21\" : null,\n" +
                    "    \"sc24\" : null,\n" +
                    "    \"sc25\" : null,\n" +
                    "    \"sc26\" : null,\n" +
                    "    \"sc13\" : null,\n" +
                    "    \"sc15\" : null,\n" +
                    "    \"sc16\" : null,\n" +
                    "    \"sc31\" : null,\n" +
                    "    \"sc32\" : null,\n" +
                    "    \"sc37\" : null,\n" +
                    "    \"sc46\" : null,\n" +
                    "    \"sc35\" : null,\n" +
                    "    \"sc36\" : null,\n" +
                    "    \"sc54\" : null,\n" +
                    "    \"sc66\" : null,\n" +
                    "    \"sc67\" : null,\n" +
                    "    \"sc71\" : null,\n" +
                    "    \"sc72\" : null,\n" +
                    "    \"sc100\" : null,\n" +
                    "    \"sc101\" : null,\n" +
                    "    \"sc102\" : null,\n" +
                    "    \"sc110\" : null,\n" +
                    "    \"sc111\" : null,\n" +
                    "    \"sc112\" : null,\n" +
                    "    \"sc113\" : null,\n" +
                    "    \"sc114\" : null,\n" +
                    "    \"sc124\" : null,\n" +
                    "    \"sc125\" : null,\n" +
                    "    \"sc127\" : null,\n" +
                    "    \"sc140\" : null,\n" +
                    "    \"sc141\" : null,\n" +
                    "    \"sc144\" : null,\n" +
                    "    \"sc150\" : null,\n" +
                    "    \"sc172\" : null,\n" +
                    "    \"sc152\" : null,\n" +
                    "    \"sc155\" : null,\n" +
                    "    \"sc156\" : null,\n" +
                    "    \"sc157\" : null,\n" +
                    "    \"sc171\" : null,\n" +
                    "    \"sc173\" : null,\n" +
                    "    \"sc174\" : null,\n" +
                    "    \"sc175\" : null,\n" +
                    "    \"sc176\" : null,\n" +
                    "    \"sc133\" : null,\n" +
                    "    \"sc134\" : null,\n" +
                    "    \"sc135\" : null,\n" +
                    "    \"sc136\" : null,\n" +
                    "    \"sc137\" : null,\n" +
                    "    \"sc60\" : null,\n" +
                    "    \"sc61\" : null,\n" +
                    "    \"sc62\" : null,\n" +
                    "    \"sc63\" : null,\n" +
                    "    \"sc64\" : null,\n" +
                    "    \"sc65\" : null,\n" +
                    "    \"sc73\" : null,\n" +
                    "    \"sc80\" : null,\n" +
                    "    \"sc81\" : null,\n" +
                    "    \"sc82\" : null,\n" +
                    "    \"sc83\" : null,\n" +
                    "    \"sc84\" : null,\n" +
                    "    \"sc85\" : null,\n" +
                    "    \"sc86\" : null,\n" +
                    "    \"sc87\" : null,\n" +
                    "    \"sc90\" : null,\n" +
                    "    \"sc91\" : null,\n" +
                    "    \"sc92\" : null,\n" +
                    "    \"sc93\" : null,\n" +
                    "    \"sc94\" : null,\n" +
                    "    \"sc95\" : null,\n" +
                    "    \"sc96\" : null,\n" +
                    "    \"sc97\" : null,\n" +
                    "    \"sc160\" : null,\n" +
                    "    \"sc161\" : null,\n" +
                    "    \"sc162\" : null,\n" +
                    "    \"sc163\" : null,\n" +
                    "    \"sc164\" : null,\n" +
                    "    \"sc165\" : null,\n" +
                    "    \"sc166\" : null,\n" +
                    "    \"sc167\" : null,\n" +
                    "    \"sc190\" : null,\n" +
                    "    \"sc191\" : null,\n" +
                    "    \"sc192\" : null,\n" +
                    "    \"sc193\" : null,\n" +
                    "    \"sc194\" : null,\n" +
                    "    \"sc195\" : null,\n" +
                    "    \"sc196\" : null,\n" +
                    "    \"sc197\" : null,\n" +
                    "    \"sc200\" : null,\n" +
                    "    \"sc201\" : null,\n" +
                    "    \"sc202\" : null,\n" +
                    "    \"sc203\" : null,\n" +
                    "    \"sc204\" : null,\n" +
                    "    \"sc205\" : null,\n" +
                    "    \"sc206\" : null,\n" +
                    "    \"sc207\" : null,\n" +
                    "    \"sc210\" : null,\n" +
                    "    \"sc211\" : null,\n" +
                    "    \"sc212\" : null,\n" +
                    "    \"sc213\" : null,\n" +
                    "    \"sc214\" : null,\n" +
                    "    \"sc215\" : null,\n" +
                    "    \"sc216\" : null,\n" +
                    "    \"sc217\" : null,\n" +
                    "    \"sc220\" : null,\n" +
                    "    \"sc221\" : null,\n" +
                    "    \"sc222\" : null,\n" +
                    "    \"sc223\" : null,\n" +
                    "    \"sc224\" : null,\n" +
                    "    \"sc225\" : null,\n" +
                    "    \"sc226\" : null,\n" +
                    "    \"sc227\" : null,\n" +
                    "    \"sc230\" : null,\n" +
                    "    \"sc231\" : null,\n" +
                    "    \"sc232\" : null,\n" +
                    "    \"sc233\" : null,\n" +
                    "    \"sc234\" : null,\n" +
                    "    \"sc235\" : null,\n" +
                    "    \"sc236\" : null,\n" +
                    "    \"sc237\" : null\n" +
                    "  } ]";

            return jsonResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "\"Error processing request\"";
        }
    }
}
