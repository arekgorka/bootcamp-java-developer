package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }

        Calculator calculator = new Calculator();

        int sumAdd = 11;
        int sumSubtract = 12;

        int resultAdd = calculator.add(6, 5);
        int resultSubtract = calculator.subtract(25,13);

        if (resultAdd == sumAdd) {
            System.out.println("Test Add is OK");
        } else {
            System.out.println("Test Add is WRONG!");
        }

        if (resultSubtract == sumSubtract) {
            System.out.println("Test Subtract is OK");
        } else {
            System.out.println("Test Subtract is WRONG!");
        }

    }
}
