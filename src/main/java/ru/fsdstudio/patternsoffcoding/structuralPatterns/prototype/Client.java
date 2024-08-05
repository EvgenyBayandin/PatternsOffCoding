package ru.fsdstudio.patternsoffcoding.structuralPatterns.prototype;

import ru.fsdstudio.patternsoffcoding.structuralPatterns.prototype.factory.Car;
import ru.fsdstudio.patternsoffcoding.structuralPatterns.prototype.factory.CarFactory;

/**
 * This class demonstrates the usage of the Prototype pattern.
 */
public class Client {
    /**
     * Main method to demonstrate the usage of the Car class and its cloning.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Create a new Car object with id 1, name "First", and trunk true
        Car firstCar = new Car(1, "First", true);
        
        // Set the id of the firstCar to 2
        firstCar.setId(2);
        
        // Print the firstCar object
        System.out.println(firstCar);
        
        // Clone the firstCar object using the copy method
        Car clonedCar = (Car) firstCar.copy();
        
        // Print the clonedCar object
        System.out.println(clonedCar);
        
        // Create a CarFactory object with the firstCar as the prototype
        CarFactory factory = new CarFactory(firstCar);
        
        // Clone the firstCar object using the CarFactory
        Car clonedCar2 = factory.cloneCar();
        
        // Print the clonedCar2 object
        System.out.println(clonedCar2);
        
        // Set the id of the firstCar to 1
        firstCar.setId(1);
        
        // Print the firstCar object
        System.out.println(firstCar);
        
        // Print the clonedCar object
        System.out.println(clonedCar);
        
        // Set the trunk of the clonedCar2 to false
        clonedCar2.setTrunk(false);
        
        // Print the firstCar object
        System.out.println(firstCar);
        
        // Print the clonedCar object
        System.out.println(clonedCar);
        
        // Print the clonedCar2 object
        System.out.println(clonedCar2);
    }
}
