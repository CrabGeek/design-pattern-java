package com.crabgeek.principle.opencloseprinple;

public class CalculationAreaImplExt extends CalculationAreaImpl{
    private final static  double pai = 3.141592653D;

    @Override
    public double circular(double r) {
        return pai * r * r;
    }
}
