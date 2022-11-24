package com.crabgeek.pattern.create.factory.general;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcreteProducer implements Product{

    @Override
    public void method1() {
        log.info("-----执行 method 1-----");
    }

    @Override
    public void method2() {
        log.info("----- 执行 method 2-----");
    }
}
