package com.crabgeek.pattern.behavior.chain;

public abstract class Player {
    private Player successor;

    public abstract void handle(int i);

    protected void setSuccessor(Player aSuccessor) {
        this.successor = aSuccessor;
    }

    public void next(int index) {
        if (successor != null) {
            this.successor.handle(index);
        } else {
            System.out.println("游戏结束");
        }
    }
}
