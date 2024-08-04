package ru.fsdstudio.patternsoffcoding.structuralPatterns.factoryMethod;

import ru.fsdstudio.patternsoffcoding.structuralPatterns.factoryMethod.car.impl.Lada;
import ru.fsdstudio.patternsoffcoding.structuralPatterns.factoryMethod.car.impl.Niva;
import ru.fsdstudio.patternsoffcoding.structuralPatterns.factoryMethod.car.impl.Volga;
import ru.fsdstudio.patternsoffcoding.structuralPatterns.factoryMethod.factory.impl.LadaDepartment;
import ru.fsdstudio.patternsoffcoding.structuralPatterns.factoryMethod.factory.impl.NivaDepartment;
import ru.fsdstudio.patternsoffcoding.structuralPatterns.factoryMethod.factory.impl.VolgaDepartment;

public class Client {
    
    public static void main(String[] args) {
        System.out.println(new NivaDepartment().createCar());
        System.out.println(new Niva().drive());
        
        System.out.println(new LadaDepartment().createCar());
        System.out.println(new Lada().drive());
        
        System.out.println(new VolgaDepartment().createCar());
        System.out.println(new Volga().drive());
    }
}
