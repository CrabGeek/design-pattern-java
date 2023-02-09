package com.crabgeek.pattern.behavior.Mediator;

/**
 * @program: design-pattern-java
 * @description:
 * @author: Guipeng.Xie
 * @create: 2023-02-09 22:09
 */
public class Man extends Person{
    public Man(String name, int age, int requestAge, MarriageAgency marriageAgency) {
        super(name, age, Gender.MALE, requestAge, marriageAgency);
    }
}
