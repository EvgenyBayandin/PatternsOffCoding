package ru.fsdstudio.patternsoffcoding.structuralPatterns.abstractFactory.employee;

/**
 * The interface Manager.
 */
public interface Manager {
    /**
     * This method represents the sale of a car by a manager.
     *
     * @return The string "Менеджер продает" indicating the sale of a car.
     */
    default String saleCar() {
        // Return the string indicating the sale of a car
        return "Менеджер продает модели ";
    }
}
