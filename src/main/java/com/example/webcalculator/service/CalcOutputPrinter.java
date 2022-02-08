package com.example.webcalculator.service;

import com.example.webcalculator.event.CalculatorRegister;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CalcOutputPrinter implements ApplicationListener<CalculatorRegister> {

    private static Logger logger = LoggerFactory.getLogger(CalcOutputPrinter.class);
    @Override
    public void onApplicationEvent(CalculatorRegister event) {
        logger.info("Value a = " +event.getValueA());
        logger.info("Value b = " +event.getValueB());
    }
}
