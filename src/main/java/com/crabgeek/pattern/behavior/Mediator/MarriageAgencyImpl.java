package com.crabgeek.pattern.behavior.Mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * @program: design-pattern-java
 * @description:
 * @author: Guipeng.Xie
 * @create: 2023-02-09 22:09
 */
public class MarriageAgencyImpl implements MarriageAgency{

    private List<Man> men = new ArrayList<>();
    private List<Woman> women = new ArrayList<>();

    @Override
    public void pair(Person person) {


        if (person.getGender().equals(Person.Gender.MALE)) {
            Woman woman = women.stream()
                    .filter(women -> women.getAge() == person.getAge())
                    .findAny()
                    .orElse(null);
            if (Objects.nonNull(woman)) {
                System.out.println(person.getName() + " 和 " + woman.getName() + " 配对成功");
                return;
            }
        } else if (person.getGender().equals(Person.Gender.FEMALE)) {
            Man man = men.stream()
                    .filter(men -> men.getAge() == person.getAge())
                    .findAny()
                    .orElse(null);
            if (Objects.nonNull(man)) {
                System.out.println(person.getName() + " 和 " + man.getName() + " 配对成功");
                return;
            }
        }
        System.out.println("没有为" + person.getName() + "找到合适的对象");
    }

    @Override
    public void register(Person person) {
        if (person.getGender().equals(Person.Gender.MALE)) {
            this.men.add((Man) person);
        } else {
            this.women.add((Woman) person);
        }
    }
}
