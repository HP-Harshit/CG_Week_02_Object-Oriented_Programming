package hybridinheritance.vehiclemanagementsystem;

public class ElectricVehicle extends Vehicle {
    // Class Attribute
    public int batteryCapacity;

    // Defining Constructor
    public ElectricVehicle(int maxSpeed, String model, int batteryCapacity) {
        // Calling the superclass constructor
        super(maxSpeed, model);
        this.batteryCapacity = batteryCapacity;
    }

    // Method to charge the electric vehicle
    public void charge() {
        System.out.println("Charging the electric vehicle.");
    }

    // Overriding the displayVehicleDetails method
    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}
