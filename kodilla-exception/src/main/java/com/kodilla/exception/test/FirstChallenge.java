package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        double resultDivide = 0;

        if (b == 0) {
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException e) {
                System.out.println("Jest błąd: " + e);
                return resultDivide;
            } finally {
                System.out.println("To i tak zrobi się zawsze");
            }
        } else
           return a/b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3, 0);

        System.out.println(result);
    }
}
