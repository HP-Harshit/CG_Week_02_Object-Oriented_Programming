package hierarchicalinheritance.schoolsystem;

public class Staff extends Person{
    // Class Attribute
    String department;

    // Defining Constructor
    public Staff(String name, int age, String department) {
        // Calling the superclass constructor
        super(name, age);
        this.department = department;
    }

    // Method to display role
    public void displayRole() {
        System.out.println("Staff is working");
        System.out.println("Department: " + department);
    }
}
