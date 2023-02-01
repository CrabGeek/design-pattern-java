package com.crabgeek.pattern.behavior.strategy;

public class FixDiscountStrategy extends DiscountStrategy{

    public FixDiscountStrategy(double price, int number) {
        super(price, number);
    }

    @Override
    public double calculateDiscount() {
        return getNumber() * 1;
    }
}
