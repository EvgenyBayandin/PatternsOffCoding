package ru.fsdstudio.patternsoffcoding.structuralPatterns.builder;

/**
 * This interface defines the contract for building a Pizza object.
 * It provides methods to set properties of the Pizza, such as size, price, name, and cheese.
 * The build method is used to create a Pizza object with the set properties.
 */
public interface Builder {
    /**
     * Sets the size of the Pizza.
     *
     * @param size The size of the Pizza.
     */
    void setSize(int size);
    
    /**
     * Sets the price of the Pizza.
     *
     * @param price The price of the Pizza.
     */
    void setPrice(double price);
    
    /**
     * Sets the name of the Pizza.
     *
     * @param name The name of the Pizza.
     */
    void setName(String name);
    
    /**
     * Sets whether the Pizza has cheese or not.
     *
     * @param cheese Whether the Pizza has cheese or not.
     */
    void setCheese(boolean cheese);
    
    /**
     * Builds and returns a Pizza object with the set properties.
     *
     * @return A Pizza object with the set properties.
     */
    Pizza build();
}
