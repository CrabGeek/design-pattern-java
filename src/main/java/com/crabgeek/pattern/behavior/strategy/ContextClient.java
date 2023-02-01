package com.crabgeek.pattern.behavior.strategy;

public class ContextClient {
    private DiscountStrategy ds;

    public ContextClient(DiscountStrategy ds) {
        this.ds = ds;
    }

    public double contextCalDisc() {
        return ds.calculateDiscount();
    }

    public static void main(String[] args) {
        ContextClient contextClient = new ContextClient(new NoDiscountStrategy(48.5, 20));
        System.out.println(contextClient.contextCalDisc());

        ContextClient contextClient1 = new ContextClient(new FixDiscountStrategy(46, 60));
        System.out.println(contextClient1.contextCalDisc());

        ContextClient contextClient2 = new ContextClient(new PercentagetDiscountStrategy(38, 40));
        System.out.println(contextClient2.contextCalDisc());
    }
}
