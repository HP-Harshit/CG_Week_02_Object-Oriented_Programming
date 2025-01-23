import java.util.Scanner;

public class OnlineCourseManagement {
    public static void main(String[] args){
        // Create a scanner class object
        Scanner input = new Scanner(System.in);

        // Ask user input for institute name
        System.out.println("Enter the name of the institute:");
        String instituteName = input.nextLine();

        // Update the institute name
        Course.updateInstituteName(instituteName);

        // Ask for user input
        System.out.println("Enter the course name:");
        String courseName = input.nextLine();
        System.out.println("Enter the course duration(in days):");
        int courseDuration = input.nextInt();
        System.out.println("Enter the course fee:");
        double courseFee = input.nextDouble();
    
        // Create a course class object
        Course course = new Course(courseName, courseDuration, courseFee);

        // Display course details
        course.displayCourseDetail();

        // Closing the scanner object
        input.close();
    }
}


class Course{
    // Instance Variable
    private String courseName;
    private int duration;
    private double fee;
    // Class Variable
    private static String instituteName;

    // Default constructor
    public Course(){}

    // Parameterized constructor
    public Course(String courseName, int duration, double fee){
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course detail
    public void displayCourseDetail(){
        System.out.println("\n=== Course Details ===");
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: "+courseName);
        System.out.println("Duration: "+duration+" days");
        System.out.println("Fee: "+fee);
    }

    // Class method to update institute name
    public static void updateInstituteName(String name){
        instituteName = name;
    }
}