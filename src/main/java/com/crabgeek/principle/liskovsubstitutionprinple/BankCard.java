package com.crabgeek.principle.liskovsubstitutionprinple;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public abstract class BankCard {
    private Logger logger = LoggerFactory.getLogger(BankCard.class);
    private String cardNo;
    private String cardDate;

    public BankCard(String cardNo, String cardDate) {
        this.cardNo = cardNo;
        this.cardDate = cardDate;
    }

    abstract boolean rule(BigDecimal amount);

    public String positive(String orderId, BigDecimal amount) {
        System.out.println(String.format("卡号%s 入款成功, 单号: %s 金额 %f", cardNo, orderId, amount));
        return "0000";
    }

    public String negative(String orderId, BigDecimal amount) {
        System.out.println(String.format("卡号%s 出款成功, 单号: %s 金额 %f", cardNo, orderId, amount));
        return "0000";
    }

    public List<String> tradeFlow() {
        System.out.println("交易流水查询成功");
        List<String> tradeList = new ArrayList<>();
        tradeList.add("100001, 100.00");
        tradeList.add("100001, 89.10");
        tradeList.add("100001, 120.30");
        return tradeList;
    }

    public String getCardNo() {
        return cardNo;
    }

    public String getCardDate() {
        return cardDate;
    }
}
