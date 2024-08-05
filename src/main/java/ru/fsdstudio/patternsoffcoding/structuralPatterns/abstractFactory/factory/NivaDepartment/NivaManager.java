package ru.fsdstudio.patternsoffcoding.structuralPatterns.abstractFactory.factory.NivaDepartment;

import ru.fsdstudio.patternsoffcoding.structuralPatterns.abstractFactory.employee.Manager;

/**
 * This class is a concrete implementation of the Manager interface. It implements the factory method.
 */
public class NivaManager implements Manager {
    
    /**
     * This method overrides the saleCar() method from the Manager interface.
     * It appends the word "Niva" to the result of the superclasses saleCar() method.
     *
     * @return A string representing the car being sold, with the word "Niva" appended.
     */
    @Override
    public String saleCar() {
        // Call the saleCar() method of the superclass and append "Niva" to the result
        return Manager.super.saleCar() + "Niva";
    }
}
