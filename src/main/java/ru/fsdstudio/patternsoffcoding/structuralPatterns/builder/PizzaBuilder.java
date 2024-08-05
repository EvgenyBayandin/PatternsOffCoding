package ru.fsdstudio.patternsoffcoding.structuralPatterns.builder;

/**
 * Class PizzaBuilder for Builder pattern
 */
public class PizzaBuilder implements Builder{
    private final Pizza pizza;
    
    PizzaBuilder() {
        pizza = new Pizza();
    }
    
    @Override
    public void setSize(int size) {
        pizza.setSize(size);
    }
    
    @Override
    public void setPrice(double price) {
        pizza.setPrice(price);
    }
    
    @Override
    public void setName(String name) {
        pizza.setName(name);
    }
    
    @Override
    public void setCheese(boolean cheese) {
        pizza.setCheese(cheese);
    }
    
    @Override
    public Pizza build() {
        return pizza;
    }
}
