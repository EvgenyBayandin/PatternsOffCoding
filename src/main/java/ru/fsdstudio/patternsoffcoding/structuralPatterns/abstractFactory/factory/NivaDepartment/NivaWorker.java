package ru.fsdstudio.patternsoffcoding.structuralPatterns.abstractFactory.factory.NivaDepartment;

import ru.fsdstudio.patternsoffcoding.structuralPatterns.abstractFactory.employee.Worker;

/**
 * This class is a concrete implementation of the Worker interface. It implements the factory method. It creates a NivaWorker object.
 */
public class NivaWorker implements Worker {
    /**
     * Builds a car by appending the model name "Niva" to the base car.
     *
     * @return The built car with the model name "Niva".
     */
    public String buildCar() {
        // Call the superclass buildCar method and append "Niva" to the result
        return Worker.super.buildCar() + "Niva";
    }
}
