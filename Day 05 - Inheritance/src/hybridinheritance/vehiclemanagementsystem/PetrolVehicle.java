package hybridinheritance.vehiclemanagementsystem;

public class PetrolVehicle extends Vehicle implements Refuelable {
    // Class Attribute
    double fuelTankCapacity;

    // Defining Constructor
    public PetrolVehicle(int maxSpeed, String model, double fuelTankCapacity) {
        // Calling the superclass constructor
        super(maxSpeed, model);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    // Implementing the refuel method
    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle.");
    }

    // Overriding the displayVehicleDetails method
    @Override
    void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
    }
}
