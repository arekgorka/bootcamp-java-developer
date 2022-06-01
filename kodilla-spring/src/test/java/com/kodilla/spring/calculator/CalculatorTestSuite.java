package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculations() {
        //Given
        double a = 9;
        double b = 7;
        //When
        double result1 = calculator.add(a,b);
        double result2 = calculator.sub(a,b);
        double result3 = calculator.mul(a,b);
        double result4 = calculator.div(a,b);
        //Then
        assertEquals(16.0,result1);
        assertEquals(2.0,result2);
        assertEquals(63.0,result3);
        assertEquals(1.2857142857142858,result4);

    }
}
