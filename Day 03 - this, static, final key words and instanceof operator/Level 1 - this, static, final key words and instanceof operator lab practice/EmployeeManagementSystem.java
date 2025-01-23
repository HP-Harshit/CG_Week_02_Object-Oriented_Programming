import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter Employee name: ");
        String employeeName = input.nextLine();
        System.out.print("Enter Employee ID: ");
        int employeeID = input.nextInt();
        input.nextLine();
        System.out.print("Enter Designation: ");
        String designation = input.nextLine();
        System.out.print("Enter Salary: ");
        double salary = input.nextDouble();

        // Create an Employee object
        Employee employee = new Employee(employeeName, employeeID, designation, salary);

        // Check for instance
        System.out.println("\nIs \"employee\" is an object of \"Employee\" class? "
                + (employee instanceof Employee ? "Yes" : "No"));

        // Ask user for company name and set it
        input.nextLine(); 
        System.out.print("\nEnter Company Name: ");
        String companyName = input.nextLine();
        Employee.setCompanyName(companyName);

        // Display employee detail
        System.out.println("\n=== Employee Details ===");
        employee.displayEmployeeDetails();
        Employee.displayTotalEmployee();

        // Closing the Scanner object
        input.close();
    }
}

class Employee {
    // Attributes
    public final int employeeID;
    private double salary;
    static String companyName;
    static int totalEmployee = 0;
    public String employeeName;
    public String designation;

    // Parameterized Constructor
    public Employee(String employeeName, int employeeID, String designation, double salary) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.designation = designation;
        this.salary = salary;
        totalEmployee++;
    }

    // Setter for company name
    public static void setCompanyName(String name) {
        companyName = name;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Company name: " + companyName);
        System.out.println("Employee name: " + employeeName);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: $" + salary);
    }

    public static void displayTotalEmployee() {
        System.out.println("The total number of employee is: " + totalEmployee);
    }
}
