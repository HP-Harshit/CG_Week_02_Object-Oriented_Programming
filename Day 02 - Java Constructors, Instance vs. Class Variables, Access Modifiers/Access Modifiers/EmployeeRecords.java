import java.util.Scanner;

// Base Class
class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    // Default Constructor
    public Employee() {
    }

    // Parameterized Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Sub-Class Manager
class Manager extends Employee {
    // Constructor
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    // Method to display manager details
    @Override
    public void displayEmployeeDetails() {
        System.out.println("\n=== Manager Details ===");
        super.displayEmployeeDetails();
    }

    // Method to demonstrate access to employeeID and department
    public void accessEmployeeDetails() {
        System.out.println("Accessing Employee ID: " + employeeID); // Public member
        System.out.println("Accessing Department: " + department); // Protected member
    }
}

// Main Class
public class EmployeeRecords {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter Employee ID: ");
        int employeeID = input.nextInt();
        input.nextLine();
        System.out.print("Enter Department: ");
        String department = input.nextLine();
        System.out.print("Enter Salary: ");
        double salary = input.nextDouble();

        // Create an Employee object
        Employee employee = new Employee(employeeID, department, salary);
        System.out.println("\n=== Employee Details ===");
        employee.displayEmployeeDetails();

        // Modify and access the salary using public method
        System.out.println("\nEnter the new salary: ");
        double newSalary = input.nextDouble();
        employee.setSalary(newSalary);
        System.out.println("Modified Salary: $" + employee.getSalary());

        // Create a Manager object
        Manager manager = new Manager(employeeID, department, salary);
        manager.displayEmployeeDetails();

        // Demonstrate access to employeeID and department in Manager class
        System.out.println("\nDemonstrating access modifiers in Manager class:");
        manager.accessEmployeeDetails();

        // Closing the Scanner object
        input.close();
    }
}
