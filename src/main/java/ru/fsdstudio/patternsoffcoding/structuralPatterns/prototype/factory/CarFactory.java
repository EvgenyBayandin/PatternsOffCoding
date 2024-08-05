package ru.fsdstudio.patternsoffcoding.structuralPatterns.prototype.factory;

/**
 * This class represents the prototype pattern and defines the copy method. It is used to create a new object from an existing object.
 */
public class CarFactory {
    Car car;
    
    public CarFactory(Car car) {
        this.car = car;
    }
    
    /**
     * Sets the car object in the factory.
     *
     * @param car The car object to be set in the factory.
     */
    public void setCar(Car car) {
        this.car = car;
    }
    
    /**
     * This method is used to clone a Car object using the prototype pattern.
     * It creates a new instance of a Car object by copying the state from an existing Car object.
     *
     * @return The cloned Car object.
     */
    public Car cloneCar() {
        // Use the copy method of the Car object to create a new instance with the same state.
        return (Car) car.copy();
    }
}
