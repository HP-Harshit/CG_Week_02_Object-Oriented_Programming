import java.util.Scanner;

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        // Create a Scanner class object
        Scanner input = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter the owner's name: ");
        String ownerName = input.nextLine();
        System.out.print("Enter the vehicle type (Car, Bus, or Motorcycle): ");
        String vehicleType = input.nextLine();
        System.out.print("Enter the vehicle Registration Number: ");
        String registrationNumber = input.nextLine();
        System.out.print("Enter the registration fee: ");
        double registrationFee = input.nextDouble();

        // Update the Registration fee
        Vehicle.updateRegistrationFee(registrationFee);

        // create a Vehicle object
        Vehicle vehicle = new Vehicle(ownerName, vehicleType, registrationNumber);

        // Check for instance
        System.out.println("\nIs \"vehicle\" is an object of \"Vehicle\" class? "
                + (vehicle instanceof Vehicle ? "Yes" : "No"));

        // Display the vehicle details
        vehicle.displayVehicleDetail();

        // Closing Scanner object
        input.close();
    }
}

class Vehicle {
    // Attributes
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;
    private static double registrationFee;

    // Parameterized constructor
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Method to display detail
    public void displayVehicleDetail() {
        System.out.println("\n=== Course Details ===");
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Method to update registration fee name
    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
}