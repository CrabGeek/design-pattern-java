package com.crabgeek.pattern.behavior.Mediator;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @program: design-pattern-java
 * @description:
 * @author: Guipeng.Xie
 * @create: 2023-02-09 22:01
 */
@Getter
public abstract class Person {
    private String name;
    private int age;
    private Gender gender;
    private int requestAge;
    private MarriageAgency marriageAgency;

    public Person(String name, int age, Gender gender, int requestAge, MarriageAgency marriageAgency) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.requestAge = requestAge;
        this.marriageAgency = marriageAgency;
        this.marriageAgency.register(this);
    }

    public void findPartner() {
        this.marriageAgency.pair(this);
    }

    enum Gender {
        MALE, FEMALE;
    }
}
