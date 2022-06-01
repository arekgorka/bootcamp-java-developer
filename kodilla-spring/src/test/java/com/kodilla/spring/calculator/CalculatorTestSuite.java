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
        calculator.add(a,b);
        calculator.sub(a,b);
        calculator.mul(a,b);
        calculator.div(a,b);
        //Then
    }
}
