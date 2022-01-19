package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Bean
    public Board getBoard() {
        return new Board(getToDoList(), getInProgressList(), getDoneList());
    }

    public TaskList getToDoList() {
        return new TaskList();
    }

    public TaskList getInProgressList() {
        return new TaskList();
    }

    public TaskList getDoneList() {
        return new TaskList();
    }
}
