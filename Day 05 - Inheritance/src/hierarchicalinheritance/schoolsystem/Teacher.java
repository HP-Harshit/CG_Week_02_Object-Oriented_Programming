package hierarchicalinheritance.schoolsystem;

public class Teacher extends Person{
    // Class Attribute
    public String subject;

    // Defining Constructor
    public Teacher(String name, int age, String subject) {
        // Calling the superclass constructor
        super(name, age);
        this.subject = subject;
    }

    // Method to display role
    public void displayRole() {
        System.out.println(name + " is teaching " + subject);
    }
}
