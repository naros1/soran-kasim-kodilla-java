package com.kodilla.patterns.factory.task;

import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        System.out.println(shopping.executeTask());
        //Then
        Assert.assertEquals("Buy groceries", shopping.getTaskName());
        Assert.assertEquals(true, shopping.isTaskExecuted());
    }
    @Test
    public void testFactoryPaintingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        System.out.println(painting.executeTask());
        //Then
        Assert.assertEquals("Paint room", painting.getTaskName());
        Assert.assertEquals(true, painting.isTaskExecuted());
    }
    @Test
    public void testFactoryDrivingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        System.out.println(driving.executeTask());
        //Then
        Assert.assertEquals("Drive safe", driving.getTaskName());
        Assert.assertEquals(true, driving.isTaskExecuted());
    }

}
