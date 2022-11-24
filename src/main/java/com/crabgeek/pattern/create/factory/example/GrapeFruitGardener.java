package com.crabgeek.pattern.create.factory.example;

public class GrapeFruitGardener implements FruitGardener{
    @Override
    public Fruit factory() {
        return new Grape();
    }
}
