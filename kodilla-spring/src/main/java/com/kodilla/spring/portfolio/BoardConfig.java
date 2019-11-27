package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {


    @Bean(name="toDoList")
    public Board getToDoList() {
        return new Board(tasklist.getToDoList());
    }
    @Bean
    public Board getToDoList() {
        return new Board(taskList)
