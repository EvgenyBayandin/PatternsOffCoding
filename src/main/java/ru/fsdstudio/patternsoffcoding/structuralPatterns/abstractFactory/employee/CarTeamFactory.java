package ru.fsdstudio.patternsoffcoding.structuralPatterns.abstractFactory.employee;

/**
 * The interface Car team factory.
 */
public interface CarTeamFactory {
    /**
     * Get the engineer from the team.
     *
     * @return The Engineer object representing an engineer.
     */
    Engineer getEngineer();
    
    /**
     * Get the worker from the team.
     *
     * @return The Worker object representing a worker.
     */
    Worker getWorker();
    
    /**
     * Get the manager from the team.
     *
     * @return The Manager object representing a manager.
     */
    Manager getManager();
}
