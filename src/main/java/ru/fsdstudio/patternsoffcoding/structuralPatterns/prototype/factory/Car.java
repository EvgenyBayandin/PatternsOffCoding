package ru.fsdstudio.patternsoffcoding.structuralPatterns.prototype.factory;

/**
 * This class represents the prototype pattern and defines the copy method. It is used to create a new object from an existing object.
 */
public class Car implements Prototype{
    
    private int id;
    
    private String name;
    
    private Boolean trunk;
    
    public Car(int id, String name, Boolean trunk) {
        this.id = id;
        this.name = name;
        this.trunk = trunk;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Boolean getTrunk() {
        return trunk;
    }
    
    public void setTrunk(Boolean trunk) {
        this.trunk = trunk;
    }
    
    /**
     * This method creates a deep copy of the current object.
     *
     * @return A new instance of the Car class with the same properties as the current object.
     */
    @Override
    public Object copy() {
        // Create a new instance of the Car class with the same properties as the current object
        return new Car(this.id, this.name, this.trunk);
    }
    
    @Override
    public String toString() {
        return "Car{" + "id=" + id + ", name='" + name + '\'' + ", trunk=" + trunk + '}';
    }
    
    /**
     * This method clones the current object.
     *
     * @return A copy of the current object.
     */
    @Override
    public Prototype clone() {
        // The copy method is called to create a new object.
        // The object is cast to a Prototype.
        return (Prototype) copy();
    }
}
