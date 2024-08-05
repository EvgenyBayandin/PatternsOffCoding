package ru.fsdstudio.patternsoffcoding.structuralPatterns.abstractFactory.factory.ladaDepartment;

import ru.fsdstudio.patternsoffcoding.structuralPatterns.abstractFactory.employee.Manager;

/**
 * This class represents the Lada manager.
 * It implements the Manager interface and overrides the saleCar() method.
 * It appends the word "Lada" to the result of the superclasses saleCar() method.
 */
public class LadaManager implements Manager {
    /**
     * This method overrides the saleCar() method from the Manager interface.
     * It appends the word "Lada" to the result of the superclasses saleCar() method.
     *
     * @return A string representing the car being sold, with the word "Lada" appended.
     */
    @Override
    public String saleCar() {
        // Call the saleCar() method of the superclass and append "Lada" to the result
        return Manager.super.saleCar() + "Lada";
    }
}
