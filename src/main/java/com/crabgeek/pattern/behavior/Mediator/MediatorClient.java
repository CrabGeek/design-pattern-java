package com.crabgeek.pattern.behavior.Mediator;

/**
 * @program: design-pattern-java
 * @description:
 * @author: Guipeng.Xie
 * @create: 2023-02-09 22:25
 */
public class MediatorClient {
    public static void main(String[] args) {
        MarriageAgency agency = new MarriageAgencyImpl();
        Person m1 = new Man("John", 20, 18, agency);
        Person m2 = new Man("Mike", 27, 25, agency);
        Person w1 = new Woman("Mary", 25, 27, agency);
        Person w2 = new Woman("Jane", 20, 22, agency);
        m1.findPartner();
        m2.findPartner();
    }
}