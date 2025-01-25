package multilevelinheritance.onlineretailordermanagement;

public class DeliveredOrder extends Order{
    // Class Attribute
    public String deliveryDate;

    // Defining Constructor
    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        // Calling the superclass constructor
        super(orderId, orderDate);
        this.deliveryDate = deliveryDate;
    }

    // Overriding the getOrderStatus method
    @Override
    public String getOrderStatus() {
        return "Order Delivered";
    }

    // Overriding the displayOrderDetails method
    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}
