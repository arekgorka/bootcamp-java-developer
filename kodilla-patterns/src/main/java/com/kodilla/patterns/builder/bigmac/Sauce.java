package com.kodilla.patterns.builder.bigmac;

public class Sauce {

    public static final String STANDARD = "standard";
    public static final String THOUSANDISLAND = "1000 island";
    public static final String BARBECUE = "barbecue";
    private String sauce;

    public Sauce (String sauce) {
        switch (sauce) {
            case STANDARD:
                this.sauce = STANDARD;
                break;
            case THOUSANDISLAND:
                this.sauce = THOUSANDISLAND;
                break;
            case BARBECUE:
                this.sauce = BARBECUE;
                break;
            default:
                System.out.println("We don't have " + sauce + ". You can choose: standard, 1000island, barbecue.");
        }
    }

    public String getSauce() {
        return sauce;
    }

    public String toString() {
        return sauce;
    }
}
