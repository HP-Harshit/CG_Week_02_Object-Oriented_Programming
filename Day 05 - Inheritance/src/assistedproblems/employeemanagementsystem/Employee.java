package assistedproblems.employeemanagementsystem;

public class Employee {
    // Class Attributes
    public String name;
    public int id;
    public double salary;

    // Defining Constructor
    public Employee(String name, int id, double salary) {
        // Initializing the attributes
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}
