package com.crabgeek.pattern.behavior.visitor;

/**
 * @program: design-pattern-java
 * @description:
 * @author: Guipeng.Xie
 * @create: 2023-03-19 22:08
 */
public abstract class Hardware {
    protected String type;

    public Hardware(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract void run();

    public abstract void accept(ComputerVisitor visitor);
}
