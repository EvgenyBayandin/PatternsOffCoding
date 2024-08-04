package ru.fsdstudio.patternsoffcoding.structuralPatterns.factoryMethod.car.impl;

import ru.fsdstudio.patternsoffcoding.structuralPatterns.factoryMethod.car.Car;

public class Lada implements Car {
    
    @Override
    public String drive() {
        return "Лада выезжает с конвеера.";
    }
}
