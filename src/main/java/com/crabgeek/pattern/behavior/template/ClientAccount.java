package com.crabgeek.pattern.behavior.template;

public class ClientAccount {
    public static void main(String[] args) {
        Account demandAccount = new DemandAccount();
        System.out.println("活期利息: " + demandAccount.calculateInterest());

        Account fixedAccount = new FixedAccount();
        System.out.println("定期利息: " + fixedAccount.calculateInterest());
    }
}
