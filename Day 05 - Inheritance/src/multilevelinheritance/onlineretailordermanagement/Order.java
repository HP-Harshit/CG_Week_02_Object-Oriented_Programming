package multilevelinheritance.onlineretailordermanagement;

public class Order {
    // Class Attributes
    public int orderId;
    public String orderDate;

    // Defining Constructor
    public Order(int orderId, String orderDate) {
        // Initializing the attributes
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to get the order status
    public String getOrderStatus() {
        return "Order Placed";
    }

    // Method to display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Order Status: " + getOrderStatus());
    }
}
