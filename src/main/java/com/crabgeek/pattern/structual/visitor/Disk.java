package com.crabgeek.pattern.structual.visitor;

/**
 * @program: design-pattern-java
 * @description:
 * @author: Guipeng.Xie
 * @create: 2023-03-19 22:13
 */
public class Disk extends Hardware{

    public Disk(String type) {
        super(type);
    }

    @Override
    public void run() {
        System.out.println("型号为" + type + " 的硬盘正在运行");
    }

    @Override
    public void accept(ComputerVisitor visitor) {
        visitor.visitDisk(this);
    }
}
