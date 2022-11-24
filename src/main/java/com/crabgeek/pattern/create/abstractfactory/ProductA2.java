package com.crabgeek.pattern.create.abstractfactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProductA2 implements ProductA{
    @Override
    public void method1() {
        log.info("等级为2的产品A的实现方法");
    }

    @Override
    public void method2() {

    }
}
