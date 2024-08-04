package ru.fsdstudio.patternsoffcoding.structuralPatterns.factoryMethod.factory.impl;

public class LadaDepartment extends CarFactory {
    @Override
    public String createCar() {
        return "Lada" + super.createCar();
    }
}
