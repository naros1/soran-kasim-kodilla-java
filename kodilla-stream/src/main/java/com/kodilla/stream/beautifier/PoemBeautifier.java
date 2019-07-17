package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator poemBeautifierRule){
        String result = poemBeautifierRule.decorate(text);
        System.out.println("Result equals: " +"\"" + result + "\"");
    }
}
