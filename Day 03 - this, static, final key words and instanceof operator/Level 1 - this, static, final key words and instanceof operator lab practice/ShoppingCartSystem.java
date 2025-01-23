import java.util.Scanner;

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the product name: ");
        String productName = input.nextLine();
        System.out.println("Enter the product id: ");
        int productId = input.nextInt();
        System.out.println("Enter the product price: ");
        double price = input.nextDouble();
        input.nextLine();
        System.out.println("Enter the product quantity: ");
        int quantity = input.nextInt();
        input.nextLine();
        
        // Create an Product object
        Product product = new Product(productName, productId, price, quantity);
        
        // Check for instance
        System.out.println("\nIs \"product\" is an object of \"Product\" class? "
        + (product instanceof Product ? "Yes" : "No"));
        
        // Update Discount
        System.out.println("\nEnter the updated discount: ");
        int discount = input.nextInt();
        Product.updateDiscount(discount);

        // Display employee detail
        System.out.println("\n=== Product Details ===");
        product.display();

        // Closing the Scanner object
        input.close();
    }
}

class Product {
    // Attributes
    static int discount = 0;
    final int productId;
    private String productName;
    private double price;
    private int quantity;

    // Parameterized constructor
    public Product(String productName, int productId, double price, int quantity) {
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
    }

    // Setter for discount
    public static void updateDiscount(int discnt) {
        discount = discnt;
    }

    // Method to display details
    public void display() {
        System.out.println("Product name: " + productName);
        System.out.println("Product ID: " + productId);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}