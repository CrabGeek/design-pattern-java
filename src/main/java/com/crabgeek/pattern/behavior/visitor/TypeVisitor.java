package com.crabgeek.pattern.behavior.visitor;

/**
 * @program: design-pattern-java
 * @description:
 * @author: Guipeng.Xie
 * @create: 2023-03-19 22:14
 */
public class TypeVisitor implements ComputerVisitor{
    @Override
    public void visitCPU(CPU cpu) {
        System.out.println("CPU 型号为: " + cpu.getType());
    }

    @Override
    public void visitDisk(Disk disk) {
        System.out.println("硬盘型号为: " + disk.getType());
    }
}
