package com.crabgeek.pattern.chain;

public class PlayerA extends Player{

    public PlayerA(Player successor) {
        this.setSuccessor(successor);
    }

    @Override
    public void handle(int i) {
        if (i == 1) {
            System.out.println("PlayerA 喝酒");
        } else {
            System.out.println("PlayerA 把花传下");
            next(i);
        }
    }
}
