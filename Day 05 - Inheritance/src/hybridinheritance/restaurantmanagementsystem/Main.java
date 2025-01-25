package hybridinheritance.restaurantmanagementsystem;

public class Main {
    public static void main(String[] args) {
        // Creating instances of Chef and Waiter
        Chef chef = new Chef("Alice", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("Bob", 102, "Outdoor Seating");

        // Displaying person details, roles, and duties
        chef.displayPersonDetails();
        chef.displayRole();
        chef.performDuties();
        System.out.println();

        waiter.displayPersonDetails();
        waiter.displayRole();
        waiter.performDuties();
    }
}
