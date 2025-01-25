package practiceproblem.employeemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Employee Management System");
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee john = new FullTimeEmployee(001, "John", 2499.99, 3499.99);
        PartTimeEmployee alice = new PartTimeEmployee(002, "Alice", 1999.99, 799.49, 6);

        john.assignDepartment("Computer Science");
        alice.assignDepartment("Mechanical");

        employees.add(john);
        employees.add(alice);

        for(Employee employee : employees){
            employee.displayDetails();
        }
    }
}
