import java.util.ArrayList;
import java.util.List;

// Class Faculty
class Faculty {
    // Class Attributes
    private String facultyName;

    // Constructor
    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    // Getter for faculty name
    public String getFacultyName() {
        return facultyName;
    }

    // Print faculty details
    public void printDetails() {
        System.out.println("Faculty Name: " + facultyName);
    }
}

// Class Department
class Department {
    // Class Attributes
    private String DeptName;

    // Constructor
    public Department(String DeptName) {
        this.DeptName = DeptName;
    }

    // Getter for department name
    public String getDeptName() {
        return DeptName;
    }

    // Print department details
    public void printDetails() {
        System.out.println("Department Name: " + DeptName);
    }
}

// Class University
class University {
    // Class Attributes
    private String UniversityName;
    private List<Department> departments;
    private List<Faculty> faculties;

    // Constructor
    public University(String UniversityName) {
        this.UniversityName = UniversityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Method to add a department
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Method to add a faculty
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Method to show all departments
    public void showDepartments() {
        System.out.println("Departments at " + UniversityName + ":");
        for (Department department : departments) {
            System.out.println("- " + department.getDeptName());
        }
    }

    // Method to show all faculties
    public void showFaculties() {
        System.out.println("Faculties at " + UniversityName + ":");
        for (Faculty faculty : faculties) {
            System.out.println("- " + faculty.getFacultyName());
        }
    }

    // Method to delete the university
    public void deleteUniversity() {
        departments.clear();
        faculties.clear();
        System.out.println(UniversityName + " has been deleted, along with all its departments and faculty members.");
    }
}

// Main Class
public class UniversityFacultyDepartments {
    public static void main(String[] args) {
        // Object of class University
        University university = new University("Tech University");

        // Object of class Department
        Department computerScience = new Department("Computer Science");
        Department electricalEngineering = new Department("Electrical Engineering");

        // Add departments to the university
        university.addDepartment(computerScience);
        university.addDepartment(electricalEngineering);

        // Object of class Faculty
        Faculty drAlice = new Faculty("Dr. Alice");
        Faculty drBob = new Faculty("Dr. Bob");

        // Add faculty members to the university
        university.addFaculty(drAlice);
        university.addFaculty(drBob);

        // Show departments and faculties
        university.showDepartments();
        university.showFaculties();

        // Demonstrate the composition relationship by deleting the university
        university.deleteUniversity();

        // Faculties still exist independently
        drAlice.printDetails(); // Should still print details of Dr. Alice
        drBob.printDetails(); // Should still print details of Dr. Bob
    }
}
