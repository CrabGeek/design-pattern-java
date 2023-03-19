package com.crabgeek.pattern.structual.visitor;

/**
 * @program: design-pattern-java
 * @description:
 * @author: Guipeng.Xie
 * @create: 2023-03-19 22:11
 */
public class CPU extends Hardware{

    public CPU(String type) {
        super(type);
    }

    @Override
    public void run() {
        System.out.println("型号为: " + type + " 的CPU正在运行");
    }

    @Override
    public void accept(ComputerVisitor visitor) {
        visitor.visitCPU(this);
    }
}
