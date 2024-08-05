package ru.fsdstudio.patternsoffcoding.structuralPatterns.abstractFactory.factory.NivaDepartment;

import ru.fsdstudio.patternsoffcoding.structuralPatterns.abstractFactory.employee.Engineer;

/**
 * This class is a concrete implementation of the Engineer interface. It implements the factory method.
 */
public class NivaEngineer implements Engineer {
    /**
     * This method creates a car with the brand "Niva".
     * It calls the superclasses createCar method and appends "Lada" to the result.
     * @return a string representing the car with the brand "Niva"
     */
    @Override
    public String createCar() {
        // Call the superclasses createCar method and append "Niva" to the result
        return Engineer.super.createCar() + "Niva";
    }
}
