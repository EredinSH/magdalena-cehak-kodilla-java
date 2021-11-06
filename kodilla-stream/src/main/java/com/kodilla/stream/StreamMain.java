package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

import static java.awt.SystemColor.text;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Litwo, ojczyzno moja!", (text) -> text + " Ty jestes jak zdrowie.");
        poemBeautifier.beautify("Litwo, ojczyzno moja!", (text) -> text + " Adam Mickiewicz");
        poemBeautifier.beautify("Litwo, ojczyzno moja!", (text) -> "~~<3 " + text + " <3~~");
        poemBeautifier.beautify("Litwo, ojczyzno moja!", (text) -> text.toUpperCase());

    }

}
