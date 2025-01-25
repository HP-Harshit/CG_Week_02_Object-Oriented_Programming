package practiceproblem.ridehailingapplication;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create vehicle objects
        Car car = new Car("V001", "Alice", 10.0);
        Bike bike = new Bike("V002", "Bob", 5.0);
        Auto auto = new Auto("V003", "Charlie", 7.0);

        // Set locations for each vehicle
        car.updateLocation("Upper Lake");
        bike.updateLocation("Van Vihar National Park");
        auto.updateLocation("Anand Nagar");

        // Add vehicles to list
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        double distance = 15.0; // Example distance

        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails();
            System.out.println("Current Location: " + ((GPS) vehicle).getCurrentLocation());
            System.out.println("Fare for " + distance + " km: " + vehicle.calculateFare(distance));
            System.out.println();
        }
    }
}


