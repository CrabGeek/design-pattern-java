package com.crabgeek.pattern.behavior.visitor;

/**
 * @program: design-pattern-java
 * @description:
 * @author: Guipeng.Xie
 * @create: 2023-03-19 22:22
 */
public class RunVisitor implements ComputerVisitor{
    @Override
    public void visitCPU(CPU cpu) {
        cpu.run();
    }

    @Override
    public void visitDisk(Disk disk) {
        disk.run();
    }
}
