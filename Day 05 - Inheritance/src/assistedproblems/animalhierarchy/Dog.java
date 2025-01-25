package assistedproblems.animalhierarchy;

public class Dog extends Animal{
    // Defining the constructor
    public Dog(String name, int age){
        // Calling the superclass constructor
        super(name, age);
    }

    // Overriding the abstract method
    @Override
    public void makeSound(){
        System.out.println(name + " is barking.");
    }
}
