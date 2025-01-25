package practiceproblem.onlinefooddeliverysystem;

public class NonVegItem extends FoodItem implements Discountable{
    private static final double ADDITIONAL_CHARGE = 1.25;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice(){
        return (getPrice()*getQuantity())*ADDITIONAL_CHARGE;
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        double discount = (discountPercentage/100)*getPrice();
        setPrice(getPrice() - discount);
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
