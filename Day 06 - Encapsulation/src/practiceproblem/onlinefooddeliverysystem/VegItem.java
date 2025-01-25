package practiceproblem.onlinefooddeliverysystem;

public class VegItem extends FoodItem implements Discountable{

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice(){
        return getPrice()*getQuantity();
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        double discount = (discountPercentage/100)*getPrice();
        setPrice(getPrice()-discount);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount applied on Veg Item: " + getItemName();
    }

    @Override
    public void getItemDetails() {
        super.getItemDetails();
        System.out.println("Total price: " + calculateTotalPrice());
    }
}
