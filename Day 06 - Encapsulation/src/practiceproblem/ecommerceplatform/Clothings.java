package practiceproblem.ecommerceplatform;

public class Clothings extends Product implements Taxable{
    private double discout;
    public Clothings(int productId, String name, double price, double discout){
        super(productId, name, price);
        this.discout = discout;
    }
    @Override
    public double calculateDiscount(){
        return getPrice()*discout/100;
    }
    @Override
    public double calculateTax() {
        return getPrice() * 0.12;
    }
    @Override
    public String getTaxDetails() {
        return "12% GST";
    }
    @Override
    public void displayProductDetails(){
        super.displayProductDetails();
        System.out.println("Discount: " + calculateDiscount());
        System.out.println("Tax: " + getTaxDetails());
        System.out.println("Final price: " + (getPrice()+calculateTax()-discout));
    }
}
