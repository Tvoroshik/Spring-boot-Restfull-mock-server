package org.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CreditHistoryController {

    private static final Logger log = LoggerFactory.getLogger(CreditHistoryController.class);

    @Value("${app.delay.credit_history:0}")
    private long credit_history_delay;

    @GetMapping("/wsmb/getCreditHistory")
    public Object getCreditHistory(@RequestParam String pinEq) {
        try {
            // Добавляем задержку (в миллисекундах)
            Thread.sleep(credit_history_delay);
            // Создаем основной ответ
            Map<String, Object> response = new HashMap<>();

            // Создаем вложенный объект response
            Map<String, Object> innerResponse = new HashMap<>();

            // Заполняем числовые значения
            innerResponse.put("number_ac", 2);
            innerResponse.put("number_cc", 0);
            innerResponse.put("acc_num", 2);
            innerResponse.put("dlq_num", 0);

            // Создаем список accounts
            List<Map<String, Object>> accounts = new ArrayList<>();

            // Первый аккаунт
            Map<String, Object> account1 = new HashMap<>();
            account1.put("acc_id", "14NO5X");
            account1.put("acc_num_of_tranches", 0);
            account1.put("acc_rko_number", "");
            account1.put("acc_prod_code", "GuaranteeEBG_EBGExecution_NoFP");
            account1.put("acc_prod_block", "DealBusinessBlock_BlockMB");
            account1.put("acc_credit_type", "GUARANTEE");
            account1.put("acc_start_date", "2025-06-05");
            account1.put("acc_end_date", "2026-01-22");
            account1.put("acc_actual_end_date", "1900-01-01");
            account1.put("acc_last_lim_change_date", "1900-01-01");
            account1.put("acc_status", "A");
            account1.put("acc_currency", "RUR");
            account1.put("acc_authorization_date_limit_rur", 89702.25);
            account1.put("acc_limit_rur", 89702.25);
            account1.put("acc_apr", 0);
            account1.put("acc_payments_type", "PeriodType_End");
            account1.put("acc_monthly_paym_rur", 0);
            account1.put("acc_outstanding_sum_rur", 0);
            account1.put("acc_available_balance_rur", 89702.25);
            account1.put("acc_cur_dlq_status", "N");
            account1.put("acc_cur_dlq_start_date", "1900-01-01");
            account1.put("acc_cur_dlq_sum_od_rur", 0);
            account1.put("acc_cur_dlq_sum_prcnt", 0);
            account1.put("acc_restruct_flag", "N");
            account1.put("acc_refinance_flag", "N");
            account1.put("spare_num_1", 0);
            account1.put("spare_num_2", 0);
            account1.put("spare_num_3", 0);
            account1.put("spare_num_4", 0);
            account1.put("spare_num_5", 0);

// Второй аккаунт
            Map<String, Object> account2 = new HashMap<>();
            account2.put("acc_id", "14P54X");
            account2.put("acc_num_of_tranches", 0);
            account2.put("acc_rko_number", "");
            account2.put("acc_prod_code", "GuaranteeEBG_EBGTender_NoFP");
            account2.put("acc_prod_block", "DealBusinessBlock_BlockMB");
            account2.put("acc_credit_type", "GUARANTEE");
            account2.put("acc_start_date", "2025-06-06");
            account2.put("acc_end_date", "2026-02-22");
            account2.put("acc_actual_end_date", "1900-01-01");
            account2.put("acc_last_lim_change_date", "1900-01-01");
            account2.put("acc_status", "A");
            account2.put("acc_currency", "RUR");
            account2.put("acc_authorization_date_limit_rur", 357671.71);
            account2.put("acc_limit_rur", 357671.71);
            account2.put("acc_apr", 0);
            account2.put("acc_payments_type", "PeriodType_End");
            account2.put("acc_monthly_paym_rur", 0);
            account2.put("acc_outstanding_sum_rur", 0);
            account2.put("acc_available_balance_rur", 357671.71);
            account2.put("acc_cur_dlq_status", "N");
            account2.put("acc_cur_dlq_start_date", "1900-01-01");
            account2.put("acc_cur_dlq_sum_od_rur", 0);
            account2.put("acc_cur_dlq_sum_prcnt", 0);
            account2.put("acc_restruct_flag", "N");
            account2.put("acc_refinance_flag", "N");
            account2.put("spare_num_1", 0);
            account2.put("spare_num_2", 0);
            account2.put("spare_num_3", 0);
            account2.put("spare_num_4", 0);
            account2.put("spare_num_5", 0);

// Добавляем аккаунты в список
            accounts.add(account1);
            accounts.add(account2);

// Добавляем список аккаунтов во внутренний ответ
            innerResponse.put("accounts", accounts);

// Добавляем внутренний ответ в основной
            response.put("response", innerResponse);

            log.info("Получен запрос с параметром pinEq: {}", pinEq);
            return response;
        } catch (Exception e) {
            log.error("Ошибка обработки запроса для pinEq: {}", pinEq, e);
            return Map.of("error", "Произошла ошибка при обработке запроса");
        }
    }
}