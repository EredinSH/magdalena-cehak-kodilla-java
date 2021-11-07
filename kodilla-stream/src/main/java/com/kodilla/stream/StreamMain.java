package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Litwo, ojczyzno moja!",(text) -> text + " Ty jestes jak zdrowie.");
        poemBeautifier.beautify("Litwo, ojczyzno moja!",(text) -> text + " Adam Miciewicz");
        poemBeautifier.beautify("Litwo, ojczyzno moja!",(text) -> "~~<3 " + text + " <3~~");
        poemBeautifier.beautify("Litwo, ojczyzno moja!",(text) -> text.toUpperCase());

    }

}
