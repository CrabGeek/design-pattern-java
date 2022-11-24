package com.crabgeek.pattern.create.abstractfactory;

public class ConcreteFactory1 implements AbstractFactory{

    @Override
    public ProductA factoryA() {
        return new ProductA1();
    }

    @Override
    public ProductB factoryB() {
        return new ProductB1();
    }
}
