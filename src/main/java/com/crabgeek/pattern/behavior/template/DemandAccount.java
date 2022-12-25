package com.crabgeek.pattern.behavior.template;

// 具体模版类，活期账号
public class DemandAccount extends Account{
    @Override
    protected String getAccountType() {
        return "活期";
    }

    @Override
    protected double getInterestRate() {
        return 0.005D;
    }
}
