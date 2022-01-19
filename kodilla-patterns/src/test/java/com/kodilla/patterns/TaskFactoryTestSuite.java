package com.kodilla.patterns;

import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testTaskShopping() {
        //GIVEN
        TaskFactory factory = new TaskFactory();

        //WHEN
        Task shopping = factory.makeTask(TaskFactory.SHOPPINGTASK);

        //THEN
        assertEquals("Shopping", shopping.getTaskName());

    }

    @Test
    void testTaskPainting() {
        //GIVEN
        TaskFactory factory = new TaskFactory();

        //WHEN
        Task painting = factory.makeTask(TaskFactory.PAINTINGTASK);

        //THEN
        assertEquals("Painting", painting.getTaskName());

    }

    @Test
    void testTaskDriving() {
        //GIVEN
        TaskFactory factory = new TaskFactory();

        //WHEN
        Task driving = factory.makeTask(TaskFactory.DRIVINGTASK);

        //THEN
        assertEquals("Driving", driving.getTaskName());

    }

}
