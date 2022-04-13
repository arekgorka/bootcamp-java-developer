package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String text, PoemDecorator poemDecorator) {
        String finalText = poemDecorator.decorate(text);
        System.out.println(finalText);
    }
}
