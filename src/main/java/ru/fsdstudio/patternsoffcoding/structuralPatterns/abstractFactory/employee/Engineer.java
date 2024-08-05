package ru.fsdstudio.patternsoffcoding.structuralPatterns.abstractFactory.employee;

/**
 * The interface Engineer.
 */
public interface Engineer {
    /**
     * This method creates a car for an engineer.
     *
     * @return The string representing the process of car development.
     */
    default String createCar() {
        // Return the string indicating the process of car development
        return "Инженер разрабатывает модели ";
    }
}
