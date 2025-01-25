package assistedproblems.employeemanagementsystem;

public class Manager extends Employee{
    // Class Attribute
    public int teamSize;

    // Defining Constructor
    public Manager(String name, int id, double salary, int teamSize) {
        // Calling the superclass constructor
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    // Overriding the displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}
