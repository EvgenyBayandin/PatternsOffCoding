package ru.fsdstudio.patternsoffcoding.structuralPatterns.builder;

/**
 * Class Main for Builder pattern
 */
public class Main {
    /**
     * This is the main function that demonstrates the Builder and Director patterns.
     * It creates a PizzaBuilder and a Director, and then uses the Director to create
     * two different types of pizzas. The pizzas are then printed to the console.
     */
    public static void main(String[] args) {
        // Create a new PizzaBuilder
        Builder builder = new PizzaBuilder();
        
        // Create a new Director and pass in the PizzaBuilder
        Director director = new Director(builder);
        
        // Use the Director to create a default pizza
        director.createDefaultPizza();
        
        // Build and print the default pizza
        System.out.println(builder.build());
        
        // Use the Director to create a cheese pizza
        director.createCheesePizza();
        
        // Build and print the cheese pizza
        System.out.println(builder.build());
        
        // Create a new record pizza
        RecordPizza recordPizza = new RecordPizza(12, 200, "Cheese and tomato", true);
        
        // Print the record pizza
        System.out.println(recordPizza);
    }
    
    // Another Builder pattern example
    
    /**
     * This record class represents a pizza. It has four fields:
     * - size: the size of the pizza (int)
     * - name: the name of the pizza (String)
     * - price: the price of the pizza (int)
     * - cheese: a boolean indicating whether the pizza has cheese or not
     */
    public record RecordPizza(int size, int price, String name, boolean cheese) {}
    
}
