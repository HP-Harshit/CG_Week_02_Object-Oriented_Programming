import java.util.ArrayList;
import java.util.List;

// Class Student
class Student {
    // Class Attributes
    private String studentName;
    private String studentId;
    private List<Course> courses;

    // Constructor
    public Student(String studentName, String studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }

    // Getter for student name
    public String getStudentName() {
        return studentName;
    }

    // Getter for student ID
    public String getStudentId() {
        return studentId;
    }

    // Method to enroll in a course
    public void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }

    // Method to show enrolled courses
    public void showEnrolledCourses() {
        System.out.println("\nCourses enrolled by " + studentName + ":");
        for (Course course : courses) {
            course.printDetails();
        }
    }
}

// Class Professor
class Professor {
    // Class Attributes
    private String professorName;
    private String professorId;
    private List<Course> courses;

    // Constructor
    public Professor(String professorName, String professorId) {
        this.professorName = professorName;
        this.professorId = professorId;
        this.courses = new ArrayList<>();
    }

    // Getter for professor name
    public String getProfessorName() {
        return professorName;
    }

    // Getter for professor ID
    public String getProfessorId() {
        return professorId;
    }

    // Method to assign a course
    public void assignCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.assignProfessor(this);
        }
    }

    // Method to show assigned courses
    public void showAssignedCourses() {
        System.out.println("\nCourses taught by " + professorName + ":");
        for (Course course : courses) {
            course.printDetails();
        }
    }

    // Print professor details
    public void printDetails() {
        System.out.println("Professor Name: " + professorName);
    }
}

// Class Course
class Course {
    // Class Attributes
    private String courseName;
    private List<Student> students;
    private Professor professor;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    // Getter for course name
    public String getCourseName() {
        return courseName;
    }

    // Method to add a student
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Method to assign a professor
    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    // Print course details
    public void printDetails() {
        System.out.println("Course Name: " + courseName + ", Professor: "
                + (professor != null ? professor.getProfessorName() : "None"));
    }

    // Method to show enrolled students
    public void showEnrolledStudents() {
        System.out.println("\nStudents enrolled in " + courseName + ":");
        for (Student student : students) {
            System.out.println("- " + student.getStudentName());
        }
    }
}

// Main Class
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Object of class Course
        Course dataStructures = new Course("Data Structures");
        Course algorithms = new Course("Algorithms");

        // Object of class Professor
        Professor drSmith = new Professor("Dr. Smith", "P001");
        Professor drJohnson = new Professor("Dr. Johnson", "P002");

        // Object of class Student
        Student alice = new Student("Alice", "S001");
        Student bob = new Student("Bob", "S002");

        // Professors assign courses
        drSmith.assignCourse(dataStructures); // Dr. Smith teaches Data Structures
        drJohnson.assignCourse(algorithms); // Dr. Johnson teaches Algorithms

        // Students enroll in courses
        alice.enrollCourse(dataStructures); // Alice enrolls in Data Structures
        alice.enrollCourse(algorithms); // Alice enrolls in Algorithms
        bob.enrollCourse(dataStructures); // Bob enrolls in Data Structures

        // Show enrolled courses for students
        alice.showEnrolledCourses(); // Show courses Alice is enrolled in
        bob.showEnrolledCourses(); // Show courses Bob is enrolled in

        // Show assigned courses for professors
        drSmith.showAssignedCourses(); // Show courses taught by Dr. Smith
        drJohnson.showAssignedCourses(); // Show courses taught by Dr. Johnson

        // Show enrolled students for each course
        dataStructures.showEnrolledStudents(); // Show students in Data Structures
        algorithms.showEnrolledStudents(); // Show students in Algorithms
    }
}
