package com.crabgeek.pattern.structual.proxy;

import java.util.Date;

public class GamePlayerProxy implements IGamePlayer{

    private IGamePlayer player = null;

    public GamePlayerProxy(IGamePlayer player) {
        this.player = player;
    }

    @Override
    public void killBoss() {
        this.log();
        player.killBoss();
    }

    @Override
    public void upGrade() {
        this.count();
        player.upGrade();
    }

    private void log() {
        System.out.println("打怪时间 " + new Date().toString());
    }

    private void count() {
        System.out.println("升1级耗费50小时");
    }
}
