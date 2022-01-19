package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //GIVEN
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //WHEN
        String taskToDo = "to do";
        String taskInProgress = "in progress";
        String taskDone = "done";
        board.getToDoList().addTask(taskToDo);
        board.getInProgressList().addTask(taskInProgress);
        board.getDoneList().addTask(taskDone);

        //THEN
        assertEquals("to do",board.getToDoList().getTasks().get(0));
        assertEquals("in progress",board.getInProgressList().getTasks().get(0));
        assertEquals("done",board.getDoneList().getTasks().get(0));

    }
}
