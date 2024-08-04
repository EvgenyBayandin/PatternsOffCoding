package ru.fsdstudio.patternsoffcoding.structuralPatterns.factoryMethod.factory.impl;

import ru.fsdstudio.patternsoffcoding.structuralPatterns.factoryMethod.factory.Factory;

public class CarFactory implements Factory {
    
    @Override
    public String createCar() {
        return " произведена.";
    }
}
