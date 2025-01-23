import java.util.ArrayList;
import java.util.List;

// Class Student
class Student {
    // Class Attributes
    private String name;
    private String studentId;
    private List<Course> courses;

    // Constructor
    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for student ID
    public String getStudentId() {
        return studentId;
    }

    // Method to enroll in a course
    public void enrollInCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    // Method to show enrolled courses
    public void showEnrolledCourses() {
        System.out.println("\nCourses enrolled by " + name + ":");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

// Class Course
class Course {
    // Class Attributes
    private String courseName;
    private List<Student> enrolledStudents;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    // Getter for course name
    public String getCourseName() {
        return courseName;
    }

    // Method to enroll a student
    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }

    // Method to show enrolled students
    public void showEnrolledStudents() {
        System.out.println("\nStudents enrolled in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getName());
        }
    }
}

// Class School
class School {
    // Class Attributes
    private String schoolName;
    private List<Course> courses;
    private List<Student> students;

    // Constructor
    public School(String schoolName) {
        this.schoolName = schoolName;
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    // Method to add a course
    public void addCourse(Course course) {
        courses.add(course);
    }

    // Method to add a student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to show all courses
    public void showCourses() {
        System.out.println("\nCourses offered by " + schoolName + ":");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

// Main Class
public class SchoolAndStudents {
    public static void main(String[] args) {
        // Object of class School
        School school = new School("Sunnyvale High School");

        // Object of class Course
        Course maths = new Course("Mathematics");
        Course science = new Course("Science");

        // Add courses to the school
        school.addCourse(maths);
        school.addCourse(science);

        // Object of class Student
        Student alice = new Student("Alice", "S001");
        Student bob = new Student("Bob", "S002");

        // Add students to the school
        school.addStudent(alice);
        school.addStudent(bob);

        // Enroll students in courses
        alice.enrollInCourse(maths); // Alice enrolls in Mathematics
        alice.enrollInCourse(science); // Alice enrolls in Science
        bob.enrollInCourse(maths); // Bob enrolls in Mathematics

        // Show enrolled students for each course
        maths.showEnrolledStudents(); // Show students in Mathematics
        science.showEnrolledStudents(); // Show students in Science

        // Show all courses offered by the school
        school.showCourses();

        // Show courses enrolled by each student
        alice.showEnrolledCourses(); // Show courses Alice is enrolled in
        bob.showEnrolledCourses(); // Show courses Bob is enrolled in
    }
}
