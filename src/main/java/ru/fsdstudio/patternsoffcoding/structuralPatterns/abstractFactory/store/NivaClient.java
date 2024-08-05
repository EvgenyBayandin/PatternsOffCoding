package ru.fsdstudio.patternsoffcoding.structuralPatterns.abstractFactory.store;

import ru.fsdstudio.patternsoffcoding.structuralPatterns.abstractFactory.employee.CarTeamFactory;
import ru.fsdstudio.patternsoffcoding.structuralPatterns.abstractFactory.factory.NivaDepartment.NivaTeamFactory;

/**
 *  The class NivaClient implements the CarTeamFactory interface. It implements the factory method. It creates a NivaTeamFactory object.
 */
public class NivaClient {
    /**
     * This method represents the main entry point of the NivaClient class.
     * It creates a new instance of NivaTeamFactory and uses it to create, build, and sell a Niva car.
     */
    public static void main(String[] args) {
        // Create a new instance of NivaTeamFactory
        CarTeamFactory teamFactory = new NivaTeamFactory();
        
        // Print a message indicating that the NivaClient is ordering a Niva car
        System.out.println("NivaClient заказывает автомобиль Niva");
        
        // Create a new car using the engineer from the NivaTeamFactory
        System.out.println(teamFactory.getEngineer().createCar());
        
        // Build the car using the worker from the NivaTeamFactory
        System.out.println(teamFactory.getWorker().buildCar());
        
        // Sell the car using the manager from the NivaTeamFactory
        System.out.println(teamFactory.getManager().saleCar());
        
        // Print a message indicating that the client is satisfied with the Niva car
        System.out.println("Довольный клиент уезжает на автомобиле Niva");
    }
}
