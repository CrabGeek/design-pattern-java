package com.crabgeek.pattern.behavior.chain;

public class PlayerB extends Player{

    public PlayerB(Player successor) {
        this.setSuccessor(successor);
    }

    @Override
    public void handle(int i) {
        if (i == 2) {
            System.out.println("PlayerB 喝酒");
        } else {
            System.out.println("PlayerB 把花传下");
            next(i);
        }
    }
}
