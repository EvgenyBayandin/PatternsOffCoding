package ru.fsdstudio.patternsoffcoding.structuralPatterns.abstractFactory.factory.ladaDepartment;

import ru.fsdstudio.patternsoffcoding.structuralPatterns.abstractFactory.employee.CarTeamFactory;
import ru.fsdstudio.patternsoffcoding.structuralPatterns.abstractFactory.employee.Engineer;
import ru.fsdstudio.patternsoffcoding.structuralPatterns.abstractFactory.employee.Manager;
import ru.fsdstudio.patternsoffcoding.structuralPatterns.abstractFactory.employee.Worker;

/**
 * The class LadaTeamFactory implements the CarTeamFactory interface. It implements the factory method. It creates a LadaTeamFactory object.
 */
public class LadaTeamFactory implements CarTeamFactory{
    /**
     * This method returns a new instance of LadaEngineer as an Engineer.
     *
     * @return LadaEngineer object
     */
    @Override
    public Engineer getEngineer() {
        // Create and return a new instance of LadaEngineer
        return new LadaEngineer();
    }
    
    /**
     * This method returns a new instance of LadaWorker as a Worker.
     *
     * @return LadaWorker object
     */
    @Override
    public Worker getWorker() {
        // Create and return a new instance of LadaWorker
        return new LadaWorker();
    }
    
    /**
     * This method returns a new instance of LadaManager as a Manager.
     *
     * @return LadaManager object
     */
    @Override
    public Manager getManager() {
        // Create and return a new instance of LadaManager
        return new LadaManager();
    }
}
