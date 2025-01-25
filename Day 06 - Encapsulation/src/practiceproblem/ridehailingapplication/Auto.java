package practiceproblem.ridehailingapplication;

public class Auto extends Vehicle implements GPS {
    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        currentLocation = location;
    }

    @Override
    public void getVehicleDetails() {
        super.getVehicleDetails();
        System.out.println("Current Location: " + getCurrentLocation());
    }
}
