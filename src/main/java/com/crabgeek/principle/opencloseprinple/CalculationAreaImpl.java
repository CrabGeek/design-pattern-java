package com.crabgeek.principle.opencloseprinple;

public class CalculationAreaImpl implements ICalculationArea{
    private final static double pai = 3.14D;

    @Override
    public double rectangle(double x, double y) {
        return x * y;
    }

    @Override
    public double triangle(double x, double y, double z) {
        double p = (x + y + z) / 2;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }

    @Override
    public double circular(double r) {
        return pai * r * r;
    }
}
