package com.crabgeek.pattern.create.abstractfactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProductA1 implements ProductA{
    @Override
    public void method1() {
        log.info("等级为1的产品A的实现方法");
    }

    @Override
    public void method2() {

    }
}
