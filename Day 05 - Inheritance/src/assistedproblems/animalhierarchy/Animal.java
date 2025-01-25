package assistedproblems.animalhierarchy;

public abstract class Animal {
    // Class Attributes
    String name;
    int age;

    // Defining Constructor
    public Animal(String name, int age){
        // Initializing the attributes
        this.name = name;
        this.age = age;
    }
    // Defining the abstract method
    abstract void makeSound();
}
