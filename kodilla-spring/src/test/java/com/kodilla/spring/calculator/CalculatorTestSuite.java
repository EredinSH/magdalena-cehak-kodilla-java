package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //GIVEN
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //WHEN
        double result1 = calculator.add(2,8);
        double result2 = calculator.sub(25,10);
        double result3 = calculator.mul(3,4);
        double result4 = calculator.div(100,25);

        //THEN
        assertEquals(10,result1,0.01);
        assertEquals(15,result2, 0.01);
        assertEquals(12,result3, 0.01);
        assertEquals(4,result4, 0.01);

    }

}
