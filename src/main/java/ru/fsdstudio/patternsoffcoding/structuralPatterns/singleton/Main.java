package ru.fsdstudio.patternsoffcoding.structuralPatterns.singleton;

/**
 * This is a singleton class. It demonstrates the usage of the Singleton pattern.
*/
public class Main {
    /**
     * This is the main method that demonstrates the usage of the Singleton pattern.
     *
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        // Print the first instance of the Singleton
        System.out.println(Singleton.getInstance());
        
        // Print the second instance of the Singleton
        System.out.println(Singleton.getInstance());
        
        // Get the runtime instance
        System.out.println(Runtime.getRuntime());
    }
}
