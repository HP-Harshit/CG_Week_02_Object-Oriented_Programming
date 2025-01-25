package practiceproblem.ecommerceplatform;

public abstract class Product {
    private int productId;
    private String name;
    private double price;
    public Product(int productId, String name, double price){
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public abstract double calculateDiscount();
    public void displayProductDetails(){
        System.out.println("\n=== Product Details ===");
        System.out.println("Product Id: " + productId);
        System.out.println("Product name: " + name);
        System.out.println("Price: " + price);
    }
}
