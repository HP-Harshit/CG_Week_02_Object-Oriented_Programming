package practiceproblem.vehiclerentalsystem;

public class Truck extends Vehicle implements Insurable {
    private double insuranceRate;

    public Truck(String vehicleNumber, String type, double rentalRate, double insuranceRate) {
        super(vehicleNumber, type, rentalRate);
        this.insuranceRate = insuranceRate;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.2;
    }

    @Override
    public String getInsuranceDetails() {
        return "20% insurance rate.";
    }
}
