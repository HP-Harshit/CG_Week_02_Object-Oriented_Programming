public class Inventory {
    public static void main(String[] args) {
        // Create an object of InventoryClass
        InventoryClass inventory = new InventoryClass();

        // Set the item details using setter methods
        inventory.setItemCode(801);
        inventory.setItemName("notebook");
        inventory.setPrice(299.99);

        // Calculate the total cost for a given quantity
        inventory.findTotalCost(5);

        // Display the details
        System.out.println("=== Inventory Details ===");
        inventory.displayDetails();
    }
}

class InventoryClass {
    // Attributes for itemCode, itemName, and price
    private int itemCode;
    private String itemName;
    private double price;
    private double totalCost;

    // Default constructor
    public InventoryClass() {
    }

    // Setter method to set the item code
    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    // Setter method to set the item name
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    // Setter method to set the price
    public void setPrice(double price) {
        this.price = price;
    }

    // Method to calculate total cost
    public void findTotalCost(int quantity) {
        totalCost = quantity * price;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Total Cost: " + totalCost);
    }
}
