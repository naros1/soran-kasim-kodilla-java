package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    private final String color;
    private final String whatToPaint;
    private boolean taskStatus = false;

    public PaintingTask(final String color, final String whatToPaint) {
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask() {
        taskStatus = true;
        return "Task " + whatToPaint + " on color " + color + " was executed !";
    }

    @Override
    public String getTaskName() {
        return "Painting Task";
    }

    @Override
    public boolean isTaskExecuted() {
        return taskStatus;
    }
}
