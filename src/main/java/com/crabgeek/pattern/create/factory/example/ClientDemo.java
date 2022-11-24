package com.crabgeek.pattern.create.factory.example;

public class ClientDemo {
    public static void main(String[] args) {

        FruitGardener appleFruitGardener = new AppleFruitGardener();
        Fruit apple = appleFruitGardener.factory();
        apple.plant();
        apple.grow();
        apple.harvest();

        GrapeFruitGardener grapeFruitGardener = new GrapeFruitGardener();
        Fruit grape = grapeFruitGardener.factory();
        grape.plant();
        grape.grow();
        grape.harvest();
    }
}
