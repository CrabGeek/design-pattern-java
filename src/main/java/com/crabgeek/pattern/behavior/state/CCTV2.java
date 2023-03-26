package com.crabgeek.pattern.behavior.state;

/**
 * @program: design-pattern-java
 * @description:
 * @author: Guipeng.Xie
 * @create: 2023-03-26 14:59
 */
public class CCTV2 implements Channel{
    @Override
    public void display() {
        System.out.println("CCTV2 经济半小时");
    }
}
