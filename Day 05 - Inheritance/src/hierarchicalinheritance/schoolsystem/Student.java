package hierarchicalinheritance.schoolsystem;

public class Student extends Person{
    // Class Attribute
    public String grade;

    // Defining Constructor
    public Student(String name, int age, String grade) {
        // Calling the superclass constructor
        super(name, age);
        this.grade = grade;
    }

    // Method to display role
    public void displayRole() {
        System.out.println(name + " grade in study is " + grade);
    }
}
