package assistedproblems.employeemanagementsystem;

public class Developer extends Employee{
    // Class Attribute
    public String programmingLanguage;

    // Defining Constructor
    public Developer(String name, int id, double salary, String programmingLanguage) {
        // Calling the superclass constructor
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Overriding the displayDetails method
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
