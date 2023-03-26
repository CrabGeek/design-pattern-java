package com.crabgeek.pattern.behavior.visitor;

public interface ComputerVisitor {
    void visitCPU(CPU cpu);
    void visitDisk(Disk disk);
}
