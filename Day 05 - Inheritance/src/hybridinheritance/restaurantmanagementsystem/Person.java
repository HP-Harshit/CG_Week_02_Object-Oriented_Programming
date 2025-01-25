package hybridinheritance.restaurantmanagementsystem;

public class Person {
    // Class Attributes
    public String name;
    public int id;

    // Defining Constructor
    public Person(String name, int id) {
        // Initializing the attributes
        this.name = name;
        this.id = id;
    }

    // Method to display person details
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
