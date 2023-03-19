package com.crabgeek.pattern.structual.visitor;

/**
 * @program: design-pattern-java
 * @description:
 * @author: Guipeng.Xie
 * @create: 2023-03-19 22:22
 */
public class ClientDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        TypeVisitor typeVisitor = new TypeVisitor();
        RunVisitor runVisitor = new RunVisitor();

        computer.accept(typeVisitor);
        System.out.println("------------------");
        computer.accept(runVisitor);
    }
}
