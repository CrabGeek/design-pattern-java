package com.crabgeek.pattern.structual.flyweight;

public class Game {
    public static void main(String[] args) {
        Chesspiece p1 = ChesspieceFactory.getChesspiece("黑");

        Chesspiece p2 = ChesspieceFactory.getChesspiece("白");

        Chesspiece p3 = ChesspieceFactory.getChesspiece("黑");

        Chesspiece p4 = ChesspieceFactory.getChesspiece("白");

        p1.put(1, 1);

        p2.put(2, 2);

        p3.put(3, 3);

        p4.put(4, 4);
    }
}
