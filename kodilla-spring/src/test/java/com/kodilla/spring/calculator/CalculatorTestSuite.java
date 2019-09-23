package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double add = calculator.add(2.0,3.0);
        double sub = calculator.sub(2.0,3.0);
        double mul = calculator.mul(2.0,3.0);
        double div = calculator.div(1.0,5.0);
        //then
        Assert.assertEquals(5.0,add,0.00001);
        Assert.assertEquals(-1.0,sub,0.00001);
        Assert.assertEquals(6.0,mul,0.00001);
        Assert.assertEquals(0.2,div,0.00001);

    }
}
