package ru.fsdstudio.patternsoffcoding.structuralPatterns.factoryMethod.factory.impl;

public class VolgaDepartment extends CarFactory {
    @Override
    public String createCar() {
        return "Волга" + super.createCar();
    }
}
