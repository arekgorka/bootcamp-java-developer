package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.getToDoList().getTasks().add("-Odkurzyć dom");
        board.getInProgressList().getTasks().add("-Zrobić pranie");
        board.getDoneList().getTasks().add("-Umyć okna");

        //When & Then
        System.out.println("To Do List:");
        board.getToDoList().getTasks().stream().forEach(System.out::println);
        System.out.println(" ");
        System.out.println("In Progress List:");
        board.getInProgressList().getTasks().stream().forEach(System.out::println);
        System.out.println(" ");
        System.out.println("Done List:");
        board.getDoneList().getTasks().stream().forEach(System.out::println);
    }
}
