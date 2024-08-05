package ru.fsdstudio.patternsoffcoding.structuralPatterns.builder;

/**
 * Class Director for Builder pattern
 */
public class Director {
    Builder builder;
    
    Director(Builder builder) {
        this.builder = builder;
    }
    
    /**
     * This method creates a default pizza using the builder pattern.
     * It sets the  size, price, and name of the pizza.
     */
    public void createDefaultPizza() {
        
        // Set the size of the pizza to 6
        builder.setSize(6);
        
        // Set the price of the pizza to 150
        builder.setPrice(150);
        
        // Set the name of the pizza to "Default Pizza"
        builder.setName("Default Pizza");
    }
    
    /**
     * Creates a cheese pizza using the builder pattern.
     * It sets the size, price, name and cheese option of the pizza.
     */
    public void createCheesePizza() {
       
        // Set the size of the pizza to 6
        builder.setSize(6);
        
        // Set the price of the pizza to 150
        builder.setPrice(150);
        
        // Set the name of the pizza to "Cheese Pizza"
        builder.setName("Cheese Pizza");
        
        // Set the cheese option to true
        builder.setCheese(true);
    }
}
