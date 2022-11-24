package com.crabgeek.pattern.structual.decorator;

public class ClientDemo {
    public static void main(String[] args) {
        Car benz = new Benz();
        ConcreteCarDecorator carDecorator = new ConcreteCarDecorator(benz);

        carDecorator.show();
    }
}
