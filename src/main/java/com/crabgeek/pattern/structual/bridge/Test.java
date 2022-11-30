package com.crabgeek.pattern.structual.bridge;

public class Test {
    public static void main(String[] args) {
        Color color = new Green();
        AbstractShape square = new Square(color);
        square.draw();
    }
}
