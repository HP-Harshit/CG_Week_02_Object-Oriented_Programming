import java.util.Scanner;

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
        input.nextLine();
        System.out.print("Enter student grade: ");
        String grade = input.nextLine();

        // Create a Student object
        Student student = new Student(rollNumber, name, cgpa, grade);
        
        // Check for instance
        System.out.println("\nIs \"student\" is an object of \"Student\" class? "
                + (student instanceof Student ? "Yes" : "No"));

        // Updating University Name
        System.out.print("\nEnter University name: ");
        String university = input.nextLine();

        Student.setUniversityName(university);

        // Displaying details
        System.out.println("\n=== Student Details ===");
        student.displayStudentDetails();
        System.out.println("\nThe total number of student is: " + Student.getTotalStudent());

        // Closing the Scanner object
        input.close();
    }
}
 
class Student {
    // Attributes
    public final int rollNumber;
    protected String name;
    private double cgpa;
    private String grade;
    static String universityName;
    static int totalStudent = 0;

    // Parameterized Constructor
    public Student(int rollNumber, String name, double cgpa, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
        this.grade = grade;
        totalStudent++;
    }

    // Setter for university
    public static void setUniversityName(String university) {
        universityName = university;
    }

    // Getter for total student
    public static int getTotalStudent() {
        return totalStudent;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("University Name: " + universityName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Grade: " + grade);
    }
}
