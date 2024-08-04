package ru.fsdstudio.patternsoffcoding.structuralPatterns.factoryMethod.car.impl;

import ru.fsdstudio.patternsoffcoding.structuralPatterns.factoryMethod.car.Car;

public class Volga implements Car {
    @Override
    public String drive() {
        return "Волга выезжает с конвеера.";
    }
}
