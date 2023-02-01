package com.crabgeek.pattern.behavior.strategy;

public abstract class DiscountStrategy {
    private double price = 0;
    private int number = 0;

    public DiscountStrategy(double price, int number) {
        this.price = price;
        this.number = number;
    }

    public double getPrice() {
        return this.price;
    }

    public int getNumber() {
        return this.number;
    }

    public abstract double calculateDiscount();
}
