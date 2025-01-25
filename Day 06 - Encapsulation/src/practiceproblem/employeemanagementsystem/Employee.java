package practiceproblem.employeemanagementsystem;

public abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public int getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public abstract double calculateSalary();
    public void displayDetails(){
        System.out.println("\n=== Employee Details ===");
        System.out.println("Name: " + name);
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Salary: " + baseSalary);
    }
}
