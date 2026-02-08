package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignDoc64Controller {

    private static final Logger logger = LoggerFactory.getLogger(SignDoc64Controller.class);

    // Читаем значение задержки из application.properties
    @Value("${app.delay_SignDoc64:0}")
    private long delay_SignDoc64;

    @PostMapping(
            value = "/signDocBase64",
            produces = MediaType.TEXT_HTML_VALUE  // Указываем, что ответ — HTML
    )
    public String SignDoc64() {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(delay_SignDoc64);

            // HTML-ответ (ваш шаблон)
            String htmlResponse = "<!DOCTYPE html>\n" +
                    "<html lang=\"ru\">\n" +
                    "    <head>\n" +
                    "        <base href=\"/aft-ui-internal/\"/>\n" +
                    "        <meta charSet=\"utf-8\"/>\n" +
                    "        <meta name=\"viewport\" content=\"width=device-width, minimum-scale=1, maximum-scale=1, initial-scale=1, user-scalable=no, viewport-fit=cover\"/>\n" +
                    "        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"/>\n" +
                    "        <meta http-equiv=\"Cache-Control\" content=\"no-store\"/>\n" +
                    "        <meta http-equiv=\"Pragma\" content=\"no-cache\"/>\n" +
                    "        <meta http-equiv=\"Expires\" content=\"0\"/>\n" +
                    "        <title>??????????? ?????????? ????????</title>\n" +
                    "        <link rel=\"apple-touch-icon\" sizes=\"60x60\" href=\"assets/static/media/apple-touch-icon-60x60.e2cf75ad.png\"/>\n" +
                    "        <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"assets/static/media/apple-touch-icon-76x76.0bd946ad.png\"/>\n" +
                    "        <link rel=\"apple-touch-icon\" sizes=\"120x120\" href=\"assets/static/media/apple-touch-icon-120x120.4c19e3dc.png\"/>\n" +
                    "        <link rel=\"apple-touch-icon\" sizes=\"152x152\" href=\"assets/static/media/apple-touch-icon-152x152.727de2ac.png\"/>\n" +
                    "        <link rel=\"apple-touch-icon\" sizes=\"180x180\" href=\"assets/static/media/apple-touch-icon-180x180.bb4eb5e2.png\"/>\n" +
                    "        <link rel=\"icon\" type=\"image/png\" sizes=\"32x32\" href=\"assets/static/media/favicon-32x32.acd06fd6.png\"/>\n" +
                    "        <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"assets/static/media/favicon-16x16.31f188a6.png\"/>\n" +
                    "        <link rel=\"mask-icon\" href=\"assets/static/media/safari-pinned-tab.0c02813d.svg\" color=\"#ef3124\"/>\n" +
                    "        <link rel=\"shortcut icon\" href=\"assets/static/media/favicon.1c150c4c.ico\"/>\n" +
                    "        <meta name=\"msapplication-config\" content=\"assets/static/media/browserconfig.851ccf8f.xml\"/>\n" +
                    "        <meta name=\"application-name\"/>\n" +
                    "        <meta name=\"version\"/>\n" +
                    "        <link rel=\"stylesheet\" href=\"assets/vendor.e2a33fd7.css\"/>\n" +
                    "        <link rel=\"stylesheet\" href=\"assets/main.ae20c865.css\"/>\n" +
                    "        <link rel=\"stylesheet\" href=\"assets/commonComponents.9104560e.chunk.css\"/>\n" +
                    "        <script></script>\n" +
                    "    </head>\n" +
                    "    <body>\n" +
                    "        <div id=\"react-app\">\n" +
                    "            <div class=\"loader_container__ttBtK loader_absolutePosition__wtTkh\">\n" +
                    "                <svg viewBox=\"0 0 48 48\" fill=\"none\" xmlns=\"http://www.w3.org/2000/svg\" class=\"spinner__spinner_wdzlt spinner__component_6d0oa spinner__size-48_wdzlt spinner__visible_wdzlt\" data-test-id=\"undefined.spinner\">\n" +
                    "                    <defs>\n" +
                    "                        <linearGradient id=\":R16:_top\" x1=\"0.05\">\n" +
                    "                            <stop offset=\"0.1\" stop-opacity=\"0\" stop-color=\"currentColor\"></stop>\n" +
                    "                            <stop offset=\"1\" stop-opacity=\"0.3\" stop-color=\"currentColor\"></stop>\n" +
                    "                        </linearGradient>\n" +
                    "                        <linearGradient id=\":R16:_bottom\" x1=\"0.05\">\n" +
                    "                            <stop offset=\"0\" stop-opacity=\"1\" stop-color=\"currentColor\"></stop>\n" +
                    "                            <stop offset=\"1\" stop-opacity=\"0.3\" stop-color=\"currentColor\"></stop>\n" +
                    "                        </linearGradient>\n" +
                    "                    </defs>\n" +
                    "                    <g stroke-width=\"4\">\n" +
                    "                        <path stroke=\"url(#:R16:_top)\" d=\"M6,24 A18,18 0 0 1 42,24\"></path>\n" +
                    "                        <path stroke=\"url(#:R16:_bottom)\" d=\"M42,24 A18,18 0 0 1 6,24\"></path>\n" +
                    "                        <path stroke=\"currentColor\" stroke-linecap=\"round\" d=\"M6,24 A18,18 0 0 1 6 24\"></path>\n" +
                    "                    </g>\n" +
                    "                </svg>\n" +
                    "            </div>\n" +
                    "        </div>\n" +
                    "        <script type=\"text/javascript\" defer=\"\" src=\"assets/vendor.b49b242d.js\"></script>\n" +
                    "        <script type=\"text/javascript\" defer=\"\" src=\"assets/main.d24eb962.js\"></script>\n" +
                    "        <script type=\"text/javascript\" defer=\"\" src=\"assets/commonComponents.8fe7ec3b.chunk.js\"></script>\n" +
                    "        <script type=\"text/javascript\">\n" +
                    "            (function(p, l, o, w, i, n, g) {\n" +
                    "                if (!p[i]) {\n" +
                    "                    p.GlobalSnowplowNamespace = p.GlobalSnowplowNamespace || [];\n" +
                    "                    p.GlobalSnowplowNamespace.push(i);\n" +
                    "                    p[i] = function() {\n" +
                    "                        (p[i].q = p[i].q || []).push(arguments)\n" +
                    "                    }\n" +
                    "                    ;\n" +
                    "                    p[i].q = p[i].q || [];\n" +
                    "                    n = l.createElement(o);\n" +
                    "                    g = l.getElementsByTagName(o)[0];\n" +
                    "                    n.async = 1;\n" +
                    "                    n.src = w;\n" +
                    "                    g.parentNode.insertBefore(n, g)\n" +
                    "                }\n" +
                    "            }(window, document, 'script', 'https://metrics.alfabank.ru/metrica/sp.js', 'sp'));\n" +
                    "            sp('newTracker', 'mainApp', 'metrics.alfabank.ru/metrica/corp', {\n" +
                    "                appId: 'aft-ui-internal_int',\n" +
                    "                platform: 'web',\n" +
                    "                discoverRootDomain: true,\n" +
                    "                pageUnloadTimer: 50,\n" +
                    "                forceSecureTracker: true\n" +
                    "            });\n" +
                    "            sp('newTracker', 'sharedApp', 'metrics.alfabank.ru/metrica/corp', {\n" +
                    "                appId: 'corp-shared-metrics',\n" +
                    "                platform: 'web',\n" +
                    "                discoverRootDomain: true,\n" +
                    "                pageUnloadTimer: 50,\n" +
                    "                forceSecureTracker: true\n" +
                    "            });\n" +
                    "            sp('setUserId', 'undefined');\n" +
                    "            sp('trackPageView:mainApp', null, [{\n" +
                    "                schema: 'iglu:com.alfabank/custom_dimension/jsonschema/1-0-0',\n" +
                    "                data: {\n" +
                    "                    2: false,\n" +
                    "                    3: 'undefined',\n" +
                    "                },\n" +
                    "            }, ]);\n" +
                    "        </script>\n" +
                    "        <script type=\"text/javascript\">\n" +
                    "            document.addEventListener('DOMContentLoaded', function() {\n" +
                    "                window.__main({\n" +
                    "                    \"app\": {\n" +
                    "                        \"contextRoot\": \"/aft-ui-internal\",\n" +
                    "                        \"alfaMetricsId\": \"aft-ui-internal_int\",\n" +
                    "                        \"useMocks\": false,\n" +
                    "                        \"sentryDsn\": \"\",\n" +
                    "                        \"appType\": \"internal\"\n" +
                    "                    }\n" +
                    "                });\n" +
                    "            });\n" +
                    "        </script>\n" +
                    "    </body>\n" +
                    "</html>";

            return htmlResponse;

        } catch (InterruptedException e) {
            logger.error("Error processing request", e);
            Thread.currentThread().interrupt();
            return "<!DOCTYPE html><html><body><h1>Error processing request</h1></body></html>";
        }
    }
}
