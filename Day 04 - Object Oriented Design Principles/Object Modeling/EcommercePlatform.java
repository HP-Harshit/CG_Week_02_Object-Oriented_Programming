import java.util.ArrayList;
import java.util.List;

// Class Product
class Product {
    // Class Attributes
    private String productName;
    private double price;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    // Getter for product name
    public String getProductName() {
        return productName;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Print details
    public void printDetails() {
        System.out.println("Product Name: " + productName + ", Price: " + price);
    }
}

// Class Order
class Order {
    // Class Attributes
    private String orderId;
    private List<Product> products;

    // Constructor
    public Order(String orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    // Getter for order id
    public String getOrderId() {
        return orderId;
    }

    // Method to add product
    public void addProduct(Product product) {
        products.add(product);
    }

    // Method to show order details
    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        for (Product product : products) {
            product.printDetails();
        }
    }
}

// Class Customer
class Customer {
    // Class Attributes
    private String customerId;
    private String name;
    private List<Order> orders;

    // Constructor
    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.orders = new ArrayList<>();
    }

    // Getter for customer id
    public String getCustomerId() {
        return customerId;
    }

    // Getter for customer name
    public String getName() {
        return name;
    }

    // Method to place an order
    public void placeOrder(Order order) {
        orders.add(order);
    }

    // Method to show customer orders
    public void showCustomerOrders() {
        System.out.println("Customer Name: " + name);
        for (Order order : orders) {
            order.showOrderDetails();
        }
    }
}

// Class Main
public class EcommercePlatform {
    public static void main(String[] args) {
        // Object of class products
        Product laptop = new Product("Laptop", 1500.0);
        Product smartphone = new Product("Smartphone", 800.0);
        Product headphones = new Product("Headphones", 150.0);

        // Object of class Order
        Order order1 = new Order("O001");

        // Add product to order
        order1.addProduct(laptop);
        order1.addProduct(smartphone);

        Order order2 = new Order("O002");
        order2.addProduct(headphones);

        // Object of class Customer
        Customer customer = new Customer("C001", "John Doe");

        // Adding order to customers
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        // Show customer orders
        customer.showCustomerOrders();
    }
}
