package com.crabgeek.pattern.behavior.strategy;

public class PercentagetDiscountStrategy extends DiscountStrategy{

    public PercentagetDiscountStrategy(double price, int number) {
        super(price, number);
    }

    @Override
    public double calculateDiscount() {
        return getNumber() * getPrice() * 0.15;
    }
}
