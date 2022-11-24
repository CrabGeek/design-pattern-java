package com.crabgeek.principle.liskovsubstitutionprinple;

import org.junit.Test;

import java.math.BigDecimal;

public class CrashCardTest {

    @Test
    public void test1() {
        CashCard cashCard = new CashCard("621234334", "2020-10-01");
        cashCard.withdrawal("100001", new BigDecimal(100));
        cashCard.recharge("100001", new BigDecimal(100));
    }

    @Test
    public void test2() {
        CreditCard creditCard = new CreditCard("7888383", "2029-10-01");
        creditCard.loan("10001", new BigDecimal(100));
        creditCard.repayment("10001", new BigDecimal(100));
    }

    @Test
    public void test3() {
        CashCard creditCard = new CreditCard("7888383", "2029-10-01");
        creditCard.withdrawal("10001", new BigDecimal(100));
        creditCard.recharge("10001", new BigDecimal(100));
    }
}
