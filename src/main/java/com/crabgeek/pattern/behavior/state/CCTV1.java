package com.crabgeek.pattern.behavior.state;

/**
 * @program: design-pattern-java
 * @description:
 * @author: Guipeng.Xie
 * @create: 2023-03-26 14:55
 */
public class CCTV1 implements Channel{
    @Override
    public void display() {
        System.out.println("CCTV1 新闻联播");
    }
}
