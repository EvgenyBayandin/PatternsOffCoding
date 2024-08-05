package ru.fsdstudio.patternsoffcoding.structuralPatterns.singleton;

/**
 * Singleton pattern
 *
 * @author fsdstudio.ru
 */
public class Singleton {
    
    private static Singleton singleton;
    
    private Singleton() {}
    
    /**
     * Returns the instance of the Singleton class.
     * Uses lazy initialization and thread-safe synchronization.
     *
     * @return The instance of the Singleton class.
     */
    public static synchronized Singleton getInstance() {
        // Check if the singleton instance is null
        if (singleton == null) {
            // If null, create a new instance from private constructor
            singleton = new Singleton();
        }
        // Return the singleton instance
        return singleton;
    }
}
