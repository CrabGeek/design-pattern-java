package com.crabgeek.pattern.create.factory.example;

public class AppleFruitGardener implements FruitGardener{
    @Override
    public Fruit factory() {
        return new Apple();
    }
}
