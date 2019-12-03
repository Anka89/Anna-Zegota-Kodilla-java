package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.doTask(TaskFactory.SHOPPINGTASK);
        shopping.executeTask();
        boolean done = true;
        //Then
        Assert.assertEquals("Buy Christmas gifts", shopping.getTaskName());
        Assert.assertEquals(done,shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.doTask(TaskFactory.PAINTINGTASK);
        painting.executeTask();
        boolean done = true;
        //Then
        Assert.assertEquals("Paint gifts", painting.getTaskName());
        Assert.assertEquals(done,painting.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.doTask(TaskFactory.DRIVINGTASK);
        boolean done = false;
        //Then
        Assert.assertEquals("Go to the family", driving.getTaskName());
        Assert.assertEquals(false,driving.isTaskExecuted());
    }
}