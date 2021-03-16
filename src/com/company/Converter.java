package com.company;

@FunctionalInterface
public interface Converter {

    double convert(double moneyAmount, double ratio);
}
