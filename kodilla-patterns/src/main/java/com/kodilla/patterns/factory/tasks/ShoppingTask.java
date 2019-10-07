package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    private final String whatToBuy;
    private final double quantity;
    private boolean taskStatus = false;

    public ShoppingTask( final String whatToBuy, final double quantity) {

        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String executeTask() {
        taskStatus = true;
        return "Task " +  whatToBuy + " was executed !";
    }

    @Override
    public String getTaskName() {
        return "Shopping Task";
    }

    @Override
    public boolean isTaskExecuted() {
        return taskStatus;
    }
}
