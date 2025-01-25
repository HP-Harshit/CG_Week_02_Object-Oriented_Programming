package practiceproblem.ecommerceplatform;

public class Groceries extends Product implements Taxable{
    private double discout;
    public Groceries(int productId, String name, double price, double discout){
        super(productId, name, price);
        this.discout = discout;
    }
    @Override
    public double calculateDiscount(){
        return getPrice()*discout/100;
    }
    @Override
    public double calculateTax() {
        return getPrice() * 0.16;
    }
    @Override
    public String getTaxDetails() {
        return "16% GST";
    }
    @Override
    public void displayProductDetails(){
        super.displayProductDetails();
        System.out.println("Discount: " + calculateDiscount());
        System.out.println("Tax: " + getTaxDetails());
        System.out.println("Final price: " + (getPrice()+calculateTax()-discout));
    }
}
