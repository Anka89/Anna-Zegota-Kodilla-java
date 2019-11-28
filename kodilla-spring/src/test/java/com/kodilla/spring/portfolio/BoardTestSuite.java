package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class BoardTestSuite {

@Test
public void testBeansExist() {

        //Given
        ApplicationContext contex = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");

        //When
        boolean boardExists = contex.containsBean("board");
        boolean taskToDoListExists = contex.containsBean("toDoList");
        boolean taskInProgressListExists = contex.containsBean("inProgressList");
        boolean taskDoneListExists = contex.containsBean("doneList");

        //Then
        System.out.println("Bean board was found in the container: " + boardExists);
        System.out.println("Bean toDoList was found in the container: " + taskToDoListExists);
        System.out.println("Bean InProgressList was found in the container: " + taskInProgressListExists);
        System.out.println("Bean doneList was found in the container: " + taskDoneListExists);

        Assert.assertTrue(boardExists);
        Assert.assertTrue(taskToDoListExists);
        Assert.assertTrue(taskInProgressListExists);
        Assert.assertTrue(taskDoneListExists);
        }

@Test
public void testTaskAdd() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");

        //When
        Board board = (Board)context.getBean("board");

        List<String> ToDoList = (ArrayList<String>)board.getToDoList().getTasks();
        ToDoList.add("Task To Do list");

        List<String> InProgressList = (ArrayList<String>)board.getInProgressList().getTasks();
        InProgressList.add("Task in progress list");

        List<String> taskDoneList = (ArrayList<String>)board.getDoneList().getTasks();
        taskDoneList.add("Task done list");

        //Then
        Assert.assertEquals("Task To Do list", ToDoList.get(0));
        Assert.assertEquals("Task in progress list", InProgressList.get(0));
        Assert.assertEquals("Task done list", taskDoneList.get(0));
        }
}
