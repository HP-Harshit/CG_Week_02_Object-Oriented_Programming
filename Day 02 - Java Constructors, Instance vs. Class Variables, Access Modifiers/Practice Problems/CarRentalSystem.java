import java.util.Scanner;

public class CarRentalSystem {
    public static void main(String[] args) {
        // Create a new Scanner object
        Scanner input = new Scanner(System.in);

        // Ask for user input
        System.out.println("Enter the customer name:");
        String customerName = input.nextLine();
        System.out.println("Enter the car model:");
        String carModel = input.nextLine();
        System.out.println("Enter the rental days:");
        int rentalDays = input.nextInt();
        System.out.println("Enter the rental cost per day:");
        double rentalCost = input.nextDouble();

        // Create a CarRental object with user-provided data
        CarRental carRental = new CarRental(customerName, carModel, rentalDays, rentalCost);

        // Display the car rental details
        carRental.displayCarRentalDetails();

        // Close the scanner object
        input.close();
    }
}

class CarRental {
    // Instance Variable
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double rentalCost;

    // Default constructor
    public CarRental() {
        this("Customer", "Car Model", 0, 0.0);
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays, double rentalCost) {
        setCustomerName(customerName);
        setCarModel(carModel);
        setRentalDays(rentalDays);
        setRentalCost(rentalCost);
    }

    // Setter for customer name
    private void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // Setter for car model
    private void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    // Setter for rental days
    private void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    // Setter for rental cost
    private void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    // Getter for customer name
    private String getCustomerName() {
        return this.customerName;
    }

    // Getter for car model
    private String getCarModel() {
        return this.carModel;
    }

    // Getter for rental days
    private int getRentalDays() {
        return this.rentalDays;
    }

    // Getter for rental cost per day
    private double getRentalCost() {
        return this.rentalCost;
    }

    // Method to calculate total rental cost
    public double getTotalRentalCost() {
        return this.rentalDays * this.rentalCost;
    }

    // Method to display car rental details
    public void displayCarRentalDetails() {
        System.out.println("\n=== Rental Details ===");
        System.out.println("Customer Name: " + getCustomerName());
        System.out.println("Car Model: " + getCarModel());
        System.out.println("Rental Days: " + getRentalDays());
        System.out.println("Rental Cost: " + getRentalCost() + " per day.");
        System.out.println("Total Rental Cost: " + getTotalRentalCost());
    }
}
