public class Employee {
	public static void main(String[] args) {
		// Create an Employee class object
		EmployeeClass employee1 = new EmployeeClass();
		EmployeeClass employee2 = new EmployeeClass();

		// Set details using setter methods
		employee1.setName("Harsh");
		employee1.setId(1);
		employee1.setSalary(29245);

		employee2.setName("Veer");
		employee2.setId(2);
		employee2.setSalary(28125);

		// Display details of each employee
		System.out.println("=== Employee 1 ===");
		employee1.displayDetails();
		System.out.println("\n=== Employee 2 ===");
		employee2.displayDetails();
	}
}

class EmployeeClass {
	// Attributes for name, id, and salary
	private String name;
	private int id;
	private double salary;

	// Default constructor
	public EmployeeClass() {}

	// Setter method to set the name
	public void setName(String name) {
		this.name = name;
	}

	// Setter method to set the id
	public void setId(int id) {
		this.id = id;
	}

	// Setter method to set the salary
	public void setSalary(double salary) {
		this.salary = salary;
	}

	// Method to display Employee details
	public void displayDetails() {
		System.out.println("The Employee name: " + name);
		System.out.println("The Employee id: " + id);
		System.out.println("The Employee salary: " + salary);
	}
}
