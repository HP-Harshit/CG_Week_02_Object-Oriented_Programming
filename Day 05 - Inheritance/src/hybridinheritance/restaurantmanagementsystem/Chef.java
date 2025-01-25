package hybridinheritance.restaurantmanagementsystem;

public class Chef extends Person implements Worker{
    // Class Attribute
    public String specialty;

    // Defining Constructor
    public Chef(String name, int id, String specialty) {
        // Calling the superclass constructor
        super(name, id);
        this.specialty = specialty;
    }

    // Implementing the performDuties method
    @Override
    public void performDuties() {
        System.out.println("Cooking delicious meals.");
    }

    // Method to display role
    public void displayRole() {
        System.out.println("Role: Chef");
        System.out.println("Specialty: " + specialty);
    }
}
