package ru.fsdstudio.patternsoffcoding.structuralPatterns.factoryMethod.factory.impl;

public class NivaDepartment extends CarFactory {
    @Override
    public String createCar() {
        return "Нива" + super.createCar();
    }
}
