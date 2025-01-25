package multilevelinheritance.educationalcoursehierarchy;

public class Main {
    public static void main(String[] args) {
        // Creating instances of each class
        Course course = new Course("Java", 45);
        OnlineCourse onlineCourse = new OnlineCourse("Math", 8, "Zoom", true);
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Science", 12, "Google Meet", true, 200.0, 20.0);

        // Calling the displayCourseInfo method on each instance
        course.displayCourseInfo();
        System.out.println();
        onlineCourse.displayCourseInfo();
        System.out.println();
        paidOnlineCourse.displayCourseInfo();
    }
}
