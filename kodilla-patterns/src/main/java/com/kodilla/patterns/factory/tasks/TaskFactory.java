package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskCLass) {
        switch (taskCLass) {
            case SHOPPING:
                return new ShoppingTask("Shopping","table",149.99);
            case PAINTING:
                return new PaintingTask("Painting","pink","elephant");
            case DRIVING:
                return new DrivingTask("Driving","San Francisco","Car");
            default:
                return null;
        }
    }
}
