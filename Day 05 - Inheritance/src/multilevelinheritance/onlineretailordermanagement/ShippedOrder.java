package multilevelinheritance.onlineretailordermanagement;

public class ShippedOrder extends Order{
    // Class Attribute
    public String trackingNumber;

    // Defining Constructor
    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        // Calling the superclass constructor
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // Overriding the getOrderStatus method
    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }

    // Overriding the displayOrderDetails method
    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}
