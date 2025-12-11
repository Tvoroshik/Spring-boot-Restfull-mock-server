package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;

@RestController
public class WSSettlementController {

    private static final Logger logger = LoggerFactory.getLogger(WSSettlementController.class);

    @Value("${app.delay.ws-settlement:0}")
    private long wsSettlementDelay;

    @PostMapping(
            value = "/CS/EQ/WSSettlementDocumentInfo/WSSettlementDocumentInfo10",
            produces = MediaType.APPLICATION_XML_VALUE
    )
    public ResponseEntity<String> getWSSettlementResponse() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(wsSettlementDelay);
        } catch (InterruptedException e) {
            logger.warn("Задержка прервана", e);
            Thread.currentThread().interrupt();
        }

        String xmlResponse = """
                "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">" +
                        "<soapenv:Body>" +
                        "<ns3:WSSettlementDocumentInfoGetResponse xmlns:ns3=\"http://WSSettlementDocumentInfo10.EQ.CS.ws.alfabank.ru\">" +
                        "<response>" +
                        "<outCommonParms>" +
                        "<outCommonParmsExt>" +
                        "<name>logUID</name>" +
                        "<value>wststint.eqws3-241120-095550-2</value>" +
                        "</outCommonParmsExt>" +
                        "</outCommonParms>" +
                        "<outParms>" +
                        "<data><![CDATA[<?xml version="1.0" encoding="windows-1251"?><WSSettlementNotificationT1 xmlns="ss:es:v1.0" ESFrom="SS" ESTo="RK" ESNo="1132" ESDate="2024-11-20" ESCreationTime="09:55:50"> <ssNotice type="1" DocID="02NR6RBN4" DocType="01RUR10" DocStatus="G24"/> <ssDocDetails rDCC="PM" rWRF="Y" rBRM="MOCO" rBRU="MOCO" rBRR="MOCO" rMIN="MC" r100="01" r105="RUR" r201="1132" r301="2024-09-06" r302="2024-09-06" r303="2024-09-06" r311="2024-09-16" r312="2024-09-06" r320="3576703" r502="40702810600000021987" r50A="ООО &quot;Центр Терапии Боли &quot;ФАРМАТЕБ&quot;" r500="7707501332" r505="772801001" r531="30102810300000000593" r53A="ГУ БАНКА РОССИИ ПО ЦФОг Москва 35" r537="044525308" r538="30101810245250000308" r53C="ООО &quot;Инбанк&quot; г Москва" r592="47501810500000000165" r59A="АО &quot;Альфа-Банк&quot;" r590="7728168971" r596="770801001" r557="044525593" r558="30101810200000000593" r55A="АО &quot;АЛЬФА-БАНК&quot; г Москва" r78Y="ООО &quot;Инбанк&quot; г Москва" r700="Оплата по счету № 0RGI1X от 06.09.2024 вознаграждения по Договору о предоставлении банковской гарантии № 0RGI1X от 06.09.2024 Сумма 35767-03 Без налога (НДС)" r702="5" r710="SHA" r730="00" r731="00" r801="CRED" rAC1="47501810500000000165" rDT1="2024-09-06" rDT2="2024-09-06" rID1="OP1E" rID2="Z2CT" rKVO="00000" rMFO="0" rNM1="АО &quot;АЛЬФА-БАНК&quot;" rRDI="RKCMOS810N" rSPI="47501810500000000165" rTM1="17:04:22" rTM2="21:39:05"/></WSSettlementNotificationT1>]]></data>" +
                        "</outParms>" +
                        "</response>" +
                        "</ns3:WSSettlementDocumentInfoGetResponse>" +
                        "</soapenv:Body>" +
                "</soapenv:Envelope>"\s
                """;

        return ResponseEntity.ok(xmlResponse);
    }
}
