package hierarchicalinheritance.schoolsystem;

public class Person {
    // Class Attributes
    public String name;
    public int age;

    // Defining Constructor
    public Person(String name, int age) {
        // Initializing the attributes
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
