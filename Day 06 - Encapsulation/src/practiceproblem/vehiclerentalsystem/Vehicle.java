package practiceproblem.vehiclerentalsystem;

public abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    public Vehicle(String vehicleNumber, String type, double rentalRate){
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public double getRentalRate() {
        return rentalRate;
    }
    abstract double calculateRentalCost(int days);
    public void displayVehicleDetails(){
        System.out.println("=== Vehicle Details ===");
        System.out.println("Vehicle number: " + vehicleNumber);
        System.out.println("Vehicle type: " + type);
        System.out.println("Rental rate per day: " + rentalRate);
    }
}
