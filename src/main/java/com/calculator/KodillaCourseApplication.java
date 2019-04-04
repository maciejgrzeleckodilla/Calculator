package com.calculator;

import com.fasterxml.jackson.databind.BeanProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaCourseApplication.class, args);
        Calculator calculator = new Calculator();
        System.out.println(calculator.addition(5, 6));

    }



}
