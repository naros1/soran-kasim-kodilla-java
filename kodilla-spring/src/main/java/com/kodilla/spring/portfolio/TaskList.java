package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {
    final List<String> taska;

    public TaskList() {
        taska = new ArrayList<>();
    }

    public Boolean addTask(String task){
        taska.add(task);
        return true;
    }

    public List<String> getTaska() {
        return taska;
    }
}
