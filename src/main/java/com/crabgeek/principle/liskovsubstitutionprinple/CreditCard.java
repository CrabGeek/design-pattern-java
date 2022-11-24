package com.crabgeek.principle.liskovsubstitutionprinple;

import com.sun.org.slf4j.internal.LoggerFactory;
import lombok.extern.slf4j.Slf4j;
import com.sun.org.slf4j.internal.Logger;

import java.math.BigDecimal;

@Slf4j
public class CreditCard extends CashCard{
    private Logger logger = LoggerFactory.getLogger(CreditCard.class);

    public CreditCard(String cardNo, String cardDate) {
        super(cardNo, cardDate);
    }

    boolean rule2(BigDecimal amount) {
        return amount.compareTo(new BigDecimal(1000)) <= 0;
    }

    public String loan(String orderId, BigDecimal amount) {
        boolean rule2 = rule2(amount);
        if (!rule2) {
            System.out.println(String.format("生成订单失败，金额超限, 单号{} 金额{} ", orderId, amount));
            return "0001";
        }
        System.out.println(String.format("生成贷款单, 单号%s 金额%f", orderId, amount));
        System.out.println(String.format("贷款成功，单号%s 金额%f", orderId, amount));

        return super.negative(orderId, amount);
    }

    public String repayment(String orderId, BigDecimal amount) {
        System.out.println(String.format("生成还款单, 单号%s 金额%f", orderId, amount));
        System.out.println(String.format("还款成功, 单号: %s 金额 %f", orderId, amount));
        return super.positive(orderId, amount);
    }
}
