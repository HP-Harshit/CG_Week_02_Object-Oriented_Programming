package practiceproblem.onlinefooddeliverysystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Online Food Delivery System ===");
        List<FoodItem> orders = new ArrayList<>();

        orders.add(new VegItem("Paneer Tikka", 10, 2));
        orders.add(new NonVegItem("Chicken Curry", 15, 1));

        for(FoodItem item : orders){
            item.getItemDetails();
            System.out.println();

            if(item instanceof Discountable){
                ((Discountable)item).applyDiscount(10); // Discount 10%
                System.out.println("After Discount");
                System.out.println("Discounted price: " + item.calculateTotalPrice());
                System.out.println(((Discountable)item).getDiscountDetails());
                System.out.println();
            }
        }
    }
}
