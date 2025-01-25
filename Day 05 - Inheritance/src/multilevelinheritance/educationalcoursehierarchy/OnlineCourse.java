package multilevelinheritance.educationalcoursehierarchy;

public class OnlineCourse extends Course{
    // Class Attributes
    public String platform;
    public boolean isRecorded;

    // Defining Constructor
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        // Calling the superclass constructor
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Overriding the displayCourseInfo method
    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}
