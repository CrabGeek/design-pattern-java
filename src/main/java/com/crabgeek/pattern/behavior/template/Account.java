package com.crabgeek.pattern.behavior.template;

public abstract class Account {
    private String accountNumber;

    public Account() {
        this.accountNumber = null;
    }

    public Account(String number) {
        this.accountNumber = number;
    }

    protected abstract String getAccountType();

    protected abstract double getInterestRate();

    public double calculateAmount(String accountType, String accountNumber) {
        return 4567.00D;
    }

    public double calculateInterest() {
        String accountType = getAccountType();
        double interestRate = getInterestRate();
        double amount = calculateAmount(accountType, accountNumber);
        return amount * interestRate;
    }
}
