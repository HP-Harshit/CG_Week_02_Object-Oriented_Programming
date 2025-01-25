package practiceproblem.employeemanagementsystem;

public class PartTimeEmployee extends Employee implements Department{
    private double hourlyRate;
    private int workHours;
    private String department;
    PartTimeEmployee(int employeeId, String name, double baseSalary, double hourlyRate, int workHours){
        super(employeeId, name, baseSalary);
        this.hourlyRate = hourlyRate;
        this.workHours = workHours;
    }
    @Override
    public double calculateSalary() {
        return workHours*hourlyRate;
    }
    @Override
    public void assignDepartment(String department){
        this.department = department;
    }
    @Override
    public String getDepartmentDetails(){
        return department;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Part-Time Employee");
        System.out.println("Department: " + getDepartmentDetails());
        System.out.println("Woring hours: " + workHours);
        System.out.println("Calculated salary: " + calculateSalary());
    }
}
