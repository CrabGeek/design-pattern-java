package com.crabgeek.principle.liskovsubstitutionprinple;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class CashCard extends BankCard{

    private Logger logger = LoggerFactory.getLogger(CashCard.class);

    public CashCard(String cardNo, String cardDate) {
        super(cardNo, cardDate);
    }

    @Override
    boolean rule(BigDecimal amount) {
        return true;
    }

    public String withdrawal(String orderId, BigDecimal amount) {
        System.out.println(String.format("提现成功, 单号%s 金额%f", orderId, amount));
        return super.negative(orderId, amount);
    }

    public String recharge(String orderId, BigDecimal amount) {
        System.out.println(String.format("储蓄成功，单号%s 金额%f", orderId, amount));
        return super.positive(orderId, amount);
    }

    public boolean checkRisk(String cardNo, String orderId, BigDecimal amount) {
        System.out.println(String.format("风控校验, 卡号%s 单号%s 金额%f", cardNo, orderId, amount));
        return true;
    }
}
