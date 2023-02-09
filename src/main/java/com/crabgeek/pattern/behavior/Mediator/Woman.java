package com.crabgeek.pattern.behavior.Mediator;

/**
 * @program: design-pattern-java
 * @description:
 * @author: Guipeng.Xie
 * @create: 2023-02-09 22:11
 */
public class Woman extends Person{
    public Woman(String name, int age, int requestAge, MarriageAgency marriageAgency) {
        super(name, age, Gender.FEMALE, requestAge, marriageAgency);
    }
}
