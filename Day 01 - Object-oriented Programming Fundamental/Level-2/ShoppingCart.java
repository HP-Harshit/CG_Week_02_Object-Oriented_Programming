import java.util.Scanner;

public class ShoppingCart {

    public static void main(String[] args) {

        // Create an object for the Scanner class
        Scanner input = new Scanner(System.in);

        // Create an array to store the itemName, price
        String[] items = { "bat", "ball", "football", "basketball", "gloves", "tshirt", "shoes", "track suit" };
        double[] price = { 10.99, 5.99, 14.99, 19.99, 7.99, 8.99, 12.99, 23.99 };

        // Create an object of class CartItem
        CartItem cart = new CartItem(items, price);

        // Perform operations on the object
        while (true) {
            // Display the menu
            System.out.println("\n1. Add item to cart");
            System.out.println("2. Remove item from cart");
            System.out.println("3. Display Cart");
            System.out.println("4. Display total cost");
            System.out.println("5. Exit");
            System.out.print("\n\nEnter your choice: ");
            // Read the choice from the user
            int choice = input.nextInt();
            int quantity;
            int itemIndex;
            // Perform the operation based on the choice
            switch (choice) {
                // Add item to cart
                case 1:
                    // Display the items
                    cart.displayItems();
                    // Read the item index and quantity from the user
                    System.out.print("\nEnter the item index: ");
                    itemIndex = input.nextInt() - 1; // Adjust for array indexing
                    System.out.print("Enter the Quantity: ");
                    quantity = input.nextInt();
                    cart.addItem(itemIndex, quantity);
                    System.out.print("\nUpdated Cart: ");
                    cart.displayCart();
                    break;

                // Remove item from cart
                case 2:
                // Check cart is empty or not
                if (cart.isCartEmpty()) {
                    System.out.println("\nYour cart is empty, first add items to cart.");
                } else {
                        // Display the items in the cart
                        cart.displayCart();
                        // Ask the user to enter the item index to remove
                        System.out.print("\nEnter the item index to remove: ");
                        itemIndex = input.nextInt() - 1;
                        System.out.print("Enter the Quantity: ");
                        quantity = input.nextInt();
                        cart.removeItem(itemIndex, quantity);
                        System.out.print("\n\nUpdated Cart: ");
                        cart.displayCart();
                    }
                    break;

                // Display cart
                case 3:
                    System.out.println("\n==== Cart Details ====");
                    cart.displayCart();
                    break;

                // Display total cost
                case 4:
                    System.out.println("\n==== Total Cost ====");
                    System.out.println(cart.getTotalCost());
                    break;

                // Exit the program
                case 5:
                    System.out.println("\nExiting...");
                    input.close();
                    System.exit(0);

                // Invalid choice
                default:
                    System.out.println("\nInvalid choice. Try again.");
                    break;
            }
        }
    }
}

class CartItem {

    // Create attributes itemNames, price, quantity
    private String[] items;
    private double[] price;
    private int maxSize;
    // Create an Array to store the items in the cart
    private String[] itemNames = new String[100]; 
    private double[] prices = new double[100];
    private int[] quantities = new int[100];
    private double totalCost = 0;
    // Create an index to track the current item in the cart
    private int index = -1;

    // Constructor to initialize the attributes
    public CartItem(String[] items, double[] price) {
        this.items = items;
        this.price = price;
        this.maxSize = items.length;
    }

    // Method to display Items
    public void displayItems() {
        for (int i = 0; i < maxSize; i++) {
            System.out.println((i + 1) + ". " + items[i] + "\t" + price[i]);
        }
    }

    // Method to add an item to the cart
    public void addItem(int itemIndex, int quantity) {
        // Check if the item index is valid
        if (itemIndex < 0 || itemIndex >= maxSize) {
            System.out.println("\nInvalid item index.");
            // Return from the method
            return;
        }
        // Check if the item is already in the cart
        for (int i = 0; i <= index; i++) {
            if (itemNames[i].equals(items[itemIndex])) {
                // If the item is already in the cart, update the quantity
                quantities[i] += quantity;
                return;
            }
        }
        // If the item is not in the cart, add it
        index++;
        itemNames[index] = items[itemIndex];
        prices[index] = price[itemIndex];
        quantities[index] = quantity;
    }

    // Method to check if cart is empty
    public boolean isCartEmpty() {
        return index == -1;
    }

    // Simplified Method to remove an item from the cart
    public void removeItem(int itemIndex, int quantity) {
        // Check if the item index is valid
        if (itemIndex < 0 || itemIndex > index) {
            System.out.println("\n\nInvalid index.");
            // Return from the method
            return;
        }
        // Check for the quantity in the cart
        if (quantity > quantities[itemIndex] || quantity < 0) {
            System.out.println("\nEnter the right quantity of item");
        } else if (quantity < quantities[itemIndex]) {
            quantities[itemIndex] -= quantity;
        } else {
            // If the quantity is equal to the quantity in the cart, remove the item
            for (int i = itemIndex; i < index; i++) {
                itemNames[i] = itemNames[i + 1];
                quantities[i] = quantities[i + 1];
                prices[i] = prices[i + 1];
            }
            index--;
        }
    }

    // Method to get the total cost
    public double getTotalCost() {
        // Reset total cost before calculation
        totalCost = 0; 
        // Iterate through the cart and calculate the total cost
        for (int i = 0; i <= index; i++) {
            totalCost += (prices[i] * quantities[i]);
        }
        // Return the total cost
        return totalCost;
    }

    // Method to display the cart
    public void displayCart() {
        // Check if the cart is empty
        if (isCartEmpty()) {
            System.out.println("\n\nYour cart is empty");
        } else {
            // Display the cart
            System.out.println("\n\nIndex\tItem\t\tQuantity\tPrice");
            for (int i = 0; i <= index; i++) {
                System.out.printf((i + 1) + "\t" + itemNames[i] + "\t" + quantities[i] + "\t" + prices[i] + "\n");
            }
        }
    }
}
