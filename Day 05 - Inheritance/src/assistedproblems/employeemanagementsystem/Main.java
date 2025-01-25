package assistedproblems.employeemanagementsystem;

public class Main {
    public static void main(String[] args) {
        // Creating instances of the subclasses
        Manager manager = new Manager("Alice", 101, 75000, 10);
        Developer developer = new Developer("Bob", 102, 60000, "Java");
        Intern intern = new Intern("Charlie", 103, 20000, "MIT");

        // Calling the displayDetails method on each instance
        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}
