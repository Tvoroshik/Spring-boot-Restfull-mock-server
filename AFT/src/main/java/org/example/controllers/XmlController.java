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
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

@RestController
public class XmlController {

    private static final Logger logger = LoggerFactory.getLogger(XmlController.class);

    @Value("${app.delay.xml-controller:0}")
    private long xmlControllerDelay;

    @PostMapping(
            value = "/CS/EQ/WSAccountStatement/WSAccountStatement10",
            produces = MediaType.APPLICATION_XML_VALUE
    )
    public ResponseEntity<String> getXmlControllerResponse() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(xmlControllerDelay);
        } catch (InterruptedException e) {
            logger.warn("Задержка прервана", e);
            Thread.currentThread().interrupt();
        }

        String xmlResponse =
                "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">" +
                        "<soapenv:Body>" +
                        "<ns3:WSAccountStatementGetResponse xmlns:ns3=\"http://WSAccountStatement10.EQ.CS.ws.alfabank.ru\">" +
                        "<outParms>" +
                        "<outCommonParms>" +
                        "<outCommonParmsExt>" +
                        "<name>logUID</name>" +
                        "<value>wststint.eqws1-241120-095324-1</value>" +
                        "</outCommonParmsExt>" +
                        "</outCommonParms>" +
                        "<result>" +
                        "<sq>0</sq>" +
                        "<jn>866276</jn>" +
                        "<ean>91315810300000000028</ean>" +
                        "<ab>0000</ab>" +
                        "<an>U55372</an>" +
                        "<as>IQE</as>" +
                        "<stn>0</stn>" +
                        "<ccy>RUR</ccy>" +
                        "<cld>РОССИЙСКИЙ РУБЛ</cld>" +
                        "<sdt>2024-09-16</sdt>" +
                        "<dte>2024-11-20</dte>" +
                        "<stt>Z</stt>" +
                        "<dtp>0001-01-01</dtp>" +
                        "<enm>АО \"Фармстандарт</enm>" +
                        "<va>0</va>" +
                        "<var>0</var>" +
                        "<ia>141888103</ia>" +
                        "<iar>141888103</iar>" +
                        "<dt>0</dt>" +
                        "<dtr>0</dtr>" +
                        "<ct>141888103</ct>" +
                        "<ctr>141888103</ctr>" +
                        "<bn1>Центральный офис</bn1>" +
                        "<bn2></bn2>" +
                        "<ba1>107078, г.Москва, ул.Каланчевская,</ba1>" +
                        "<ba2>д.27</ba2>" +
                        "<ba3></ba3>" +
                        "<ba4></ba4>" +
                        "<bic>044525593</bic>" +
                        "<acc>30101810200000000593</acc>" +
                        "<cnm>АО \"ФАРМСТАНДАРТ\"</cnm>" +
                        "<inn>0274110679</inn>" +
                        "<xm></xm>" +
                        "<axs></axs>" +
                        "<aco>GD9</aco>" +
                        "<mgt>CZF2</mgt>" +
                        "<p1r>L2L</p1r>" +
                        "<dn>0</dn>" +
                        "<dnr>0</dnr>" +
                        "<cn>0</cn>" +
                        "<cnr>0</cnr>" +
                        "<dle>0001-01-01</dle>" +
                        "<is>141888103</is>" +
                        "<isr>141888103</isr>" +
                        "<ar>0</ar>" +
                        "<arr>0</arr>" +
                        "<ius>CZF2</ius>" +
                        "<rnm>РОССИЙСКИЙ РУБЛЬ</rnm>" +
                        "<nm1>АО \"ФАРМСТАНДАРТ\" Дог02NR6RBN4 от 1</nm1>" +
                        "<nm2>60924, 160924-241224</nm2>" +
                        "<nm3></nm3>" +
                        "</result>" +
                        "<resultSetCount>3</resultSetCount>" +
                        "<resultSet>" +
                        "<row>" +
                        "<sq>0</sq>" +
                        "<jn>866276</jn>" +
                        "<ab>0000</ab>" +
                        "<an>U55372</an>" +
                        "<as>IQE</as>" +
                        "<no>1240916MOCOKKQ8 00006</no>" +
                        "<dto>2024-09-16</dto>" +
                        "<dti>2024-09-16</dti>" +
                        "<sbt>C</sbt>" +
                        "<am>141888103</am>" +
                        "<amr>141888103</amr>" +
                        "<ccy>RUR</ccy>" +
                        "<cld>РОССИЙСКИЙ РУБЛ</cld>" +
                        "<acn>91319810100000000729</acn>" +
                        "<spt>1.0000000</spt>" +
                        "<tix>M2</tix>" +
                        "<nix>00094</nix>" +
                        "<teq>09</teq>" +
                        "<ne5></ne5>" +
                        "<cm1>Уменьшение лимита при выдаче по сог</cm1>" +
                        "<cm2>лашению №02NR6R от 250321, гарантия</cm2>" +
                        "<cm3>№02NR6RBN4</cm3>" +
                        "<cm4></cm4>" +
                        "<rb>02NR6RBN4</rb>" +
                        "<cmp>Уменьшение лимита при выдаче по соглашению №02NR6R от 250321, гарантия №02NR6RBN4</cmp>" +
                        "<pn>N</pn>" +
                        "<pct>N</pct>" +
                        "<pcp>N</pcp>" +
                        "<pca>Y</pca>" +
                        "<ac></ac>" +
                        "<acc></acc>" +
                        "<te2>M2</te2>" +
                        "<ne2></ne2>" +
                        "<neq>00094</neq>" +
                        "<rnm>РОССИЙСКИЙ РУБЛЬ</rnm>" +
                        "<id>0</id>" +
                        "<nos>1240916MOCOKKQ8 00005</nos>" +
                        "</row>" +
                        "</resultSet>" +
                        "</outParms>" +
                        "</ns3:WSAccountStatementGetResponse>" +
                        "</soapenv:Body>" +
                        "</soapenv:Envelope>";

        return ResponseEntity.ok(xmlResponse);
    }
}