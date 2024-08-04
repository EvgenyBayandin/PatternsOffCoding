package ru.fsdstudio.patternsoffcoding.structuralPatterns.factoryMethod.car.impl;

import ru.fsdstudio.patternsoffcoding.structuralPatterns.factoryMethod.car.Car;

public class Niva implements Car {
    @Override
    public String drive() {
        return "Нива выезжает с конвеера.";
    }
}
