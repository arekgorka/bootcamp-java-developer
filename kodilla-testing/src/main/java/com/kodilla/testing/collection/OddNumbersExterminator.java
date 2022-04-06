package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    List<Integer> numbers = new ArrayList<>();
    List<Integer> evenNumbers = new ArrayList<>();

    //public OddNumbersExterminator() {
    //}

    public List<Integer> exterminate() {
        for(int i=0; i<10; i++) {
            numbers.add(i);
        }
        for (int i=0; i < numbers.size(); i++) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
        return numbers;
    }
}
