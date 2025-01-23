import java.util.Scanner;

// Base Class
class Student {
    // Attributes
    public int rollNumber;
    protected String name;
    private double cgpa;

    // Default Constructor
    public Student() {
    }

    // Parameterized Constructor
    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Setter for CGPA
    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    // Getter for CGPA
    public double getCGPA() {
        return cgpa;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}

// Sub-Class PostgraduateStudent
class PostgraduateStudent extends Student {
    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double cgpa) {
        super(rollNumber, name, cgpa);
    }

    // Method to display postgraduate student details
    @Override
    public void displayStudentDetails() {
        System.out.println("\n=== Postgraduate Student Details ===");
        super.displayStudentDetails();
    }

    // Method to change the name
    public void accessName() {
        System.out.println("\n=== Accesing Name ===");
        // Accessing the protected member 'name'
        System.out.println("Accessing name: " + name); 
    }
}

// Main Class
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter roll number: ");
        int rollNumber = input.nextInt();
        input.nextLine();
        System.out.print("Enter student name: ");
        String name = input.nextLine(); 
        System.out.print("Enter CGPA: ");
        double cgpa = input.nextDouble();

        // Create a Student object
        Student student = new Student(rollNumber, name, cgpa);
        System.out.println("\n=== Student Details ===");
        student.displayStudentDetails();

        // Modify and access the CGPA using public method
        student.setCGPA(9.5);
        System.out.println("Modified CGPA: " + student.getCGPA());

        // Create a PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(rollNumber, name, cgpa);
        pgStudent.displayStudentDetails();

        // Demonstrate protected member access and modify
        pgStudent.accessName();

        // Closing the Scanner object
        input.close();
    }
}
