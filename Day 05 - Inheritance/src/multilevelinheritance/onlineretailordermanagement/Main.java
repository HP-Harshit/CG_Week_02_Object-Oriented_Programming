package multilevelinheritance.onlineretailordermanagement;

public class Main {
    public static void main(String[] args) {
        // Creating instances of each class
        Order order = new Order(101, "2025-01-24");
        ShippedOrder shippedOrder = new ShippedOrder(102, "2025-01-23", "TN12345");
        DeliveredOrder deliveredOrder = new DeliveredOrder(103, "2025-01-22", "TN54321", "2025-01-25");

        // Calling the displayOrderDetails method on each instance
        order.displayOrderDetails();
        System.out.println();

        shippedOrder.displayOrderDetails();
        System.out.println();

        deliveredOrder.displayOrderDetails();
    }
}
