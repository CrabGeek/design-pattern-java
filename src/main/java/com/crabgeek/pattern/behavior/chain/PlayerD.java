package com.crabgeek.pattern.behavior.chain;

public class PlayerD extends Player{

    public PlayerD(Player successor) {
        this.setSuccessor(successor);
    }

    @Override
    public void handle(int i) {
        if (i == 4) {
            System.out.println("PlayerD 喝酒");
        } else {
            System.out.println("PlayerD 把花传下");
            next(i);
        }
    }
}
