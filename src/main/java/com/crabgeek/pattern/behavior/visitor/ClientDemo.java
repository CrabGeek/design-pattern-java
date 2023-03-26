package com.crabgeek.pattern.behavior.visitor;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @program: design-pattern-java
 * @description:
 * @author: Guipeng.Xie
 * @create: 2023-03-19 22:22
 */
public class ClientDemo {
    public static void main(String[] args) throws UnknownHostException {
        Computer computer = new Computer();
        TypeVisitor typeVisitor = new TypeVisitor();
        RunVisitor runVisitor = new RunVisitor();

        computer.accept(typeVisitor);
        System.out.println("------------------");
        computer.accept(runVisitor);

        System.out.println(InetAddress.getLocalHost().getHostAddress());
        System.out.println(InetAddress.getLocalHost());
    }
}