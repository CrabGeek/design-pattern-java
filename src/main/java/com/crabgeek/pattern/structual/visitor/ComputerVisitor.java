package com.crabgeek.pattern.structual.visitor;

public interface ComputerVisitor {
    void visitCPU(CPU cpu);
    void visitDisk(Disk disk);
}
