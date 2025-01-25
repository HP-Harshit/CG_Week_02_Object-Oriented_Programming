package hybridinheritance.restaurantmanagementsystem;

public class Waiter extends Person implements Worker{
    // Class Attribute
    public String section;

    // Defining Constructor
    public Waiter(String name, int id, String section) {
        // Calling the superclass constructor
        super(name, id);
        this.section = section;
    }

    // Implementing the performDuties method
    @Override
    public void performDuties() {
        System.out.println("Serving food to customers.");
    }

    // Method to display role
    public void displayRole() {
        System.out.println("Role: Waiter");
        System.out.println("Section: " + section);
    }
}
