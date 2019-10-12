package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.TaskListDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "Test List name";
    private static final String DESCRIPTION = "Test description";

    @Test
    public void findByListName(){
        //Given
        TaskList taskList = new TaskList(LISTNAME,DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTasksList = taskListDao.findByListName(listName);
        String readedName = readTasksList.get(0).getListName();

        //Then
        Assert.assertEquals(1, readTasksList.size());
        Assert.assertEquals(listName,readedName);

        //CleanUp
        int id = readTasksList.get(0).getId();
        taskListDao.deleteById(id);



    }
}
