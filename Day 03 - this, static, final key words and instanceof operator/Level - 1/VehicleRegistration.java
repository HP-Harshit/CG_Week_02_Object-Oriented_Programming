import java.util.Scanner;

public class VehicleRegistration {
    public static void main(String[] args){
        // Create a Scanner class object
        Scanner input = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter the owner's name: ");
        String ownerName = input.nextLine();
        System.out.print("Enter the vehicle type (Car, Bus, or Motorcycle): ");
        String vehicleType = input.nextLine();
        System.out.print("Enter the registration fee: ");
        double registrationFee = input.nextDouble();

        // Update the Registration fee
        Vehicle.updateRegistrationFee(registrationFee);

        // create a Vehicle object
        Vehicle vehicle = new Vehicle(ownerName, vehicleType);

        // Display the vehicle details
        vehicle.displayVehicleDetail();

        // Closing Scanner object
        input.close();
    }
}

class Vehicle{ 
    // Instance Variables
    private String ownerName;
    private String vehicleType;
    // Class Variables
    private static double registrationFee;

    // Default constructor
    public Vehicle(){}

    // Parameterized constructor
    public Vehicle(String ownerName, String vehicleType){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display course detail
    public void displayVehicleDetail() {
        System.out.println("\n=== Course Details ===");
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Veicle type: " + vehicleType);
        System.out.println("Registration type: " + registrationFee);
    }

    // Class method to update registration fee name
    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
}