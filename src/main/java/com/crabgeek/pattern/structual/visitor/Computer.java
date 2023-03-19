package com.crabgeek.pattern.structual.visitor;

/**
 * @program: design-pattern-java
 * @description:
 * @author: Guipeng.Xie
 * @create: 2023-03-19 22:20
 */
public class Computer {
    private Hardware cpu;
    private Hardware disk;

    public Computer() {
        this.cpu = new CPU("Intel Core i7-620");
        this.disk = new Disk("Seagate 500G 7200转");
    }

    public void accept (ComputerVisitor visitor) {
        cpu.accept(visitor);
        disk.accept(visitor);
    }
}
