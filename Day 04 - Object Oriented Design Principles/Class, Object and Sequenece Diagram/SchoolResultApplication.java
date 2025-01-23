import java.util.ArrayList;
import java.util.List;


// Student Class
class  Subject{
    // Class Attributes
    private String subjectName;
    private int marks;

    // Constructor
    public Subject(String SubjectName, int marks){
        this.subjectName = subjectName;
        this.marks = marks;
    }

    // Getter for subject name
    public String getSubjName(){
        return subjectName;
    }

    // Getter for marks
    public int getMarks(){
        return marks;
    }
}

// Class Student
class Student{
    // Class Attributes
    private String stdName;
    private List<Subject> subjects;

    // Constructor
    public Student(String stdName){
        this.stdName = stdName;
        this.subjects = new ArrayList<>();
    }

    // Method to add subject
    public void addSubject(Subject subject){
        subjects.add(subject);
    }

    // Getter for subjects
    public List<Subject> getSubject(){
        return subjects;
    }

    // Getter for subject count
    public int getSubjCount(){
        return subjects.size();
    }

    // Getter for student name
    public String getStdName(){
        return stdName;
    }
}

// Class GradeCalculator
class GradeCalculator{
    // Method to calculate Grade
    public static String calculateGrade(Student student){
        // Initial marks
        int totalMarks = 0;
        // Total subject count
        int totalSubj = student.getSubjCount();

        // Check for subject count
        if(totalSubj == 0){
            return "No subject available.";
        } else {

            // Iterate to get total marks
            for (Subject subject : student.getSubject()) {
                totalMarks += subject.getMarks();
            }

            // Calculate average
            double avg = (double)totalMarks/(double)totalSubj;
            
            // Checking for Grade
            if (avg >= 90) {
                return "A";
            } else if (avg >= 80) {
                return "B";
            } else if (avg >= 70) {
                return "C";
            } else if (avg >= 60) {
                return "D";
            } else {
                return "F";
            }
        }
    }
}

// Main Class
public class SchoolResultApplication{
    public static void main(String[] args) {
        
        // Object of subject class
        Subject maths = new Subject("Maths", 90);
        Subject science = new Subject("Science", 85);

        // Object of student class
        Student john = new Student("John");

        // Add subjects to student object
        john.addSubject(maths);
        john.addSubject(science);

        // Calculating Grade
        String Grade = GradeCalculator.calculateGrade(john);

        // Printing the result
        System.out.println("Student: " + john.getStdName() + " , Grade: "+ Grade);
    }
}