package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Autowired
    TaskList taskList;


    @Bean(name="1")
    public Board getBoard(TaskList taskList) {
        return new Board(tasklist.getToDoList(), getInProgressList(), getDoneList());
    }
}
