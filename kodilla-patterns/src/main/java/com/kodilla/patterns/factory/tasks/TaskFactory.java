package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Buy groceries", "milk", 2.0);
            case PAINTING:
                return new PaintingTask("Paint room", "blue", "bedroom");
            case DRIVING:
                return new DrivingTask("Drive safe", "work", "car");
            default:
                return null;
        }
    }
}
