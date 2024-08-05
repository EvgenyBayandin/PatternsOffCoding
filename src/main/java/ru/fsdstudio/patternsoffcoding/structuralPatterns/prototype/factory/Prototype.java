package ru.fsdstudio.patternsoffcoding.structuralPatterns.prototype.factory;

/**
 * This interface represents the prototype pattern and defines the copy method.
 */
public interface Prototype {
    /**
     * Creates and returns a copy of the current object.
     *
     * @return a copy of the current object
     */
    Object copy();
}
