package com.crabgeek.pattern.create.Builder;

public class ComputerTest {
    public static void main(String[] args) {
        ComputerDirector computerDirector = new ComputerDirector();
        T410 t410 = computerDirector.constructT410();
        System.out.println(t410);

        X201 x201 = computerDirector.constructX201();
        System.out.println(x201);
    }
}
