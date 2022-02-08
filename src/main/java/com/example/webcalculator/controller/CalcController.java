package com.example.webcalculator.controller;

import com.example.webcalculator.domain.NumberOutputsDto;
import com.example.webcalculator.event.CalculatorRegister;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class CalcController implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;
    private static Logger logger = LoggerFactory.getLogger(CalcController.class);

    @PostMapping(path = "/multiply")
    public void multiply(@RequestBody NumberOutputsDto dto) {
        publisher.publishEvent(
                new CalculatorRegister(
                        this,
                        dto.getValueA(),
                        dto.getValueB()));
        logger.info("result = " +dto.multi());
    }

    @PostMapping(path = "/divide")
    public void divide(@RequestBody NumberOutputsDto dto) {
        publisher.publishEvent(
                new CalculatorRegister(
                        this,
                        dto.getValueA(),
                        dto.getValueB()));
        logger.info("result = " +dto.divide());
    }

    @PostMapping(path = "/subtract")
    public void sub(@RequestBody NumberOutputsDto dto) {
        publisher.publishEvent(
                new CalculatorRegister(
                        this,
                        dto.getValueA(),
                        dto.getValueB()));
        logger.info("result = " + dto.subtract());
    }

    @PostMapping(path = "/add")
    public void add(@RequestBody NumberOutputsDto dto) {
        publisher.publishEvent(
                new CalculatorRegister(
                        this,
                        dto.getValueA(),
                        dto.getValueB()));
        logger.info("result = " +dto.add());
    }


    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}
