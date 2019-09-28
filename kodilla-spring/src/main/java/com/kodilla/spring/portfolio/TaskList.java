package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {
    final List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public Boolean addTask(String task){
        tasks.add(task);
        return true;
    }

    public List<String> getTaska() {
        return tasks;
    }

}
