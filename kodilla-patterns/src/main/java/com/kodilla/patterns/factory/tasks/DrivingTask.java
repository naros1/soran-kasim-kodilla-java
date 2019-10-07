package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    private final String where;
    private final String using;
    private boolean taskStatus =false;

    public DrivingTask(final String where, final String using) {
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask() {
        taskStatus = true;
        return "Task " + where + " was executed !";
    }

    @Override
    public String getTaskName() {
        return "Driving Task";
    }

    @Override
    public boolean isTaskExecuted() {
        return taskStatus;
    }
}
