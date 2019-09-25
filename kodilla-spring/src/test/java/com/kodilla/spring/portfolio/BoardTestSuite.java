package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Stream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        boolean addToDoTask = board.getToDoList().addTask("To Do Task");
        boolean addInProgressTask = board.getInProgressList().addTask("In progrss Task");
        boolean addDoneTask = board.getDoneList().addTask("Done Task");
        //Then
        board.getToDoList().getTaska().stream()
                .forEach(System.out::println);
        board.getInProgressList().getTaska().stream()
                .forEach(System.out::println);
        board.getDoneList().getTaska().stream()
                .forEach(System.out::println);

    }
}

