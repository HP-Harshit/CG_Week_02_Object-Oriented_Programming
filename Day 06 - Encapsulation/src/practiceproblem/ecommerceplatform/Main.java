package practiceproblem.ecommerceplatform;

import practiceproblem.employeemanagementsystem.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("E-Commerce platform");
        List<Product> products = new ArrayList<>();

        Electronics electronics = new Electronics(101, "Laptop", 8499.49, 7);
        Clothings clothings = new Clothings(102, "T-Shirt", 459.99, 10);
        Groceries groceries = new Groceries(103, "Coffee", 249.49, 5);

        products.add(electronics);
        products.add(clothings);
        products.add(groceries);

        for(Product product : products){
            product.displayProductDetails();
        }
    }
}
