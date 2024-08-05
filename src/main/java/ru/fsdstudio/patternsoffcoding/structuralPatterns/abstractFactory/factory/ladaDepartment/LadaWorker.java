package ru.fsdstudio.patternsoffcoding.structuralPatterns.abstractFactory.factory.ladaDepartment;

import ru.fsdstudio.patternsoffcoding.structuralPatterns.abstractFactory.employee.Worker;

/**
 * This class is a concrete implementation of the Worker interface. It implements the factory method. It creates a LadaWorker object.
 */
public class LadaWorker implements Worker {
    /**
     * This method overrides the buildCar() method from the Worker interface.
     * It appends the word "Lada" to the result of the superclasses buildCar() method.
     *
     * @return A string representing the car being built, with the word "Lada" appended.
     */
    @Override
    public String buildCar() {
        // Call the buildCar() method of the superclass and append "Lada" to the result
        return Worker.super.buildCar() + "Lada";
    }
}
