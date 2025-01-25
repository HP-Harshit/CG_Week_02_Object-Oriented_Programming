package hybridinheritance.vehiclemanagementsystem;

public class Vehicle {
    // Class Attributes
    public String model;
    public int maxSpeed;

    // Defining Constructor
    public Vehicle(int maxSpeed, String model) {
        // Initializing the attributes
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Method to display vehicle details
    void displayVehicleDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}
