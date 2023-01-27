package com.crabgeek.pattern.chain;

public class DrumBeater {
    public static void main(String[] args) {
        Player player = new PlayerA(new PlayerB(new PlayerC(new PlayerD(null))));
        player.handle(3);
    }
}
