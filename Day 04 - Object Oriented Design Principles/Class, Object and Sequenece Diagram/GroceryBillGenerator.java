import java.util.ArrayList;
import java.util.List;

// Class Product
class Product{
    // Class Attributes
    private String productName;
    private double price;
    private int quantity;

    // Constructor
    public Product(String  productName, double price, int quantity){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter for product name
    public String getProduct(){
        return productName;
    }

    // Getter for Price
    public double getPrice(){
        return price;
    }

    // Getter for Quantity
    public int getQuantity(){
        return quantity;
    }
}

// Class Customer
class Customer{
    // Class Attributes
    private String customerName;
    private List<Product> products;

    // Constructor
    public Customer(String customerName){
        this.customerName = customerName;
        this.products = new ArrayList<>();
    }

    // Method to add Product
    public void addProduct(Product product){
        products.add(product);
    }

    // Getter for Product
    public List<Product> getProduct(){
        return products;
    }

    // Getter for Customer name
    public String getCustomerName(){
        return customerName;
    }
}

// Class BillGenerator
class BillGenerator{
    // Method to calculate bill
    public static double generateBill(Customer customer){
        // Initial Bill
        double totalBill = 0;

        // Iterate to get totalBill
        for(Product product : customer.getProduct()){
            int quantity = product.getQuantity();
            double price = product.getPrice();
            totalBill += quantity*price;
        }
        return totalBill;
    }
}

// Main Class
public class GroceryBillGenerator {
    public static void main(String[] args) {
        // Object of class Product
        Product apple = new Product("Apples", 3, 2);
        Product milk = new Product("Milk", 2, 1);

        // Object of class Customer
        Customer alice = new Customer("Alice");

        // Add product to Customer
        alice.addProduct(apple);
        alice.addProduct(milk);

        // Calculate total bill
        Double totalBill = BillGenerator.generateBill(alice);

        // Printing the bill
        System.out.println("\t\t=== Bill ===");
        System.out.println("\nCustomer name: " + alice.getCustomerName());
        System.out.println("\nQuantity\tPrice\tQuantity\tTotal");
        System.out.println(apple.getProduct()+"\t\t"+apple.getPrice()+"\t"+apple.getQuantity()+"\t\t"+(apple.getPrice()*apple.getQuantity()));
        System.out.println(milk.getProduct()+"\t\t"+milk.getPrice()+"\t"+milk.getQuantity()+"\t\t"+(milk.getPrice()*milk.getQuantity()));
        System.out.println("--------------------------------------------");
        System.out.println("Total Bill\t\t\t\t" + totalBill);
    }
}
