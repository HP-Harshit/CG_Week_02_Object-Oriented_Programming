import java.util.Scanner;

public class ProductInventory{
    public static void main(String[] args){
        // Create a Scanner class object
        Scanner input = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter the product name: ");
        String name = input.nextLine();
        System.out.print("Enter the product price: ");
        double price = input.nextDouble();

        // Create object for Product class
        Product product = new Product(name, price);

        // Display the product detail
        product.displayProductDetails();

        // Display total product {Calling class method using class name}
        Product.displayTotalProducts();

        // Closing Scanner class object
        input.close();
    }
}

class Product{
    // Instance Variable
    private String productName;
    private double price;
    // Class Variable
    private static int totalProducts=0;

    // Default Constructor
    public Product(){}

    // Parameterized Constructor
    public Product(String name, double price){
        this.productName = name;
        this.price = price;
        totalProducts++;
    }

    // Instance method to display details
    public void displayProductDetails(){
        System.out.println("\n=== Product Details ===");
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class method to display total products
    public static void displayTotalProducts(){
        System.out.println("Total Products: " + totalProducts);
    }
}