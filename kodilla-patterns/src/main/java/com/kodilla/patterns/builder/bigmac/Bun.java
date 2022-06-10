package com.kodilla.patterns.builder.bigmac;

public class Bun {

    public static final String WITH_SEZAM = "With sezam";
    public static final String WITHOUT_SEZAM = "Without sezam";
    private String bun;

    public Bun (String bun) {
        switch (bun) {
            case WITH_SEZAM:
                this.bun = WITH_SEZAM;
                break;
            case WITHOUT_SEZAM:
                this.bun = WITHOUT_SEZAM;
                break;
            default:
                System.out.println("You must choose 'With sezam' or 'Without sezam'.");;
        }
    }

    public String getBun() {
        return bun;
    }

    public String toString() {
        return bun;
    }
}
