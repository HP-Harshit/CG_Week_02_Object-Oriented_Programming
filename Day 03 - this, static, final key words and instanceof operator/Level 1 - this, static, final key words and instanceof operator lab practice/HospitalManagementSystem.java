import java.util.Scanner;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Create a scanner class object
        Scanner input = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter patient name: ");
        String name = input.nextLine();
        System.out.print("Enter patient Id: ");
        int patientId = input.nextInt();
        System.out.print("Enter patient age: ");
        int age = input.nextInt();
        input.nextLine();
        System.out.print("Enter ailment: ");
        String ailment = input.nextLine();
        
        // Create an object of Patient class
        Patient patient = new Patient(name, patientId, age, ailment);
        
        // Check for instance
        System.out.println("\nIs \"patient\" is an object of \"Patient\" class? "
        + (patient instanceof Patient ? "Yes" : "No"));
        
        // Setting Hospital Name
        System.out.print("\nEnter Hospital name: ");
        String hospital = input.nextLine();
        Patient.setHospitalName(hospital);

        // Display details
        System.out.println("\n=== Patient Details ===");
        patient.displayDetail();
        System.out.println("\nThe total number of patients is: " + Patient.getTotalPatients());

        // Closing scanner class object
        input.close();
    }
}

class Patient{
    // Attributes
    static String hospitalName;
    static int totalPatient=0;
    private String name;
    private final int patientId;
    private int age;
    private String ailment;

    // Parameterized constructor
    public Patient(String name, int patientId, int age, String ailment){
        this.name = name;
        this.patientId = patientId;
        this.age = age;
        this.ailment = ailment;
        totalPatient++;
    }

    // Setter for Hospital name
    public static void setHospitalName(String hospital){
        hospitalName = hospital;
    }

    // Static method to get total patient count
    public static int getTotalPatients(){
        return totalPatient;
    }

    // Method to display detail
    public void displayDetail(){
        System.out.println("\nHospital name: " + hospitalName);
        System.out.println("Patient name: " + name);
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient age: " + age);
        System.out.println("Ailment: " + ailment);
    }
}