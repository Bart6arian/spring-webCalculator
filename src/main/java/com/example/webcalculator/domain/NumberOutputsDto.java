package com.example.webcalculator.domain;

public class NumberOutputsDto {

    private double valueA;
    private double valueB;

    public NumberOutputsDto(double valueA, double valueB) {
        this.valueA = valueA;
        this.valueB = valueB;
    }

    public double getValueA() {
        return valueA;
    }

    public double getValueB() {
        return valueB;
    }

    public double multi() {
        return getValueA() * getValueB();
    }

    public double divide() {
        return getValueA() / getValueB();
    }

    public double add() {
        return getValueA() + getValueB();
    }

    public double subtract() {
        return getValueA() - getValueB();
    }

    /*public double power() {
        if(getValueB() == 0) {
            return 1;
        } else
            return (getValueA() * power(getValueA(), getValueB()-1));
    }
    */
}
