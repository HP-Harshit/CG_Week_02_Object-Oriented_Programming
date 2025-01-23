import java.util.ArrayList;
import java.util.List;

// Class Employee
class Employee {
    // Class Attributes
    private String empName;
    private String position;

    // Constructor
    public Employee(String empName, String position) {
        this.empName = empName;
        this.position = position;
    }

    // Getter for employee name
    public String getName() {
        return empName;
    }

    // Getter for employee Position
    public String getPosition() {
        return position;
    }
}

// Class Department
class Department{
    // Class Attributes
    private String deptName;
    private List<Employee> employees;
    
    // Constructor
    public Department(String deptName){
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    // Getter for department name
    public String getDeptName(){
        return deptName;
    }

    // Method to add employee
    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    // Getter for employee
    public List<Employee> getEmployees() {
        return employees;
    }
}

// Class Company
class Company {
    // Class Attributes
    private static String companyName;
    private List<Department> departments;

    // Constructor
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Method to add Department
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Print details
    public void printDetails() {
        System.out.println("Company Name: " + companyName);
        for (Department department : departments) {
            System.out.println("\tDepartment Name: " + department.getDeptName());
            for (Employee employee : department.getEmployees()) {
                System.out.println("\t\tEmployee Name: " + employee.getName() + ", Position: " + employee.getPosition());
            }
        }
    }
}

// Class Main
public class CompanyAndDepartmets {
    public static void main(String[] args) {
        // Object of class Company
        Company company = new Company("CG Tech Innovators");

        // Objects of class Department
        Department researchAndDevelopment = new Department("Research and Development");
        Department salesAndMarketing = new Department("Sales and Marketing");

        // Object of class Employee
        Employee alice = new Employee("Alice", "Engineer");
        Employee bob = new Employee("Bob", "Scientist");
        Employee charlie = new Employee("Charlie", "Sales Manager");
        Employee daisy = new Employee("Daisy", "Marketing Specialist");

        // Adding employees to respective departments
        researchAndDevelopment.addEmployee(alice);
        researchAndDevelopment.addEmployee(bob);
        salesAndMarketing.addEmployee(charlie);
        salesAndMarketing.addEmployee(daisy);

        // Adding department to company
        company.addDepartment(researchAndDevelopment);
        company.addDepartment(salesAndMarketing);

        // Printing details
        company.printDetails();
    }
}
