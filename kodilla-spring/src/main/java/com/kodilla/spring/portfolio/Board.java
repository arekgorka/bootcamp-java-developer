package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Board {

    @Autowired
    @Qualifier("ToDoList")
    private TaskList toDoList;
    @Autowired
    @Qualifier("InProgressList")
    private TaskList inProgressList;
    @Autowired
    @Qualifier("DoneList")
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {

        return toDoList;
    }

    public TaskList getInProgressList() {

        return inProgressList;
    }

    public TaskList getDoneList() {

        return doneList;
    }
}
