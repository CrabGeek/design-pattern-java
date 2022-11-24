package com.crabgeek.pattern.create.abstractfactory;

public interface AbstractFactory {
    // 创建产品A
    ProductA factoryA();

    // 创建产品B
    ProductB factoryB();
}
