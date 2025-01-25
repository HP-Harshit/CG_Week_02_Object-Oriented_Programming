package assistedproblems.employeemanagementsystem;

public class Intern extends Employee{
    // Class Attribute
    String universityName;

    // Defining Constructor
    Intern(String name, int id, double salary, String universityName) {
        // Calling the superclass constructor
        super(name, id, salary);
        this.universityName = universityName;
    }

    // Overriding the displayDetails method
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("University Name: " + universityName);
    }
}
