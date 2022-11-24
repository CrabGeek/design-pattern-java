package com.crabgeek.pattern.create.abstractfactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProductB1 implements ProductB{
    @Override
    public void method1() {
        log.info("等级为1的产品B的实现方法");
    }

    @Override
    public void method2() {

    }
}
