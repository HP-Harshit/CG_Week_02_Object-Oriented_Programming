package hierarchicalinheritance.schoolsystem;

public class Main {
    public static void main(String[] args) {
        // Creating instances of each subclass
        Teacher teacher = new Teacher("John", 30, "Math");
        Student student = new Student("Alice", 20, "A");
        Staff staff = new Staff("Charlie", 45, "Maintenance");

        // Calling the displayPersonDetails and displayRole methods on each instance
        teacher.displayPersonDetails();
        teacher.displayRole();
        System.out.println();

        student.displayPersonDetails();
        student.displayRole();
        System.out.println();

        staff.displayPersonDetails();
        staff.displayRole();
    }
}
