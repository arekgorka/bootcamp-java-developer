package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.Locale;

public class StreamMain {

    public static void main(String[] args) {
        /*ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10,5, (a,b) -> a+b);
        expressionExecutor.executeExpression(10,5, (a,b) -> a-b);
        expressionExecutor.executeExpression(10,5, (a,b) -> a*b);
        expressionExecutor.executeExpression(10,5, (a,b) -> a/b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);*/

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify( "Text To Beautify", text -> "ABC" + text + "ABC");
        poemBeautifier.beautify( "Text To Beautify", text -> text.toUpperCase());
        poemBeautifier.beautify( "Text To Beautify", text -> "@_" + text + "_@");
        poemBeautifier.beautify( "Text To Beautify", text -> text.toLowerCase());
    }
}