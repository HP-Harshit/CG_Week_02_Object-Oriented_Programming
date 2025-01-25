package assistedproblems.animalhierarchy;

public class Cat extends Animal{
    // Defining the constructor
    public Cat(String name, int age){
        // Calling the superclass constructor
        super(name, age);
    }

    // Overriding the abstract method
    @Override
    public void makeSound(){
        System.out.println(name + " is meowing.");
    }
}
