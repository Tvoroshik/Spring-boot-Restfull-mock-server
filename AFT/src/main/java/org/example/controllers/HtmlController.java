package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;

@RestController
public class HtmlController {

    private static final Logger logger = LoggerFactory.getLogger(HtmlController.class);

    @Value("${app.delay.html:0}")
    private long Html_delay;

    @PostMapping(
            value = "/signDocBase64",
            produces = MediaType.TEXT_HTML_VALUE
    )
    public String HtmlController() {
        try {
            // Простая задержка из конфигурации
            Thread.sleep(Html_delay);
        } catch (InterruptedException e) {
            logger.warn("Задержка прервана", e);
            Thread.currentThread().interrupt();
        }

        return """
                <!DOCTYPE html>
                <html lang="ru">
                <head>
                <base href="/aft-ui-internal/"/>
                <meta charSet="utf-8"/>
                <meta name="viewport" content="width=device-width, minimum-scale=1, maximum-scale=1, initial-scale=1, user-scalable=no, viewport-fit=cover"/>
                <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
                <meta http-equiv="Cache-Control" content="no-store"/>
                <meta http-equiv="Pragma" content="no-cache"/>
                <meta http-equiv="Expires" content="0"/>
                <title>??????????? ?????????? ????????</title>
                <link rel="apple-touch-icon" sizes="60x60" href="assets/static/media/apple-touch-icon-60x60.e2cf75ad.png"/>
                <link rel="apple-touch-icon" sizes="76x76" href="assets/static/media/apple-touch-icon-76x76.0bd946ad.png"/>
                <link rel="apple-touch-icon" sizes="120x120" href="assets/static/media/apple-touch-icon-120x120.4c19e3dc.png"/>
                <link rel="apple-touch-icon" sizes="152x152" href="assets/static/media/apple-touch-icon-152x152.727de2ac.png"/>
                <link rel="apple-touch-icon" sizes="180x180" href="assets/static/media/apple-touch-icon-180x180.bb4eb5e2.png"/>
                <link rel="icon" type="image/png" sizes="32x32" href="assets/static/media/favicon-32x32.acd06fd6.png"/>
                <link rel="icon" type="image/png" sizes="16x16" href="assets/static/media/favicon-16x16.31f188a6.png"/>
                <link rel="mask-icon" href="assets/static/media/safari-pinned-tab.0c02813d.svg" color="#ef3124"/>
                <link rel="shortcut icon" href="assets/static/media/favicon.1c150c4c.ico"/>
                <meta name="msapplication-config" content="assets/static/media/browserconfig.851ccf8f.xml"/>
                <meta name="application-name"/>
                <meta name="version"/>
                <link rel="stylesheet" href="assets/vendor.e2a33fd7.css"/>
                <link rel="stylesheet" href="assets/main.ae20c865.css"/>
                <link rel="stylesheet" href="assets/commonComponents.9104560e.chunk.css"/>
                <script></script>
                </head>
                <body>
                <div id="react-app">
                <div class="loader_container__ttBtK loader_absolutePosition__wtTkh">
                <svg viewBox="0 0 48 48" fill="none" xmlns="http://www.w3.org/2000/svg" class="spinner__spinner_wdzlt spinner__component_6d0oa spinner__size-48_wdzlt spinner__visible_wdzlt" data-test-id="undefined.spinner">
                <defs>
                <linearGradient id=":R16:_top" x1="0.05">
                <stop offset="0.1" stop-opacity="0" stop-color="currentColor"></stop>
                <stop offset="1" stop-opacity="0.3" stop-color="currentColor"></stop>
                </linearGradient>
                <linearGradient id=":R16:_bottom" x1="0.05">
                <stop offset="0" stop-opacity="1" stop-color="currentColor"></stop>
                <stop offset="1" stop-opacity="0.3" stop-color="currentColor"></stop>
                </linearGradient>
                </defs>
                <g stroke-width="4">
                <path stroke="url(#:R16:_top)" d="M6,24 A18,18 0 0 1 42,24"></path>
                <path stroke="url(#:R16:_bottom)" d="M42,24 A18,18 0 0 1 6,24"></path>
                <path stroke="currentColor" stroke-linecap="round" d="M6,24 A18,18 0 0 1 6 24"></path>
                </g>
                </svg>
                </div>
                </div>
                <script type="text/javascript" defer="" src="assets/vendor.b49b242d.js"></script>
                <script type="text/javascript" defer="" src="assets/main.d24eb962.js"></script>
                <script type="text/javascript" defer="" src="assets/commonComponents.8fe7ec3b.chunk.js"></script>
                <script type="text/javascript">
                (function(p, l, o, w, i, n, g) { TGnts)
                }
                ;
                p[i].q = p[i].q || [];
                n = l.createElement(o);
                g = l.getElementsByTagName(o)[0];RVBFD CCCCCCCC                platform: 'web',
                discoverRootDomain: true,
                pageUnloadTimer: 50,
                forceSecureTracker: true
    });
        sp('newTracker', 'sharedApp', 'metrics.alfabank.ru/metrica/corp', {
                appId: 'corp-shared-metrics',
                platform: 'web',
                discoverRootDomain: true,
                pageUnloadTimer: 50,
                forceSecureTracker: true
    });
        sp('setUserId', 'undefined');
        sp('trackPageView:mainApp', null, [{
                schema: 'iglu:com.alfabank/custom_dimension/jsonschema/1-0-0',
                data: {
            2: false,
                    3: 'undefined',
        },
    }, ]);
</script>
                <script type="text/javascript">
                document.addEventListener('DOMContentLoaded', function() {
            window.__main({
                    "app": {
                "contextRoot": "/aft-ui-internal",
                        "alfaMetricsId": "aft-ui-internal_int",
                        "useMocks": false,
                        "sentryDsn": "",
                        "appType": "internal"
            }
        });
        });
</script>
                </body>
                </html>
        """;
    }
}
