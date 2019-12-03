package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPING TASKC";
    public static final String PAINTINGTASK = "PAINTING TASK";
    public static final String DRIVINGTASK = "DRIVING TASK";

    public final Task doTask(final String whatTask) {
        switch (whatTask) {
            case SHOPPINGTASK:
                return new ShoppingTask("Buy Christmas gifts", "Christmas tree", 1);
            case PAINTINGTASK:
                return new PaintingTask("Paint gifts", "red", "Christmas baubles");
            case DRIVINGTASK:
                return new DrivingTask("Go to the family", "Kutno", "Mazda");
            default:
                return null;
        }

    }
}