package com.kodilla.patterns.builder.bigmac;

public class Burgers {

    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    private int burgers;

    public Burgers (int burgers) {

        switch (burgers) {
            case ONE:
                this.burgers = ONE;
                break;
            case TWO:
                this.burgers = TWO;
                break;
            case THREE:
                this.burgers = THREE;
                break;
            default:
                System.out.println("You must choose amount of burgers from 1 to 3.");
        }
    }

    public int getBurgers() {
        return burgers;
    }

    public String toString() {
        return "" + burgers;
    }
}
