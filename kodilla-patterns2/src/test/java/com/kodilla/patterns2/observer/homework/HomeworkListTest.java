package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkListTest {

    @Test
    public void homeworkUpdate() {

        //GIVEN
        HomeworkList moduleOne = new ModuleOne();
        HomeworkList moduleTwo = new ModuleTwo();
        HomeworkList moduleThree = new ModuleThree();
        Mentors billGates = new Mentors("Bill Gates");
        Mentors elonMusk = new Mentors("Elon Musk");

        moduleOne.registerMarker(billGates);
        moduleThree.registerMarker(billGates);
        moduleOne.registerMarker(elonMusk);
        moduleTwo.registerMarker(elonMusk);
        moduleThree.registerMarker(elonMusk);

        //WHEN
        moduleOne.addHomework("Homework 1.1");
        moduleOne.addHomework("Homework 1.2");
        moduleOne.addHomework("Homework 1.3");
        moduleTwo.addHomework("Homework 2.1");
        moduleTwo.addHomework("Homework 2.2");
        moduleTwo.addHomework("Homework 2.3");
        moduleTwo.addHomework("Homework 2.4");
        moduleTwo.addHomework("Homework 2.5");
        moduleThree.addHomework("Homework 3.1");
        moduleThree.addHomework("Homework 3.2");
        moduleThree.addHomework("Homework 3.3");

        //THEN
        assertEquals(6, billGates.getUpdateCount());
        assertEquals(11, elonMusk.getUpdateCount());

    }

}
