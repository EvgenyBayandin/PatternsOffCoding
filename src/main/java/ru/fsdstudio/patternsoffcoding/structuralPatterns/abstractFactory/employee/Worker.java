package ru.fsdstudio.patternsoffcoding.structuralPatterns.abstractFactory.employee;

/**
 * The interface Worker.
 */
public interface Worker {
    /**
     * This method builds a car.
     *
     * @return The message indicating that the worker is building a car.
     */
    default String buildCar() {
        // Return the message indicating that the worker is building a car.
        return "Рабочий собирает модели ";
    }
}
