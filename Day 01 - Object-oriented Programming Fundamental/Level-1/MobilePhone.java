import java.util.Scanner;

public class MobilePhone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the number of mobile phones as input
        System.out.print("Enter the number of mobile phones: ");
        int size = input.nextInt();
        input.nextLine();

        // Creating an array object of Mobile class
        Mobile[] mobiles = new Mobile[size];

        // Initializing the objects with user input
        for (int i = 0; i < size; i++) { 
            mobiles[i] = new Mobile();
            
            // Taking the details of each mobile phone
            System.out.println("\nEnter details for Mobile Phone " + (i + 1));
            System.out.print("Enter brand: ");
            mobiles[i].setBrand(input.nextLine());

            System.out.print("Enter model: ");
            mobiles[i].setModel(input.nextLine());

            System.out.print("Enter price: ");
            mobiles[i].setPrice(input.nextDouble());
            input.nextLine();
        }

        // Displaying the details
        for (int i = 0; i < size; i++) {
            System.out.println("\n=== Mobile Phone " + (i + 1) + " Details ===");
            mobiles[i].displayDetails();
        }

        // Close the scanner object
        input.close();
    }
}

class Mobile {
    // Attributes for brand, model, and price
    private String brand;
    private String model;
    private double price;

    // Default constructor
    public Mobile() {}

    // Setter method to set the brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Setter method to set the model
    public void setModel(String model) {
        this.model = model;
    }

    // Setter method to set the price
    public void setPrice(double price) {
        this.price = price;
    }

    // Method to display the mobile details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}
