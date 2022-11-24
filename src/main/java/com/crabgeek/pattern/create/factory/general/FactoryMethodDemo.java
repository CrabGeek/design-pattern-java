package com.crabgeek.pattern.create.factory.general;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        ConcreteCreator creator = new ConcreteCreator();
        Product product = creator.factory(ConcreteProducer.class);
        product.method1();
        product.method2();
    }
}
