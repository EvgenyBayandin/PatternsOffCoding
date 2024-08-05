package ru.fsdstudio.patternsoffcoding.structuralPatterns.abstractFactory.store;

import ru.fsdstudio.patternsoffcoding.structuralPatterns.abstractFactory.employee.CarTeamFactory;
import ru.fsdstudio.patternsoffcoding.structuralPatterns.abstractFactory.factory.ladaDepartment.LadaTeamFactory;

/**
 * The class LadaClient implements the CarTeamFactory interface. It implements the factory method. It creates a LadaTeamFactory object. It creates a LadaTeamFactory object.
 */
public class LadaClient {
    /**
     * This main function demonstrates the usage of the LadaClient class.
     * It creates a LadaTeamFactory object and uses it to create, build, and sell a Lada car.
     */
    public static void main(String[] args) {
        // Print a message indicating the start of the process
        System.out.println("LadaClient заказывает автомобиль Lada");
        
        // Create a LadaTeamFactory object
        CarTeamFactory teamFactory = new LadaTeamFactory();
        
        // Get the engineer from the factory and create a car
        System.out.println(teamFactory.getEngineer().createCar());
        
        // Get the worker from the factory and build a car
        System.out.println(teamFactory.getWorker().buildCar());
        
        // Get the manager from the factory and sell a car
        System.out.println(teamFactory.getManager().saleCar());
        
        // Print a message indicating the end of the process
        System.out.println("Довольный клиент уезжает на автомобиле Lada");
    }
}
