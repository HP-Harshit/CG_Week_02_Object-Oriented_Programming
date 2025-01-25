package multilevelinheritance.educationalcoursehierarchy;

public class Course {
    // Class Attributes
    public String courseName;
    public int duration;

    // Defining Constructor
    public Course(String courseName, int duration) {
        // Initializing the attributes
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display course information
    public void displayCourseInfo() {
        System.out.println("Course name: " + courseName);
        System.out.println("Course duration: " + duration + " weeks.");
    }
}
