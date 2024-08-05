package ru.fsdstudio.patternsoffcoding.structuralPatterns.abstractFactory.factory.NivaDepartment;

import ru.fsdstudio.patternsoffcoding.structuralPatterns.abstractFactory.employee.CarTeamFactory;
import ru.fsdstudio.patternsoffcoding.structuralPatterns.abstractFactory.employee.Engineer;
import ru.fsdstudio.patternsoffcoding.structuralPatterns.abstractFactory.employee.Manager;
import ru.fsdstudio.patternsoffcoding.structuralPatterns.abstractFactory.employee.Worker;

/**
 * The class NivaTeamFactory implements the CarTeamFactory interface. It implements the factory method. It creates a NivaTeamFactory object.
 */
public class NivaTeamFactory implements CarTeamFactory {
    /**
     * This method returns a new instance of NivaEngineer as an Engineer.
     *
     * @return NivaEngineer object
     */
    @Override
    public Engineer getEngineer() {
        // Create and return a new instance of NivaEngineer
        return new NivaEngineer();
    }
    
    /**
     * This method creates and returns a new instance of NivaWorker as a Worker.
     *
     * @return NivaWorker object
     */
    @Override
    public Worker getWorker() {
        // Create and return a new instance of NivaWorker
        return new NivaWorker();
    }
    
    /**
     * This method returns a new instance of NivaManager as a Manager.
     *
     * @return NivaManager object
     */
    @Override
    public Manager getManager() {
        // Create and return a new instance of NivaManager
        return new NivaManager();
    }
}
