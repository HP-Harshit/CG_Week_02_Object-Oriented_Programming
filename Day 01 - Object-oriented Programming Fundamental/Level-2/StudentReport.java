import java.util.Arrays;

public class StudentReport {
    public static void main(String[] args) {
        // Create an object of the Student class
        Student student = new Student();

        double[] marks = { 85, 96, 92 };

        // Set the student's details using setter methods
        student.setName("Harsh");
        student.setRollNumber(18);
        student.setMarks(marks);

        // Display Student details
        student.displayDetails();
    }
}

class Student {
    // Attributes for name, roll number, and marks
    private String name;
    private int rollNumber;
    private double[] marks;
    private double totalMarks;
    private double average;

    // Default constructor
    public Student() {
    }

    // Setter method to set the name
    public void setName(String name) {
        this.name = name;
    }

    // Setter method to set the roll number
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Setter method to set the marks
    public void setMarks(double[] marks) {
        this.marks = marks;
        calculateTotalAndAverage();
    }

    // Method to calculate the total marks and average
    private void calculateTotalAndAverage() {
        totalMarks = 0;
        // Calculate the total marks
        for (double mark : marks) {
            totalMarks += mark;
        }
        // Calculate the average marks
        average = totalMarks / marks.length;
    }

    // Method to calculate the grade
    public String calculateGrade() {
        // Determine the grade based on the average marks
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else if (average >= 50) {
            return "E";
        } else {
            return "F";
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + Arrays.toString(marks));
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + calculateGrade());
    }
}
