package com.crabgeek.pattern.create.abstractfactory;

public class ClientDemo {
    public static void main(String[] args) {
        ConcreteFactory1 concreteFactory1 = new ConcreteFactory1();
        ConcreteFactory2 concreteFactory2 = new ConcreteFactory2();

        ProductA a1 = concreteFactory1.factoryA();
        ProductA a2 = concreteFactory2.factoryA();

        ProductB b1 = concreteFactory1.factoryB();
        ProductB b2 = concreteFactory2.factoryB();

        a1.method1();
        a2.method1();
        b1.method1();
        b2.method1();
    }
}
