import java.util.Scanner;

public class DrawCircle {
    public static void main(String[] args) {
        // Create a Scanner class object
        Scanner input = new Scanner(System.in);

        // Default object
        Circle circle1 = new Circle();
        
        // Parameterized object
        System.out.println("\nEnter the radius of the circle:");
        double radius = input.nextDouble();
        Circle circle2 = new Circle(radius);

        // Accessing the methods of the Circle class
        System.out.println("=== Circle 1 with default value ===");
        circle1.displayDetails();
        
        System.out.println("\n=== Circle 2 with user-provided value ===");
        circle2.displayDetails();
        
        // Closing the Scanner object
        input.close();
    }
}

class Circle {
    // Instance Variable
    private double radius;

    // Default constructor
    public Circle() {
        this(2); // Default radius value is set to 2
    }

    // Parameterized constructor with constructor chaining
    public Circle(double radius) {
        setRadius(radius);
    }

    // Setter for radius
    private void setRadius(double radius) {
        if (radius < 0) {
            System.out.println("Radius cannot be negative");
        } else {
            this.radius = radius;
        }
    }

    // Getter for radius
    private double getRadius() {
        return radius;
    }

    // Method to display circle details
    public void displayDetails() {
        System.out.println("Radius of the circle is: " + getRadius() + " cm");
    }
}
