package com.example.webcalculator.event;

import org.springframework.context.ApplicationEvent;

public class CalculatorRegister extends ApplicationEvent {

    private double valueA;
    private double valueB;

    public CalculatorRegister(Object source, double valueA, double valueB) {
        super(source);
        this.valueA = valueA;
        this.valueB = valueB;
    }

    public double getValueA() {
        return valueA;
    }

    public double getValueB() {
        return valueB;
    }
}
