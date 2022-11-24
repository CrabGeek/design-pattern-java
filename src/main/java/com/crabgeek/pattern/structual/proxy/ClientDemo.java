package com.crabgeek.pattern.structual.proxy;

public class ClientDemo {
    public static void main(String[] args) {
        IGamePlayer charlie = new GamePlayer("Charlie");

        GamePlayerProxy gamePlayerProxy = new GamePlayerProxy(charlie);

        gamePlayerProxy.killBoss();
        gamePlayerProxy.upGrade();
    }
}
