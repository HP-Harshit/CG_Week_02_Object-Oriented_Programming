package practiceproblem.vehiclerentalsystem;

public class Car extends Vehicle implements Insurable{
    private double insuranceRate;
    public Car(String vehicleNumber, String type, double rentalRate, double insuranceRate) {
        super(vehicleNumber, type, rentalRate);
        this.insuranceRate = insuranceRate;
    }
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    @Override
    public double calculateInsurance(){
        return getRentalRate() * 0.05;
    }
    @Override
    public String getInsuranceDetails(){
        return "10% insurance rate.";
    }
    @Override
    public void displayVehicleDetails(){
        super.displayVehicleDetails();
//        System.out.println("Total rental cost: " + calculateRentalCost());
    }
}
