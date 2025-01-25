package practiceproblem.vehiclerentalsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Vehicle Rental System ===");
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("1234", "Car", 150, 10));
        vehicles.add(new Bike("5678", "Bike", 100, 5));
        vehicles.add(new Truck("91011", "Truck", 300, 20));

        for (Vehicle vehicle : vehicles) {
            vehicle.displayVehicleDetails();
            System.out.println("Rental Cost for 5 days: " + vehicle.calculateRentalCost(5));
            if (vehicle instanceof Insurable) {
                System.out.println("Insurance: " + ((Insurable) vehicle).calculateInsurance());
                System.out.println("Insurance Details: " + ((Insurable) vehicle).getInsuranceDetails());
            }
            System.out.println();
        }
    }
}
