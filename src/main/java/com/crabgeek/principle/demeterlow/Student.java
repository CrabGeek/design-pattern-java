package com.crabgeek.principle.demeterlow;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Student {
    private String name;
    private int rank;
    private double grade;
}
